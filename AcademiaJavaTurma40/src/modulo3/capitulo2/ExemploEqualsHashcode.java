package modulo3.capitulo2;

import java.util.Date;

public class ExemploEqualsHashcode {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario
				(1, "Jão", "123.456.876-23", new Date());
		Funcionario funcionario2 = new Funcionario
				(1, "Jão", "123.456.876-43", new Date());
		
		Funcionario funcionario3 = funcionario1;
		
		//boolean iguais = funcionario1 == funcionario3;
		//boolean iguais = funcionario1 == funcionario2;
		boolean iguais = funcionario1.equals(funcionario2);
		
		System.out.println("Iguais: " + iguais);
	}
}
