package br.usjt.dominio;

public class Fachada {
	public boolean login(String userName, String password) {
		IDAOUsuario daoUsuario = new DAOUsuarioMySQL();
		UsuarioRepositorio repositorio = new UsuarioRepositorio(daoUsuario);
		return repositorio.login(userName, password);
			
	}
	
	public String cadastraCliente(String cpf, String nome, String endereco,
			String telefone) {
		DAOClienteMySQL daoCliente = new DAOClienteMySQL();
		ClienteRepositorio repositorio = new ClienteRepositorio(daoCliente);
		Cliente umCliente = new Cliente();
		String mensagem = "";

		try {
			umCliente.setCPF(cpf);
			umCliente.setNome(nome);
			umCliente.setEndereco(endereco);
			umCliente.setTelefone(telefone);

		} catch (Exception e) {
			mensagem = e.getMessage();
			System.out.println(mensagem);
			return mensagem;
		}

		return repositorio.cadastra(umCliente);
	}
}
