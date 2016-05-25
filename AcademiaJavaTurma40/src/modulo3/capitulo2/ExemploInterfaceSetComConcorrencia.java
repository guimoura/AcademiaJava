package modulo3.capitulo2;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploInterfaceSetComConcorrencia {

	public static void main(String[] args) {
		
		Set<Funcionario> funcionarios = new HashSet<>();
		Funcionario func1 = new Funcionario(1, "Missae", "11111", new Date());
		Funcionario func2 = new Funcionario(2, "Guilherme", "22222", new Date());
		Funcionario func3 = new Funcionario(3, "Ângela", "33333", new Date());
		Funcionario func4 = new Funcionario(4, "Renato", "44444", new Date());
		Funcionario func5 = new Funcionario(5, "Fernando", "55555", new Date());
		Funcionario func6 = new Funcionario(6, "Missae", "11111", new Date());
		
		
		funcionarios.add(func1);
		funcionarios.add(func2);
		funcionarios.add(func3);
		funcionarios.add(func4);
		funcionarios.add(func5);
		funcionarios.add(func6);
		
		Iterator<Funcionario> it = funcionarios.iterator();
		
		while(it.hasNext()) {
			Funcionario funcionario = it.next();
			if(funcionario.getNome().equals("Renato")) {
				it.remove();
			}
		}
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Nome: " + funcionario.getNome() +
					" Cpf: " + funcionario.getCpf());
		}

		// Problema de concorrência
		/*for (Funcionario funcionario : funcionarios) {
			if(funcionario.getNome().equals("Renato")) {
				funcionarios.remove(funcionario);
			}
		}*/
	}
}
