<%-- 
    Document   : sum2
    Created on : Feb 29, 2020, 8:18:01 AM
    Author     : anushikha

working with EL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>JSP Page</title>

    </head>

    <body>

      
        
        <form method="post">

            Enter first no  :<input type="text" name="n1" value="${param.n1}"/><br/>

            Enter second no :<input type="text" name="n2" value="${param.n2}"/><br/>

            
            <input type="submit" name="submit" value="Add"/>

        </form>


        <%if(request.getParameter("submit")!=null){%>

        <b>First no =${param.n1}<br/> <br/>

            Second no=${param.n2}<br/></b>

            <br/>

            <h2>sum =${param.n1+param.n2}<br/></h2>

            
            <%}%>

    </body>

</html>


