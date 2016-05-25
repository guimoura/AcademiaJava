package modulo3.capitulo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploInterfaceMap {

	public static void main(String[] args) {
		Map<Integer, String> meses = new TreeMap<>();
		meses.put(4, "Abril");
		meses.put(1, "Janeiro");
		meses.put(2, "Fevereiro");
		meses.put(3, "Março");
		meses.put(5, "Maio");
		meses.put(6, "Junho");
		
		System.out.println(meses.get(4));
		System.out.println(meses.get(2));
		System.out.println(meses.get(5));
		System.out.println(meses.containsKey(6));
		System.out.println(meses.containsValue("Março"));
		
		System.out.println("Tamanho antes: " + meses.size());
		
		meses.remove(3);
		
		System.out.println("Tamanho depois: " + meses.size());
	
		System.out.println("Chaves");
		Set<Integer> chaves = meses.keySet();
		for (Integer chave : chaves) {
			//System.out.println(meses.get(chave));
			System.out.println(chave);
		}
		
		System.out.println("Valores");
		Collection<String> valores = meses.values();
		for (String mes : valores) {
			System.out.println(mes);
		}
	}
}
