<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>godisnjedoba</title>

 <style>

      .text {
        padding: 7px;
        margin: 20px;
        font-size: 30px;
        font-weight: bolder;
        font-family: Georgia, Times, 'Times New Roman', serif;
        text-align: center;
        background-color: rgba(126, 165, 180, 0.2);
      }

      .container {
        position: relative;
        border-width: 0px;
        padding: 12px;
        background-color: rgba(233, 233, 233, 0.5);
        margin: 0px;
      }

      .row {
    	text-align: center;
        border-width: 1px;
        border-style: groove;
        padding: 10px;
        margin: 30px; 
      }

      a {
        text-align: center;
        color: black;
        text-decoration: none;
        font-family: 'Times New Roman', Times, serif;
        font-size: 55px;
        display: ruby;
        text-indent: 0px;
        letter-spacing: 1em;
      }

      a:hover {
        font-weight: bold;
      }

      .ljeto {
        position: relative;
        background-image: linear-gradient( rgba(255, 255, 255, 0.5), 
        rgba(255, 255, 255, 0.7) ), url(assets/img/summer.jpg);
      }

      .proljece {
        background-image: linear-gradient( rgba(255, 255, 255, 0.5), 
        rgba(255, 255, 255, 0.7) ), url(assets/img/spring.jpg); 
      }

      .jesen {
        background-image: linear-gradient( rgba(255, 255, 255, 0.5), 
        rgba(255, 255, 255, 0.7) ), url(assets/img/autumn.jpg);
      }

      .zima {
        background-image: linear-gradient( rgba(255, 255, 255, 0.5), 
        rgba(255, 255, 255, 0.7) ), url(assets/img/winter.jpg);
      }

      .ljeto:hover {
        background-image: url(assets/img/summer.jpg);
      }

      .proljece:hover {
        background-image: url(assets/img/spring.jpg);
      }

      .jesen:hover {
        background-image: url(assets/img/autumn.jpg);
      }

      .zima:hover {
        background-image: url(assets/img/winter.jpg);
      }
      
    </style>
</head>
  <body>
      
      <div class="container"> 
        <div class="text">     
        Kako Vam zvuci skijanje u julu? 
        <br>
        Nimalo privlacno, naravno. Zbog toga, odaberite godisnje doba u kojem planirate svoje putovanje. 
        Time nam pomazete u pruzanju lokacije koja ce biti potpuno po Vasim mjerama i - 
        u pravo vrijeme!
        </div>  

		 <div class="row proljece">
          <a href="proljece.html">PROLJECE</a>  
       	 </div>
        
         <div class="row ljeto">
          <a  href="ljeto.html">LJETO</a>
         </div>

		 <div class="row jesen">
          <a href="jesen.html">JESEN</a>
		 </div>
		 
		 <div class="row zima">
          <a href="zima.html">ZIMA</a>
         </div>

        </div>
        
</body>
</html>