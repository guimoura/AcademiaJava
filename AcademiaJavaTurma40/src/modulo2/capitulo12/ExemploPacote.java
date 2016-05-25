// Define o package
package modulo2.capitulo12;

import java.util.Date;

import static java.lang.System.out;
import static java.lang.Integer.*;

public class ExemploPacote {

	public static void main(String[] args) {
		
		Date dataAtual = new Date();
		out.println("Data Atual: " + dataAtual);
		
		String valor = "10";
		int numero = parseInt(valor);
		
		double maiorValorInt = Double.MAX_VALUE;
		System.out.println("Maior valor: " + maiorValorInt);
		
	
		
		ExemploDataSql.imprimirDataSql(new java.sql.Date(1000));;
	
	
	}
}
