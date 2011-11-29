package br.usjt.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import br.usjt.dominio.DAOFactory;

import br.usjt.dominio.IDAOCliente;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.server.SeleniumServer;

public class ContextoDeTeste_UC01CadastraCliente {
	Selenium selenium;
	SeleniumServer servidor;
	IDAOCliente daoCliente;
	DataPool dataPool;
	CasoDeTeste ct;
	ArrayList<CasoDeTeste> massaDeTeste;

	@Before
	public void setUp() throws Exception {
		servidor = new SeleniumServer();
		servidor.start();
		selenium = new DefaultSelenium("localhost", 4444, "*chrome",
				"http://localhost:8080/");
		selenium.start();
		daoCliente = DAOFactory.getClienteDAO();

		dataPool = new DataPool();
		
		massaDeTeste = new ArrayList<CasoDeTeste>();
		try {
			massaDeTeste = dataPool.carregaMassaTeste();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		daoCliente.cadastra("58905389007", "carlos manoel", "r. taquari", "11111111");

	}

	@Test
	public void controleTeste_UC01CadastrarCliente() throws Exception {

		for (CasoDeTeste ct : massaDeTeste) {
			System.out.println("usuario=>" + ct.getNome());
			selenium.open("/VideoLocadora/visao/FormLogin.jsp");
			FormLogin login = new FormLogin(selenium);
			login.digitaID(ct.getId());
			login.digitaSenha(ct.getSenha());
			FormMenu formMenu = login.clickBotaoLogin();
			FormCadastraCliente formCadastraCliente = formMenu
					.clickCadastraCliente();
			formCadastraCliente.digitaCPF(ct.getCpf());
			formCadastraCliente.digitaNome(ct.getNome());
			formCadastraCliente.digitaEndereco(ct.getEndereco());
			formCadastraCliente.digitaTelefone(ct.getTelefone());
			formCadastraCliente.clickBotaoCadastra();
			assertTrue("mensagem de retorno",
					selenium.isTextPresent(ct.getResultadoEsperado()));
		}
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
		servidor.stop();
		for (CasoDeTeste ct : massaDeTeste) {
			daoCliente.exclui(ct.getCpf());
		}
	}
}
