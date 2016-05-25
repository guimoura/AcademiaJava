package modulo4.capitulo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExemploLeituraFileReader {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("escrita_FW.txt");
		FileReader fr = new FileReader(arquivo);
		
		char[] dados = new char[100];
		
		int tamanho = fr.read(dados);
		System.out.println("Quantidade de caracteres lidos: " + tamanho);
		
		for (char c : dados) {
			System.out.print(c);
			
		}
		
		fr.close();
	}
}
