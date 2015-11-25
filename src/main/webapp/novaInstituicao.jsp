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
				document.getElementById("falhaLogin").innerHTML = "Falha no Login! Veja se seu Nome de Usu�rio ou Senha est�o incorretos.";
			}
		}
	</script>

	<a href="/cad-institucional/pesquisar.jsp"><div class="setinha">
			<img src="/cad-institucional/Imagens/Left-100.png" />
		</div> </a>
		
		<div class="container">
			<h1>Adicionar Institui��o</h1>
			<form>
				<input class="campos" type="text" placeholder="Nome da  Institui��o"/>
				<input class="campos" type="text" placeholder="CNPJ"/>
				<input class="campos" type="text" placeholder="N�vel de curso"/>
				<input class="campos" type="text" placeholder="Endere�o"/>
				<input class="campos" type="text" placeholder="Telefone"/>
				<input class="campos" type="text" placeholder="E-mail"/>
				<input class="campos" type="text" placeholder="Respos�vel"/>
				<input class="campos" type="text" placeholder="Telefone do Respons�vel"/>
				<input class="campos" type="text" placeholder="E-mail do Respons�vel"/>
			</form>
		</div>

</body>
</html>