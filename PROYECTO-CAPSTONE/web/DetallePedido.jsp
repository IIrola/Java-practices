<%-- 
    Document   : DetallePedido
    Created on : 19-nov-2020, 1:46:55
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
    <style>
        body{
                background: #ADA996;  /* fallback for old browsers */
                background: -webkit-linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996);  /* Chrome 10-25, Safari 5.1-6 */
                background: linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */

            }
    </style>
    
    <script src="js/ocultar.js" type="text/javascript"></script>
    </head>
    <body>
        
        <h1 align="center" >DETALLE DE PEDIDO</h1>
        
    <div class="col-sm-11 container">
                 
            <div class="card-body">
                <c:forEach var="detalpedc" items="${DetalPedidoCli}" end = "0">
                    <h2>DATOS DE CLIENTE</h2>
                    <label>CODIGO DE PEDIDO: </label>
                    <input type="text" value="${detalpedc.auto_pedido}" readonly="" class="form-control">
                    <label>CLIENTE: </label>
                    <input type="text" value="${detalpedc.nombre_cliente} ${detalpedc.apellido_pate} ${detalpedc.apellido_mate}" readonly="" class="form-control">
                    <label>CELULAR: </label>
                    <input type="text" value="${detalpedc.direccion_cliente}" readonly="" class="form-control">
                    
                </c:forEach>
            </div>
      
        <div class="row">
            <div class="col-sm-9">
                <div class="card">
                    <div class="card-body">
                        <table style="text-align: center" class="table table-hover">
                            <thead>
                                <tr>
                                    <th>CATEGORIA</th>
                                    <th>PRODUCTO</th>
                                    <th>PRECIO</th>
                                    <th>CANTIDAD</th>
                                    <th>SUB TOTAL</th>
                                </tr>
                            </thead>
                            <tbody style="text-align: center">
                                <c:forEach var="detalpedc" items="${DetalPedidoCli}">
                                    <tr align="center">
                                        <td>${detalpedc.categoria_descri}</td>
                                        <td>${detalpedc.nombre_producto}</td>
                                        <td>${detalpedc.precio_unitario}</td>
                                        <td>${detalpedc.cantidad}</td>
                                        <td>${detalpedc.sub_total_por_producto}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table> 
                    </div>
                </div>
            </div>

            <c:forEach var="detalpedc" items="${DetalPedidoCli}" >
                <div id="p" style=" display: none;">
                    ${ffff=ffff+detalpedc.sub_total_por_producto}
                </div>
            </c:forEach>

            <div class="col-sm-3">
                <div class="card">
                    <div class="card-body">
                        <c:forEach var="detalpedc" items="${DetalPedidoCli}" end="0">
                            <label>SUB TOTAL: </label>
                            <input type="text" value="S/.${Math.round(ffff*100)/100}" readonly="" class="form-control">
                            <label>IGV: </label>
                            <input type="text" value="${detalpedc.igv} %" readonly="" class="form-control">
                            <label>ENVIO: </label>
                            <input type="text" value="S/.${detalpedc.envio_precio}" readonly="" class="form-control">
                            <label>TOTAL A PAGAR:</label>
                            <input type="text" value="S/.${Math.round(((detalpedc.igv*ffff)+(ffff+detalpedc.envio_precio))*100)/100}" readonly="" class="form-control">
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>    
       
    </div>    
        
        
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        
    <script src="js/funciones.js" type="text/javascript"></script> 
    
    </body>
</html>
