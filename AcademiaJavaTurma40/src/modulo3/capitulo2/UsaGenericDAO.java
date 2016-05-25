package modulo3.capitulo2;

import java.util.Date;
import java.util.List;

import modulo1.capitulo4.Pessoa;

public class UsaGenericDAO {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario(1, "Missae", "11111", new Date());
		GenericDAO<Funcionario, Integer> dao = new GenericDAO<>();
		dao.salvar(funcionario);
		GenericDAO<Pessoa, Integer> daoPessoa = new GenericDAO<>();
		List<Pessoa> pessoas = daoPessoa.listar();
		System.out.println(pessoas.size());
		Pessoa pessoaBanco = daoPessoa.obterPorId(new Pessoa(), 1);
		
	}
}
