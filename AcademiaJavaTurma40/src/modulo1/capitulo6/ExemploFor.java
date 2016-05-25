package modulo1.capitulo6;

public class ExemploFor {

	public static void main(String[] args) {
		// int i = 1;
		// int j = 10;
		// Imprimir os números de 1 a 10;
		/*for (int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println();*/
		
		/*for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println("\n");
		}*/
		
		/*for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println("\n");
		}*/
		
		forExterno:
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if(i == 5 && j == 1) {
					continue forExterno;
				}
				System.out.print(i + "," + j + "\t");
				
			}
			System.out.println("\n");
		}
		
	}
}
