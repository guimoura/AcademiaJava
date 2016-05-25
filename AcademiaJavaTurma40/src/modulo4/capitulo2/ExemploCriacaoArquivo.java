package modulo4.capitulo2;

import java.io.File;
import java.io.IOException;

public class ExemploCriacaoArquivo {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("exemplo1.txt");
		
		System.out.println(arquivo.exists());
		
		if(!arquivo.exists()){
			arquivo.createNewFile();
		}
	}
}
