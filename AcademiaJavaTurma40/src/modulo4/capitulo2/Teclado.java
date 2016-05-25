package modulo4.capitulo2;

import java.util.Scanner;

public class Teclado {

	public static String ler(){
		Scanner leitor = new Scanner(System.in);
		String texto = leitor.nextLine();
		
		return texto;
	}
}
