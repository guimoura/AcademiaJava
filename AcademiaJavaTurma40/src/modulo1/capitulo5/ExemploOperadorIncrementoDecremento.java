package modulo1.capitulo5;

public class ExemploOperadorIncrementoDecremento {

	public static void main(String[] args) {
		int x = -10;
		int y = x++; //int y = x; x = x + 1;
		
		int z = +10;
		int w = ++z; // z = z + 1; w = z;
		
		System.out.println(x);
		System.out.println(y);

		/*byte b = (byte) 129;// -128 até 127
		
		int i = b;
		
		b = (byte) i;*/
	}
}
