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
		$(document).ready(function() {
			$(".button-collapse").sideNav();
		})
	</script>

	<div class="nav-wrapper side-nav fixed light-blue darken-9">
		<a href="/cad-institucional" class="brand-logo"><img
			src="/cad-institucional/Imagens/Logo.png" /></a>
		<ul id="menu">
			<li><a href="pesquisar">Pesquisar</a></li>
		</ul>
	</div>
	<nav class="fixed light-blue darken-9 hide-on-large-only">
		<div class="nav-wrapper">
			<a href="/cad-institucional" class="center-align"><img
				class="logo-cad brand-logo"
				src="/cad-institucional/Imagens/Logo.png" /></a>
			<ul id="menu">
				<li><a href="pesquisar">Pesquisar</a></li>
			</ul>
		</div>

	</nav>
	<main class="container grey-text text-darken-4">
	<h1>Pesquisar Instituição</h1>
	<form>
		<input type="text" name="pesquisa"
			placeholder="Entre com algum dado da instituição" />
	</form>
	<table>
		<thead>

			<th>Nome</th>
			<th>CNPJ</th>
			<th>Nível de curso</th>
			<th>Endereço</th>
			<th>Telefone</th>
			<th>E-mail</th>
			<th>Resposável</th>
			<th>Telefone do Responsável</th>
			<th>E-mail do Responsável</th>
		</thead>
		<tbody>
			<%
				classe.core.tabelaInstituicoes tabela = new classe.core.tabelaInstituicoes(
						(java.util.ArrayList<classe.core.Instituicao>) session
								.getAttribute("insts"));

				for (int i = 0; i < tabela.getInsts().size(); i++) {
			%>

			<tr onclick="document.location = '#';" class="linhaTabela">
				<td><%=tabela.getNomeInst(i)%></td>
				<td><%=tabela.getCnpj(i)%></td>
				<td><%=tabela.getNivel(i)%></td>
				<td><%=tabela.getEndereco(i)%></td>
				<td><%=tabela.getTelefone(i)%></td>
				<td><%=tabela.getEmail(i)%></td>
				<td><%=tabela.getNomeResponsavel(i)%></td>
				<td><%=tabela.getTelefoneResponsavel(i)%></td>
				<td><%=tabela.getEmailResponsavel(i)%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
	<div class="center-align">
		<br> <a href="novaInstituicao">Adicionar uma nova
			instituição...</a>
	</div>
	</main>
</body>
</html>