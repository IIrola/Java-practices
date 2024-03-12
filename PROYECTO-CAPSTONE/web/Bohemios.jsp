

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Anton&family=Big+Shoulders+Inline+Text:wght@900&family=Noto+Sans+KR:wght@900&family=Playfair+Display:wght@600&display=swap" rel="stylesheet">
    <style>
         #titulo{
            text-align:center ;
            background:black;
            color:white;
            height:100px;
        }
        .medio{
            width:100%;
            height:50px;
            padding-top:9px;
            background: #FDC830;  /* fallback for old browsers */
            background: -webkit-linear-gradient(to right, #F37335, #FDC830);  /* Chrome 10-25, Safari 5.1-6 */
            background: linear-gradient(to right, #F37335, #FDC830); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
;
        }
        .medio  h2 {
            text-align: center;
           
        }
        
        
        .medio .ventalicor{
            text-align:center;
            font-size:55px;
            font-family: 'Heebo', sans-serif;

            padding-top:10px;
        }
        .medio:hover{
            background: black;
            color:white;
        }
        .medio .licores{
            text-align:center;
            font-size:20px;
            font-family: 'Heebo', sans-serif;
            padding-bottom:30px;
           
        }
        
        .imagenes{
          
            margin-top: 8px;
            width: 100%;
            float: left;
        }
        
        
        .contenedorNL p{
            font-size: 35px;
            
            text-align: center;
            color:#000;
           height: 400px;
           line-height: 380px;
           position: relative;
           bottom: 180px;
                  
        }
        .column-general{
            background: #dbdcde;
            height: 550px;
        }
        .columna{
            position: relative;
            left: 350px;
            top: 40px;
           margin:20px;
        }
        
        
        
        .contenido{
            position: relative;
            top: 30px;
            left: 30px;
        }
        
        .contacto{
           
            height: 400px;
            text-align: center;
        }
       
            th, td{
    padding-left: 30px;
    margin-left: 40px;
    padding-bottom: 12px;
    }
    </style>
    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bohemios</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">     
        <link href="CSS/estilo.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        
           
        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="Img/portada-libreria.jpg" style="width:102%;height:525px;" alt=""/>
                </div>
                <div class="carousel-item">
                    <img src="Img/portada-libreria2.jpg" style="width:102%;height:525px;" alt=""/>
                </div>
                <div class="carousel-item">
                    <img src="Img/portada-3.jpg" style="width:102%;height:525px;" alt=""/>

                </div>
            </div>
            
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
        
        
        
        
         <div class="medio">
             
             <h2> EMPRESA  DISTRIBUIDORA <span>LIBRERÍA GINO E.I.R.L </span> te da la bienvenida</h2>
             
         </div>
         
         <div class="imagenes">
            
           <img src="Img/utiles-1.png" style="width:318px;height:340px;"  alt="carteras">
             <img src="Img/utiles-2.jpg" style="width:316px;height:340px;" alt="blusas">
             <img src="Img/utiles-3.jpg"  style="width:313px;height:340px;" alt="polos">
             <img src="Img/utiles-4.jpg" style="width:315px;height:340px;" alt="leggins"><br><br>
            
         </div>
         
         <section class="contenedorNL">
             <p>NUEVOS LANZAMIENTOS 2022</p>
		<div class="imagenes">
                    <img src="Img/utiles-5.jpg"  width="310" height="200"alt="lanzamiento1"/>
                    <img src="Img/utiles-6.jpg"  width="310" height="200"alt="lanzamiento2"/>
                    <img src="Img/utiles-7.jpg"  width="330" height="200"alt="lanzamiento3"/>
                    <img src="Img/utiles-8.png"  width="320" height="200" alt="lanzamiento4"/>
		</div>
       </section>
         
         
         <div class="column-general">        
        
	<table class="columna">
			
                        <tr>
				<th> Libreria Gino</th>
				<th> Categorias </th>
				<th> Atención al cliente </th>				
			</tr>	

			<tr>
				<td>Trabaja con nosotros</td>
				<td>Ropas de colegio</td>
				<td>Preguntas frecuentes</td>				
			</tr>	

			<tr>
				<td>Nosotros</td>
				<td>Uniforme para varon</td>
				<td>Terminos y condiciones</td>				
			</tr>	

			<tr>
				<td>Corporacion Libreria Gino</td>
				<td>Mochilas</td>
				<td>Cambios y devoluciones</td>				
			</tr>	
			<tr>
				<td>Librerias</td>
				<td>Pantalones escolares para dama</td>
				<td>Politica y proteccion de datos</td>				
			</tr>	
			<tr>
				<td>Contactanos</td>
				<td>Accesorios </td>
				<td>Bases legales</td>
			</tr>

			<tr>
				<td></td>
				<td>Utiles para colegio </td>
				<td>Ley que regula el plastico</td>
			</tr>

			<tr>
				<td></td>
				<td></td>
				<td>Condiciones y permisos</td>
			</tr>		
		</table>
         </div>
         
          
         
         <section class="contacto">
             
             
             
             <h2>Contáctanos</h2>  
              
             
                   
                 <p>¿Tienes alguna solicitud o entrega especial? </p>
                 <p> Escríbenos para obtener más información.</p><br><br>
            
             
                 <p><b>Libreria GINO.SAC</b></p>
           <p> Oficina Central:  Mz J Lte 23 - Callao,Ventanilla-Perú</p>
           <p><b>Ciudad de Perú</b></p>
             <p>Celular:987231235</p>
             <p>E-mail: Libreria_Gino@hotmail.com</p>
             
             
             

             
         </section>
         
         
         
         
         <footer class="footer">
             <p style="background: black;color: white; text-align: center;margin-top: 3px;">Capstone 2022 s© Todos los derechos reservados</p>
</footer>
         
         
         
         
        <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="js/funciones.js" type="text/javascript"></script>
    </body>
</html>