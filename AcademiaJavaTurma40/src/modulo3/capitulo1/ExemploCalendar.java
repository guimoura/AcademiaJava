package modulo3.capitulo1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class ExemploCalendar {
	
	public static void main(String[] args) {
		
		Calendar dataAtual = Calendar.getInstance();
		
		int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
		
		//dataAtual.set(Calendar.DAY_OF_MONTH, 9);
		dataAtual.add(Calendar.HOUR_OF_DAY, 10);
		//dataAtual.roll(Calendar.DAY_OF_MONTH, 10); // adiciona 10 apenas no mes ignorando os outros campos 
		//dataAtual.roll(Calendar.DAY_OF_MONTH, -10); // forma retroativa
		
		System.out.println("Data atual: " + dataAtual.getTime());
		System.out.println("Data valor: " + dia);
		
		
		int valor = dataAtual.get(Calendar.DATE);
		System.out.println("Valor: " + valor);
		

		Calendar dataNasc = new GregorianCalendar(1989, 07, 06);
		System.out.println("meu coisa: " + dataNasc.get(Calendar.WEEK_OF_MONTH));
		String diaSemana = dataAtual.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("pt","BR"));
		System.out.println(diaSemana);
				
	}

}
