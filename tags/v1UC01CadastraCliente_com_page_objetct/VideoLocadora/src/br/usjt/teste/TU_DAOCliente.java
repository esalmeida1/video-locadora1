package br.usjt.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.usjt.dominio.DAOFactory;
import br.usjt.dominio.IDAOCliente;

public class TU_DAOCliente {
	static IDAOCliente clienteDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		clienteDAO = DAOFactory.getClienteDAO();
	}

	
	/**
	 * Objetivo- verificar o comportamento da função cadastrar cliente na camada
	 * de persistencia
	 * Pré-condição - o cpf não esta cadastrado
	 */
	@Test
	public void CT01CadastraCliente_com_sucesso() {
		assertEquals("qt de registro modificados no db=", 1, clienteDAO.cadastra("58905389007",
				"carlos manoel", "r. taquari", "11111111"));
	}
	/**
	 * Objetivo- verificar o comportamento da função cadastrar cliente na camada
	 * de persistencia para um cpf ja cadastrado
	 * Pré-condição - o cpf esta cadastrado
	 */
	@Test
	public void CT02CadastraCliente_cpf_ja_cadastrado() {
		clienteDAO.cadastra("58905389007", "carlos manoel", "r. taquari", "11111111");
		assertEquals("qt de registro modificados no db=", 0, clienteDAO.cadastra("58905389007",
				"carlos manoel", "r. taquari", "11111111"));
	}
	/**
	 * Objetivo- verificar o comportamento da função cadastrar cliente na camada
	 * de persistencia com nome em branco
	 * Pré-condição - o banco de dados não rejeita nome em branco
	 */
	@Test
	public void CT03CadastraCliente_nome_em_branco() {
		
		assertEquals("qt de registro modificados no db=", 1, clienteDAO.cadastra("58905389007",
				"", "r. taquari", "11111111"));
	}
	@After
	public void tearDown() throws Exception {
		clienteDAO.exclui("58905389007");
	}

}
