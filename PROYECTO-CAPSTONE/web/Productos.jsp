    <%-- 
    Document   : Productos
    Created on : 2/07/2020, 02:04:16 AM
    Author     : leoce
--%>
<%@page import="java.util.Iterator"%>
<%@page import="modelo.ProductosDAO"%>
<%@page import="modelo.Productos"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
        <script src="js/validaciones.js" type="text/javascript"></script>
        <style>
            
            body{
              background: #D3CCE3;  /* fallback for old browsers */
background: -webkit-linear-gradient(to bottom, #E9E4F0, #D3CCE3);  /* Chrome 10-25, Safari 5.1-6 */
background: linear-gradient(to bottom, #E9E4F0, #D3CCE3); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
 /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
            }
        </style>
    </head>
    
    <body>
       
        <h1 align="center">Mantenimiento de Productos</h1>
        
        
        <br>
        <%-------------------------------------------------------------------------------------------------------------------%>
        <form action="Controlador?accion=Productos" method="POST" class="form-inline" >
            <h5 align="left">Buscar productos: &nbsp;</h5>
            <input type="search" name="txtBuscarProductos" class="form-control col-lg-3" >
            <input type="submit" name="menu" value="Buscar Producto" class="btn btn-info col-sm-1.5">
        </form>
        <%-------------------------------------------------------------------------------------------------------------------%>
        <br>
        
        
        
        <div class="d-flex">
            <div class="card col-sm-3 animate__animated animate__fadeInTopRight" style="background-image:url(Imagenes/franja.png)">
                <p style = "font-size:20pt" align="center">Datos del Producto</p>
                <div class="card-body">

                    <form action="Controlador?accion=Productos" method="POST" >
                        <div class="form-group">  
                            <div class="form-group">
                                <strong>Nombre de producto</strong>
                                <input type="text" value="${producto.getProd_descripcion()}" name="txtProdDescripcion" class="form-control" placeholder="Nombre producto" onkeypress="return NombreProd(event)" maxlength="100" minlength="1" onpaste="return false" required="">
                            </div> 
                            <div class="form-group">
                                <strong>Precio</strong>
                                <input type="text" value="${producto.getProd_precio()}" name="txtProdPrecio" class="form-control" placeholder="9.99" onkeypress="return Precio(event)" minlength="1" onpaste="return false" required="">
                            </div>
                            <div class="form-group">
                                <strong>Stock</strong>
                                <input type="text" value="${producto.getProd_stock()}" name="txtProdStock" class="form-control" placeholder="1" onkeypress="return SoloNumeros()(event)" minlength="1" onpaste="return false" required="">
                            </div>
                            <div class="form-group">
                                <strong>Proveedor</strong>
                                    <select name="cboProveedor" class="form-control" > 
                                        <%int a=0;%>
                                        <option value="0">--Selecionar--</option> 
                                        <c:forEach var="pro" items="${proveedores}" >
                                            <option value="${pro.getCod_proveedor()}">${pro.getProv_razon()}</option> 
                                        </c:forEach> 
                                    </select> 
                                
                            </div> 
                            <div class="form-group">
                                <label>Categoria</label>
                                  <select name="cboCategoria" class="form-control" >
                                      <option value="0">--Selecionar--</option> 
                                        <c:forEach var="cate" items="${categorias}"> 
                                            <option value="${cate.getCod_categoria()}" >${cate.getCate_descripcion()}</option> 
                                        </c:forEach> 
                                </select>
                            </div> 
                        </div>
                        <input type="submit" name="menu" value="Agregar Producto" class="btn btn-info">
                        <br>
                        <br>
                        <input type="submit" name="menu" value="Actualizar Producto" class="btn btn-success">
                    </form>
                </div>
            </div>
 
            <div class="col-sm-8">
                <p style = "font-size:20pt" align="center">Tabla de Productos</p>
                <table style="text-align: center" class="table table-hover">
                    <thead>
                        <tr>
                            <th>Codigo</th>
                            <th>Categoria</th>
                            <th>Descripcion</th>
                            <th>Precio</th>
                            <th>Stock</th>                 
                            <th>Proveedor</th>
                            <th>Acciones</th> 
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="pr" items="${productos}">
                            <tr>
                                <td>${pr.cod_producto}</td>
                                <td>${pr.descripcion_categoria}</td>
                                <td>${pr.prod_descripcion}</td>                             
                                <td>${pr.prod_precio}</td>
                                <td>${pr.prod_stock}</td>
                                <td>${pr.descripcion_proveedor}</td>
                                <td>
                                    <a class="btn btn-warning" href="Controlador?accion=Productos&menu=EditarProd&cod_prod=${pr.getCod_producto()}">Editar <br></a>
                                  
                                    <a class="btn btn-darnger" href="Controlador?accion=Productos&menu=DeleteProducto&cod_prod=${pr.getCod_producto()}">Eliminar</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
                            
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script>
                                  function solonumeros(e) {
                                      key = e.keyCode || e.which;

                                      teclado = String.fromCharCode(key);
                                      numero = "0123456789";
                                      especiales = "8-37-38-46";
                                      teclado_especial = false;

                                      for (var i in especiales) {
                                          if (key == especiales[i]) {
                                              teclado_especial = true;
                                          }

                                          if (numero.indexOf(teclado) == -1 && !teclado_especial) {
                                              return false;
                                          }
                                      }
                                  }

                                  function SoloLetra(e) {
                                      key = e.keyCode || e.which;
                                      //S=evt.getKeyChar();
                                      teclado = String.fromCharCode(key);
                                      letras = "FAT";
                                      especiales = "8-32-37-38-46-164-255";
                                      teclado_especial = false;

                                      for (var i in especiales) {
                                          if (key == especiales[i]) {
                                              teclado_especial = true;
                                              break;
                                          }

                                          if (letras.indexOf(teclado) == -1 && !teclado_especial) {
                                              //if(letras.indexOf(teclado)==-1 && !teclado_especial){
                                              alert("SOLO SE PERMITEN TECLAS: F,A,T");
                                              return false;
                                          }
                                      }
                                  }                        
    </script>            
        
        
        
        
    </body>
</html>
