<%-- 
    Document   : Tienda
    Created on : 15/10/2020, 12:03:49 AM
    Author     : leoce
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


        <link href="CSS/tienda.css" rel="stylesheet" type="text/css"/>
        <script src="js/buscador.js" type="text/javascript"></script>


        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <!-- JavaScript -->
        <script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>

        <!-- CSS -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.min.css"/>
        <!-- Default theme -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/default.min.css"/>
        <!-- Semantic UI theme -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/semantic.min.css"/>
        <!-- Bootstrap theme -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/bootstrap.min.css"/>
       
        <!-- 
            RTL version
        -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.rtl.min.css"/>
        <!-- Default theme -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/default.rtl.min.css"/>
        <!-- Semantic UI theme -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/semantic.rtl.min.css"/>
        <!-- Bootstrap theme -->
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/bootstrap.rtl.min.css"/>
        <script src="{PATH}/alertify.min.js"></script>
        <!-- include the style -->
        <link rel="stylesheet" href="{PATH}/alertify.min.css" />
        <!-- include a theme -->
        <link rel="stylesheet" href="{PATH}/themes/default.min.css" />

        <script src="js/alertify.js" type="text/javascript"></script>
        <script src="js/alertify.min.js" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="alertify/alertify.js" type=text/javascript"></script>

        <link href="alertifyjs/css/alertify.css" rel="stylesheet">
        <link href="alertifyjs/css/themes/default.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    
        <style>
            body{
                background: #ADA996;  /* fallback for old browsers */
                background: -webkit-linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996);  /* Chrome 10-25, Safari 5.1-6 */
                background: linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
            }
            
            span{
                color:#FDC830;
            }
            h1{
                font-family:'Arial';
                text-align: center;
                height: 50px;
                line-height: 50px;
                background: #000;
                color: #fff;
            }
            
            
        </style>
    </head>
    <body>
        <div class="row">
            <div class="col-sm-12">
                <h1>  EMPRESA  DISTRIBUIDORA <span> LIBRERÍA GINO E.I.R.L </span></h1>
            </div>
            <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="Img/portada-libreria.jpg" style="width:1300px;height:490px;" alt=""/>
                </div>
                <div class="carousel-item">
                    <img src="Img/portada-libreria2.jpg" style="width:1300px;height:490px;" alt=""/>
                </div>
                <div class="carousel-item">
                    <img src="Img/portada-3.jpg" style="width:1300px;height:490px;" alt=""/>

                </div>
            </div>
                <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
                <br>
            </div> 

            <div class="col-sm-4">
            </div>
            <div class="col-sm-4 text-center">
                <strong style="margin-left:25px;position:relative;left: 70px; font-size: 22px; ">Buscar: </strong>
            </div>
            <div class="col-md-4">
                <input style="position:relative;right: 110px;" type="text" name="txtBuscar" class="form-control" size="50" placeholder="Categoria o descripción" id="searchTerm" onkeyup="doSearch()">  
            </div>
            <br>
            <div class="col-sm-12">
                <br>
                <form  action="Controlador?accion=Tienda" method="POST" class="form-inline container" >
                    <div class="col-sm-12 container">
                        <table id="datos" style="text-align: center" class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Categoria</th>
                                    <th>Descripcion</th>
                                    <th>Precio</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            
                            
                            <tbody style="text-align: center">
                                <c:forEach var="p" items="${productos}">
                                    <tr align="center">
                                        <td>${p.descripcion_categoria}</td>
                                        <td>${p.prod_descripcion}</td>
                                        <td>${p.prod_precio}</td>
                                        <td>
                                            <!--Añadiendo alerta carrito -->
                                            <a class="btn btn-outline-info" href="Controlador?accion=AgregarCarrito&cod_prod=${p.getCod_producto()}">Agregar al Carrito</a>
                                            <a class="btn btn-danger" href="Controlador?accion=Comprar&cod_prod=${p.getCod_producto()}">Comprar</a>
                                        </td>
                               
                                    </tr>
                                </c:forEach>
                            </tbody>
                             
                            
                        </table>
                    </div>
                </form>
            </div>
        </div>

      

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

        <script src="js/funciones.js" type="text/javascript"></script>
    </body>
</html>
