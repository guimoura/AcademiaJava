package modulo1.capitulo7;

public class ExemploArrays {

	public static void main(String[] args) {
		
		//int[] numeros = new int[5];
		//int numeros[] = new int[5];
		
		//int numero = numeros[3];
		
		//numeros[0] = 2;
		//numeros[4] = 10;
		
		/*int valor = 2;
		for(int i = 0; i < 5; i++) {
			numeros[i] = valor;
			valor += 2;
		}*/
		int x = 14;
		
		//int[] numeros = {2,4,6,8,10,12,x};
		
		int[] numeros = new int[]{2,4,6,8,10,12,x};
		
		int[] numeros2 = new int[numeros.length + 1];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros2[i] = numeros[i];
		}
		
		numeros2[7] = 20;
		
		System.out.println("Tamanho do array: " + numeros.length);
		
		//imprimirArray(numeros2);
		
		imprimirArraysComForeach(numeros2);
		
		//imprimirArray(new int[]{2,4,6,8,10,12,x});
		
		
		
		//numeros[0]
	}
	
	static void imprimirArray(int[] numeros) {
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(i + " -> " + numeros[i]);
		}
	}
	//for(<tipo> <identificador> : <array>)
	static void imprimirArraysComForeach(int[] numeros) {
		for(int numero : numeros) {
			System.out.println(numero);
		}
	}
}
