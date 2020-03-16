<%-- 
    Document   : jsp3
    Created on : Feb 18, 2020, 11:32:51 PM
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
        <h1>Hello MANIT!</h1>
         <table>
            <tr>
                <td>Number</td>
                <td>Square</td>
            </tr>
        
        <%
            for(int i=1;i<=10;i++)
            {
        %>
    <tr>
        <td><%=i%></td>
        <td><%=i*i%></td>
        
    </tr>            
         <%   }%>
            
            
      </table>  

    </body>
</html>
