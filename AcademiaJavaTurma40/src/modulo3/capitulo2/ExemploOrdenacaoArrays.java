package modulo3.capitulo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoArrays {

	public static void main(String[] args) {
		String[] nomes = 
			{"Missae", "Gabriel", "Angela", "Renato", "Fernando"};
		
		System.out.println("Sem ordenação");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		Arrays.sort(nomes, Collections.reverseOrder());
		
		System.out.println("\n\nCom ordenação");
		/*for (String nome : nomes) {
			System.out.println(nome);
		}*/
		System.out.println(Arrays.toString(nomes));
		
		List<String> nomesList = new ArrayList<>(Arrays.asList(nomes)); 
		nomesList.add("Heitor");
		nomesList.remove("Renato");
		for (String nome : nomesList) {
			System.out.println(nome);
		}
	}
}
