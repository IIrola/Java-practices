
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <style>
            body{
                background: #ADA996;  /* fallback for old browsers */
                background: -webkit-linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996);  /* Chrome 10-25, Safari 5.1-6 */
                background: linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */

            }
            </style>
            
        
            

            
    </scrip> </scrip>
    </head>
    <body>   
             <%
    HttpSession sesion = request.getSession();
    
       if(sesion.getAttribute("cod_cliente")==null || sesion.getAttribute("cod_cliente")=="0"){
                  response.sendRedirect("index.jsp");
                 }
   
       
    %>

    
   
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="Controlador?accion=Bohemios" target="myFrame">LIBRERÍA GINO</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="Controlador?accion=Tienda" target="myFrame">Tienda<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="Controlador?accion=Carrito" target="myFrame">Carrito<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active"><a class="nav-link"> </a></li>
                    
                </ul>
                
                <div class="dropdown text-center">
                    
                    <%--<strong style="color:white;"> <%out.print(sesion.getAttribute("cli_nombre"));%></strong>--%>
                    <img src="Img/icono.png" width="30px"/>
                    
                    <button style="border: none;margin-right:50px;" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        ${CleintesL.getCli_nombre()} 
                        ${CleintesL.getCli_ap_paterno()}
                        ${CleintesL.getCli_ap_materno()}
                        <%out.print(sesion.getAttribute("cli_nombre"));%>
                        <%out.print(sesion.getAttribute("cli_ap_paterno"));%>
                        <%out.print(sesion.getAttribute("cli_ap_materno"));%>
                        
                        
                    </button>
                    <div class="dropdown-menu text-center" aria-labelledby="dropdownMenuButton">
                     <a class="dropdown-item" href="Controlador?accion=PedidosCliente&menu5=ListarPedidosCliente" target="myFrame">Mis Pedidos</a>
                        <a class="dropdown-item" href="Controlador?accion=Perfil&menu2=ListarClientes" target="myFrame">Perfil</a>
                        <a class="dropdown-item" href="LogOut.jsp" target="">Salir</a>
                    </div>
                </div>
            </div>
        </nav>
                    
                       

        <div class="m-4" style="height: 950px;">
            <iframe name="myFrame" style="height: 100% ; width: 100%;border: none"></iframe>
        </div>
                        
                        
                         
                              
                    


        <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="js/funciones.js" type="text/javascript"></script>
    </body>
    
    
    
</html>
