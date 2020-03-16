package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.utilities.SmsSender;
import com.beans.User;
import java.util.concurrent.ThreadLocalRandom;

public final class reg2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Upload Profile Image</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("            <script>\n");
      out.write("\n");
      out.write("                function readURL(input) {\n");
      out.write("                    if (input.files && input.files[0]) {\n");
      out.write("                        var reader = new FileReader();\n");
      out.write("\n");
      out.write("                        reader.onload = function (e) {\n");
      out.write("                            pic.src = e.target.result;\n");
      out.write("                        };\n");
      out.write("\n");
      out.write("                        reader.readAsDataURL(input.files[0]);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                function validateOtp(x,y,z){\n");
      out.write("                    if(x.trim().length==6){\n");
      out.write("                        if(x==y){\n");
      out.write("                            z.innerHTML =\"<font color='blue'><b>mobile number varified..</b></font>\";\n");
      out.write("                            submit.disabled=false;\n");
      out.write("                            otp.disabled=true;\n");
      out.write("                        }\n");
      out.write("                        else {\n");
      out.write("                             z.innerHTML =\"<font color='red'><b>Invalid OTP</b></font>\";\n");
      out.write("                             submit.disabled=true;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("            \n");
      out.write("        </head>\n");
      out.write("        \n");
      out.write("        <body>\n");
      out.write("        \n");
      out.write("            ");
 if (request.getParameter("submit") == null) {
      out.write("\n");
      out.write("            <h4>Please Complete Registration Form (Part-1) <br/><br/>\n");
      out.write("            <a href=\"reg1.jsp\">Go to Registration page-1 </a></h4>\n");
      out.write("            ");
return;
        }
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col col-md-6\">\n");
      out.write("                    ");
      com.beans.User user = null;
      synchronized (session) {
        user = (com.beans.User) _jspx_page_context.getAttribute("user", PageContext.SESSION_SCOPE);
        if (user == null){
          user = new com.beans.User();
          _jspx_page_context.setAttribute("user", user, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("user"), request);
      out.write("\n");
      out.write("                    ");

        
                        String hobbies[] = request.getParameterValues("hobbies");
                        String hbs = "";
                        for (String s : hobbies) {
                            hbs += s + ",";
                        }
                        user.setHobbies(hbs);

                        //Generate Random OTP and Send to MObile Number- 
                        int otp = ThreadLocalRandom.current().nextInt(100000, 999999);
                        String output = SmsSender.sendCampaign("J2D1AOM721DSLE41CES22OUGXQMXIUQ0", "DX96PF4PNZFO3BUF", "stage", user.getContact(), String.valueOf(otp), "gistec");
                        session.setAttribute("otp", String.valueOf(otp));
                    
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <form enctype=\"multipart/form-data\" action=\"UserController?op=add\" method=\"post\">\n");
      out.write("                        <p>Enter OTP Received in Your Mobile</p>\n");
      out.write("                        <p><input type=\"text\" id=\"otp\" maxlength=\"6\" class=\"form-control\" onkeyup=\"validateOtp(this.value,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${otp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(",s1)\"/>\n");
      out.write("                            <span id=\"s1\"></span>\n");
      out.write("                        </p>\n");
      out.write("                        <p>Select Your Profile Image <p>\n");
      out.write("                        <p>\n");
      out.write("                            <img src=\"assets/images/nophoto.jpg\" style=\"width:200px;height: 200px\" class=\"img\" id=\"pic\"/><br/>\n");
      out.write("                            <input type=\"file\" name=\"photo\" id=\"photoInput\" class=\"form-control\"  onchange=\"readURL(this);\" />\n");
      out.write("                        <p>\n");
      out.write("                            <input type=\"submit\" id=\"submit\" value=\"Register Me\" disabled=\"disabled\"/>\n");
      out.write("                            \n");
      out.write("                        <p><input type=\"submit\" id=\"submit\" value=\"resend otp\"/>    \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
