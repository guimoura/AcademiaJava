package modulo3.capitulo2;

import java.util.ArrayList;
import java.util.List;

public class GenericDAO<Entidade, PK> {

	public void salvar(Entidade e) {
		//entityManager.persist(entidade)
		System.out.println("Salvando entidade do tipo " + e.getClass());

	}

	public List<Entidade> listar() {
		//entityManager.createQuery("from Funcionarios").getResultList()
		return new ArrayList<Entidade>();
	}
	
	public Entidade obterPorId(Entidade e, PK id){
		//find(Funcionario.clas, id)
		System.out.println("Retornando objeto com id " + id);
		return null;
	}

}
