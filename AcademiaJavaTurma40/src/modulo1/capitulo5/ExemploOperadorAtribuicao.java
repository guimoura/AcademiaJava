package modulo1.capitulo5;

public class ExemploOperadorAtribuicao {

	public static void main(String[] args) {
		int x = 10;
		x += 5;  //x = x + 5;
		System.out.println(x);
		
		int y = 10;
		y -= 5; // y = y - 5;
		System.out.println(y);
		
		double d = 10.5;
		d *= 2; //d = d * 2;
		System.out.println(d);
		
		int z = 10;
		z %= 3; //z = z % 3
		System.out.println(z);
		
		int valor = 10;
		valor *= (2 + 3 * 2);
		System.out.println(valor);
		
	}
}
