

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <h1 align="center" >DETALLE DE PEDIDO vista Administrador</h1>
        <script src="js/ocultar.js" type="text/javascript"></script>
        
    <div class="col-sm-11 container">
                 
             <div class="card-body">
                <c:forEach var="dpedc" items="${DetalPA}" end = "0">
                    <h2>DATOS DE CLIENTE</h2>
                    <label>CODIGO DE PEDIDO: </label>
                    <input type="text" value="${dpedc.auto_pedido}" readonly="" class="form-control">
                    <label>CLIENTE: </label>
                    <input type="text" value="${dpedc.nombre_cliente} ${dpedc.apellido_pate} ${dpedc.apellido_mate}" readonly="" class="form-control">
                    <label>CELULAR: </label>
                    <input type="text" value="${dpedc.direccion_cliente}" readonly="" class="form-control">
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
                                <c:forEach var="dpedc" items="${DetalPA}">
                                    <tr align="center">
                                        <td>${dpedc.categoria_descri}</td>
                                        <td>${dpedc.nombre_producto}</td>
                                        <td>${dpedc.precio_unitario}</td>
                                        <td>${dpedc.cantidad}</td>
                                        <td>${dpedc.sub_total_por_producto}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table> 
                    </div>
                </div>
            </div>

            <c:forEach var="detalpedc" items="${DetalPA}" >
                <div id="p" style=" display: none;">
                    ${ffff=ffff+detalpedc.sub_total_por_producto}
                </div>
            </c:forEach>
            
            <div class="col-sm-3"> 
                <div class="card">
                    <div class="card-body">
                        <c:forEach var="dpedc" items="${DetalPA}" end = "0">
                            <label>SUB TOTAL: </label>
                            <input type="text" value="S/.${Math.round(ffff*100)/100}" readonly="" class="form-control">
                            <label>IGV: </label>
                            <input type="text" value="${dpedc.igv} %" readonly="" class="form-control">
                            <label>ENVIO: </label>
                            <input type="text" value="S/.${dpedc.envio_precio}" readonly="" class="form-control">
                            <label>TOTAL A PAGAR:</label>
                            <input type="text" value="S/.${Math.round(((dpedc.igv*ffff)+(ffff+dpedc.envio_precio))*100)/100}" readonly="" class="form-control">
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