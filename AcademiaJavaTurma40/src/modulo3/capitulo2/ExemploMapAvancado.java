package modulo3.capitulo2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExemploMapAvancado {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = criarListaFuncionarios();
		
		Map<Integer, List<Funcionario>> mapaDepartamentoFuncionarios = 
				criarMapaDepartamentoFuncionarios(funcionarios);
		
		imprimirFuncionariosList(funcionarios);
		
		imprimirFuncionarioMap(mapaDepartamentoFuncionarios);
	}

	private static void imprimirFuncionarioMap(
			Map<Integer, List<Funcionario>> mapa) {
		Integer[] departamentos = {1,2,3};
		for (Integer departamento : departamentos) {
			System.out.println("Funcionários do departamento " + departamento);
			for(Funcionario funcionario : mapa.get(departamento)) {
				System.out.println(funcionario.getNome());
			}
		}
	}

	private static void imprimirFuncionariosList(List<Funcionario> funcionarios) {
		Integer[] departamentos = {1,2,3};
		for (Integer departamento : departamentos) {
			System.out.println("Funcionários do departamento " + departamento);
			for (Funcionario funcionario : funcionarios) {
				if(funcionario.getIdDepartamento().equals(departamento)) {
					System.out.println(funcionario.getNome());
				}
			}
		}
	}

	private static Map<Integer, List<Funcionario>> criarMapaDepartamentoFuncionarios(
			List<Funcionario> funcionarios) {
		Map<Integer, List<Funcionario>> mapa
			= new HashMap<>();
			
		for (Funcionario funcionario : funcionarios) {
			Integer idDepartamento = funcionario.getIdDepartamento();
			if(mapa.get(idDepartamento) == null) {
				mapa.put(idDepartamento, new ArrayList<Funcionario>());
			}
			
			mapa.get(idDepartamento).add(funcionario);
		}
			
		return mapa;
	}

	private static List<Funcionario> criarListaFuncionarios() {
		List<Funcionario> funcionarios = new ArrayList<>();
		Funcionario funcionario1 = new Funcionario(1, "Funcionario1", "1", new Date(), 1);
		Funcionario funcionario2 = new Funcionario(2, "Funcionario2", "2", new Date(), 2);
		Funcionario funcionario3 = new Funcionario(3, "Funcionario3", "3", new Date(), 3);
		Funcionario funcionario4 = new Funcionario(4, "Funcionario4", "4", new Date(), 1);
		Funcionario funcionario5 = new Funcionario(5, "Funcionario5", "5", new Date(), 3);
		Funcionario funcionario6 = new Funcionario(6, "Funcionario6", "6", new Date(), 3);
		Funcionario funcionario7 = new Funcionario(7, "Funcionario7", "7", new Date(), 1);
		Funcionario funcionario8 = new Funcionario(8, "Funcionario8", "8", new Date(), 2);
		Funcionario funcionario9 = new Funcionario(9, "Funcionario9", "9", new Date(), 1);
		Funcionario funcionario10 = new Funcionario(10, "Funcionario10", "10", new Date(), 1);
		
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);
		funcionarios.add(funcionario4);
		funcionarios.add(funcionario5);
		funcionarios.add(funcionario6);
		funcionarios.add(funcionario7);
		funcionarios.add(funcionario8);
		funcionarios.add(funcionario9);
		funcionarios.add(funcionario10);
		
		return funcionarios;
	}
}
