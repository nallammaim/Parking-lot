<%-- 
    Document   : view_users
    Created on : 9 Sep, 2020, 9:45:41 PM
    Author     : nallu
--%>

<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.sql.Connection.*"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.ResultSetMetaData"%>
<%@ page import="java.sql.Statement"%>
<%
    Connection conn=null;
    ResultSet rs=null;
    Statement stmt=null;
    Class.forName("org.postgresql.Driver");
    conn=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres","postgres","nallu005");
    stmt=conn.createStatement();
    rs=stmt.executeQuery("select * from parkingregister");
    %>
    <html>
        <head>
            <style type="text/css"> 
		html, 
		body { 
			height: 200px; 
		} 
    .topnav {
  background-color: #333;
  overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* Add a color to the active/current link */
.topnav a.active {
  background-color: #4CAF50;
  color: white;
}
body {
                background-color: blanchedalmond;
                 
                 background-image: -webkit-linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)), url("image1.jpeg");
    background-image: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)), url("image1.jpeg");
    color: white;
                 background-repeat: no-repeat;
                 text-color:white;
                 background-position: center;
                 background-size: cover; 
                 background-size: 100%;
                 background-attachment: fixed;
            }
	</style> 
        </head>
        <body>
            <div class="topnav">
  <a class="active" href="#home">Home</a>
  <a href="#news">View Areas</a>
  <a href="view_users.jsp">View Users</a>
  <a href="view_bookings.jsp">View Bookings</a>
</div> 
        <center>
            <h2>View Users</h2>
            <table border="1" cellspacing="0" cellpadding="0">
                <tr>
                    <td><b>Name</b></td>
                    <td><b>Email</b></td>
                 
                </tr>
                <%
                    while(rs.next()){
                        %>
                        <tr>
                            <td><%=rs.getString("name1")%></td>
                            <td><%=rs.getString("email")%></td>
                        </tr>
                        <%
                            }rs.close();stmt.close();conn.close();%></table></center></body></html>
    


