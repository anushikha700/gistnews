<%-- 
    Document   : jquery1
    Created on : Feb 24, 2020, 8:21:58 AM
    Author     : anushikha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="base.jsp"></jsp:include>
        <script type="text/javascript">
            $(document).ready(function(){
                $("#b1").click(function(){
                    alert('hello');
                });   
                $("#b2").click(function(){
                    $("#div1").fadeIn(3000);
                });
                
            });
            </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <button id="b1">Click me</button>
        </br>
        <button id="b2">Click me too</button>
        <div id="div1" style=" height:100px;display:none; background-color: orange" ></div>
    </body>
</html>
