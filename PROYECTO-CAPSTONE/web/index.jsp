<%@page import="java.util.List"%>
<%@page import="modelo.Cliente"%>
<%@page import="modelo.ClienteDAO"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--favicon-->
        <title>Login</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="CSS/alertify.min.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/default.min.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/fondoLogin.css" rel="stylesheet" type="text/css"/>
        <script src="js/validaciones.js" type="text/javascript"></script>

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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
        <link rel="stylesheet" href="CSS/estilos.css">
        <script
            src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" data-auto-a11y="true"
        ></script>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans|Montez|Pathway+Gothic+One" rel="stylesheet">
        <!--RTL version-->
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
        <link rel="stylesheet" type="text/css" href="CSS/spinner.css">
        <style>
            .subir{
                float:right;
                padding-bottom:-50%;
            }
            
            body {
                background-image: url(Img/portada-login_1.jpg)
            }
        </style>

    </head>
    <body>

        <div id="contenedor_carga">
            <div id="carga"></div>
        </div>

        <form name="frmIndex"   action="index.jsp" method="POST">
                 
            <div class="contenedor" >
                <header style="background:#bbc2bf ">
                    <img src="" style="margin-left:20px;">
                    <a  align="right" href="#" data-toggle="modal" data-target="#myModal" style=" background:#bbc2bf ; width: 1930px; position: relative;left: 600px;" >Registrate...</a>
                </header>
                <div class="login animate__animated animate__rotateIn">
                    <article class="fondo">
                        <img src="Img/logotipo.png" alt=""/>
                        <h3>LOGIN - INICIO DE SESIÓN</h3>  
                        <i class="fas fa-user"></i> <input type="email" name="txtuser1" class=" inp" placeholder="email@example.com" onkeypress="return Email(event)" maxlength="50" style="text-transform: lowercase" onpaste="return false"  required="">      
                        <i class="fas fa-key"></i><input  type="password" id="pass2" name="txtpass1" class="inp" placeholder="ejemplo123" onkeypress="return Contrasena(event)" maxlength="20" onpaste="return false" required="">
                      
                        <input class="boton" type="submit" name="btnIngresar" value="Ingresar">
                      
                    </article>
                </div>
            </div>
        </form>

        <div class="modal fade" id="myModal" tabindex="-1" role="dialog">
            <div class="modal-dialog modal-dialog-centered" role="document">                
                <div class="modal-content">                   
                    <div class="modal-body"> 
                        <!-- Registrarse -->
                        <form action="index.jsp"  method="POST">
                            <%--      <form action="Controlador?accion=Productos" method="POST" >--%>
                            <div class="form-group">
                                <h1 align="center"><label>CREAR UNA CUENTA</label></h1>
                                <p style="position:relative; left:150px; bottom:15px;">Registrase es facil</p>
                                <div class="form-group">
                                    <label>Nombre (<span style="color: #ff0000;">*</span>)</label>
                                    <%--<input type="text" name="txtnom"  class="form-control" placeholder="Leo Estif" onkeypress="return validarTexto(event)" onkeypress=" return SoloLetras(event)" maxlength="50" onpaste="false">--%>
                                    <input type="text" name="txtNommbreNuevo"  class="form-control" placeholder="Nombres" onkeypress="return SoloLetras(event)" maxlength="50" minlength="1" onpaste="return false" required="">
                                </div>
                                <div class="form-group">
                                    <label>Apellido paterno (<span style="color: #ff0000;">*</span>)</label>
                                    <input type="text" name="txtApellidoPaterno" class="form-control" placeholder="Apellido paterno" onkeypress="return SoloLetras(event)" maxlength="20" minlength="1" onpaste="return false" required="">
                                </div>
                                <div class="form-group">
                                    <label>Apellido materno (<span style="color: #ff0000;">*</span>)</label>
                                    <input type="text" name="txtApellidoMaterno" class="form-control" placeholder="Apellido materno" onkeypress="return SoloLetras(event)" maxlength="20" minlength="1" onpaste="return false" required="">
                                </div>
                                <div class="form-group">
                                    <label>Dni - CE (<span style="color: #ff0000;">*</span>)</label>
                                    <input type="text" name="txtDni" class="form-control" placeholder="01245678" onkeypress="return SoloNumeros(event)" maxlength="8" minlength="8" onpaste="return false" required=""> 
                                </div>
                                <div class="form-group">
                                    <label>Celular (<span style="color: #ff0000;">*</span>)</label>
                                    <input type="text" name="txtCelular" class="form-control" placeholder="999999999" onkeypress="return SoloNumeros(event)" maxlength="9" minlength="9" onpaste="return false" required="">
                                </div>
                                <div class="form-group">
                                    <label>Direccion (<span style="color: #ff0000;">*</span>)</label>
                                    <input type="text" name="txtDireccion" class="form-control" placeholder="Jr. Av. Psje. 123" onkeypress="return LetrasNumeros(event)" maxlength="50" minlength="1" onpaste="return false" required="">
                                </div>
                                <div class="form-group">
                                    <label>Email address (<span style="color: #ff0000;">*</span>)</label>
                                    <input type="text" name="txtEmail" class="form-control" placeholder="email@example.com" onkeypress="return Email(event)" maxlength="50" minlength="5" style="text-transform: lowercase" onpaste="return false"  required="">     
                                </div>
                                <div class="form-group">
                                    <label>Password (<span style="color: #ff0000;">*</span>)</label>
                                    <div class="input-group-append">
                                        <input type="Password" id="pass" name="txtPass" class="form-control" placeholder="ejemplo123" onkeypress="return Contrasena(event)" maxlength="20" minlength="6" onpaste="return false" required="">
                                        <button id="show_password" class="btn btn-primary" type="button" onclick="MostrarPassword()"> <span class="fa fa-eye-slash icon"></span> </button>    
                                    </div>
                                </div>     
                            </div>

                            <input align="right" type="submit" name="RegistroNuevo" value="Registrar" class="btn btn-info">
                        </form>
                    </div>   
                </div>
            </div>
        </div>

        <%
            if (request.getParameter("RegistroNuevo")!=null){
                ClienteDAO cdao = new ClienteDAO();
                Cliente cl = new Cliente();
                List<Cliente> cl_lst = cdao.ListarClientes();

                String NombreNuevo      = (String) request.getParameter("txtNommbreNuevo");
                String Apellido_paterno = (String) request.getParameter("txtApellidoPaterno");
                String Apellido_materno = (String) request.getParameter("txtApellidoMaterno");
                String Dni              = (String) request.getParameter("txtDni");
                String Celular          = (String) request.getParameter("txtCelular");
                String Direccion        = (String) request.getParameter("txtDireccion");
                String Correo           = (String) request.getParameter("txtEmail");
                String Password         = (String) request.getParameter("txtPass");

                cl.setCli_nombre(NombreNuevo);
                cl.setCli_ap_paterno(Apellido_paterno);
                cl.setCli_ap_materno(Apellido_materno);
                cl.setCli_dni(Dni);
                cl.setCli_direccion(Celular);
                cl.setCli_celular(Direccion);
                cl.setCorreo(Correo);
                cl.setPassword(Password);

                cdao.AgregarCLiente(cl);
            }
        %>

        <!--Modelo-->
        <%                Connection c = null;
            Statement st = null;
            ResultSet rs = null;
            PreparedStatement ps = null;

            if (request.getParameter("btnIngresar") != null) {
                ClienteDAO cdao = new ClienteDAO();
                Cliente cl = new Cliente();
                List<Cliente> clie = cdao.ListarClientes();
                List listaClientes = cdao.ListarClientes();
                request.setAttribute("clientes", listaClientes);

                String user = request.getParameter("txtuser1");
                String pass = request.getParameter("txtpass1");
                HttpSession sesion = request.getSession();
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    String url = "jdbc:sqlserver://LAPTOP-HC3FCUDR:1433;databaseName=carritocompra";
                    c = DriverManager.getConnection(url,"usuario1","12345");
                    st = c.createStatement();
                    rs = st.executeQuery("select * from CLIENTE where correo='" + user + "' AND password='" + pass + "'");

                    while (rs.next()) {
                        sesion.setAttribute("correo", rs.getString("correo"));
                        sesion.setAttribute("password", rs.getString("password"));
                        sesion.setAttribute("cod_cliente", rs.getString("cod_cliente"));
                        sesion.setAttribute("cli_nombre", rs.getString("cli_nombre"));
                        sesion.setAttribute("cli_ap_paterno", rs.getString("cli_ap_paterno"));
                        sesion.setAttribute("cli_ap_materno", rs.getString("cli_ap_materno"));
                        sesion.setAttribute("cli_dni", rs.getString("cli_dni"));
                        sesion.setAttribute("cli_celular", rs.getString("cli_celular"));
                        sesion.setAttribute("cli_direccion", rs.getString("cli_direccion"));

                        if ((sesion.getAttribute("cod_cliente").equals("1"))) {
                            response.sendRedirect("Controlador?accion=Principal");
                        } else {
                            response.sendRedirect("PrincipalCliente.jsp");
                        }
                    }
                    out.print("<div class=\"alert alert-danger subir\" role=\"alert\">Usuario no Valido!!</");
                } catch (Exception e) {
                }
            }
        %>       

        <script>
            window.onload = function () {
                var contenedor = document.getElementById('contenedor_carga');

                contenedor.style.visibility = 'hidden';
                contenedor.style.opacity = '0';
            }
        </script>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="CSS/alertify.min.js" type="text/javascript"></script>
    </body>
</html>
