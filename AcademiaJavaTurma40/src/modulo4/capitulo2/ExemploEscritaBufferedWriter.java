package modulo4.capitulo2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploEscritaBufferedWriter {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("escrita_BW.txt");
		FileWriter fw = new FileWriter(arquivo, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Academia Java");
		bw.newLine();
		bw.write("Turma 40 - 2016");
		
		bw.flush();
		bw.close();
	}
}
