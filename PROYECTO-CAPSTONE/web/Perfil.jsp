<%-- 
    Document   : Perfil
    Created on : 12/10/2020, 06:36:33 PM
    Author     : leoce
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="js/validaciones.js" type="text/javascript"></script>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
         <style>
            body{
                background: #ADA996;  /* fallback for old browsers */
                background: -webkit-linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996);  /* Chrome 10-25, Safari 5.1-6 */
                background: linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */

            }
        </style>
    </head>
    <%
    HttpSession sesion = request.getSession();
    
    %>
   
    <body>
        
        
        <h1 align="center">Perfil</h1>
        <br>
        <div class="d-flex">
            <div class="card col-sm-4 animate__animated animate__flip" style="margin-left:35%; " >
                <div class="card-body">

                    <form action="Controlador?accion=Perfil" method="POST" >
                        <div class="form-group">
                            <label>DNI:</label>
                            <input type="text" value="${CleintesL.getCli_dni()}" name="txtdni1" class="form-control" onkeypress="return SoloNumeros()(event)" maxlength="8" minlength="8" onpaste="return false" required="">
                        </div>
                        <div class="form-group">
                            <label>Nombre:</label>
                            <input type="text" value="${CleintesL.getCli_nombre()}" name="txtname1" class="form-control" onkeypress="return SoloLetras(event)" maxlength="50" minlength="1" onpaste="return false" required="">
                        </div>
                         <div class="form-group">
                            <label>Apellido paterno:</label>
                            <input type="text" value="${CleintesL.getCli_ap_paterno()}" name="txtapepaterno1" class="form-control" onkeypress="return SoloLetras(event)" maxlength="20" minlength="1" onpaste="return false" required="">
                        </div>
                         <div class="form-group">
                            <label>Apellido materno:</label>
                            <input type="text" value="${CleintesL.getCli_ap_materno()}" name="txtapematerno1" class="form-control" onkeypress="return SoloLetras(event)" maxlength="20" minlength="1" onpaste="return false" required="">
                        </div>
                        <div class="form-group">
                            <label>Telefono:</label>
                            <input type="text" value="${CleintesL.getCli_celular()}" name="txtcelular1" class="form-control" onkeypress="return SoloNumeros()(event)" maxlength="9" minlength="9" onpaste="return false" required="">
                        </div>
                        <div class="form-group">
                            <label>Direccion:</label>
                            <input type="text" value="${CleintesL.getCli_direccion()}" name="txtdirec1" class="form-control" onkeypress="return LetrasNumeros(event)" maxlength="50" minlength="1" onpaste="return false" required="">
                        </div>
                        <div class="form-group">
                            <label>Correo:</label>
                            <input type="email" value="${CleintesL.getCorreo()}" name="txtcorreo1" class="form-control" onkeypress="return Email(event)" maxlength="50" minlength="5" onpaste="return false" required="" style="text-transform: lowercase">
                        </div>
                       
                        <div class="form-group">
                            <label>Contraseña:</label>
                            <div class="input-group-append">
                                <input type="password" id="pass" value="${CleintesL.getPassword()}" name="txtcontra1" class="form-control" onkeypress="return Contrasena(event)" maxlength="20" onpaste="return false" required="">
                                <button id="show_password" class="btn btn-primary" type="button" onclick="MostrarPassword()"> <span class="fa fa-eye-slash icon"></span> </button>    
                            </div>
                        </div>        
                                
                        <%--
                            <input type="submit" name="ActualizarCliente" value="Actualizar cliente" class="btn btn-success">
                        
                        <input type="submit" value="btnActualiza" name="ActualizarCliente" />
                          <input type="submit" name="accion" value="ActualizarClientes" class="btn btn-success">
                          <a href="Controlador?accion=ActualizarClientes" target="myFrame">Actualiza datos</a>
                             &cod_pedido=${ped.cod_pedido}
                        <input type="submit" value="actualizar" name="ActualizarClientes"/>
                                 <a class="btn btn-info" href="Controlador?accion=ActualizarClientes">Actualiza datos</a>
                        --%>

                            <input type="submit" name="menu2" value="Actualizar mi perfil" class="btn btn-success">                     
                 </form>      
                </div>

            </div> 


        </div>

                        
                        
                        
<form id="form1">
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                
            </div>
        </div>
    </div>
</form>
                        
                                  
                        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>    

</html>
