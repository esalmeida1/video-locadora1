package br.usjt.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import br.usjt.dominio.DAOFactory;
import br.usjt.dominio.DAOUsuario;

public class TU_DAOFactory {

	@Before
	public void setUp() throws Exception {
	
	}

	/**
	 * Objetivo - valida a conexao de acesso ao db
	 * Pre-condicao - o driver de conexao do db foi carregado com sucesso
	 */
	@Test
	public void CT01ValidaConexao_com_sucesso() {
		assertNotNull("valida a conexao =>", DAOFactory.criaConexao());
	}
	
	/**
	 * Objetivo - valida a instanciacao de um objeto DAOUsuario
	 * Pre-condicao - o driver de conexao do db foi carregado com sucesso
	 */
	@Test
	public void CT03ObtemUsuarioDAO_com_sucesso() {
		assertTrue(DAOFactory.getUsuarioDAO() instanceof DAOUsuario);
	}
	@After
	public void tearDown() throws Exception {
	}

}
