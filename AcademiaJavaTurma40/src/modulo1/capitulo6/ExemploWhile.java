package modulo1.capitulo6;

public class ExemploWhile {

	public static void main(String[] args) {
		
		// Imprimir os números de 1 a 10
		
		int numero = 1;
		
		while(numero <= 10) {
			System.out.print(numero);
			numero++;
		}
		
		// imprimir os números de 10 a 1
		
		numero = 10;
		while(numero >= 1) {
			System.out.println(numero);
			numero--;
		}
		
		int x = 1;
		while(x++ <= 10) {
			System.out.print(x + " ");
		}
		
		System.out.println(x);
		
		boolean aprovado = false;
		
		while(aprovado=!aprovado) {
			System.out.println("Dentro do while");
		}
	}
}
