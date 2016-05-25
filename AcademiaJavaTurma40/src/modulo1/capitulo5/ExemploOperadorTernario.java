package modulo1.capitulo5;

public class ExemploOperadorTernario {

	public static void main(String[] args) {
		double nota = 6.5;
		
		// < 5 reprovado
		// >= 5 && < 7 exame
		// >= 7 aprovado
		//String resultado = nota >= 6 ? "Aprovado" : "Reprovado";
		//String resultado = nota < 6 ? "Reprovado" : "Aprovado";
		//String resultado = nota < 5 ? "Reprovado" : nota < 7 ? "Exame" : "Aprovado";
		//String resultado = nota < 5 ? "Reprovado" : nota >= 7 ? "Aprovado" : "Exame";
		String resultado = nota >= 5 && nota <7 ? "Exame" : nota++ > 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
		System.out.println(nota);
	}
}
