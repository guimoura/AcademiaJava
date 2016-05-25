package modulo3.capitulo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ExemploListFuncionario {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
		Funcionario func1 = new Funcionario(1, "Missae", "11111", new Date());
		Funcionario func2 = new Funcionario(2, "Guilherme", "11111", new Date());
		Funcionario func3 = new Funcionario(3, "Angela", "33333", new Date());
		Funcionario func4 = new Funcionario(4, "Renato", "44444", new Date());
		Funcionario func5 = new Funcionario(5, "Fernando", "55555", new Date());
		Funcionario func6 = new Funcionario(6, "Missae", "11119", new Date());
		
		funcionarios.add(func1);
		funcionarios.add(func2);
		funcionarios.add(func3);
		funcionarios.add(func4);
		funcionarios.add(func5);
		funcionarios.add(func6);
		
		
		System.out.println("Sem ordena��o");
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Nome: " + funcionario.getNome() +
					" Cpf: " + funcionario.getCpf());
		}
		
		//Collections.sort(funcionarios, new FuncionarioCpfNomeComparator(),);
		//Collections.reverse(funcionarios);
		Collections.sort(funcionarios, 
				Collections.reverseOrder(new FuncionarioCpfNomeComparator()));
		
		System.out.println("\n\nCom ordena��o ordena��o");
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Nome: " + funcionario.getNome() +
					" Cpf: " + funcionario.getCpf());
		}
	}
}
