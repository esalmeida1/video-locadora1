package br.usjt.teste;

import static org.junit.Assert.*;

import br.usjt.dominio.DAOFactory;
import br.usjt.dominio.IDAOCliente;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.server.SeleniumServer;


public class GUI_UC01CadastraClienteFB  {
	Selenium selenium;
	SeleniumServer servidor;
	IDAOCliente daoCliente;
	@Before
	public void setUp() throws Exception {
		servidor = new SeleniumServer(); 
		//servidor.start();
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost:8080/");
		selenium.start();
		daoCliente = DAOFactory.getClienteDAO();
	}

	@Test
	public void testUC01CadastraCliente() throws Exception {
		selenium.open("/VideoLocadora/visao/FormLogin.jsp");
		FormLogin login = new FormLogin(selenium);
		login.digitaID("jSilva");
		login.digitaSenha("1111");
		FormMenu formMenu = login.clickBotaoLogin();
		FormCadastraCliente formCadastraCliente = formMenu.clickCadastraCliente();
		formCadastraCliente.digitaCPF("97386352174");
		formCadastraCliente.digitaNome("claudio fonseca");
		formCadastraCliente.digitaTelefone("4321-4321");
		formCadastraCliente.clickBotaoCadastra();
		assertTrue("mensagem cadastro efetivado",selenium.isTextPresent("Cadastro efetivado"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
		servidor.stop();
		daoCliente.exclui("97386352174");
	}
}

