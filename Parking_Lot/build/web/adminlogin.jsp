<%-- 
    Document   : adminlogin
    Created on : 9 Sep, 2020, 9:18:58 PM
    Author     : nallu
--%>

<%-- 
    Document   : login
    Created on : 6 Jun, 2020, 3:57:13 PM
    Author     : nallu
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> demo loginjsp</title>
<style>
    B{
        text-transform: uppercase;
        top:50%;
        left:50%;
        transform: translate(-50%, -50%);
        position: absolute;
        font-size:50px;
    }
</style>
</head>
<body>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%
String userid=request.getParameter("usr"); 
session.putValue("userid",userid); 
String pwd=request.getParameter("pwd"); 
out.println(userid);
out.println(pwd);
if(userid.equals("admin") && pwd.equals("admin")){
    out.println("welcome"+userid);
    response.sendRedirect("adminmodule.html");
}else{
    out.println("Invalid access");
}
/*
Class.forName("org.postgresql.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres","postgres","nallu005"); 
Statement st= con.createStatement(); 
ResultSet rs=st.executeQuery("select username,password1 from parkingregister where username='"+userid+"'"); 
if(rs.next()) 
{ 
if(rs.getString(2).equals(pwd)) 
{ 
out.println("welcome "+userid);
response.sendRedirect("usermodule.html"); //logged-in page     
} 
else 
{ 
out.println("Invalid password try again"); 
} 
} 
*/
%>
<CENTER><B>INVALID PASSWORD!!!!<BR><a href="userlogin.html"> Home</a></b></CENTER>
</body>
</html>