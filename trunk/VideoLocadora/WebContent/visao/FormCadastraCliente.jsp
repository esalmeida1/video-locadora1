<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastra Cliente</title>
</head>
<body>
<CENTER>
<BR>
<BR><H2>Cadastra Cliente</H2>
<BR>
<BR>
<BR>
<form id = "formCadastraCliente" METHOD=POST action="/VideoLocadora/ServletControle">
<table cellspacing="4">
	<tr>
	     <td><INPUT TYPE=HIDDEN NAME=acao VALUE=cadastraCliente></td>
	   
	     <td ALIGN=LEFT>CPF: </td>
	     <td><INPUT TYPE=TEXT NAME=cpf></td>
		<td></td>
		</tr>
	<tr>
	 	<td></td>
	 	<td ALIGN=LEFT>Nome: </td>
		<td><INPUT TYPE=TEXT NAME=nome></td>
		 <td></td>
	</tr>
	<tr>
	 	<td></td>
	 	<td ALIGN=LEFT>Endereço: </td>
		<td><INPUT TYPE=TEXT NAME=endereco></td>
		 <td></td>
	</tr>
		<tr>
	 	<td></td>
	 	<td ALIGN=LEFT>Telefone: </td>
		<td><INPUT TYPE=TEXT NAME=telefone></td>
		 <td></td>
	</tr>
	<tr><td></td></tr>
	<tr>
		<td></td>	
		<td ALIGN=right><input type="submit" name="cadastra" id="cad" value="Cadastra"></td>
		
		<td><input type="Reset" name="limparDados" id="limpar" value="Limpar Dados"> </td>
	</tr>
</table>
</form>
<BR>
<BR>

<% String cadastraOK = (String) request.getAttribute("cadastraOK");
   System.out.println("cadastraOK =" + cadastraOK);
   if(cadastraOK != null)
     if (cadastraOK.equals("true"))
          out.println("Cadastro efetivado");
     else
    	  out.println(cadastraOK);
 %>
<BR>
<BR>
<BR>
</CENTER>
</body>
</html>