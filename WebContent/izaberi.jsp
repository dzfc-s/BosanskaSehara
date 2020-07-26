<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Odabir</title>

	<style>
	
	 .text {
        padding: 7px;
        margin: 20px;
        font-size: 30px;
        font-weight: bolder;
        font-family: Georgia, Times, 'Times New Roman', serif;
        text-align: center;
        background-color: rgb(126, 165, 180);
      }

      .container {
        position: relative;
        border-width: 0px;
        padding: 12px;
        margin: 0px;
        background-image: linear-gradient( rgba(255, 255, 255, 0.3), 
        rgba(255, 255, 255, 0.5) ), url(assets/img/back.jpg);
      }
	
	.row {
		height: 8em;
    	text-align: center;
        border-width: 1px;
        border-style: groove;
        padding-top: 40px;
        padding-bottom: -10px;
        margin: 30px; 
        position: relative;
        background-color: rgb(126, 165, 180);
      }

	.row:hover {
		 background-color: rgba(126, 165, 180, 0.5);
	}
	
    a {
        text-align: center;
        color: black;
        text-decoration: none;
        font-family: 'Times New Roman', Times, serif;
        font-size: 55px;
        display: ruby;
        text-indent: 0px;
        letter-spacing: 0.5em;
      }

      a:hover {
        font-weight: bold;
      }
	</style>
</head>
<body>
		
	<div class="container"> 
        <div class="text">     
        	<h2>Odaberite zeljenu opciju</h2>
 		</div>
 		 <div class="row edit">
          <a href="uredivanje.html">Urediti lokaciju</a> 
       	 </div>
        
         <div class="row add">
          <a href="dodavanje.html">Dodati novu lokaciju</a>
         </div>
 	</div>  
		
</body>
</html>