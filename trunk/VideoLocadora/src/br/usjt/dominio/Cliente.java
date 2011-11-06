package br.usjt.dominio;

//
import java.util.Enumeration;
import java.util.Vector;

public class Cliente {
	private String cpf;
	private String nome;
	private String endereco;

	private String telefone;
//	private Vector<Emprestimo> _rentals = new Vector();

	
	public String getCPF() {
		return cpf;
	}

	public void setNome(String nome){
		if (nome != "" && nome !=null){
			this.nome = nome;
		}
		else
			throw new IllegalArgumentException("Entrada inválida!");
	}

	public String getName() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setCPF(String cpf) throws Exception {
		if (isValido(cpf)){
			this.cpf = cpf;
		}
		else
			throw new IllegalArgumentException("Entrada inválida!");
	}
	public boolean isValido(String cpf) {
		if (cpf.length() == 11) {
			int d1, d2;
			int digito1, digito2, resto;
			int digitoCPF;
			String nDigResult;
			d1 = d2 = 0;
			digito1 = digito2 = resto = 0;
			for (int n_Count = 1; n_Count < cpf.length() - 1; n_Count++) {
				digitoCPF = Integer
						.valueOf(cpf.substring(n_Count - 1, n_Count))
						.intValue();
				d1 = d1 + (11 - n_Count) * digitoCPF;
				d2 = d2 + (12 - n_Count) * digitoCPF;
			}
			resto = (d1 % 11);
			if (resto < 2)
				digito1 = 0;
			else
				digito1 = 11 - resto;
			d2 += 2 * digito1;
			resto = (d2 % 11);
			if (resto < 2)
				digito2 = 0;
			else
				digito2 = 11 - resto;
			String nDigVerific = cpf.substring(cpf.length() - 2, cpf.length());
			nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
			return nDigVerific.equals(nDigResult);
		} else {
			return false;

		}
	}
}
