<%-- 
    Document   : reg
    Created on : Feb 28, 2020, 12:43:43 AM
    Author     : anushikha

page to show session . From here it will go to login2 then welcome 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import ="session.first.Person"%>
<!DOCTYPE html>

<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>JSP Page</title>
        <jsp:include page="base.jsp"></jsp:include>

    </head>

    <body>

        <form method="post">

            <input type="text" name="name" placeholder="enter name"/><br/>

            <input type="number" name="age" placeholder="enter age"/><br/>

            <input type="text" name="userid" placeholder="Enter userid"/><br/>

            <input type="password" name="password" placeholder="enter password"/><br/>

            <input type="text" name="contact" placeholder="enter contact no"/><br/>

            <input type="text" name="address" placeholder="Enter address"/><br/>

            <input type="submit" value="Register" name="submit"/>
 
        </form>
 
        
        <% if(request.getParameter("submit")!=null){

            Person person = new Person();

            person.setName(request.getParameter("name"));

            person.setAge(Integer.parseInt(request.getParameter("age")));

            person.setContact(request.getParameter("contact"));
            person.setAddress(request.getParameter("address"));
            person.setUserid(request.getParameter("userid"));
            person.setPassword(request.getParameter("password"));
            
            session.setAttribute("person", person); 
            response.sendRedirect("login2.jsp");
        }
            
            %>
    </body>
</html>

