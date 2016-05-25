package modulo3.capitulo1;

import java.util.Date;

public class ExemploPrintf {

	public static void main(String[] args) {
		String nome = "Jão";
		double salario = 1999.99;
		int idade = 200;
		Date dataNasc = new Date();
		
		System.out.println("O funcionario " + nome + " nascido em ....");
		
		System.out.printf("O funcionario %s recebe o salario de R$ %.2f", nome, salario);
	}
}
