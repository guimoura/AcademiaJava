package modulo2.capitulo5;

public class TesteCurso {
	
	public static void main(String[] args) {
		System.out.println(Curso.valor);
		Curso curso3 = new Curso();
		Curso curso1 = new Curso("AJ", "Curso de Java", "AJT40", 120);
		Curso curso2 = new Curso("AJ2", 100);
		//curso.inicializaCurso("AJ", "Curso de Java", "AJT40", 120);
		System.out.println(curso1.getNome());
		System.out.println(curso3.getNome());
		System.out.println(curso2.getDescricao());
		curso3 = new Curso("AW", 100);
		Curso curso4 = curso3;
		curso3 = null;
		curso4 = null;
	}
}
