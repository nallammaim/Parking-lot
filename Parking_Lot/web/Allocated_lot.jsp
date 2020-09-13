<%-- 
    Document   : Allocated_lot
    Created on : 10 Sep, 2020, 6:41:01 PM
    Author     : nallu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Allocated lot</title>
        <style type="text/css">

            * {
                margin: 0;
                padding: 0;
            }
            body {
                background-color: blanchedalmond;
                 
                 background-image: -webkit-linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)), url("cars.jpg");
    background-image: linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)), url("cars.jpg");
    color: white;
                 background-repeat: no-repeat;
                 text-color:white;
                 background-position: center;
                 background-size: cover; 
                 background-size: 100%;
                 background-attachment: fixed;
            }
            
            #btn{  
    font-size: 25px;  
    }

        </style>
    </head>
    <body>
                <<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>

<%
    
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
out.println("<h2><center><b>You have A Parking lot at "+area+"!!!</b></h1><center>"); 


con.close();

%>
        
        <jsp:useBean id="bean_id" class="Allocated_lot.Allocated_lot" scope="request"/>
        
        <% String lot=request.getParameter("My_Menu1");
        bean_id.setAvailable_lot(lot);%>
           
        <strong><h2>Your allocated lot is <%=bean_id.get_lot()%></h2><br/></strong>
    </body>
</html>
