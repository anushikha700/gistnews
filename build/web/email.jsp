<%-- 
    Document   : email
    Created on : Mar 5, 2020, 7:53:12 AM
    Author     : anushikha
--%>

<%@page import="com.utilities.EmailSender"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="base.jsp"></jsp:include>
    </head>
    <body>
        <center>
        <div class="container">
            <div class="row">
                <div class ="col col-md-6" style="text-align: left">
          <form method="post">

              <input type="text"  name="recipients" placeholder="Enter Email" pattern="^(\s?[^\s,]+@[^\s,]+\.[^\s,]+\s?,)*(\s?[^\s,]+@[^\s,]+\.[^\s,]+)$" class="form-control" /><br/>
              Enter Subject: <input type="text" name="subject" class="form-control"/><br/>
              Enter message:<br/>

              <textarea name="message" rows="10" cols="20" class="form-control">
              </textarea>

            

            <input type="submit" value="Send" name="submit" class="btn btn-primary form-control"/>
 
        </form>
          </div>     
         </div>   
       </div>   
            </center>
            <% if (request.getParameter("submit")!=null){
                         String host;
                         String port;
                         String user;
                         String pass;
                         
                         ServletContext context= config.getServletContext();
                         host=context.getInitParameter("host");
                         port=context.getInitParameter("port");
                         user=context.getInitParameter("user");
                         pass=context.getInitParameter("pass");
                         
                         String recipients[]= request.getParameter("recipients").split(",");
                         String subject= request.getParameter("subject");
                         String message= request.getParameter("message");
                         
                         if(EmailSender.sendEmail(host, port, user, pass, recipients, subject, message))
                            out.println("Mail sent successfully");
                         else
                            out.println("<font color='red'> Mail could not be sent!!</font>");
            }      
            %>
    </body>
</html>


