<%-- 
    Document   : sms
    Created on : Mar 4, 2020, 7:38:12 AM
    Author     : anushikha
--%>

<%@page import="com.utilities.SmsSender"%>
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

              <input type="number"  name="mobile" placeholder="Enter mobile no" class="form-control"/><br/>
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
                String message = request.getParameter("message");
                String mobile = request.getParameter("mobile");
                
                String output= SmsSender.sendCampaign("FNFX1355JHI0E8TS4I8TFSWWLE2SH0ZA","YYTQ5OQLXDJ4CVPF","stage",mobile,message,"anghfrde");
               out.println(output);
                if(output.contains("200"))
                out.println("<script>alert('Message Sent');</script>");
                else
                out.println("<script> alert('Message could not be sent');</script>");
                }
                
            %>
    </body>
</html>
