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
<title>CIE - Pesquisar Instituições</title>
</head>

<body class="grey lighten-4">

	<!--Import jQuery before materialize.js-->
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="js/materialize.min.js"></script>

	<script>
		$(document)
				.ready(function() {
					$(".button-collapse").sideNav();
				})
	</script>

	<div class="nav-wrapper side-nav fixed light-blue darken-9">
		<a href="sistema" class="brand-logo"><img src="Imagens/Logo.png" /></a>
		<ul id="menu">
			<li><a class="white-text" href="sistema">Pesquisar</a></li>
			<li class="logout"><a class="white-text" href="logout">Logout</a></li>
		</ul>
	</div>
	<nav class="fixed light-blue darken-9 hide-on-large-only">
		<div class="nav-wrapper">
			<a href="sistema" class="center-align"><img
				class="logo-cad brand-logo" src="Imagens/Logo.png" /></a>
			<ul id="menu">
				<li class="right"><a href="sistema">Pesquisar</a></li>
				<li><a href="logout">Logout</a></li>
			</ul>
		</div>
	</nav>
	<main class="container grey-text text-darken-4">
	<h1>Pesquisar Instituição</h1>
	<form class="row">
		<i class="material-icons col s1 pesquisar">search</i><input type="text" name="pesquisa"
			placeholder="Entre com algum dado da instituição" class="col s11"/> 
			
	</form>
	<div class="row">
		<table style="font-size: 9pt;" class="col s12">
			<thead>
				<th>Nome</th>
				<th>CNPJ</th>
				<th>Telefone</th>
			</thead>
			<tbody>
				<%
					java.util.List<classe.core.Instituicao> lista = (java.util.List<classe.core.Instituicao>) session
							.getAttribute("listaDeInstituicoes");

					for (int i = 0; i < lista.size(); i++) {
				%>

				<tr
					onclick="document.location = 'editarInstituicao?nome=<%=lista.get(i).getNome()%>&cnpj=<%=lista.get(i).getCnpj()%>&telefone=<%=lista.get(i).getTelefone()%>&endereco=<%=lista.get(i).getEndereco()%>&nivelCurso=<%=lista.get(i).getNivelCurso()%>&email=<%=lista.get(i).getEmail()%>&nomeResponsavel=<%=lista.get(i).getNomeResponsavel()%>&telefoneResponsavel=<%=lista.get(i).getTelefoneResponsavel()%>&emailResponsavel=<%=lista.get(i).getEmailResponsavel()%>';"
					class="linhaTabela">
					<td><%=lista.get(i).getNome()%></td>
					<td><%=lista.get(i).getCnpj()%></td>
					<td><%=lista.get(i).getTelefone()%></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>
	<div class="center-align">
		<a href="novaInstituicao">Adicionar uma nova instituição...</a>
	</div>
	</main>
</body>
</html>