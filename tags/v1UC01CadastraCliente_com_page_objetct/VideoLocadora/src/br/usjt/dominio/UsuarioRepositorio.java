package br.usjt.dominio;

public class UsuarioRepositorio {
	private IDAOUsuario daoUsuario;

	public UsuarioRepositorio(IDAOUsuario daoUsuario) {
		this.daoUsuario = daoUsuario;

	}

	public boolean login(String nome, String senha) {
		if (daoUsuario != null) {
			
			return daoUsuario.login(nome, senha);
			
		}
		return false;
	}

}
