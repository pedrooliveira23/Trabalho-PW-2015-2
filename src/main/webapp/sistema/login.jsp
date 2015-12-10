<!DOCTYPE html>
<html>
<head>
<!--Import Google Icon Font-->
<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet" href="css/materialize.min.css"
	media="screen,projection" />
<link type="text/css" rel="stylesheet" href="css/estilo.css" />

<!--Let browser know website is optimized for mobile-->
<meta name="viewport" content="width=device-width, initial-scale=1.0"
	charset="UTF-8" />
<title>CIE - Login</title>

</head>

<body class="grey lighten-4">

	<!--Import jQuery before materialize.js-->
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="js/materialize.min.js"></script>
	<div class="center">
	<form class="centralizar">
		<a href="bemvindo" class="brand-logo"><img src="Imagens/Logo.png" /></a>
		<input type="text" placeholder="Nome de Usuário" name="usuario" /> <input
			type="password" placeholder="Senha" name="senha" /> <input class="btn" type="submit"
			value="Entrar" />
			
			<div><br><%=(String)request.getAttribute("erro")%></div>
	</form>
	</div>
</body>
</html>