package br.usjt.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.Test;

import br.usjt.dominio.DAOFactory;

import br.usjt.dominio.IDAOUsuario;

public class TU_DAOUsuario {
	static IDAOUsuario usuario;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		usuario = DAOFactory.getUsuarioDAO();
	}

	@Test
	public void CT01ValidaUsuario_com_sucesso() {
		assertTrue("valida ",usuario.login("jSilva","1111"));
	}
	@Test
	public void CT01ValidaUsuario_senha_invalida() {
		assertFalse("valida ",usuario.login("jSilva","2222"));
	}
	@Test
	public void CT01ValidaUsuario_senha_em_branco() {
		assertFalse("valida ",usuario.login("jSilva",""));
	}
	@Test
	public void CT01ValidaUsuario_senha_id_em_branco() {
		assertFalse("valida ",usuario.login("",""));
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
