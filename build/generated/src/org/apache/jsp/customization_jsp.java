package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customization_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .style1 {\n");
      out.write("\n");
      out.write("                font-size: 20px;\n");
      out.write("\n");
      out.write("                font-family: corbel;\n");
      out.write("\n");
      out.write("                color:blue;\n");
      out.write("\n");
      out.write("                background-color: #d1ecf1;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .style2 {\n");
      out.write("\n");
      out.write("                font-size: 20px;\n");
      out.write("\n");
      out.write("                font-family: corbel;\n");
      out.write("\n");
      out.write("                color: wheat;\n");
      out.write("\n");
      out.write("                background-color: darkmagenta;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write(" \n");
      out.write("         $(document).ready(function(){\n");
      out.write("\n");
      out.write("             $(\"input\").click(function(){\n");
      out.write("\n");
      out.write("                $(\"#f1\").submit();\n");
      out.write("\n");
      out.write("             });\n");
      out.write("\n");
      out.write("         });\n");
      out.write("   \n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");


        String theam_class="style1";
 
        Cookie cookis[] = request.getCookies();

        for (Cookie c : cookis)

            if (c.getName().equals("style"))

                theam_class = c.getValue();

        
        
        if(request.getParameter("style")!=null) {

              theam_class = request.getParameter("style");

              Cookie c = new Cookie("style", theam_class);
 
              c.setMaxAge(60*60*24*30);

              response.addCookie(c);

        }

          
        
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <form method=\"post\" id=\"f1\">\n");
      out.write(" \n");
      out.write("                    <input type=\"radio\" value=\"style1\" name=\"style\" ");
if(theam_class.equals("style1")) out.println("checked");
      out.write("/>Light Theam\n");
      out.write(" \n");
      out.write("                <input type=\"radio\" value=\"style2\" name=\"style\" ");
if(theam_class.equals("style2")) out.println("checked");
      out.write("/>Dark Theam\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("            <div  class=\"row ");
      out.print(theam_class);
      out.write("\" style=\"height: 200px\">\n");
      out.write("\n");
      out.write("            this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.\n");
      out.write("\n");
      out.write("            this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.\n");
      out.write("  this is gist technosolutions.\n");
      out.write("            this is gist technosolutions.  this is gist technosolutions.\n");
      out.write("  this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.\n");
      out.write("  this is gist technosolutions.  this is gist technosolutions.\n");
      out.write("\n");
      out.write("\n");
      out.write("            this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.\n");
      out.write("  this is gist technosolutions.\n");
      out.write("            this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.\n");
      out.write("\n");
      out.write("            this is gist technosolutions.  this is gist technosolutions.\n");
      out.write("\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
