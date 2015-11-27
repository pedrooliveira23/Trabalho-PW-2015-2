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

	<a href="/cad-institucional/pesquisar.jsp"><div class="setinha">
			<img src="/cad-institucional/Imagens/Left-100.png" />
		</div> </a>

	<div class="container row conteudo">
		<h1>Adicionar Instituição</h1>
		<form class="addInst">
			<input class="col s6 m6 l6" type="text"
				placeholder="Nome da  Instituição" /> <input class="col s6 m6 l6"
				type="text" placeholder="CNPJ" /> <input class="col s6 m6 l6"
				type="text" placeholder="Nível de curso" /> <input
				class="col s6 m6 l6" type="text" placeholder="Endereço" /> <input
				class="col s6 m6 l6" type="text" placeholder="Telefone" /> <input
				class="col s6 m6 l6" type="email" placeholder="E-mail" /> <input
				class="col s6 m6 l6" type="text" placeholder="Resposável" /> <input
				class="col s6 m6 l6" type="text"
				placeholder="Telefone do Responsável" /> <input class="col s6 m6 l6"
				type="text" placeholder="E-mail do Responsável" />
			<div class="col s12 m12 l12">
				<bottom type="submit" class="btn right">Enviar</bottom>
				<bottom type="submit" class="btn">Limpar</bottom>
			</div>
		</form>
	</div>

</body>
</html>