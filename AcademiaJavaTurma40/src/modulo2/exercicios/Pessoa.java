package modulo2.exercicios;

public class Pessoa {

	private String nome;
	private double peso;
	private double altura;
	
	private String obterAvaliacao(double imc) {
		if(imc <= 25) {
			return "Normal";
		}
		
		if(imc <= 30) {
			return "Sobrepeso";
		}
		
		return "Obesidade";
	}
	
	public String calcularImc() {
		double imc = peso / (altura * altura);
		String resultado = obterAvaliacao(imc);
		return resultado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
