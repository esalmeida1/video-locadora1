package br.usjt.dominio;

public class Fachada {
	public boolean login(String userName, String password) {
		IDAOUsuario daoUsuario = new DAOUsuario();
		UsuarioRepositorio repositorio = new UsuarioRepositorio(daoUsuario);
		return repositorio.login(userName, password);
			
	}
}
