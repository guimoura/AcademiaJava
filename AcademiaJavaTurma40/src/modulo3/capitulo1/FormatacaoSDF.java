package modulo3.capitulo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatacaoSDF {

	public static void main(String[] args) throws ParseException {
		
		Date dataAtual = new Date();
		
		//SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss.S a EEEE 'Animado' yyyy");
		
		SimpleDateFormat formatador = new SimpleDateFormat(
				"'São Jose dos Campos,' dd 'de' MMMM 'de' yyyy ");
		
		String dataFormatada = formatador.format(dataAtual);
		
		System.out.println("Data atual: " + dataFormatada);
		
		//São Jose dos Campos, 9 de Abril de 2016
		
		SimpleDateFormat formatadorParse = new SimpleDateFormat("dd/MM/yyyy");
		
		String dataParaConverter = "09/04/2016";
		
		Date dataConvertida = formatadorParse.parse(dataParaConverter);
		
		System.out.println("Data Convertida: " + dataConvertida);
		
	}
}
