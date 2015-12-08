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

	<a href="#" data-activates="slide-out"
		class="button-collapse hide-on-large-only"><i
		class="mdi-navigation-menu"></i></a>
	<div class="container">
		<header>
			<div class="left nav-wrapper">
				<ul id="slide-out" class="side-nav">
					<li class="li-logo"><a href="/cad-institucional/"><img
							class="logo-cad" src="Imagens/Logo.png" /></a></li>
					<li><a href="#!">Pesquisar</a></li>
				</ul>
				<ul
					class="side-nav fixed right hide-on-med-and-down light-blue darken-9">
					<li class="li-logo"><a href="/cad-institucional"><img
							class="logo-cad" src="Imagens/Logo.png" /></a></li>
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
				<tbody>
					<%
						classe.core.tabelaInstituicoes tabela = new classe.core.tabelaInstituicoes(
								(java.util.ArrayList<classe.core.Instituicao>) session
										.getAttribute("insts"));

						for (int i = 0; i < tabela.getInsts().size(); i++) {
					%>
					<tr>
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
				<br> <a href="novaInstituicao">Adicionar
					uma nova instituição...</a>
			</div>
		</div>
	</div>
</body>
</html>