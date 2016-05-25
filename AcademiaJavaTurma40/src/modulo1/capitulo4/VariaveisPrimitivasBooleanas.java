package modulo1.capitulo4;

public class VariaveisPrimitivasBooleanas {

	public static void main(String[] args) {
		int x;
		x = 12;
		boolean positivo = x > 0;
		double nota = 5.5;
		double notaComp = 8;
		boolean aprovado = nota >= 6 || nota >= 5 && notaComp > 8;
		System.out.println("Positivo: " + aprovado);
	}
}
