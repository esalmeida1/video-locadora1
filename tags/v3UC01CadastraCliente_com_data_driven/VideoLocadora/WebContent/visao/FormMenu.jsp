<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="pt-br" lang="pt-br">
<head>
	<title> Especializa&ccedil;&atilde;o em Engenharia de Software</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />	
	<meta http-equiv="content-language" content="pt-br" />
<meta name="description" content="Laboratorio de Teste." />
<meta name="author" content="Edson" />
<style type="text/css" media="all">
body {
	background:#ccc;
	color:#333;
	margin: 0; 
	padding: 0;
	font: 12px/1.4 Verdana, Arial, Helvetica, sans-serif;
	text-align: center;
	}
#tudo {
	width: 980px;
	margin: 0 auto;
	text-align:left;
	background:#fff;
	}
#topo {
	position:relative;
	width:980px;
	height:100px;
	background:#6666ff url('imagens/bg-topo.jpg') no-repeat;
	}
#topo h1  { 
	position:absolute; 
	left:50px; 
	top:15px; 
	font-size: 28px;
	margin:0;
	}
#topo h1 span {
	color:#fff;
	}
ul#nav {
	position:absolute; 
	left:50px; 
	top:75px;
	margin:0; 
	padding:0;
	} 
ul#nav li { 
	margin-right:5px;
	display: inline;
	list-style-type: none;
	}
ul#nav li a { 
	float:left;  /* Corrige bug no IE7 que não expande background do estado over para padding top e bottom */
	color: #fff;
	font-size: 6px;
	font-weight: bold;
	text-decoration: none;
	text-transform: uppercase;
	padding: 3px 4px 7px 15px;
	margin-right:25px;
	}
ul#nav li a:hover {  
	background:#f63 url('imagens/bg-over.jpg') repeat-x 0 0;
	}
#busca { 
	position:absolute; 
	right:20px; 
	top:75px;
	margin: 0;
	padding: 0;
	color: #fff;
	font-size: 11px;
	font-weight: bold;
	}
#busca label input {
	background: #fcc;
	border: none;
	}
#busca input#submit {
	background: #c30;
	border: 2px outset #f66;
	color:#fff;
	font-size:10px;
	}
#principal {
	width:500px;
	margin: 20px 80px 50px 50px;	
	float:left;
	display:inline;
	}
#auxiliar {
	width:350px;
	float:right;
	margin-top:50px;
	margin-bottom:50px;
	}
#rodape {
	height:20px;
	clear:both;
	background:#fc6;
	}
#rodape p {
	margin-left: 50px;
	font-size:11px;
	line-height:2;
	}
#rodape p span {
	color:#f60;
	font-weight:bold;
	}
h2 {
	font-size:26px;
	color:#0056a6;
	margin:30px 0 10px 0;
	}
#principal p {
	margin-top:10px;;
	}
#principal a, #principal a:visited {
	color: #f63;
	}
#principal a:hover {
	color: #f90;
	text-decoration: none;
	}
/* Consulte a errata da página 287 em http://www.livrohtml.com.br/errata.php */
p.pular {margin:0;}
p.pular a {
	display:block;
	text-align:right;
	padding-right:10px;
	color:#fff;
	}
p.pular a:hover {
	background:#fff;
	color:#333;
	}
/* Acréscimos de regras CSS para a página Produtos */
#principal {
	width:670px;
	margin: 20px 10px 50px 50px;	
	float:left;
	display:inline;
	}
#auxiliar {
	width:245px;
	float:right;
	margin-top:0;
	margin-bottom:50px;
	background:#fff url('imagens/bg-auxiliar.jpg') repeat-x 0 0;
	min-height:500px;
	}
* html #auxiliar {
	height:500px;
	}
dl, dd {
	margin:0;
	padding:0;
	}
#principal dl {
	width:195px;
	float:left;
	margin-bottom:30px;
	}
.clear {
	clear:both;
	height:1px;
	border-top:1px solid #fc6;
	}
#principal dl.central {margin: 0 20px;}
h2 {font-size:20px;}

#auxiliar dl {
	margin-top:50px;
	}
#auxiliar dt {
	color:#0056a6;
	font-weight:bold;
	font-size:14px;
	margin:20px 0 5px 0;
	padding-left:40px;
	}
#auxiliar dd {
	margin:2px 0;
	}
#auxiliar dd a {
	display:block;
	color:#333;
	text-decoration:none;
	padding-left:40px;
	}
#auxiliar dd a:hover {
	background:#fff url('imagens/bullet.gif') 15px no-repeat;
	color:#f60;
	}
</style>
</head>
<body>
<div id="tudo">

<div id="topo">
<h1>Video <span>Locadora</span></h1>
 
 <p class="pular">
	
 </p>

<ul id="nav">
	<li><a href="http://localhost:8080/VideoLocadora/jsp/formCadastraFilme.jsp">Cad Filme</a></li>	
	<li><a href="http://localhost:8080/VideoLocadora/jsp/formConsultaFilme.jsp">Con Filme</a></li>	
	<li><a href="http://localhost:8080/VideoLocadora/jsp/formAlteraFilme.jsp">Alt Filme</a></li>
	<li><a href="http://localhost:8080/VideoLocadora/jsp/formExcluiFilme.jsp">Exc Filme</a></li>
	<li><a href="http://localhost:8080/VideoLocadora/visao/FormCadastraCliente.jsp">Cad Cliente</a></li>	
	<li><a href="http://localhost:8080/VideoLocadora/jsp/formAlteraCliente.jsp">Alt Cliente</a></li>
	<li><a href="http://localhost:8080/VideoLocadora/jsp/formExcluiCliente.jsp">Exc Cliente</a></li>
	<li><a href="http://localhost:8080/VideoLocadora/jsp/formConsultaCliente.jsp">Con Cliente</a></li>
	<li><a href="http://localhost:8080/VideoLocadora/jsp/formCadastraEmprestimo.jsp">Empresta</a></li>
	<li><a href="http://localhost:8080/VideoLocadora/jsp/formDevolucao.jsp">Devolu&ccedil;&atildeo</a></li>	
	<li><a href="http://localhost:8080/VideoLocadora/jsp/formExcluiEmprestimo.jsp">Exclui Emprestimo</a></li>
	
</ul>	
<!-- 
<form action="" method="get" id="busca">
	<label>Buscar <input type="text" name="busca" /></label>
	<input type="submit" value="OK" id="submit" />
</form> -->
</div> <!-- Fim da div#topo -->

<div id="principal">
 
<h2>Filmes infantis</h2>
  
	<p>Filmes infantis</p>
<dl>
	   
</dl>

<dl class="central">
	  
</dl>

<dl>
	   
</dl>

<div class="clear"></div>

<h2>Lan&ccedil;amentos</h2>
	<p>At&eacute; 2 dias promo&ccedil;&atilde;o.</p>

<dl>
	
</dl>

<dl class="central">		
	
</dl>

<dl>		
	
</dl>

<div class="clear"></div>

<h2>Regular</h2>
	
	<p>At&eacute; 4 dias promo&ccedil;&atilde;o ......</p>

<dl>		
	
</dl>

<dl class="central">		
	
</dl>

</div> <!-- Fim da div#principal -->
	
<div id="auxiliar">
<dl>
	
</dl>

</div> <!-- Fim da div#auxiliar -->

	
<div id="rodape">
	<p>Copyright &copy; 2008 - <b>USJT</b> <span>Disciplina - Laboratorio de Testes</span></p>
</div> <!-- Fim da div#rodape -->

</div> <!-- Fim da div#tudo -->
</body>
</html>