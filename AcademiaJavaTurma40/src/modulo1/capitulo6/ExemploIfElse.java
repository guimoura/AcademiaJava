package modulo1.capitulo6;

public class ExemploIfElse {

	public static void main(String[] args) {
		double nota = 7.5;

		System.out.println("Iniciando verificação de notas...");

		/*if (nota >= 7) {
			System.out.println("Aluno aprovado");
		} else if (nota >= 5) {
			System.out.println("Aluno em exame");
		} else {
			System.out.println("Aluno reprovado");
		}*/
		
		/*if(nota < 5) {
			System.out.println("Reprovado");
		} if (nota >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Exame");
		}*/
		
		if(nota >= 5) {
			if(nota < 7) {
				System.out.println("Exame");
			} else {
				System.out.println("Aprovado");
			}
		} else {
			System.out.println("reprovado");
		}

		System.out.println("Finalizou verificação das notas");
	}
}
