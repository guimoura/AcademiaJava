package modulo3.capitulo2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class ExemploTreeSetHorariosOnibus {

	public static void main(String[] args) {
		NavigableSet<Double> horarios = new TreeSet<>();
		
		// 12.25, 12.5, 12.75
		horarios.add(12.0);
		horarios.add(13.0);
		horarios.add(12.5);
		horarios.add(12.25);
		horarios.add(13.25);
		horarios.add(12.75);
		horarios.add(11.75);
		horarios.add(13.5);
		horarios.add(13.5);
		
		System.out.println("Primeiro hor�rio: " + horarios.first());
		System.out.println("�ltimo hor�rio: " + horarios.last());
		System.out.println("Pr�ximo Hor�rio: " + horarios.higher(12.5));
		System.out.println("Pr�ximo ou igual: " + horarios.ceiling(12.5));
		System.out.println("Hor�rio Anterior: " + horarios.lower(12.5));
		System.out.println("Anterior ou igual: " + horarios.floor(12.25));
		
		NavigableSet<Double> subHorarios = horarios.subSet(12.25, true, 12.75, false);
		
		System.out.println("-------------- Hor�rios entre 12:15 e 12:45------------\n\n");
		
		for (Double horario : subHorarios) {
			System.out.println(horario);
		}
		
		System.out.println("--------------------------\n\n");
		
		for (Double horario : horarios) {
			System.out.println(horario);
		}
		
		
	}
}
