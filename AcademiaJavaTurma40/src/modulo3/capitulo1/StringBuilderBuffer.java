package modulo3.capitulo1;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		StringBuilder curso = new StringBuilder("Academia Java");
		
		curso.append(" - Turma 40");
		int indice = curso.indexOf("-");
		//System.out.println(indice);
		//curso.delete(indice, indice + 2);
		
		StringBuilder cpf = new StringBuilder("39751484898");
		
		cpf.insert(3, ".").insert(7, ".").insert(11, "-");
		
		System.out.println(curso);
		System.out.println(cpf);
		
	}
}
