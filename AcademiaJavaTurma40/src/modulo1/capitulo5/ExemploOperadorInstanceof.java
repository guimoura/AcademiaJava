package modulo1.capitulo5;

public class ExemploOperadorInstanceof {

	public static void main(String[] args) {
		Number n = new Integer("10");
		Character c = new Character('3');
		System.out.println(n instanceof Integer);
		System.out.println(n instanceof Number);
		System.out.println(n instanceof Double);
		System.out.println(n instanceof Object);
		System.out.println(n instanceof Comparable);
	}
}
