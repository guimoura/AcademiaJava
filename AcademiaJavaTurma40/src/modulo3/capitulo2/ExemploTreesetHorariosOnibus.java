package modulo3.capitulo2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class ExemploTreesetHorariosOnibus {

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

		System.out.println("----------------------------");
		System.out.println("Primeiro horário: " + horarios.first());
		System.out.println("Ultimo   horário: " + horarios.last());
		System.out.println("Proximo  horário: " + horarios.higher(12.5));
		System.out.println("Proximo ou igual: " + horarios.ceiling(12.5));
		System.out.println("Horario anterior: " + horarios.lower(12.5));
		System.out.println("Anterior ou igual: " + horarios.floor(12.25));

		NavigableSet<Double> subHorarios = horarios.subSet(12.25, true, 12.75, true);

		System.out.println("------------- Horarios ente 12:15 e 12:45 ---------------");

		for (Double horario : horarios) {
			System.out.println(horario);
		}

		System.out.println("----------------------------");
		for (Double horario : horarios) {
			System.out.println(horario);
		}
	}
}
