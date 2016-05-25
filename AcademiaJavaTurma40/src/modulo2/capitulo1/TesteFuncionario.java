package modulo2.capitulo1;

public class TesteFuncionario {

	public static void main(String... args) {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		funcionario.setNome("João");
		funcionario.setSobrenome("Silva");
		funcionario.setIdade(-20);
		funcionario.setCasado(true);
		funcionario.setSalario(2000);
		System.out.println("Nome: " +funcionario.getNome());
		System.out.println("Sobrenome: " +funcionario.getSobrenome());
		System.out.println("Idade: " +funcionario.getIdade());
		System.out.println("Casado: " +funcionario.isCasado());
		
		funcionario.imprimirNomeCompleto();

		String nomeCompleto = funcionario.obterNomeCompleto();
		String mensagem = "Nome e sobrenome: " + nomeCompleto;
		System.out.println(mensagem);
		
		double desconto = 200;
		
		double salarioComDesconto = 
				funcionario.obterSalarioComDesconto(desconto); 
		
		System.out.println(salarioComDesconto);
		
		System.out.println(funcionario.obterEstadoCivil());
		System.out.println(funcionario.obterSalarioComDescontos(200, 10));
		
		System.out.println("\n\n\n\n");
		
		long desc = 50;
		double[] descs = {20, 30, desc};
		System.out.println(funcionario.obterSalarioComDescontosVarargs(descs)); 
	}
}
