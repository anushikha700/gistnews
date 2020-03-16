<%-- 
    Document   : reporter
    Created on : Feb 26, 2020, 10:36:29 PM
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

            function checkAccept(x,y){

                if(x.checked){

                    y.disabled=false;

               }

               else

               {

                   y.disabled=true;

               }

            }

            
            function comparePwds(x,y){

                if(x===y)

                    return true;

                else {

                    alert("Password and Confirm Password not matched !!");

                    return false;

                }

            }

            
            function verifyUserid(x,y){

               ajax = new XMLHttpRequest();

                ajax.open("GET","NewsController?op=verify2&userid="+x,true);

                ajax.send();

                
                ajax.onreadystatechange=function(){

                    if (this.readyState==4 && this.status==200){

                        y.innerHTML=this.responseText;

                    }

                };

            }
             function verifyEmail(x,y){

               ajax = new XMLHttpRequest();

                ajax.open("GET","NewsController?op=verify1&email="+x,true);

                ajax.send();

                
                ajax.onreadystatechange=function(){

                    if (this.readyState==4 && this.status==200){

                        y.innerHTML=this.responseText;

                    }

                };

            }
            
        
                
                
        function readURL(input) {
            if (input.files && input.files[0]) {
                var reader = new FileReader();

                reader.onload = function (e) {
                   pic.src= e.target.result;
                };

                reader.readAsDataURL(input.files[0]);
            }
        }
 
        
        </script>
                    <style>
                img{
                     max-width:180px;
                    }
                input[type=file]{
                padding:10px;
                background:#2d2d2d;}
            </style>
 

    </head>

    <body>

        <div class="container">

            <div class="row">

                <div class="col col-md-10">

                    <form enctype="multipart/form-data" action="NewsController?op=add" method="post" class="form" name="regForm" onsubmit="return comparePwds(password.value,rpassword.value);">
  
    <center>

        <h2 class="bg-light">Reporter registration page </h2>

        <table class="table bg-light">
 
            <tr>

                <td>Enter your Name </td>

                <td><input type="text" name="name" required="required" autocomplete="off" class="form-control"/> </td>

            </tr>
            
             <tr>

                <td>Enter contact </td>

                <td><input type="number" name="contact" class="form-control"  /> </td>
            </tr>

            <tr>

                <td>Enter email </td>

                <td><input type="email" required="required" name="email" class="form-control" onblur="verifyEmail(this.value,s1);"/>
                <br/>
                    <span id="s1"> </span>

                </td>

            </tr>
            
            <tr>

                <td>Enter your UserId </td>

                <td><input type="text" name="userid" required="required" autocomplete="off" class="form-control" onblur="verifyUserid(this.value,s2);"/> </td>
                <br/>
                    <span id="s2"> </span>

            </tr>


            
           <tr>

                <td>Enter Password </td>

                <td><input type="password" name="password" id="password" class="form-control" pattern="(?=^.{3,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$"/><br/>

                    <span><b>Password should be minimum 4 char and contains one Upper, one Lowe, one Special and one digit</b></span></td>

            </tr>

            <tr>

                <td>Retype Password </td>

                <td><input type="password" name="rpassword" id="rpassword" class="form-control"/></td>

            </tr>

            
            
                       
            <tr>
                <td>Select Your Profile Image </td>
           <td>
                 <img src="assets/images/notavailable.png" style="width:200px;height: 200px" class="img" id="pic"/><br/>
              <input type="file" name="photo" id="photoInput" class="form-control"  onchange="readURL(this);" />
           </td>
            </tr>
 
            
           
            <tr>

                <th colspan="2">

                    <input type="checkbox" id="accept" value="accept" onchange="checkAccept(this,submit);">Accept Terms and Conditions

                </th>

            </tr>

            <tr>

                 
                <th>

                    <input type="reset" value="Clear" class="form-control btn btn-dark" />

                </th>

                <th>
                <input type="submit" value="submit" class="form-control btn btn-primary" disabled="disabled" id="submit"/>
 
                </th>

            </tr>

            
         </table>

    </center>

        </form>

                </div>

            </div>

        </div>

       
    </body>

</html>


