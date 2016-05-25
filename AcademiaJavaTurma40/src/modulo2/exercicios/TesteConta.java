package modulo2.exercicios;

import javax.swing.JOptionPane;

public class TesteConta {

	public static void main(String[] args) {

		Cliente joao = new Cliente("Jo�o", 12345);
		//joao.inicializarValores("xdgf", 12345);
		//joao.setNome("Jo�o Silva");
		//joao.setCpf("123455455");
		
		Conta contaJoao = new Conta("123 - 12345", 1000, joao);
		//contaJoao.setSaldo(1000);
		//contaJoao.setLimite(200);
		//contaJoao.setNumero("123 - 12345");
		//contaJoao.setCliente(joao);

		// Teste do m�todo depositar
		/*String valor = JOptionPane.showInputDialog("Informe o valor do dep�sito!");
		double valorDeposito = Double.parseDouble(valor);
		contaJoao.depositar(valorDeposito);*/
		
		// Teste do m�todo sacar
		/*String valorSaqueStr = JOptionPane.showInputDialog("Informe o valor do saque!");
		double valorSaque = Double.parseDouble(valorSaqueStr);
		contaJoao.sacar(valorSaque);*/
		
		// Conta destino utilizada para testar o m�todo transferir;
		Cliente maria = new Cliente("Maria", 359817300);
		//maria.setNome("Maria");
		//maria.setCpf(359817300);
		
		Conta contaMaria = new Conta("123 - 12346", 500, maria, 100);
		//contaMaria.setNumero("123 - 12346");
		//contaMaria.setSaldo(500);
		//contaMaria.setLimite(100);
		//contaMaria.setCliente(maria);
		
		// Teste do m�todo transferir
		String mensagem = "Informe o valor a ser transferido da conta do(a) " + joao.getNome() + 
				" para a conta do(a) " + contaMaria.getCliente().getNome() + "!";
		String valorTransferenciaStr = JOptionPane.showInputDialog(mensagem);
		double valorTransferencia = new Double(valorTransferenciaStr);
		contaJoao.transferir(valorTransferencia, contaMaria);
		
	}

}
