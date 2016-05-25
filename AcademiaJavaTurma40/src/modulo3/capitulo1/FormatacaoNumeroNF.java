package modulo3.capitulo1;

import java.text.NumberFormat;
import java.text.ParseException;

public class FormatacaoNumeroNF {

	public static void main(String[] args) throws ParseException {
		
		double numero = 1009.99;
		NumberFormat formatador =  NumberFormat.getCurrencyInstance();
		String numeroFormatado = formatador.format(numero);
		System.out.println("Numero Formatado: " + numeroFormatado);
		
		double valorRetorno = formatador.parse(numeroFormatado).doubleValue();
		
		System.out.println("V. Retorno: " + valorRetorno);
		
		double valorP = 0.3;
		formatador =  NumberFormat.getPercentInstance();
		System.out.println(formatador.format(valorP));
		
		
		
		numero = 1234.123;
		formatador = NumberFormat.getInstance();
		formatador.setMaximumFractionDigits(5);
		formatador.setMinimumFractionDigits(4);
		numeroFormatado = formatador.format(numero);
		System.out.println("Numero Formatado: " + numeroFormatado);
		
		
	}
}
