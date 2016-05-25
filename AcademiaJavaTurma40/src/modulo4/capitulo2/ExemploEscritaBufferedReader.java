package modulo4.capitulo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploEscritaBufferedReader {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("escrita_BW.txt");
		FileReader fr = new FileReader(arquivo);
		BufferedReader br = new BufferedReader(fr);
		
		String resultado = null ;
		
		while((resultado = br.readLine()) != null){
			System.out.println(resultado);
			
		}
	}
}
