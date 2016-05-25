package modulo3.capitulo2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExemploGenerics {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		List<Object> objetos = new ArrayList<>();
		//objetos.add(new Funcionario());
		List<Serializable> ser = new ArrayList<>();
		List<Funcionario> funcionarios = new ArrayList<>();
		//funcionarios.add(new FuncionarioPJ());
		List<FuncionarioPJ> funcionariosPJ = new ArrayList<>();
		objetos.add("Teste");
		
		//imprimir(nomes);
		imprimir(ser);
		imprimir(objetos);
		imprimir(funcionarios);
		//imprimir(funcionariosPJ);
		
		//String nome = "Jão";
		//Object obj = nome;
	}

	private static void imprimir(List<? super Funcionario> list) {
		list.add(new Funcionario());
		for (Object valor : list) {
			System.out.println(valor);
		}
	}
}
