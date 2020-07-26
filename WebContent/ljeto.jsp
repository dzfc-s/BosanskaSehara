<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.DAO.ConnectionManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Summer</title>
	<style>
		.conteiner {
			border: 3px;
			margin: -10px;
            padding: 10px;
            background-color: rgb(44, 16, 44);
		}
		
        h2 {
            font-size: 35px;
            font-style: oblique;
            font-variant-caps: all-petite-caps;
            font-family: 'Courier New', Courier, monospace;
            text-align: center;
        }

        p {
            font-size: 20px;
            font-style: normal;
            font-family: 'Times New Roman', Times, serif;
            color: rgb(199, 198, 198);
            
        }
 
        h2:hover {
            color: rgb(31, 14, 71);
        }
	
        .naslov {
            position: relative;
            height: fit-content;
            width: 253px;
            border-radius: 2px;
            border-style: groove;
            margin-left: 30px;
            margin-bottom: -9px;
            padding: 2px;
            padding-left: 10px;
            background-color: beige;
        }

        .opis {
            width: fit-content;
            position: relative;
            border-radius: 1px;
            border-style: groove;
            margin-left: 300px;
            margin-right: 40px;
            margin-top: -110px;
            margin-bottom: 0px;
            padding: 10px;
            padding-left: 20px;
            padding-right: 20px;
            text-align: justify;
        }

        .opis:hover {
            background-color: rgba(92, 43, 92, 0.705);
        }

        .blank {
            position: relative;
            background-image: linear-gradient( rgba(255, 255, 255, 0.5), 
             rgba(255, 255, 255, 0.5) ), url(assets/img/summer.jpg);
            border-radius: 2px;
            border-style: groove;
            margin-left: 30px;
            width: 78.5em;
            height: 3em;

        }
	</style>
</head>
<body>
	
	<div class="conteiner">
		 <div class="blank"></div>
	<%
	String query = "SELECT * FROM ljeto";
	try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = ConnectionManager.getInstance().getConnection();
	Statement statement = connection.createStatement(); 
	ResultSet rs = statement.executeQuery(query);
	while(rs.next()) {
	%>

		<div class="naslov">
		<h2><%=rs.getString("nazivLokacije")%></h2>
		</div>
		
		<div class="opis">
		<p><%=rs.getString("opis")%></p>
		</div>
		
		<div class="blank"></div>
		
	<% 
	}	
	} catch (Exception e) {}
	%>
	</div>
	
</body>
</html>