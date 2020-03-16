<%-- 
    Document   : jsp1
    Created on : Feb 18, 2020, 10:46:47 PM
    Author     : anushikha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href= "Servlet1">Click here to open servlet</a>
        <form action="Servlet1" method="get">
            <input type="submit" value="submit using get">
        </form>
        <br/>
        
        <form action="Servlet1" method="post">
            <input type="submit" value="submit using post">
        </form>
        <br/>

        
        
            
    </body>
</html>
