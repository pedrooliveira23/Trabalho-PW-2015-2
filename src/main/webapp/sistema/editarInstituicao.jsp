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
<title>CIE - Editar Institui��o</title>
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
		<a href="bemvindo" class="brand-logo"><img src="Imagens/Logo.png" /></a>
		<ul id="menu">
			<li><a class="white-text" href="pesquisar">Pesquisar</a></li>
			<li class="logout"><a class="white-text" href="logout">Logout</a></li>
		</ul>
	</div>
	<nav class="fixed light-blue darken-9 hide-on-large-only">
		<div class="nav-wrapper">
			<a href="bemvindo" class="center-align"><img
				class="logo-cad brand-logo" src="Imagens/Logo.png" /></a>
			<ul id="menu">
				<li class="right"><a href="pesquisar">Pesquisar</a></li>
				<li><a href="logout">Logout</a></li>
			</ul>
		</div>
	</nav>
	<main class="container grey-text text-darken-4 row"> <%
 	classe.core.tabelaInstituicoes tabela = new classe.core.tabelaInstituicoes(
 			(java.util.ArrayList<classe.core.Instituicao>) session
 					.getAttribute("insts"));
 %>
	<h1>Editar Institui��o</h1>
	<form class="addInst">
		<input class="col s12 m5 l5" type="text"
			placeholder="Nome da  Institui��o" name="nome" /> <input
			class="col s12 m5 l5" type="text" placeholder="CNPJ" name="cnpj" />
		<input class="col s12 m5 l5" type="text" placeholder="N�vel de curso"
			name="nivel" /> <input class="col s12 m5 l5" type="text"
			placeholder="Endere�o" name="endereco" /> <input
			class="col s12 m5 l5" type="text" placeholder="Telefone"
			name="telefone" /> <input class="col s12 m5 l5" type="email"
			placeholder="E-mail" name="email" /> <input class="col s12 m5 l5"
			type="text" placeholder="Nome do Respos�vel" name="nomeResp" /> <input
			class="col s12 m5 l5" type="text"
			placeholder="Telefone do Respons�vel" name="telefoneResp" /> <input
			class="col s12 m5 l5" type="text" placeholder="E-mail do Respons�vel"
			name="emailResp" />
		<div class="col s12 m10 l10">
			<input type="submit" class="btn right" value="Enviar" name="acao" />
			<input type="submit" class="btn" value="Limpar" name="acao" />
		</div>
	</form>
	</main>

</body>
</html>