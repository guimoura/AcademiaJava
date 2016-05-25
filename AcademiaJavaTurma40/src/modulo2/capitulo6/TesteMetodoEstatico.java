package modulo2.capitulo6;

import java.util.Date;

public class TesteMetodoEstatico {

	public static void main(String[] args) {
		String texto = "Hello método static!";
		Turma40Utils.imprimir(texto);
		Turma40Utils.imprimir(Turma40Utils.transformarEmMaisuculo(texto));
		System.out.println("Raiz quadrada de 625: " + Math.sqrt(625));
		System.out.println("Número aleatório: " + Math.random());
		imprimirData();
	}
	
	private static void imprimirData() {
		Turma40Utils.imprimir(new Date() + "");
	}
}
