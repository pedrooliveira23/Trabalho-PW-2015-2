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
	<main class="container grey-text text-darken-4">
	<h1>Pesquisar Instituição</h1>
	<form>
		<input type="text" name="pesquisa"
			placeholder="Entre com algum dado da instituição" />
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
					classe.core.tabelaInstituicoes tabela = new classe.core.tabelaInstituicoes(
							(java.util.ArrayList<classe.core.Instituicao>) session
									.getAttribute("insts"));

					for (int i = 0; i < tabela.getInsts().size(); i++) {
				%>

				<tr
					onclick="document.location = 'editarInstituicao?nome=<%=tabela.getNomeInst(i)%>&cnpj=<%=tabela.getCnpj(i)%>&telefone=<%=tabela.getTelefone(i)%>&endereco=<%=tabela.getEndereco(i)%>&nivel=<%=tabela.getNivel(i)%>&email=<%=tabela.getEmail(i)%>&nomeResp=<%=tabela.getNomeResponsavel(i)%>&telefoneResp=<%=tabela.getTelefoneResponsavel(i)%>&emailResp=<%=tabela.getEmailResponsavel(i)%>';"
					class="linhaTabela">
					<td><%=tabela.getNomeInst(i)%></td>
					<td><%=tabela.getCnpj(i)%></td>
					<td><%=tabela.getTelefone(i)%></td>
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