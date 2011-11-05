package br.usjt.dominio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;



public class DAOUsuario implements IDAOUsuario {
	private static final String login = "SELECT nome FROM usuario"
			+ " WHERE id = ? AND senha= ?";
	@Override
	public boolean login(String userName, String password) {
		ResultSet rs = null;
		PreparedStatement stmt;
		try {
			
			stmt = DAOFactory.criaConexao().prepareStatement(login);
			stmt.setString(1, userName);
			stmt.setString(2, password);
			rs = stmt.executeQuery();

			if (rs.next()) {

				return true;
			}
			// stmt.close();
		} catch (SQLException e) {
			System.out.println("erro =>" + e.getMessage());
			//e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("erro =>" + e.getMessage());
			//e.printStackTrace();
		}
		return false;
	}

}
