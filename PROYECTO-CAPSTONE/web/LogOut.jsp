<%-- 
    Document   : LogOut
    Created on : 23-nov-2020, 2:34:01
    Author     : Sistema
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background: #ADA996;  /* fallback for old browsers */
                background: -webkit-linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996);  /* Chrome 10-25, Safari 5.1-6 */
                background: linear-gradient(to right, #EAEAEA, #DBDBDB, #F2F2F2, #ADA996); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */

            }
        </style>
    </head>
    
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
            height:500px;
            padding-top:100px;
            background: #FDC830;  /* fallback for old browsers */
            background: -webkit-linear-gradient(to right, #F37335, #FDC830);  /* Chrome 10-25, Safari 5.1-6 */
            background: linear-gradient(to right, #F37335, #FDC830); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
;
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
        footer{
            background: #3E5151;  /* fallback for old browsers */
            background: -webkit-linear-gradient(to right, #DECBA4, #3E5151);  /* Chrome 10-25, Safari 5.1-6 */
            background: linear-gradient(to right, #DECBA4, #3E5151); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
            width: 100%;
            height:300px;
            text-align: center;
            padding-top:100px;
             font-size:20px;
            font-family: 'Heebo', sans-serif;
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
    
    
    
    
    
    
   
        <h1>ERRRRORRRRRRR</h1>
        <%
        HttpSession sesion=request.getSession();
        sesion.invalidate();
        response.sendRedirect("index.jsp");        
        %>
        
        
    </body>
</html>
