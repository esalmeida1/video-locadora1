package br.usjt.teste;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;

import org.junit.Test;

import br.usjt.dominio.Cliente;
import br.usjt.dominio.ClienteRepositorio;
import br.usjt.dominio.DAOClienteMySQL;
import br.usjt.dominio.DAOUsuarioMySQL;
import br.usjt.dominio.Fachada;
import br.usjt.dominio.IDAOCliente;
import br.usjt.dominio.IDAOUsuario;
import br.usjt.dominio.UsuarioRepositorio;

public class TI_UC01CadastraClienteFB {
	IDAOUsuario daoUsuario;
	IDAOCliente daoCliente;
	UsuarioRepositorio usuarioRepositorio;
	ClienteRepositorio clienteRepositorio;
	Fachada fachada;
	Cliente umCliente;

	@Before
	public void setUp() throws Exception {
		daoUsuario = new DAOUsuarioMySQL();
		usuarioRepositorio = new UsuarioRepositorio(daoUsuario);
		daoCliente = new DAOClienteMySQL();
		clienteRepositorio = new ClienteRepositorio(daoCliente);
		fachada = new Fachada();
		umCliente = new Cliente();
		umCliente.setCPF("58905389007");
		umCliente.setNome("carlos manoel");
		umCliente.setTelefone("1234-1234");
		umCliente.setEndereco("r. taquari");
		
	}
	@Test
	public void CT01UC01CadastraCliente_valida_login() {
		assertTrue("valida ",usuarioRepositorio.login("jSilva","1111"));
	}
	@Test
	public void CT02UC02CadastraCliente_pelo_repositorio() {
		assertEquals("cadastra cliente = ","true",clienteRepositorio.cadastra(umCliente));
	}
	@Test
	public void CT01UC03CadastraCliente_valida_login() {
		assertTrue("valida ",fachada.login("jSilva","1111"));
	}
	@Test
	public void CT02UC04CadastraCliente_pelo_fachada() {
		assertEquals("cadastra cliente = ","true",fachada.cadastraCliente("58905389007","carlos manoel", "r. taquari", "11111111"));
		
		
	}
	@After
	public void tearDown() throws Exception {
		daoCliente.exclui("58905389007");
	}
}
