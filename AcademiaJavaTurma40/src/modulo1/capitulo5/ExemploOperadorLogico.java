package modulo1.capitulo5;

public class ExemploOperadorLogico {

	public static void main(String[] args) {
		double nota = 8;
		double presenca = 89;
		boolean emExame = nota >= 5 && nota < 7 && presenca++ < 90;
		/*System.out.println("Em exame? " + emExame);
		System.out.println(nota);
		System.out.println(presenca);*/
		
		boolean aprovado = nota >= 7 | presenca++ >= 90;
		System.out.println("Aprovado? " + aprovado);
		System.out.println(presenca);
		
		System.out.println(true ^ false); // true
		System.out.println(true ^ true); // false
		
		
	}
}
