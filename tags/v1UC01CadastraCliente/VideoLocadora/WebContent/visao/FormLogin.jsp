<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

<CENTER>
    <BR>
    <BR><H2>Controle de Acesso</H2>
    <BR>
    <BR>Entre com o seu nome de usuário e senha<BR>
    <BR>
    <FORM ID=FormLogin METHOD=POST action=/VideoLocadora/ServletControle>
    <td><INPUT TYPE=HIDDEN NAME=acao VALUE=FormLogin></td>
    <td><INPUT TYPE=HIDDEN NAME=achou VALUE=true></td>
    <TABLE>
    	<TR>
    		<TD>Nome de Usuário:</TD>
   			<TD><INPUT TYPE=TEXT NAME=userName></TD>
   		</TR>
    	<TR>
    		
    		<TD ALIGN=LEFT>Senha:</TD>
    		<TD><INPUT TYPE=PASSWORD NAME=password></TD>
    	</TR>
    	<TR>
    		<TD ALIGN=RIGHT COLSPAN=2>
    		<INPUT NAME=continua TYPE=SUBMIT VALUE=Login></TD>
    	</TR>
    </TABLE>
    <BR>
    <BR>
    <BR>
  
    </FORM>
   <% String achou = request.getParameter("achou");
    		if(achou != null)
    		    if (achou.equals("true"))
    		       out.println("dados invalidos");
    		    else
    		    	out.println("informe os dados de acesso");
    		%>
    		
  
    </CENTER>
</body>
</html>