package modulo3.capitulo2;

import java.util.Comparator;

public class FuncionarioCpfNomeComparator 
	implements Comparator<Funcionario>{

	@Override
	public int compare(Funcionario f1, Funcionario f2) { 
		int comp = f1.getCpf().compareTo(f2.getCpf());
		
		if(comp != 0) {
			return comp;
		}
		
		return f1.getNome().compareTo(f2.getNome());
	}

}
