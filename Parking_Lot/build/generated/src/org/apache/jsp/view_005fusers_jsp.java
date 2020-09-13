package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.*;
import java.io.*;
import java.sql.Connection.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public final class view_005fusers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Connection conn=null;
    ResultSet rs=null;
    Statement stmt=null;
    Class.forName("org.postgresql.Driver");
    conn=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres","postgres","nallu005");
    stmt=conn.createStatement();
    rs=stmt.executeQuery("select * from parkingregister");
    
      out.write("\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <style type=\"text/css\"> \n");
      out.write("\t\thtml, \n");
      out.write("\t\tbody { \n");
      out.write("\t\t\theight: 200px; \n");
      out.write("\t\t} \n");
      out.write("    .topnav {\n");
      out.write("  background-color: #333;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the links inside the navigation bar */\n");
      out.write(".topnav a {\n");
      out.write("  float: left;\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change the color of links on hover */\n");
      out.write(".topnav a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add a color to the active/current link */\n");
      out.write(".topnav a.active {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("                background-color: blanchedalmond;\n");
      out.write("                 \n");
      out.write("                 background-image: -webkit-linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)), url(\"image1.jpg\");\n");
      out.write("    background-image: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)), url(\"image1.jpeg\");\n");
      out.write("    color: white;\n");
      out.write("                 background-repeat: no-repeat;\n");
      out.write("                 text-color:white;\n");
      out.write("                 background-position: center;\n");
      out.write("                 background-size: cover; \n");
      out.write("                 background-size: 100%;\n");
      out.write("                 background-attachment: fixed;\n");
      out.write("            }\n");
      out.write("\t</style> \n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <div class=\"topnav\">\n");
      out.write("  <a class=\"active\" href=\"#home\">Home</a>\n");
      out.write("  <a href=\"#news\">View Areas</a>\n");
      out.write("  <a href=\"view_users.jsp\">View Users</a>\n");
      out.write("  <a href=\"view_bookings.jsp\">View Bookings</a>\n");
      out.write("</div> \n");
      out.write("        <center>\n");
      out.write("            <h2>View Users</h2>\n");
      out.write("            <table border=\"1\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Name</b></td>\n");
      out.write("                    <td><b>Email</b></td>\n");
      out.write("                 \n");
      out.write("                </tr>\n");
      out.write("                ");

                    while(rs.next()){
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(rs.getString("name1"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }rs.close();stmt.close();conn.close();
      out.write("</table></center></body></html>\n");
      out.write("    \n");
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
