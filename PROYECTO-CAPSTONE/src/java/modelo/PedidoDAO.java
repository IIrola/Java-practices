package modelo;

import Logica.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class PedidoDAO {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void GenerarPedido(Pedido pedido) {
        int temp_cod_pedido=0;
    
        String sql = "insert into pedido (ped_fecha_envio,cod_cliente,cod_pago) values (?,?,?)";
          
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
      
            ps.setString(1, pedido.getFecha_envio());
            ps.setInt(2, pedido.getCliente().getCod_cliente());
            ps.setInt(3, pedido.getCod_pago());
        
            ps.executeUpdate();
            
            String sql2 = "select @@IDENTITY AS cod_pedido";
            ps = con.prepareStatement(sql2);
            rs = ps.executeQuery();
            rs.next();
            temp_cod_pedido = rs.getInt("cod_pedido");
            rs.close();

            for (Carrito detallepedido : pedido.getDetallepedido()) {
                
                String  sql3 = "insert into detalle (cod_pedido,cod_producto,cantidad) values (?,?,?)";  
                
                con = cn.getCon();
                ps = con.prepareStatement(sql3);
                           
                ps.setInt(1, temp_cod_pedido);
                ps.setInt(2, detallepedido.getCod_prod());
                ps.setInt(3, detallepedido.getCantidad());
                
                ps.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
   
    public Pedido SeleccionarIDPedido(int id) {
        Pedido pe = new Pedido();
        String sql = "SELECT * FROM V_PEDIDO_1_LINEA WHERE cod_cliente=" + id ;
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setCod_pedido(rs.getInt(1));
                pe.setCod_auto_pedido(rs.getString(2));
                pe.setFecha_compra(rs.getString(3));
                pe.setFecha_envio(rs.getString(4));
                pe.setTotal(rs.getFloat(12));
                pe.setDescripcion_pago(rs.getString(6));
                pe.setDescripcion_estado(rs.getString(8));
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return pe;
    }
        
    
    public List listar(int id) {
        List<Pedido> lista = new ArrayList<>();
       
        String sql = "SELECT * FROM V_PEDIDO_1_LINEA WHERE cod_cliente=" + id+" ORDER BY cod_auto_pedido DESC";

        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pe = new Pedido();
                pe.setCod_pedido(rs.getInt(1));
                pe.setCod_auto_pedido(rs.getString(2));
                pe.setFecha_compra(rs.getString(3));
                pe.setFecha_envio(rs.getString(4));
                pe.setTotal(rs.getFloat(12));
                pe.setDescripcion_pago(rs.getString(6));
                pe.setDescripcion_estado(rs.getString(8));
                lista.add(pe);

            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }


    public List ListarPedidos(){
        List<Pedido> ListaPedido = new ArrayList<>();        
        String sql = "SELECT * FROM V_PEDIDO_1_LINEA ORDER BY cod_auto_pedido DESC";

        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pe = new Pedido();
                pe.setCod_pedido(rs.getInt(1));
                pe.setCod_auto_pedido(rs.getString(2));
                pe.setFecha_compra(rs.getString(3));
                pe.setFecha_envio(rs.getString(4));
                pe.setTotal(rs.getFloat(12));
                pe.setDescripcion_pago(rs.getString(6));
                pe.setDescripcion_estado(rs.getString(8));
                ListaPedido.add(pe);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return ListaPedido;
    }
    
    public Pedido listaIDac(int id) {
        Pedido pe = new Pedido();
        String sql = "SELECT * FROM V_PEDIDO_1_LINEA WHERE cod_pedido=" + id ;
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setCod_pedido(rs.getInt(1));
                pe.setCod_auto_pedido(rs.getString(2));
                pe.setFecha_compra(rs.getString(3));
                pe.setFecha_envio(rs.getString(4));
                pe.setTotal(rs.getFloat(12));
                pe.setDescripcion_pago(rs.getString(6));
                pe.setDescripcion_estado(rs.getString(8));
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return pe;
    }
    
    public void ActualizarEstadoPedido(Pedido p) {
        String sql = "update pedido set cod_estado_pedido=? where cod_pedido=?";
    
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);            
            ps.setInt(1, p.getCod_estado_pedido());
            ps.setInt(2, p.getCod_pedido());

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
    
    
    public List Buscar(String texto) {
        List<Pedido> ListaBusqueda = new ArrayList<>();

        String sql = "SELECT * FROM V_PEDIDO_1_LINEA where estado_descripcion like '%" + texto + "%' or cod_auto_pedido like '%" + texto + "%'";
      
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pe = new Pedido();
                pe.setCod_pedido(rs.getInt(1));
                pe.setCod_auto_pedido(rs.getString(2));
                pe.setFecha_compra(rs.getString(3));
                pe.setFecha_envio(rs.getString(4));
                pe.setTotal(rs.getFloat(12));
                pe.setDescripcion_pago(rs.getString(6));
                pe.setDescripcion_estado(rs.getString(8));
                ListaBusqueda.add(pe);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return ListaBusqueda;
    }
    
    
    public List BuscarPedidosClientes(String texto, int cod) {
        List<Pedido> listas = new ArrayList<>();

        String sql = "SELECT * FROM V_PEDIDO_1_LINEA where cod_cliente="+cod+" and (  estado_descripcion like '%" + texto + "%' or cod_auto_pedido like '%" + texto + "%')";
       
        try {
            con = cn.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pe = new Pedido();
                pe.setCod_pedido(rs.getInt(1));
                pe.setCod_auto_pedido(rs.getString(2));
                pe.setFecha_compra(rs.getString(3));
                pe.setFecha_envio(rs.getString(4));
                pe.setTotal(rs.getFloat(12));
                pe.setDescripcion_pago(rs.getString(6));
                pe.setDescripcion_estado(rs.getString(8));
                listas.add(pe);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return listas;
    }        
            
            
}
