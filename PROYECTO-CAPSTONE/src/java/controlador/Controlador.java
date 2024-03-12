/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Logica.Fecha;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Carrito;
import modelo.Categoria;
import modelo.CategoriaDAO;
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.DetPedido;
import modelo.DetallePedidoDao;
import modelo.EstadoPedido;
import modelo.EstadoPedidoDAO;
import modelo.Pago;
import modelo.Pedido;
import modelo.PedidoDAO;
import modelo.Productos;
import modelo.ProductosDAO;
import modelo.Proveedor;
import modelo.ProveedorDAO;

/**
 *
 * @author leoce
 */
public class Controlador extends HttpServlet {

    EstadoPedidoDAO estadao = new EstadoPedidoDAO();
    EstadoPedido esta = new EstadoPedido();
    List<EstadoPedido> estalis = estadao.ListarEstadosPedidos();
    
    ClienteDAO cdao = new ClienteDAO();
    Cliente cl = new Cliente();
    List<Cliente> c = cdao.ListarClientes();
    int r;

    ProductosDAO pdao = new ProductosDAO();
    Productos p = new Productos();
    List<Productos> prod = pdao.ListarProductosTienda();
    int idprod;

    Carrito car;
    List<Carrito> listarCarrito = new ArrayList<>();
    int item = 0;
    Double igv = 0.0;
    Double totalPagar = 0.0;
    int cantidad = 1;

    ProveedorDAO provedao = new ProveedorDAO();
    Proveedor prov = new Proveedor();
    List<Proveedor> prove = provedao.listar();
    int idprove;


    CategoriaDAO catedao = new CategoriaDAO();
    Categoria cate = new Categoria();
    List<Categoria> categ = catedao.ListarCategorias();
    
    PedidoDAO pedidodao =new PedidoDAO();
    Pedido pedi=new Pedido();

    int idpedi;
    
    DetallePedidoDao detaldao = new DetallePedidoDao();
    DetPedido detpedido = new DetPedido();
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");

        HttpSession sesion = request.getSession();
        
        String accion = request.getParameter("accion");//Principal para elegir cada boton del navbar
        String menu   = request.getParameter("menu");  //Productos
        String menu2  = request.getParameter("menu2"); //Perfil
        String menu3  = request.getParameter("menu3"); //Proveedor
        String menu4  = request.getParameter("menu4"); //AcPedido vista administrador
        String menu5  = request.getParameter("menu5"); //PedidosCliente vista cliente
        String a;
        a=(String)sesion.getAttribute("cod_cliente");
        
