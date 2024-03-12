<%-- 
    Document   : Proveedores
    Created on : 21-nov-2020, 15:39:55
    Author     : Sistema
--%>
<%@page import="java.util.Iterator"%>
<%@page import="modelo.Proveedor"%>
<%@page import="modelo.ProveedorDAO"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
        
    </head>
            <style>
            body{
                 background: #D3CCE3;  /* fallback for old browsers */
background: -webkit-linear-gradient(to bottom, #E9E4F0, #D3CCE3);  /* Chrome 10-25, Safari 5.1-6 */
background: linear-gradient(to bottom, #E9E4F0, #D3CCE3); /* W3C, IE 10+/ Ed, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
            }
        </style>
    <body>
        
        <h1 align="center">Mantenimiento de Proveedores</h1>
        
        <br>
        <%-------------------------------------------------------------------------------------------------------------------%>
        <form action="Controlador?accion=Proveedor" method="POST" class="form-inline" >
            <h5 align="left">Buscar proveedores: &nbsp;</h5>
            <input type="search" name="txtBuscarProveedor" class="form-control col-lg-3" >
            <input type="submit" name="menu3" value="Buscar Proveedor" class="btn btn-info col-sm-1.5">
        </form>
        <%-------------------------------------------------------------------------------------------------------------------%>
        <br>

     
        
        <div class="d-flex">
            <div class="card col-sm-3 animate__animated animate__backInRight provedores" style="background-image:url(Imagenes/franja.png)">
                <p style = "font-size:20pt" align="center">Datos del Proveedor</p>
                <div class="card-body">

                    <form action="Controlador?accion=Proveedor" method="POST" >
                       
                        <div class="form-group">
                            <div class="form-group">
                                <strong>Razon</strong>
                                <input type="text" value="${proveedoresed.getProv_razon()}" name="txtRazon" class="form-control" placeholder="PROVEEDORES SAC" onkeypress="return SoloLetras(event)" maxlength="50" minlength="1" onpaste="return false" required="">
                            </div>
                            <div class="form-group">
                                <strong>Ruc</strong>
                                <input type="text" value="${proveedoresed.getProv_ruc()}" name="txtRuc" class="form-control" placeholder="10254785211" onkeypress="return SoloNumeros()(event)" maxlength="11" minlength="11" onpaste="return false" required="">
                            </div>
                            <div class="form-group">
                                <strong>Celular</strong>
                                <input type="text" value="${proveedoresed.getProv_celular()}" name="txtCelular" class="form-control" placeholder="999999999" onkeypress="return SoloNumeros()(event)" maxlength="9" minlength="9" onpaste="return false" required="">
                            </div>
                            <div class="form-group">
                                <strong>Correo</strong>
                                <input type="text" value="${proveedoresed.getProv_correo()}" name="txtCorreo" class="form-control" placeholder="emal@ejemplo.com"  onkeypress="return Email()(event)" maxlength="20" minlength="5" onpaste="return false" required="" style="text-transform: lowercase">
                            </div>
                        </div>
                        <input type="submit" name="menu3" value="Agregar Proveedor" class="btn btn-info">
                        <br>
                        <br>
                        <input type="submit" name="menu3" value="Actualizar Proveedor" class="btn btn-success">
                    </form>

                </div>
            </div>
            
            
 
            <div class="col-sm-8">
                <p style = "font-size:20pt" align="center">Tabla de Proveedores</p>
                <table style="text-align: center" class="table table-hover">
                    <thead>
                        <tr>
                            <th>Codigo</th>
                            <th>Razon</th>  
                            <th>Ruc</th>
                            <th>Celular</th>
                            <th>Correo</th>                 
                            <th>Acciones</th> 
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="prl" items="${proveedoresl}">
                            <tr>
                                <td>${prl.cod_proveedor}</td>
                                <td>${prl.prov_razon}</td>
                                <td>${prl.prov_ruc}</td>                             
                                <td>${prl.prov_celular}</td>
                                <td>${prl.prov_correo}</td>
                                <td>
                                    <a class="btn btn-warning" href="Controlador?accion=Proveedor&menu3=EditarProveedores&cod_prove=${prl.getCod_proveedor()}">Editar</a>
                                    <a class="btn btn-darnger" href="Controlador?accion=Proveedor&menu3=DeleteProveedores&cod_prove=${prl.getCod_proveedor()}">Eliminar</a>
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
