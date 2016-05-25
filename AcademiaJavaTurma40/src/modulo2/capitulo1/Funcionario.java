package modulo2.capitulo1;

class Funcionario {

	private String nome;
	private String sobrenome;
	private int idade;
	private double salario;
	private boolean casado;
	private char sexo;
	
	void imprimirNomeCompleto() {
		System.out.println("Nome completo: " + nome + " " + sobrenome);
	}
	
	String obterNomeCompleto() {
		String nomeCompleto = nome + " " + sobrenome;
		return nomeCompleto;
	}
	
	double obterSalarioComDesconto(double desconto) {
		return salario - desconto;
	}
	
	// Criar um método obterEstadoCivil que retorna uma String com os
	// valores "Casado" ou "Solteiro";
	String obterEstadoCivil() {
		//return casado ? "Casado" : "Solteiro";
		
		/*if(casado) {
			return "Casado";
		} 
		
		return "Solteiro";*/
		
		
		if(casado) {
			return "Casado";
		} else {
			return "Solteiro";
		}
		
	}
	
	// Criar um método obterSalarioComDescontos que receberá 
	// dois valores de desconto: descontoFixo e porcentagem.
	// salario - (salario * porcentagem) - descontoFixo;
	double obterSalarioComDescontos(double descontoFixo, double porcentagem) {
		return salario - (salario * (porcentagem/100)) - descontoFixo;
	}
	
	double obterSalarioComDescontosVarargs(double... descontos) {
		System.out.println("Quantidade de descontos: " + descontos.length);
		
		double porcentagem = descontos[0];
		salario -= (salario * (porcentagem/100));
		
		double valorTotalDescontos = 0;
		for (int i = 1; i < descontos.length; i++ ) {
			valorTotalDescontos += descontos[i];
		}
		
		return salario - valorTotalDescontos;
	}
	
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		if(idade <= 0) {
			System.out.println("O valor da idade será alterado");
			this.idade = 0;
		} else {
			this.idade = idade;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	// demais getters e setters
	
}
