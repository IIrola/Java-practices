

<%@page import="java.util.Iterator"%>
<%@page import="modelo.Pedido"%>
<%@page import="modelo.PedidoDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
        <style>
          body{
                background: #ADA996;  /* fallback for old browsers */
                background: -webkit-linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996);  /* Chrome 10-25, Safari 5.1-6 */
                background: linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */

            }
        </style>
    </head>
    <body>
        
        
        <h1 align="center">Actualizacion de pedidos</h1>
           
         
        <br>
        <%-------------------------------------------------------------------------------------------------------------------%>
        <form action="Controlador?accion=AcPedido" method="POST"  >
            <div class="form-inline">
            <h5 align="left">Buscar pedidos: &nbsp;</h5>
            <input type="search" name="txtBuscarAcPedidos" class="form-control col-lg-3" >
            <input type="submit" name="menu4" value="Buscar Pedidos" class="btn btn-info col-sm-1.5">
            </div>
        <%-------------------------------------------------------------------------------------------------------------------%>
        <br>
        </form>
       
            
          <div class="d-flex">
                <div class="card col-sm-3 animate__animated animate__backInRight" style="background-image:url(Imagenes/franja.png)"> 
                <p style = "font-size:20pt" align="center">Datos del Pedido</p>
                <div class="card-body">
                                            <form action="Controlador?accion=AcPedido" method="POST" >
                        <div class="form-group">
                            <div class="form-group">
                                <label>CODIGO</label>
                                <input type="text" value="${pedidosed.getCod_auto_pedido()}" name="txtCodPedido" class="form-control" readonly="" >
                            </div>
                            <div class="form-group">
                                <label>FECHA DE COMPRA</label>
                                <input type="text" value="${pedidosed.getFecha_compra()}" name="txtFechaCompra" class="form-control"  readonly="">
                            </div>
                            <div class="form-group">
                                <label>FECHA DE ENVIO</label>
                                <input type="text" value="${pedidosed.getFecha_envio()}" name="txtFechaEnvio" class="form-control"  readonly="">
                            </div>

                            <div class="form-group">
                                <label>PRECIO TOTAL</label>
                                <input type="text" value="${pedidosed.getTotal()}" name="txtPrecioTotal" class="form-control"  readonly="">
                            </div>
                            <div class="form-group">
                                <label>TIPO DE PAGO</label>
                                <input type="text" value="${pedidosed.getDescripcion_pago()}" name="txtTipoPago" class="form-control"  readonly="">
                            </div>
                            <div class="form-group">
                                <label>ESTADO</label>
                                    <select name="cboEstado" class="form-control" > 
                                        <option value="0">--Selecionar--</option> 
                                        <c:forEach var="es" items="${estado}" >
                                            <option value="${es.getCod_estado_pedido()}">${es.getEstado_descripcion()}</option> 
                                        </c:forEach> 
                                    </select> 
                            </div> 
                        </div>
                        <br>
                                                    
                        <%--    <a class="btn btn-info" href="Controlador?accion=AcPedido&menu4=ActualizarPedido">ACTUALIZAR</a> --%>
                        <input type="submit" name="menu4" value="Actualizar Pedido" class="btn btn-success">
                        </form>
                </div>
            </div>
            
            
 
            <div class="col-sm-8">
                <p style = "font-size:20pt" align="center">Tabla de Pedidos</p>
                <table style="text-align: center" class="table table-hover">
                    <thead>
                        <tr>
                            <th>CODIGO</th>
                            <th>FECHA DE COMPRA</th>  
                            <th>FECHA DE ENVIO</th>
                            <th>PRECIO TOTAL</th>
                            <th>TIPO DE PAGO</th>  
                            <th>ESTADO</th>  
                            <th>ACCIONES</th> 
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="pl" items="${pedidosli}">
                            <tr>
                                <td>${pl.cod_auto_pedido}</td>
                                <td>${pl.fecha_compra}</td>
                                <td>${pl.fecha_envio}</td>  
                                <td>${pl.total}</td>
                                <td>${pl.descripcion_pago}</td>
                                <td>${pl.descripcion_estado}</td>
                                <td>
                              
                                        <a class="btn btn-warning" href="Controlador?accion=AcPedido&menu4=EditarPedidos&cod_pedido1=${pl.getCod_pedido()}">Editar</a>
                                    <a class="btn btn-info" href="Controlador?accion=DetallePedidossss&cod_pedido=${pl.cod_pedido}">VER</a>
                                   <%--<a class="btn btn-darnger" href="Controlador?accion=AcPedido&menu4=DeleteProveedores&cod_pedido=${prl.getCod_proveedor()}">VER</a>--%>
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
    </body>
</html>
