package modulo2.exercicios;

import javax.swing.JOptionPane;

public class TesteConta {

	public static void main(String[] args) {

		Cliente joao = new Cliente("João", 12345);
		//joao.inicializarValores("xdgf", 12345);
		//joao.setNome("João Silva");
		//joao.setCpf("123455455");
		
		Conta contaJoao = new Conta("123 - 12345", 1000, joao);
		//contaJoao.setSaldo(1000);
		//contaJoao.setLimite(200);
		//contaJoao.setNumero("123 - 12345");
		//contaJoao.setCliente(joao);

		// Teste do método depositar
		/*String valor = JOptionPane.showInputDialog("Informe o valor do depósito!");
		double valorDeposito = Double.parseDouble(valor);
		contaJoao.depositar(valorDeposito);*/
		
		// Teste do método sacar
		/*String valorSaqueStr = JOptionPane.showInputDialog("Informe o valor do saque!");
		double valorSaque = Double.parseDouble(valorSaqueStr);
		contaJoao.sacar(valorSaque);*/
		
		// Conta destino utilizada para testar o método transferir;
		Cliente maria = new Cliente("Maria", 359817300);
		//maria.setNome("Maria");
		//maria.setCpf(359817300);
		
		Conta contaMaria = new Conta("123 - 12346", 500, maria, 100);
		//contaMaria.setNumero("123 - 12346");
		//contaMaria.setSaldo(500);
		//contaMaria.setLimite(100);
		//contaMaria.setCliente(maria);
		
		// Teste do método transferir
		String mensagem = "Informe o valor a ser transferido da conta do(a) " + joao.getNome() + 
				" para a conta do(a) " + contaMaria.getCliente().getNome() + "!";
		String valorTransferenciaStr = JOptionPane.showInputDialog(mensagem);
		double valorTransferencia = new Double(valorTransferenciaStr);
		contaJoao.transferir(valorTransferencia, contaMaria);
		
	}

}
