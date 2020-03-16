<%-- 
    Document   : json1
    Created on : Mar 14, 2020, 8:51:38 AM
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
        <script>
            person={"name":"amit","age":20};
            str=JSON.stringify(person);
            
            document.write(str);
            document.write("<br/>"+person);
            document.write("<br/"+person.name+"<br/>"+person['age']);
            document.write("<br/>"+str['name']); //error
            document.write("<br/>"+str[0]);
            
            
            
            json='{"name":"amit","age":20}';
            obj=person.parse(JSON);
            document.write("<br/> the name is " );
        </script>
    </body>
</html>
