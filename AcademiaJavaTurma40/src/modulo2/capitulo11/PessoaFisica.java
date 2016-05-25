package modulo2.capitulo11;

import java.io.Serializable;

public class PessoaFisica extends Pessoa implements Serializable{

	private String cpf;
	
	public PessoaFisica(String nome, int idade, String cpf) {
		super(nome, idade);
		this.cpf = cpf;
	}
	
	public Pessoa obterTipoInstancia() {
		return this;
	}

	@Override
	public String obterDocumento() {
		return cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
