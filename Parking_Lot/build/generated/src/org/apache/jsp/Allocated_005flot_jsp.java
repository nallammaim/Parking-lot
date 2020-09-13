package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class Allocated_005flot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Allocated lot</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("            * {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                background-color: blanchedalmond;\n");
      out.write("                 \n");
      out.write("                 background-image: -webkit-linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)), url(\"cars.jpg\");\n");
      out.write("    background-image: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)), url(\"cars.jpg\");\n");
      out.write("    color: white;\n");
      out.write("                 background-repeat: no-repeat;\n");
      out.write("                 text-color:white;\n");
      out.write("                 background-position: center;\n");
      out.write("                 background-size: cover; \n");
      out.write("                 background-size: 100%;\n");
      out.write("                 background-attachment: fixed;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #btn{  \n");
      out.write("    font-size: 25px;  \n");
      out.write("    }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                <\n");
      out.write("\n");
      out.write("\n");

    
String username=request.getParameter("name"); 

String email=request.getParameter("email"); 

session.putValue("u",username); 

String vehicle=request.getParameter("vehicle");
String date_of_parking=request.getParameter("dob");
String area=request.getParameter("area");

Class.forName("org.postgresql.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres","postgres","nallu005"); 
Statement st= con.createStatement(); 
ResultSet rs=null; 
int i=st.executeUpdate("insert into bookinglot values('"+username+"','"+email+"','"+vehicle+"','"+date_of_parking+"','"+area+"')"); 
rs=st.executeQuery("select * from bookinglot");


out.println("<h1><center><b>YOUR HAVE SUCCESSFULLY BOOKED YOUR PARKING LOT "+username+"!!!</b></h1><center>"); 
out.println("<h2><center><b>You have A Parking lot at "+area+"on"+date_of_parking+"!!!</b></h1><center>"); 


con.close();


      out.write("\n");
      out.write("        \n");
      out.write("        ");
      Allocated_lot.Allocated_lot bean_id = null;
      synchronized (request) {
        bean_id = (Allocated_lot.Allocated_lot) _jspx_page_context.getAttribute("bean_id", PageContext.REQUEST_SCOPE);
        if (bean_id == null){
          bean_id = new Allocated_lot.Allocated_lot();
          _jspx_page_context.setAttribute("bean_id", bean_id, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 String lot=request.getParameter("My_Menu1");
        bean_id.setAvailable_lot(lot);
      out.write("\n");
      out.write("           \n");
      out.write("        <strong><h2>Your allocated lot is ");
      out.print(bean_id.get_lot());
      out.write("</h2><br/></strong>\n");
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
