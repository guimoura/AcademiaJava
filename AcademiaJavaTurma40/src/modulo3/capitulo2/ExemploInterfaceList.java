package modulo3.capitulo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ExemploInterfaceList {

	public static void main(String[] args) {
		
		List<String> listaNomes = new ArrayList<>();
		listaNomes.add("Nome 1");
		listaNomes.add("Nome 2");
		listaNomes.add("Nome 3");
		
		listaNomes.add(1, "Nome 4");
		listaNomes.set(2, "Nome 2.2");
		
		//List<String> novosNomes = new ArrayList<>(listaNomes);
		
		//String ultimoNome = listaNomes.get(listaNomes.size() - 1);
		String primeiroNome = listaNomes.get(0);
		System.out.println("Primeiro nome: " + primeiroNome);
		
		int indice = listaNomes.indexOf("Nome 4");
		System.out.println("Índice: " + indice);
		if(indice >= 0) {
			listaNomes.remove(indice);
		}
		
		
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
	}
}
