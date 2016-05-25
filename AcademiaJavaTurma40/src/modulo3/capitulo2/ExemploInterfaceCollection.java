package modulo3.capitulo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ExemploInterfaceCollection {

	public static void main(String[] args) {
		
		Collection<String> nomes = new ArrayList();
		String nome1 = "Missae";
		String nome2 = "Guilherme";
		
		nomes.add(nome1);
		nomes.add(nome2);
		nomes.add("Fernando");
		nomes.add(new String("Renato"));
		
		Collection outrosNomes = new ArrayList();
		outrosNomes.add("Fernando");
		outrosNomes.add("Heitor");
		
		nomes.addAll(outrosNomes);
		
		outrosNomes.add("Gabriel");
		
		//nomes.remove("Fernando");
		//outrosNomes.remove("Heitor"); -> Não remove da coleção nomes
		
		//nomes.clear(); // Remove todos os  elementos da coleção
		boolean possuiElementos = !nomes.isEmpty();
		
		System.out.println("A coleção possui elementos? " + possuiElementos);
		
		System.out.println("Quantidade de elementos: " + nomes.size());
		
		boolean possuiMissae = nomes.contains("Missae");
		System.out.println("Encontrou Missae? " + possuiMissae);
		
		boolean possuiTodos = nomes.containsAll(outrosNomes);
		System.out.println("Possui todos?" + possuiTodos);
		
		//Object[] arrayNomes = nomes.toArray();
		String[] arrayNomes = nomes.toArray(new String[nomes.size()]);
		
		//nomes.removeAll(outrosNomes);
		nomes.retainAll(outrosNomes); // Mantém na coleção nomes, apenas
									// os nomes da coleção outrosNomes
		
		System.out.println("Imprimindo nomes");
		for (String nome : nomes) {
			//System.out.println(((String)nome).length());
			//System.out.println(nome.charAt(0));
			System.out.println(nome);
		}
	}
}
