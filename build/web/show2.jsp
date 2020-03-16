<%-- 
    Document   : show2
    Created on : Mar 1, 2020, 11:46:33 PM
    Author     : anushikha
--%>

<%@page import="session.first.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <h1>Contact Details are: </h1>
      <jsp:useBean class="session.first.Person" id="person" scope="session"></jsp:useBean>
         <%
           String islogin = (String) session.getAttribute("loggedin");
            if (person==null){
                response.sendRedirect("reg.jsp");
                return;
            }
            if (islogin==null ||  !islogin.equals("yes"))
            {
                response.sendRedirect("login2.jsp");
                return;
            }
           
           %>
            
            <h2>contact no.: ${person.contact} ><br/>
            Address : ${person.address} </h2>
    </body>
</html>

