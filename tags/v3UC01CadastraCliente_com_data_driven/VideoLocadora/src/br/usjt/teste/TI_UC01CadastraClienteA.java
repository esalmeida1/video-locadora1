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

public class TI_UC01CadastraClienteA {
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
	public void CT01UC01CadastraClienteA1_cpf_invalido() {
		assertEquals("mensagem informando: ","Entrada inválida!",fachada.cadastraCliente("111111","carlos manoel", "r. taquari", "11111111"));
	}
	@Test
	public void CT02UC01CadastraClienteA2_com_nome_nulo() {
			
		assertEquals("mensagem informando: ","Column 'nome' cannot be null",fachada.cadastraCliente("58905389007",null, "r. taquari", "11111111"));
	}
	@After
	public void tearDown() throws Exception {
	}
}
