package br.usjt.teste;

import com.thoughtworks.selenium.Selenium;

public class FormCadastraCliente {
	Selenium selenium;

	public FormCadastraCliente(Selenium selenium) {
		this.selenium = selenium;
	}

	public void digitaCPF(String cpf) {
		selenium.type("name=cpf", cpf);
	}
	public void digitaNome(String nome) {
		selenium.type("name=nome", nome);
	}
	public void digitaEndereco(String endereco){
		selenium.type("name=endereco", endereco);
	}
	public void digitaTelefone(String telefone){
		selenium.type("name=telefone", telefone);
	}
	public void clickBotaoCadastra(){
		selenium.click("id=cad");
		selenium.waitForPageToLoad("30000");
	}
}
