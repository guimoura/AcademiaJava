package modulo3.capitulo2;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploInterfaceSetConcorrencia {

	public static void main(String[] args) {
		
		Set<Funcionario> funcionarios = new HashSet<>();
		Funcionario func1 = new Funcionario(1, "Missae", 	"111111", new Date());
		Funcionario func2 = new Funcionario(2, "Guilherme", "222222", new Date());
		Funcionario func3 = new Funcionario(3, "Angela", 	"333333", new Date());
		Funcionario func4 = new Funcionario(4, "Renato", 	"444444", new Date());
		Funcionario func5 = new Funcionario(5, "Fernando", 	"555555", new Date());
		Funcionario func6 = new Funcionario(5, "Angela", 	"333333", new Date());
		
		funcionarios.add(func1);
		funcionarios.add(func2);
		funcionarios.add(func3);
		funcionarios.add(func4);
		funcionarios.add(func5);
		funcionarios.add(func6);

		Iterator<Funcionario> it = funcionarios.iterator();
		
		while(it.hasNext()){
			Funcionario funcionario = it.next();
			if(funcionario.getNome().equals("Renato")){
				it.remove();
			}
		}
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Nome: " + funcionario.getNome() + "\t" +
					"CPF: " + funcionario.getCpf()); 
		}
		
		// Problema de concorrencia
		/*for (Funcionario funcionario : funcionarios) {
			if(funcionario.getNome().equals("Renato")){
				funcionarios.remove(funcionario);
			}
			
			System.out.println("Nome: " + funcionario.getNome() + "\t" +
								"CPF: " + funcionario.getCpf());
		}*/
	}
}
