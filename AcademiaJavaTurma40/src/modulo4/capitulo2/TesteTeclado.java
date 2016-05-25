package modulo4.capitulo2;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteTeclado {

	public static void main(String[] args) throws IOException {
		System.out.println("Informe o nome do arquivo: ");
		String nomeArquivo = Teclado.ler();
		
		System.out.println("Digite o texto que deseja salvar: \n");
		String texto = Teclado.ler();
		
		PrintWriter pw = new PrintWriter(nomeArquivo);
		pw.print(texto);
		
		pw.flush();
		pw.close();
		
		System.out.println("Aquivo salvo com sucesso");
	}
}
