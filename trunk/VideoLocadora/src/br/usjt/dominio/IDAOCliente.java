package br.usjt.dominio;

import java.sql.ResultSet;

public interface IDAOCliente {
	public ResultSet consulta(String cpf);
	public int cadastra(String cpf, String nome, String endereco, String telefone);
	public int exclui(String cpf);
	public int altera(String cpf);
	public String getMessage();
}
