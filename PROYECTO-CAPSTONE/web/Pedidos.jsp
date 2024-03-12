<%-- 
    Document   : Pedidos
    Created on : 19-nov-2020, 0:20:53
    Author     : Sistema
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
         <script src="js/ocultar.js" type="text/javascript"></script>
         <style>
             
            body{
                background: #ADA996;  /* fallback for old browsers */
                background: -webkit-linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996);  /* Chrome 10-25, Safari 5.1-6 */
                background: linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */

            }
        </style>
    </head>
    <body>
        <h1 align="center">LISTA DE PEDIDOS REALIZADOS</h1>
        
 
        
        <div class="col-sm-8 container">        
        <br>
        <%-------------------------------------------------------------------------------------------------------------------%>
        <form action="Controlador?accion=PedidosCliente" method="POST" class="form-inline" >
            <h5 align="left">Buscar pedidos: &nbsp;</h5>
            <input type="search" name="txtBuscarPedidosClientes" class="form-control col-lg-5" >
             <%-------------------------------------------------------------------------------------------------------------------
            <input type="submit" name="accion" value="BuscarPedidos" class="btn btn-info col-sm-1.5">
            <a class="btn btn-info" href="Controlador?accion=PedidosCliente&menu5=">Buscar Pedidos</a>
             --%>
            <input type="submit" name="menu5" value="Buscar mi Pedido" class="btn btn-info col-sm-1.5">
            
        </form>
        <%-------------------------------------------------------------------------------------------------------------------%>
        <br>
            <table style="text-align: center" class="table table-hover animate__animated animate__lightSpeedInRight">
                <thead>
                    <tr>
                        <th>CODIGO DE PEDIDO</th>
                        <th>FECHA DE COMPRA</th>
                        <th>FECHA DE ENVIO</th>
                        <th>PRECIO TOTAL</th>
                        <th>TIPO DE PAGO</th>
                        <th>ESTADO</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody style="text-align: center">
                <c:forEach var="ped" items="${pedidosCLI}">
                    <tr align="center">
                        <td>${ped.cod_auto_pedido}</td>
                        <td>${ped.fecha_compra}</td>
                        <td>${ped.fecha_envio}</td>
                        <td>${ped.total}</td>
                        <td>${ped.descripcion_pago}</td>
                        <td>${ped.descripcion_estado}</td>
                        <td>
                            <%
                            //<a class="btn btn-darnger" href="Controlador?accion=DetallePedidosCliente&cod_pedido=${ped.getCod_producto()}">VER</a>
                            %>

                            <a class="btn btn-info" onclick="ocultando()" href="Controlador?accion=DetallePedidosCliente&cod_pedido=${ped.cod_pedido}">VER</a>
                            
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        
        <%--
<script>
        $("#hide").click(function(){
            $("p").hide();
        });
</script>                

--%>









        
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        
    <script src="js/funciones.js" type="text/javascript"></script>    

    </body>
</html>
