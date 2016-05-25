package modulo2.capitulo13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;

public class ExemploCheckedException {

	public static void main(String[] args) {
		//conectarBanco();
	}
	
	
	private static void conectarBanco() throws ParseException{
		try {
			File arquivoConfiguracao = obterArquivoConfiguracao();
			//Connection conexao = DriverManager.getConnection("banco");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		
		System.out.println("Depois do catch");
		
		
	}
	
	private static File obterArquivoConfiguracao() throws IOException, ArithmeticException{
		File arquivoConfiguracao = new File("config.txt");
		if(!arquivoConfiguracao.exists()) {
			//try {
				arquivoConfiguracao.createNewFile();
			//} catch (IOException e) {
			//	e.printStackTrace();
			//}
		}
		
		return arquivoConfiguracao;
	}
}
