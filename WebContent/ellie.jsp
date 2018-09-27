<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />

<title>Ellie</title>


<link rel="icon" href="logoEllie.png">
<link rel="stylesheet" type="text/css" href="css/index.css" />
</head>
<body>
<div class="ellieLogo">
			<img src="img/logoEllie2.png" id="ellie" />
		</div>
	<div class="center">
		
		<!--    <h2>Chabot Example w/ Watson and JSP</h2> -->
		
		<div id="textchat" class="pulse"></div>
		<form method="post">
			<input type="text" id="question" name="question" class="field"
				placeholder="Escreva sua mensagem..." />
			<button id="sendQuestion">Send</button>
		</form>
	</div>
	<script type="text/javascript" src="js/main.js"></script>
</body>
</html>