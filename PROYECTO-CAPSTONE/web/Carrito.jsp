<%-- 
    Document   : Carrito
    Created on : 2/07/2020, 03:53:45 AM
    Author     : leoce
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
        <title>Carrito</title>
        
        <script src="js/validaciones.js" type="text/javascript"></script>
        <style>
            body{
                background: #ADA996;  /* fallback for old browsers */
                background: -webkit-linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996);  /* Chrome 10-25, Safari 5.1-6 */
                background: linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
            }
        </style>
    </head>
    <body>
    
        
        
        <h1 align="center">CARRITO DE COMPRAS</h1>
        <br>
        
        <div class="d-flex">
            
          
            <div class="col-sm-8">         
                <table class="table table-hover">
                    <thead>
                        <tr align="center">
                            <th>Item</th>
                            <th>Categoria</th>
                            <th>Descripcion</th>
                            <th>Precio</th>
                            <th>Cantidad</th>
                            <th>SubTotal</th>
                            <th>Accion</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="car" items="${carrito}">
                            <tr align="center">
                                <td>${car.getItem()}</td>
                                <td>${car.getDescripcion()}</td>
                                <td>${car.getDescripcion_producto()}</td>
                                <td>${car.getPrecioCompra()}</td>
                                <td>
                                    <input type="hidden" id="idpro" value="${car.getCod_prod()}">
                                    <input type="number" id="Cantidad" value="${car.getCantidad()}" class="from-control text-center" min="1" max="20">
                                </td>
                                <td>${car.getSubTotal()}</td>
                                <td>
                                    <input type="hidden" id="item2" value="${car.getCod_prod()}">
                                    <a href="#myFrame" id="deleteItem" class="btn"><i class="fas fa-trash-alt"></i></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>  
            <div class="card col-sm-4">           
                <div class="card-body">
                    <h2>Resumen de Pago</h2>
                    <label>SubTotal:</label>
                    <input type="text" value="S/.${Math.round(totalPagar)*100/100}" readonly="" class="form-control">
                    <label>IGV:</label>
                    <input type="text" value="S/.${Math.round(igv)*100/100}" readonly="" class="form-control">
                    <label>Total a Pagar:</label>
                    <input type="text" value="S/.${Math.round(totalPagar + igv)*100/100}" readonly="" class="form-control">
                </div>
                <div class="card-footer">
                    <a align="right" href="#" data-toggle="modal" data-target="#myModal" class="btn btn-success">Realizar pago</a>
                </div>
            </div>
        </div>
                
                <div class="modal animate__animated animate__fadeInBottomRight" tabindex="-1" role="dialog" id="myModal">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                
                                <form action="Controlador" method="POST">
                                
                                    <div align="center" class="modal-header">
                                        <h5 class="modal-title" style="text-align: center">Esta seguro de realizar la compra?</h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </div>
                                    <div class="modal-body">
                                                                         
                                        <p>Monto</p>
                                        <input type="text" value="S/.${Math.round(totalPagar + igv)*100/100}" name="txtmont" class="form-control" readonly="">
                                    </div>
                                    <div class="modal-footer">
                                        <input type="submit" class="btn btn-info" name="accion" value="Generar Compra" />
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                                    </div>
                                        
                                </form>
                            </div>
                        </div>
                </div>

  
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="js/funciones.js" type="text/javascript"></script>
    </body>
</html>
