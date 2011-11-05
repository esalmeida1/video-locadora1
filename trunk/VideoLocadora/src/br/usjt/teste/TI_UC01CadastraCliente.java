package br.usjt.teste;

import static org.junit.Assert.*;


import org.junit.Before;

import org.junit.Test;

import br.usjt.dominio.DAOUsuario;
import br.usjt.dominio.Fachada;
import br.usjt.dominio.IDAOUsuario;
import br.usjt.dominio.UsuarioRepositorio;

public class TI_UC01CadastraCliente {
	IDAOUsuario usuarioDAO;
	UsuarioRepositorio usuarioRepositorio;
	Fachada fachada;

	@Before
	public void setUp() throws Exception {
		usuarioDAO = new DAOUsuario();
		usuarioRepositorio = new UsuarioRepositorio(usuarioDAO);
		fachada = new Fachada();
	}
	@Test
	public void CT01UC01CadastraCliente_valida_login() {
		assertTrue("valida ",usuarioRepositorio.login("jSilva","1111"));
	}
	@Test
	public void CT01UC02CadastraCliente_valida_login() {
		assertTrue("valida ",fachada.login("jSilva","1111"));
	}
}
