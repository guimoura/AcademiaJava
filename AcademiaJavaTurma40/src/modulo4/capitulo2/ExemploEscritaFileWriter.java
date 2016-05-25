package modulo4.capitulo2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("escrita_FW.txt");
		FileWriter fw = new FileWriter(arquivo);
		fw.write("Academia Java");
		fw.write(" Turma 40");
		fw.write(" - 2016");
		
		fw.flush();
		fw.close();
	}
}
