<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>

	<style>
		.container {
        position: relative;
        border-width: 0px;
        padding: 12px;
        margin: 0px;
        background-image: linear-gradient( rgba(255, 255, 255, 0.3), 
        rgba(255, 255, 255, 0.5) ), url(assets/img/back.jpg);
      	}
      
      .form {
      	position: relative;
      	border-width: 3px;
      	padding: 20px;
      	margin: 50px;
      	text-align: center;
      	background-color: rgba(168, 124, 87, 0.9);
      }
      
      .form:hover {
      	background-color: rgb(168, 124, 87);
      }
      
      .radio {
      	margin: 10px;
      	padding: 3px;
      	font-size: 20px;
      	font-family: cursive;
      }
      
      .text {
      	font-size: 20px;
      	font-family: cursive;
      }
      
      #desc {
      	width: 70%;
      	height: 10em;
      	margin: 5px;
      	margin-bottom: 15px;
      	font-size:	15px;
      	
      }
      
      .name  {
      	height: 2em;
      	margin: 5px;
      	margin-bottom: 15px;
      }
      
      .subm  {
    	padding: 1em;
      }
      
	</style>
	
</head>
<body>
	<div class="container">
		<form action="add" method="post" class="form">
			<div class="radio">
			<div class="text">Godisnje doba</div>
				<input type="radio" name="godisnjeDoba" value="jesen" required="required">jesen
				<br>
				<input type="radio" name="godisnjeDoba" value="ljeto" required="required">ljeto
				<br>
				<input type="radio" name="godisnjeDoba" value="proljece" required="required">proljece
				<br>
				<input type="radio" name="godisnjeDoba" value="zima" required="required">zima
			</div>
			<div class="text">Naziv lokacije</div>
			<div class="name">
				<input type="text" name="nazivLokacije"  required="required" class="name">
			</div>
			<div class="text">Opis lokacije</div>
			<div>
				<textarea name="opis"  required="required" id="desc"></textarea>
			</div>
			<div class="subm">
			<button type="submit" name="potvrdi" class="text subm">Potvrdi</button>
			</div>
		</form>
	</div>
</body>
</html>