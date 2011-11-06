package br.usjt.dominio;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//
public class DAOCliente implements IDAOCliente {
	private static final String cadastraCliente = "INSERT INTO cliente "
			+ "(cpf, nome, endereco, telefone) VALUES ( ?, ?,?,? ) ";
	private static final String excluiCliente = "DELETE FROM cliente WHERE "
			+ "cpf = ? ";
	private static final String consultaCliente = "SELECT *  FROM cliente WHERE "
			+ "cpf = ? ";
	String msg = "";

	@Override
	public ResultSet consulta(String cpf) {
		ResultSet rs = null;
		PreparedStatement stmt;
		try {

			stmt = DAOFactory.criaConexao().prepareStatement(consultaCliente);
			stmt.setString(1, cpf);

			rs = stmt.executeQuery();

			// stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public int cadastra(String cpf, String nome, String endereco,
			String telefone) {
		PreparedStatement stmt;
		int rc = 0;
		try {
			stmt = DAOFactory.criaConexao().prepareStatement(cadastraCliente);
			stmt.setString(1, cpf);
			stmt.setString(2, nome);
			stmt.setString(3, endereco);
			stmt.setString(4, telefone);

			rc = stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		return rc;
	}

	@Override
	public int exclui(String cpf) {
		PreparedStatement stmt;
		int rc = 0;
		try {
			stmt = DAOFactory.criaConexao().prepareStatement(excluiCliente);
			stmt.setString(1, cpf);
			rc = stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		return rc;
	}

	@Override
	public int altera(String cpf) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getMessage() {
		return msg;
	}
}
