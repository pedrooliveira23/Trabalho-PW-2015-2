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
<script>
	$(".button-collapse").sideNav();
</script>
</head>

<body class="grey lighten-4">

	<!--Import jQuery before materialize.js-->
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="js/materialize.min.js"></script>
	<script>
		function logar() {
			if (document.getElementById("userName").value == "teste"
					&& document.getElementById("userPassword").value == "teste") {
				document.getElementsByClassName("login")[0].style.display = "none";
			} else {
				document.getElementById("falhaLogin").innerHTML = "Falha no Login! Veja se seu Nome de Usuário ou Senha estão incorretos.";
			}
		}
	</script>

	<!-- <div class="login">
		<header>
			<div class="formLogin" style="background-color: white">
				<figure>
					<img class="center" src="/cad-institucional/Imagens/Logo.png">
				</figure>
				<form>
					<input id="userName" type="text" placeholder="Nome de Usuário"
						name="user" /> <input id="userPassword" type="password"
						placeholder="Senha" name="pass" /> <a href="#" class="right"><buttom
							type="submit" class="btn" onclick="logar()" />Entrar</buttom></a>
				</form>
				<span id="falhaLogin"></span>
			</div>
		</header>
	</div> -->

	<!-- <span class="setinha hide-on-med-and-down"><img
		src="/cad-institucional/Imagens/Icones/Left-100.png" /></span>
 -->
	<a href="#" data-activates="slide-out"
		class="button-collapse hide-on-large-only"><i
		class="mdi-navigation-menu"></i></a>
	<div class="container">
		<header>
			<div class="left nav-wrapper">
				<ul id="slide-out" class="side-nav">
					<li class="li-logo"><a href="/cad-institucional/"><img
							class="logo-cad" src="/cad-institucional/Imagens/Logo.png" /></a></li>
					<li><a href="#!">Pesquisar</a></li>
				</ul>
				<ul
					class="side-nav fixed right hide-on-med-and-down light-blue darken-9">
					<li class="li-logo"><a href="/cad-institucional"><img
							class="logo-cad" src="/cad-institucional/Imagens/Logo.png" /></a></li>
					<li><a href="#!" class="grey-text text-darken-4">Pesquisar</a></li>
				</ul>
			</div>
		</header>
		<div class="container conteudo grey-text text-darken-4">
			<h1>Pesquisar Instituição</h1>
			<form>
				<input type="text" name="pesquisa"
					placeholder="Entre com algum dado da instituição" />
			</form>
			<table>
				<thead>
					<th>
					<td>Nome</td>
					<td>CNPJ</td>
					<td>Nível de curso</td>
					<td>Endereço</td>
					<td>Telefone</td>
					<td>E-mail</td>
					<td>Resposável</td>
					<td>Telefone do Responsável</td>
					<td>E-mail do Responsável</td>
					</th>
				</thead>
			</table>
			<div class="center-align">
				<br>
				<a href="/cad-institucional/novaInstituicao.jsp">Adicionar uma nova instituição...</a>
			</div>
		</div>
	</div>
</body>
</html>