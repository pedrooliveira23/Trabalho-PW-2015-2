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
<title>CIE - Bem-Vindo</title>

<style type="text/css">

p {
text-align: justify;
}

</style>

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
			<li><a  class="white-text" href="pesquisar">Pesquisar</a></li>
			<li class="logout"><a class="white-text" href="logout">Logout</a></li>
		</ul>
	</div>
	<nav class="fixed light-blue darken-9 hide-on-large-only">
		<div class="nav-wrapper">
			<a href="sistema" class="center-align"><img
				class="logo-cad brand-logo"
				src="Imagens/Logo.png" /></a>
			<ul id="menu">
				<li class="right"><a href="pesquisar">Pesquisar</a></li>
				<li><a href="logout">Logout</a></li>
			</ul>
		</div>
	</nav>
	<main class="container grey-text text-darken-4">
	<h1>Bem-Vindo</h1>
	<p>O cadastro das instituições de ensino e cursos nos Conselhos
		Regionais tem como objetivo informar em processos de registro quais os
		títulos e atribuições a serem concedidos aos egressos. No processo de
		registro profissional é consultado se a instituição e curso do egresso
		estão cadastrados no Conselho, caso estejam, é inserido no processo as
		informações (um PDF da página do cadastro do curso) e após são
		definidos o título e atribuições a serem concedidos ao egresso. Caso o
		curso ou instituição não estejam cadastrados, o egresso deve solicitar
		junto a instituição os documentos necessários para a regularização do
		curso/instituição. A aplicação proposta será utilizada para cadastrar
		cursos e instituições e servir como sistema de pesquisa dos dados
		cadastrados.</p>
	</main>
</body>
</html>