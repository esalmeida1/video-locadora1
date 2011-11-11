package br.usjt.teste;

import com.thoughtworks.selenium.Selenium;

public class FormMenu {
	Selenium selenium;

	public FormMenu(Selenium selenium) {
		this.selenium = selenium;
	}
public FormCadastraCliente clickCadastraCliente(){
	selenium.click("link=Cad Cliente");
	selenium.waitForPageToLoad("30000");
	return new FormCadastraCliente(selenium);
}
}