        List lista = pdao.ListarProductosTienda();
        List listaProvedores = provedao.listar();
        List listaCategoria = catedao.ListarCategorias();
        List listaEstaList = estadao.ListarEstadosPedidos();
        List listaPedidosAc = pedidodao.ListarPedidos();
        List listaPedido = pedidodao.listar(Integer.parseInt(a));
        
        
/* Opcion de perfil (interfaz cliente) */
        if (accion.equals("Perfil")) {
        
            switch (menu2) {
            
            case "ListarClientes":
                Cliente cliem= cdao.ListaIdCliente(Integer.parseInt(a));
                request.setAttribute("CleintesL", cliem);
            break;
            
            case "Actualizar mi perfil":
                    
                String dni11 =request.getParameter("txtdni1");
                String nombre11= request.getParameter("txtname1");
                String paterno11= request.getParameter("txtapepaterno1");
                String materno11= request.getParameter("txtapematerno1");
                String celular11= request.getParameter("txtcelular1");
                String direccion11= request.getParameter("txtdirec1");
                String correo11= request.getParameter("txtcorreo1");
                String contra11=request.getParameter("txtcontra1");                    

                cl.setCli_dni(dni11);
                cl.setCli_nombre(nombre11);
                cl.setCli_ap_paterno(paterno11);
                cl.setCli_ap_materno(materno11);
                cl.setCli_celular(celular11);
                cl.setCli_direccion(direccion11);
                cl.setCorreo(correo11);
                cl.setPassword(contra11);

                cl.setCod_cliente(Integer.parseInt(a));
                     
                cdao.ActualizarCliente(cl);

                request.getRequestDispatcher("Controlador?accion=Perfil&menu2=ListarClientes").forward(request, response);
                 
                break;        
            }
        }
   
        
/* Opcion de pedidos (interfaz administrador) */
        if (accion.equals("AcPedido")){
            switch (menu4) {
 
                case "ListarPedidos":
                    request.setAttribute("pedidosli", listaPedidosAc);
                    request.setAttribute("estado", listaEstaList);
                break;
         
                case "EditarPedidos":
                    idpedi=Integer.parseInt(request.getParameter("cod_pedido1"));
                    Pedido pedidOs=pedidodao.listaIDac(idpedi);
                    request.setAttribute("pedidosed", pedidOs);
                    request.getRequestDispatcher("Controlador?accion=AcPedido&menu4=ListarPedidos").forward(request, response);
                    break;
                   
                case "Actualizar Pedido":
                  
                    int codestados1 = Integer.parseInt(request.getParameter("cboEstado"));
                    
                    pedi.setCod_estado_pedido(codestados1);
                    pedi.setCod_pedido(idpedi);
                    pedidodao.ActualizarEstadoPedido(pedi);
                    request.getRequestDispatcher("Controlador?accion=AcPedido&menu4=ListarPedidos").forward(request, response);

                    break;
                    
                case "Buscar Pedidos":
                    
                    String dato = request.getParameter("txtBuscarAcPedidos");
                    List<Pedido> listas = pedidodao.Buscar(dato);
                  
                    request.setAttribute("pedidosli", listas);  
                    request.getRequestDispatcher("AcPedidos.jsp").forward(request, response);
                    break;           
                    
                default:
                    throw new AssertionError();
            }
        }
       
        
/*z Opcion de pedidos (interfaz cliente) */
        if (accion.equals("PedidosCliente")) {
        
            switch (menu5) {
                
                case "ListarPedidosCliente":
 
                    request.setAttribute("pedidosCLI", listaPedido);
                    request.getRequestDispatcher("Pedidos.jsp").forward(request, response);
                    break;           
                
                case "Buscar mi Pedido":
                    String dato = request.getParameter("txtBuscarPedidosClientes");
                    List<Pedido> listas = pedidodao.BuscarPedidosClientes(dato,Integer.parseInt(a));
                    request.setAttribute("pedidosCLI", listas);
                    request.getRequestDispatcher("Pedidos.jsp").forward(request, response);
                break;      
                
            }
        }
        
        
/* Opcion de Proveedor (interfaz adminisrtador) */        
        if (accion.equals("Proveedor")){
            switch (menu3) {
                case "ListarProveedores":
                    request.setAttribute("proveedoresl", listaProvedores);
                break;
                
                 case "Agregar Proveedor":
                    
                    String prove_razon = request.getParameter("txtRazon");
                    String prove_ruc = request.getParameter("txtRuc");
                    String prove_celular= request.getParameter("txtCelular");
                    String prove_correo= request.getParameter("txtCorreo");
                                    
                    prov.setProv_razon(prove_razon);
                    prov.setProv_ruc(prove_ruc);
                    prov.setProv_celular(prove_celular);
                    prov.setProv_correo(prove_correo);
                    
                    provedao.AgregarNuevoProveedor(prov);
                    request.getRequestDispatcher("Controlador?accion=Proveedor&menu3=ListarProveedores").forward(request, response);
                    break;
                    
                case "EditarProveedores":
               
                    idprove=Integer.parseInt(request.getParameter("cod_prove"));
                    Proveedor prl= provedao.listaID(idprove);
                    request.setAttribute("proveedoresed", prl);
                    request.getRequestDispatcher("Controlador?accion=Proveedor&menu3=ListarProveedores").forward(request, response);
                    break;
                    
                case "Actualizar Proveedor":

                    String prove_razon1 = request.getParameter("txtRazon");
                    String prove_ruc1 = request.getParameter("txtRuc");
                    String prove_celular1 = request.getParameter("txtCelular");
                    String prove_correo1 = request.getParameter("txtCorreo");
                    
                    prov.setProv_razon(prove_razon1);
                    prov.setProv_ruc(prove_ruc1);
                    prov.setProv_celular(prove_celular1);
                    prov.setProv_correo(prove_correo1);
                    prov.setCod_proveedor(idprove);
                    provedao.ActualizarProveedor(prov);
                    request.getRequestDispatcher("Controlador?accion=Proveedor&menu3=ListarProveedores").forward(request, response);

                    break;
                    
                case "DeleteProveedores":
                  
                    idprove=Integer.parseInt(request.getParameter("cod_prove"));
                    provedao.EliminarProveedor(idprove);
                    request.getRequestDispatcher("Controlador?accion=Proveedor&menu3=ListarProveedores").forward(request, response);
                    break;
                    
               case "Buscar Proveedor":
                    String dato = request.getParameter("txtBuscarProveedor");
                    List<Proveedor> listas = provedao.buscar(dato);
                    request.setAttribute("proveedoresl", listas);
                    request.getRequestDispatcher("Proveedores.jsp").forward(request, response);
                    break;     
                    
                    
                default:
                    throw new AssertionError();
            }
        }
        
        
/* Opcion de mantenimiento de Productps (interfaz administrador) */
        if (accion.equals("Productos")) {

            switch (menu) {
               
                case "ListarProd":
                    
                    request.setAttribute("productos", lista);
                    request.setAttribute("proveedores", listaProvedores);
                    request.setAttribute("categorias", listaCategoria);
                    break;

                case "Agregar Producto":

                    String prod_descripcion = request.getParameter("txtProdDescripcion");
                    float prod_precio = Float.parseFloat(request.getParameter("txtProdPrecio"));
                    int prod_stock = Integer.parseInt(request.getParameter("txtProdStock"));
                 
                    int cod_proveedor = Integer.parseInt(request.getParameter("cboProveedor")); 
                    int cod_categoria = Integer.parseInt(request.getParameter("cboCategoria")); 

                    p.setProd_descripcion(prod_descripcion);
                    p.setProd_precio(prod_precio);
                    p.setProd_stock(prod_stock);
                    p.setCod_categoria(cod_categoria);
                    p.setCod_proveedor(cod_proveedor);

                    pdao.AgregarProducto(p);
                    request.getRequestDispatcher("Controlador?accion=Productos&menu=ListarProd").forward(request, response);

                    break;
                    
                case "EditarProd":
                    idprod = Integer.parseInt(request.getParameter("cod_prod"));
                    Productos prd = pdao.listaID(idprod);
                    request.setAttribute("producto", prd);
                    request.getRequestDispatcher("Controlador?accion=Productos&menu=ListarProd").forward(request, response);
                    break;
                    
                case "Actualizar Producto":
               
                    String prod_descripcion1 = request.getParameter("txtProdDescripcion");
                    float prod_precio1 = Float.parseFloat(request.getParameter("txtProdPrecio"));
                    int prod_stock1 = Integer.parseInt(request.getParameter("txtProdStock"));
                   
                    int cod_proveedor1 = Integer.parseInt(request.getParameter("cboProveedor")); //indice de combo box
                    int cod_categoria1 = Integer.parseInt(request.getParameter("cboCategoria"));     //indice de combo box
 
                    p.setProd_descripcion(prod_descripcion1);
                    p.setProd_precio(prod_precio1);
                    p.setProd_stock(prod_stock1);
                    p.setCod_categoria(cod_categoria1);
                    p.setCod_proveedor(cod_proveedor1);

                    p.setCod_producto(idprod);

                    pdao.ActualizarProducto(p);
                    request.getRequestDispatcher("Controlador?accion=Productos&menu=ListarProd").forward(request, response);

                    break;
                    
                case "DeleteProducto":
                    idprod = Integer.parseInt(request.getParameter("cod_prod"));
                    pdao.BorrarProducto(idprod);
                    request.getRequestDispatcher("Controlador?accion=Productos&menu=ListarProd").forward(request, response);
                    break;
                    
                 case "Buscar Producto":
                    String dato = request.getParameter("txtBuscarProductos");
                    List<Productos> listas = pdao.BuscarProducto(dato);
                    request.setAttribute("productos", listas);
                    request.getRequestDispatcher("Productos.jsp").forward(request, response);
                    break;         
                    
                default:
                    throw new AssertionError();
            }
        }
    
        
/* Opcion de navbar Principal (interfaz general) */
        switch (accion){
            
            case "DetallePedidossss":
             
                int CodDetaPedido1 = Integer.parseInt(request.getParameter("cod_pedido"));
                List lsDetallePedidos1 = detaldao.ListarTodosDetalles(CodDetaPedido1);
                request.setAttribute("DetalPA", lsDetallePedidos1);    
                request.getRequestDispatcher("DetallePedidoAdmin.jsp").forward(request, response);
                break;          
            
            case "Principal":
                Cliente cliem= cdao.ListaIdCliente(Integer.parseInt(a));
                request.setAttribute("CleintesL", cliem);
                request.getRequestDispatcher("Principal.jsp").forward(request, response);
                break;

            case "Productos":
                request.getRequestDispatcher("Productos.jsp").forward(request, response);
                break;

            case "Proveedor":
                request.getRequestDispatcher("Proveedores.jsp").forward(request, response);
                break;
                
            case "AcPedido":
                request.getRequestDispatcher("AcPedidos.jsp").forward(request, response);
                break;    
                
            case "Tienda":
                request.setAttribute("productos", lista); 
                request.getRequestDispatcher("Tienda.jsp").forward(request, response);
                break;
        
            case "Comprar":
                AgregarCarrito(request);
                request.getRequestDispatcher("Controlador?accion=Carrito").forward(request, response);
                break;
                
            case "AgregarCarrito":
                AgregarCarrito(request);
                request.setAttribute("cont", listarCarrito.size());
                request.getRequestDispatcher("Controlador?accion=Tienda").forward(request, response);

            case "Carrito":
                igv = 0.0;
                totalPagar = 0.0;
                item = 0;
                request.setAttribute("carrito", listarCarrito);
                for (int i = 0; i < listarCarrito.size(); i++) {
                    totalPagar = totalPagar + listarCarrito.get(i).getSubTotal();
                    listarCarrito.get(i).setItem(item + i + 1);
                    igv = igv + (0.18 * listarCarrito.get(i).getSubTotal());
                }

                request.setAttribute("totalPagar", totalPagar);
                request.setAttribute("igv", igv);
                   
                request.getRequestDispatcher("Carrito.jsp").forward(request, response);
                break;

            case "DeleteProd":
                int idprodu = Integer.parseInt(request.getParameter("idp"));
                if (listarCarrito != null) {
                    for (int j = 0; j < listarCarrito.size(); j++) {
                        if (listarCarrito.get(j).getCod_prod() == idprodu) {
                            listarCarrito.remove(j);
                        }
                    }
                }
                break;

            case "ActualizarCantidad":
                int idprodc = Integer.parseInt(request.getParameter("idp"));
                int cant = Integer.parseInt(request.getParameter("Cantidad"));
                for (int i = 0; i < listarCarrito.size(); i++) {
                    if (listarCarrito.get(i).getCod_prod() == idprodc) {
                        listarCarrito.get(i).setCantidad(cant);
                        float st = listarCarrito.get(i).getPrecioCompra() * cant;
                        listarCarrito.get(i).setSubTotal(st);
                    }
                }
                break;

            case "Generar Compra":
           
                for (int i = 0; i < listarCarrito.size(); i++) {
                    int cantd = listarCarrito.get(i).getCantidad();
                    int idproduct = listarCarrito.get(i).getCod_prod();
                    p = pdao.BuscarStock(idproduct);
                }

                Cliente cliente = new Cliente();
                cliente.setCod_cliente(Integer.parseInt(a));
                PedidoDAO opdao = new PedidoDAO();
                Pedido ped = new Pedido(Fecha.FechaBDpost(), cliente,1,listarCarrito);
                
                opdao.GenerarPedido(ped);
                listarCarrito.clear();
                request.getRequestDispatcher("MensajeCompra.jsp").forward(request, response);

                break;
                
            case "Bohemios":
                request.getRequestDispatcher("Bohemios.jsp").forward(request, response);
                break;
                
            case "Perfil":
                request.getRequestDispatcher("Perfil.jsp").forward(request, response);
                break;
                
            case "DetallePedidosCliente":

                int CodDetaPedido = Integer.parseInt(request.getParameter("cod_pedido"));
                List listaDetallePedido = detaldao.ListarDetallesCliente(Integer.parseInt(a),CodDetaPedido);       
                request.setAttribute("DetalPedidoCli", listaDetallePedido);
                request.getRequestDispatcher("DetallePedido.jsp").forward(request, response);
                break;     
 
            default:
                request.setAttribute("productos", listarCarrito.size());
                throw new AssertionError();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    public void AgregarCarrito(HttpServletRequest request) {
        int pos = 0;
        cantidad = 1;
        int idp = Integer.parseInt(request.getParameter("cod_prod"));
        p = pdao.listaID(idp);
        if (listarCarrito.size() > 0) {
            for (int i = 0; i < listarCarrito.size(); i++) {
                if (listarCarrito.get(i).getCod_prod() == idp) {
                    pos = i;
                }
            }
            if (idp == listarCarrito.get(pos).getCod_prod()) {
                cantidad = listarCarrito.get(pos).getCantidad() + cantidad;
                float subtotal = listarCarrito.get(pos).getPrecioCompra() * cantidad;
                listarCarrito.get(pos).setCantidad(cantidad);
                listarCarrito.get(pos).setSubTotal(subtotal);
            } else {
                car = new Carrito();
                car.setItem(item);
                car.setDescripcion(p.getDescripcion_categoria());
                car.setDescripcion_producto(p.getProd_descripcion());
                car.setPrecioCompra(p.getProd_precio());
                car.setCantidad(cantidad);
                car.setSubTotal(cantidad * p.getProd_precio());
                car.setCod_prod(p.getCod_producto());

                listarCarrito.add(car);
            }
        } else {
            car = new Carrito();
            car.setItem(item);
            car.setDescripcion(p.getDescripcion_categoria());
            car.setDescripcion_producto(p.getProd_descripcion());
            car.setPrecioCompra(p.getProd_precio());
            car.setCantidad(cantidad);
            car.setSubTotal(cantidad * p.getProd_precio());
            car.setCod_prod(p.getCod_producto());
            listarCarrito.add(car);
        }
    }
}
