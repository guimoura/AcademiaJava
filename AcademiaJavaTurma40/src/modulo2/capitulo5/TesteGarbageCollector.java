package modulo2.capitulo5;

public class TesteGarbageCollector {

	public static void main(String[] args) {
		Curso curso = new Curso();
		
		for (int i = 0; i < 100000; i++) {
			if(i % 10000 == 0) {
				System.gc();
			}
			curso = new Curso("" + (i + 1));
		}
	}
}
