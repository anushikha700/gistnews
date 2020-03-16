package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 int id=Integer.parseInt(request.getParameter("id"));
            Connection con=null;
            PreparedStatement stmt =null;
            
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gisttraining","root","root");
                String sql= "Select * from user where id=?";
                stmt.setInt(1,id);
                stmt=con.prepareStatement(sql);
                ResultSet rs= stmt.executeQuery();
                
                if(rs.next()){ 
      out.write("\n");
      out.write("                <form action=\"UserController?op=update & id= ");
      out.print(rs.getString("id"));
      out.write("\" method =\"post\">\n");
      out.write("                    \n");
      out.write("                <center>\n");
      out.write("\n");
      out.write("                <h2> Update User's Data </h2>\n");
      out.write("\n");
      out.write("                <table width=\"600\">\n");
      out.write(" \n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>Name </td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" required=\"required\" autocomplete=\"off\" value=\"");
      out.print(rs.getString("name"));
      out.write("\"/> </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td>Father's Name </td>\n");
      out.write("                     <td><input type=\"text\" name=\"fname\" required=\"required\" value=\"");
      out.print(rs.getString("fname"));
      out.write("\"/> </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("\n");
      out.write("                    <td>your DOB  </td>\n");
      out.write("                    <td><input type=\"date\" name=\"dob\" value=\"");
      out.print(rs.getString("dob"));
      out.write("\" /> </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>Your Gender </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"Male\" ");
if (rs.getString("gender").equalsIgnoreCase("Male"))out.println("checked='checked'"); 
      out.write("  /> Male<br/>\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"Female\" ");
if (rs.getString("gender").equalsIgnoreCase("FeMale"))out.println("checked='checked'"); 
      out.write(" />Female<br/>\n");
      out.write("                    </td>\n");
      out.write("                </tr> \n");
      out.write("                <td>Selected Hobbies : </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"checkbox\" name=\"hobbies\" value=\"Dancing\" ");
if (rs.getString("hobbies").contains("Dancing"))out.println("checked='checked'"); 
      out.write(" />Dancing\n");
      out.write("                     <input type=\"checkbox\" name=\"hobbies\" value=\"Singing\" ");
if (rs.getString("hobbies").contains("Singing"))out.println("checked='checked'"); 
      out.write("/>Singing <br/>\n");
      out.write("                    <input type=\"checkbox\" name=\"hobbies\" value=\"Cooking\"  ");
if (rs.getString("hobbies").contains("Cooking"))out.println("checked='checked'"); 
      out.write("/>Cooking\n");
      out.write("                    <input type=\"checkbox\" name=\"hobbies\" value=\"Drawing\"  ");
if (rs.getString("hobbies").contains("Drawing"))out.println("checked='checked'"); 
      out.write("/>Drawing\n");
      out.write("                 </td>\n");
      out.write("                </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("                 \n");
      out.write("                <th colspan=\"2\">\n");
      out.write("\n");
      out.write("                    <input type=\"reset\" value=\"Clear\" />\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" value=\"Update\"/>\n");
      out.write(" \n");
      out.write("                </th>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            \n");
      out.write("             </table>\n");
      out.write("\n");
      out.write("        </center>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("   ");

       }stmt.close();
       con.close();
      }
    catch(Exception e)
        {
            System.out.println("Error :"+e.getMessage());
        }
       
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
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
