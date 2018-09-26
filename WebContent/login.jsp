<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br" dir="ltr">

<head>
  <meta charset="utf-8">
  <title>Login</title>
  <link rel="stylesheet" href="style-login.css">
  <link rel="icon" href="Imagens/logo_icon.png">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
    crossorigin="anonymous">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>

<body>
  <header id="headerDiv">
    <div class="links">
      <button type="button" class="btn btn-secondary btn-sm" id="home"><a href="#" id="home">Home</a></button>
      <button type="button" class="btn btn-secondary btn-sm" id="aboutus"><a href="#" id="aboutus">Sobre Nós</a></button>
    </div>
    <div class="logo">
      <img src="Imagens/logoBackless.png" alt="logo" id="idLogo" />
    </div>
  </header>

  <div class="formLogin">
    <form action="Login" method="post" id="formUser">
	      <div class="inputLogin">
	        <input type="email" class="form-control" id="e-mail" placeholder="Login">
	      </div>
	      <br>
	      <div class="inputLogin">
	        <input type="password" class="form-control" id="password" placeholder="Senha">
	      </div>
	      <div class="inputLogin">
	        <!--<a href="index.html" type="submit" id="login">ENTRAR</a>-->
	        <button type="submit" name="login" id="login">ENTRAR</button>
	      </div>
      </form>
  </div>
  
  <footer>
    <div id="socialmedias">
      <img src="Imagens/instagram.png" alt="instagram" id="insta" />
      <img src="Imagens/linkedin.png" alt="linkedin" id="li" />
      <img src="Imagens/twitter.png" alt="twitter" id="twitter" />
      <img src="Imagens/facebook.png" alt="facebook" id="facebook" />
    </div>
  </footer>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
    crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
    crossorigin="anonymous"></script>
</body>

</html>