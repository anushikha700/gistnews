<%-- 
    Document   : city
    Created on : Feb 22, 2020, 6:08:41 PM
    Author     : anushikha
--%>



<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="base.jsp"></jsp:include>
        <script>
            function loadcity(x,y){
                ajax = new XMLHttpRequest();
                ajax.open("GET","AjaxServlet?op=loadcity&sid="+x,true);
                ajax.send();
                
                ajax.onreadystatechange = function(){
                    if (this.readyState==4 && this.status==200){
                        y.innerHTML = this.responseText;
                    }
                };
            }
            </script>
        </head>
        <body>
        <center>
            <div class="container">
                <div class="row">
                    <div class="col col-md-6">
                        <select id="state" class="dropdown-header bg-light" onchange="loadcity(this.value,city)"> 
                            <option value="-1">Select State</option>

                        <%
                            Connection con = null;
                            PreparedStatement smt = null;
                            try { 
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gisttraining", "root", "root");
                                String sql = "select * from states";
                                smt = con.prepareStatement(sql);
                                ResultSet rs = smt.executeQuery();

                                while (rs.next()) {%>
                                <option value="<%=rs.getString("id")%>"> <%=rs.getString("state_name")%> </option> 
                                <% } 
                                    con.close();
                                smt.close();

                            } catch (Exception e) {
                                System.out.println("Error " + e.getMessage());
                            }

                        %>
                    </select>
                    
                    <br/>
                    <select id="city" class="dropdown-header bg-light">
                        <option value="-1">Select City </option>
                    </select>
                </div>
            </div>
        </div>
    </center>
</body>
</html>

