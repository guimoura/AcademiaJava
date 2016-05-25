package modulo4.capitulo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeituraScanner {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Arquivo: ");
		String nomeArquivo = Teclado.ler();
		
		File file = new File(nomeArquivo);
		
		Scanner scanner = new Scanner(file);
		scanner.useDelimiter(nomeArquivo);
		
		while (scanner.hasNextLine()) {
			System.out.println(scanner.next());
		}
		
		scanner.close();
	}
}
