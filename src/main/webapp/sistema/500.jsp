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
<title>CIE - Adicionar Nova Instituição</title>
</head>

<body class="grey lighten-4">

	<!--Import jQuery before materialize.js-->
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="js/materialize.min.js"></script>
	
	<script>
		$(document).ready(function() {
			$(".button-collapse").sideNav();
		})
	</script>

	<div class="nav-wrapper side-nav fixed light-blue darken-9">
		<a href="sistema" class="brand-logo"><img
			src="Imagens/Logo.png" /></a>
		<ul id="menu">
			<li><a  class="white-text" href="sistema">Pesquisar</a></li>
			<li class="logout"><a class="white-text" href="logout">Logout</a></li>
		</ul>
	</div>
	<nav class="fixed light-blue darken-9 hide-on-large-only">
		<div class="nav-wrapper">
			<a href="sistema" class="center-align"><img
				class="logo-cad brand-logo"
				src="Imagens/Logo.png" /></a>
			<ul id="menu">
				<li class="right"><a href="sistema">Pesquisar</a></li>
				<li><a href="logout">Logout</a></li>
			</ul>
		</div>
	</nav>
	<main class="container grey-text text-darken-4 row">
		<h1>Adicionar Instituição</h1>
		<h3>Já existe uma instituição cadastrada com esse CNPJ ou o campo está vazio!</h3>
		<h3><a href="novaInstituicao">Tentar novamente</a></h3>
	</main>

</body>
</html>