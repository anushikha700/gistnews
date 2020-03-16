package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class subjectentry_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col col-md-6 border-dark\" style=\"text-align: left\">\n");
      out.write("                    <form action=\"SubjectController?op=add\" method=\"post\" class=\"form\">\n");
      out.write("                        <input type=\"text\" name=\"subject\" class=\"form-control\" placeholder=\"Enter Subject Name\" required=\"required\"/>\n");
      out.write("                        <br/>\n");
      out.write("                        <h4>Select Courses </h4>\n");
      out.write("                        ");
 
                       // fetch the list of courses in form of checkboxes
                       Connection con =null;
                       PreparedStatement smt=null;
                       try{
                           Class.forName("com.mysql.jdbc.Driver");
                           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gisttraining","root","root");
                           String sql = "Select * from course";
                           smt = con.prepareStatement(sql);
                           ResultSet rs = smt.executeQuery();
                           while(rs.next()){
      out.write("\n");
      out.write("                           <input type=\"checkbox\" name=\"courseIds\" value=\"");
      out.print(rs.getString("id"));
      out.write("\"/>");
      out.print(rs.getString("name"));
      out.write(" <br/>\n");
      out.write("                           ");
}
                            con.close();
                            smt.close();
                       }catch(Exception e){
                           System.out.println("Error " + e.getMessage());
                       }
                        
      out.write("\n");
      out.write("                        <br/>\n");
      out.write("                        <input type=\"submit\" value=\"save\"/>\n");
      out.write("                    </form> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
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
