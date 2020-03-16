package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Array;
import com.beans.Product;
import java.util.ArrayList;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("        ");

            ArrayList<Product> products = new ArrayList();
            Product p = new Product(1, "Shoes", "Mens Shoe Rough and Tough", "media/products/shoe.jpg", 1234.55);
            products.add(p);

            p = new Product(2, "T-shirt", "Mens T-shirt Orange and Red ", "media/products/tshirt.jpg", 570);
            products.add(p);

            p = new Product(3, "WiFi Router", "Modem and Router with speed of 100MBPS", "media/products/router.jpg", 2100);
            products.add(p);

            p = new Product(4, "Samsung Mobile", "Samasung Galaxy S20 with 64 Megapixel Camera", "media/products/phone.jpg", 28000);
            products.add(p);

            session.setAttribute("products", products);
        
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <center>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col col-md-12\">\n");
      out.write("                    \n");
      out.write("                    <h2>My Shopping Site</h2>\n");
      out.write("              \n");
      out.write("                </div> \n");
      out.write("                    ");
 for (Product product : products){
      out.write("\n");
      out.write("                    <div class=\"card col-md-4\" style=\"padding: 10px; margin: 5px;\">\n");
      out.write("                        <form action=\"showcart.jsp\" method=\"post\">\n");
      out.write("                      \n");
      out.write("                    <img class=\"card-img-top\" src=\"");
      out.print(product.getImage());
      out.write("\" alt=\"Card image\" style=\"width:100%\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print(product.getId());
      out.write("\"/>\n");
      out.write("                        <h4 class=\"card-title\">");
      out.print(product.getName());
      out.write(" </h4>\n");
      out.write("                        <p class=\"card-text\">");
      out.print(product.getDescription());
      out.write("</p>\n");
      out.write("                        <p><b>Price : ");
      out.print(product.getPrice());
      out.write("</b></p>\n");
      out.write("                        <p>Select Quantity :<input type=\"number\" name=\"quantity\" value=\"1\" min=\"1\" max=\"5\"/></p>\n");
      out.write("                        <input type=\"submit\" value=\"Add to Cart\" class=\"btn btn-primary\"/>\n");
      out.write("                    </div>\n");
      out.write("                        </form>\n");
      out.write("                        \n");
      out.write("             </div>\n");
      out.write("                    \n");
      out.write("                       ");
}
      out.write("\n");
      out.write("           \n");
      out.write("            </div>\n");
      out.write("            </center>        \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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
