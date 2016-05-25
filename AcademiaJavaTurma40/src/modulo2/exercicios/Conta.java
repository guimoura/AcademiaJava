package modulo2.exercicios;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Conta {

	private String numero;
	private double saldo;
	private double limite;
	private Cliente cliente;
	
	public Conta() {}
	
	// construtor(numero, saldo, cliente)
	public Conta(String numero, double saldo, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	// construtor(numero, saldo, cliente, limite)
	public Conta(String numero, double saldo, Cliente cliente, double limite) {
		this(numero, saldo, cliente);
		this.limite = limite;
	}
	
	public void depositar(double valorDeposito) {
		if(valorDeposito <= 0) {
			System.out.println("Valor incorreto. Informe um valor maior que zero");
			return;
		}
		
		saldo += valorDeposito;
		System.out.println("Depósito realizado com sucesso. Seu novo saldo é " + saldo);
	}
	
	public void sacar(double valorSaque) {
		
		if(valorSaque <= 0) {
			System.out.println("Valor inválido. Informe um valor maior que zero");
			return;
		}
		
		if(valorSaque <= saldo) {
			saldo -= valorSaque;
			System.out.println("Saque realizado com sucesso. Seu novo saldo é " + saldo);
			return;
		}
		
		if(valorSaque <= saldo + limite) {
			saldo -= valorSaque;
			System.out.println("Saque realizado com sucesso. Você entrou no limite. Seu novo saldo é " + saldo);
			return;
		}
		
		System.out.println("Não foi possível sacar. O valor informado excede seu limite");
		
	}
	
	public void transferir(double valorTransferencia, Conta contaDestino) {
		
		if(valorTransferencia <= 0) {
			System.out.println("Valor inválido. Informe um valor maior que zero");
			return;
		}
		
		double saldoAtual = saldo;
		this.sacar(valorTransferencia);
		if(saldoAtual != saldo) {
			contaDestino.depositar(valorTransferencia);
			String mensagem = "Transferência realizada com sucesso!\n";
			mensagem += "O novo saldo da conta do(a) " + cliente.getNome() + " é " + NumberFormat.getCurrencyInstance().format(saldo) + "\n";
			mensagem += "O novo saldo da conta do(a) " + contaDestino.cliente.getNome() + " é " + NumberFormat.getCurrencyInstance().format(contaDestino.saldo) + "\n";
			System.out.println(mensagem);
			return;
		}
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
