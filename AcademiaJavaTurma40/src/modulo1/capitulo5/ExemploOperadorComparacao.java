package modulo1.capitulo5;

public class ExemploOperadorComparacao {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		int c = 10;
		
		System.out.println("a == b: " + (a == b));
		System.out.println("a == b: " + (a != b));
		System.out.println("a == b: " + (b == c));
		System.out.println("a \"== \"b: " + (b != c));
		
		System.out.println("a > b: " + (a > b));
		System.out.println("a >= b: " + (a >= b));
		
		System.out.println("a < b: " + (a < b));
		System.out.println("a <= b: " + (a <= b));
		
		System.out.println(3 < 3.5);
		
		boolean aprovado = false;
		
		System.out.println("Aprovado: " + (aprovado = true));
		System.out.println(aprovado);
		
		
		
		
		
		//System.out.println("\n\n");
		//System.out.println(' ' < '1');
		
	}
}
