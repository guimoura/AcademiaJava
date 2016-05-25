package modulo1.capitulo6;

public class ExercicioIfElse {

	// Exercício:
	//Criar duas variáveis do tipo double: nota e notaComportamento.
	// Se a nota for >= 7 ou a nota  for >= a 6 e a notaComportamento >= 8 -> Aprovado.
	// Senão se a nota for >= 5 -> Exame.
	// Senão Reprovado
	
    // Nota	 N. Comportamento
	// 7.5 e 5.5 -> Aprovado
	// 6.0 e 8.5 -> Aprovado
	// 6.9 e 7.9 -> Exame
	// 5.9 e 9.0 -> Exame
	// 4.5 e 8.0 -> Reprovado
	
	public static void main(String[] args) {
		double nota = 6.5;
		double notaComportamento = 5;
		
		if(nota >= 7 || (nota >= 6 && notaComportamento >= 8)){
			System.out.println("Aprovado");
		} else if(nota >= 5){
			System.out.println("Exame");
		} else {
			System.out.println("Reprovado");
		}
	}
}
