package modulo1.capitulo7;

public class ExemploArrayMultidimensional {

	public static void main(String[] args) {
		
		int[][] notas = new int[2][3];
		
		notas[0][0] = 2;
		notas[1][1] = 4;
		
		imprimirNotas(notas);
		
		//int[] novasNotas = {1,2,3,4};
		
		notas[1] = new int[]{1,2,3,4};
		
		System.out.println("Array alterado...\n\n\n");
		
		//imprimirNotas(notas);
		imprimirNotasComForeach(notas);
	}

	private static void imprimirNotasComForeach(int[][] notas) {
		for(int[] arrayNota : notas) {
			for(int valor : arrayNota) {
				System.out.println(valor);
			}
		}
	}

	private static void imprimirNotas(int[][] notas) {
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + "\t");
			}
		}
	}
	
}
