
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="ico" href="Imagenes/loguito.png">
        <link rel="stylesheet" type="text/css" href="CSS/spinner.css">
    </head>
    <body>   
             <div id="contenedor_carga">
                  <div id="carga"></div>
             </div>
             <%
    HttpSession sesion = request.getSession();
    
       if(sesion.getAttribute("cod_cliente")==null || sesion.getAttribute("cod_cliente")=="0"){
                  response.sendRedirect("index.jsp");
       }
            %>

        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="Controlador?accion=Bohemios" target="myFrame">Walla</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                   
                    <li class="nav-item active"><a class="nav-link"> </a></li>
                    <li class="nav-item">
                        <a class="nav-link " href="Controlador?accion=Productos&menu=ListarProd" target="myFrame">Productos<span class="sr-only">(current)</span></a>
                        
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="Controlador?accion=Proveedor&menu3=ListarProveedores" target="myFrame">Proveedores<span class="sr-only">(current)</span></a>
                    </li>

                    <li class="nav-item active">
                        <div class="dropdown">
                            <div class="dropdown show">
                                <a class="btn btn-secondary dropdown" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Pedidos
                                </a>
                                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                    <a class="dropdown-item" href="Controlador?accion=AcPedido&menu4=ListarPedidos" target="myFrame">Actualizar Pedido</a>
                               <%--     <a class="dropdown-item" href="Controlador?accion=Detalleped&menudet=Listardet" target="myFrame">Lista de pedidos Pendientes</a> --%>
                                </div>
                            </div>
                        </div>
                    </li>

                </ul>
                <div class="dropdown text-center">
                    <img src="Img/percy.png" width="30px"/>
                    <button style="border: none" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        ${CleintesL.getCli_nombre()} 
                        ${CleintesL.getCli_ap_paterno()}
                        ${CleintesL.getCli_ap_materno()}
                    </button>
                    <div class="dropdown-menu text-center" aria-labelledby="dropdownMenuButton">
                        
                        <a class="dropdown-item" href="Controlador?accion=Perfil&menu2=ListarClientes" target="myFrame">Perfil</a>
                        <a class="dropdown-item" href="LogOut.jsp" target="">Salir</a>
                    </div>
                </div>
            </div>
        </nav>

        <div class="m-4" style="height: 950px;">
            <iframe name="myFrame" style="height: 100% ; width: 100%;border: none"></iframe>
            
        </div>
                    
                  
                    
               <script>
            window.onload = function () {
                var contenedor = document.getElementById('contenedor_carga');

                contenedor.style.visibility = 'hidden';
                contenedor.style.opacity = '0';
             }
                </script>     

        <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="js/funciones.js" type="text/javascript"></script>
    </body>
    
    
    
</html>
