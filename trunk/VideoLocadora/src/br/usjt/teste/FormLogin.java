package br.usjt.teste;

import com.thoughtworks.selenium.Selenium;

public class FormLogin {
	Selenium selenium;
	public FormLogin(Selenium selenium){
		this.selenium=selenium;
	}
	public void digitaID(String id){
		selenium.type("userName", id);
	}
	public void digitaSenha(String senha){
		selenium.type("password", senha);
	}
	public FormMenu clickBotaoLogin(){
		selenium.click("continua");
		selenium.waitForPageToLoad("30000");
		return new FormMenu(selenium);
	}

}
