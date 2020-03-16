<%-- 
    Document   : welcome
    Created on : Feb 23, 2020, 11:13:44 AM
    Author     : anushikha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="session.first.Person"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Person person =(Person)session.getAttribute("person");
            String islogin=(String)session.getAttribute("loggedin");
            if(person==null)
            {
               response.sendRedirect("reg.jsp");
               return;
               
               
            }
            if(islogin==null||!islogin.equals("yes"))
            {
                response.sendRedirect("login2.jsp");
                return;
            }
             %> 
            <h1>Welcome <%=person.getName()%></h1>
        
        
        
        
          
    </body>
</html>
