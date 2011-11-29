package br.usjt.dominio;


//
import java.sql.ResultSet;
import java.sql.SQLException;
//
import br.usjt.dominio.DAOClienteMySQL;
import br.usjt.dominio.DAOFactory;
import br.usjt.dominio.IDAOCliente;
//
public class ClienteRepositorio{
	IDAOCliente daoCliente;

	public ClienteRepositorio(IDAOCliente daoCliente){
		this.daoCliente = daoCliente;
	}
	public Cliente consulta(String cpf) {

		
		daoCliente = DAOFactory.getClienteDAO();
		Cliente c = null;

		try {

			ResultSet rs = daoCliente.consulta(cpf);

			if (rs.next()) {

				c = new Cliente();
				try {
					c.setNome(rs.getString("nome"));
					c.setCPF(rs.getString("cpf"));
					c.setEndereco(rs.getString("endereco"));
					c.setTelefone(rs.getString("telefone"));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return c;

	}

	
	public String cadastra(Cliente c) {

		daoCliente = new DAOClienteMySQL();
		int rc = 0;
		rc=daoCliente.cadastra(c.getCPF(), c.getName(), c.getEndereco(),
					c.getTelefone());

		if (rc==1){
			return "true";
		}else{
			return daoCliente.getMessage();
		}
	}
	public String exclui(String cpf){
		daoCliente = new DAOClienteMySQL();
		int rc = 0;
		rc=daoCliente.exclui(cpf);

		if (rc==1){
			return "true";
		}else{
			return daoCliente.getMessage();
		}
	}
}
