package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class getSubject_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("             function loadCourse(x,y){\n");
      out.write("\n");
      out.write("             y.innerHTML=\"\";\n");
      out.write("\n");
      out.write("              ajax = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("                ajax.open(\"GET\",\"SubjectController?op=list&id=\"+x, true);\n");
      out.write("\n");
      out.write("                ajax.send();\n");
      out.write("\n");
      out.write("                \n");
      out.write("                ajax.onreadystatechange = function(){\n");
      out.write("\n");
      out.write("                  if(this.readyState ==4 && this.status==200){\n");
      out.write("\n");
      out.write("                      y.innerHTML = this.responseText;\n");
      out.write("\n");
      out.write("                  }\n");
      out.write("  \n");
      out.write("                };\n");
      out.write("\n");
      out.write("\n");
      out.write("         }\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <center>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col col-md-6\">\n");
      out.write("                        <select id=\"course\" class=\"dropdown-header bg-light\" onchange=\"loadcourse(this.value,name)\"> \n");
      out.write("                            <option value=\"-1\">Select Course</option>\n");
      out.write("\n");
      out.write("                        ");

                            Connection con = null;
                            PreparedStatement smt = null;
                            try { 
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gisttraining", "root", "root");
                                String sql = "select * from course";
                                smt = con.prepareStatement(sql);
                                ResultSet rs = smt.executeQuery();

                                while (rs.next()) {
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(rs.getString("id"));
      out.write("\"> ");
      out.print(rs.getString("name"));
      out.write(" </option> \n");
      out.write("                                ");
 } 
                                    con.close();
                                smt.close();

                            } catch (Exception e) {
                                System.out.println("Error " + e.getMessage());
                            }

                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
