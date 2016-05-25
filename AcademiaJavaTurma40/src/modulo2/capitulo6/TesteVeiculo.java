package modulo2.capitulo6;

import modulo2.capitulo8.Cavalo;

public class TesteVeiculo {
	
	String teste;

	public static void main(String[] args) {
		Veiculo veiculo1 = new Veiculo("VW", "Fusca");
		Veiculo veiculo2 = new Veiculo("GM", "Corsa");
		
		veiculo1.setModelo("Gol");
		imprimirVelocidade();
		//Não pode alterar por ser final
		//Veiculo.VELOCIDADE_MAXIMA_PERMITIDA = 90;
		imprimirVelocidade();
		
		System.out.println("Veículo 1");
		System.out.println(veiculo1.getMarca());
		System.out.println(veiculo1.getModelo());
		System.out.println(Veiculo.VELOCIDADE_MAXIMA_PERMITIDA);
		
		System.out.println("---------------------------------------");
		System.out.println("Veículo 2");
		System.out.println(veiculo2.getMarca());
		System.out.println(veiculo2.getModelo());
		System.out.println(Veiculo.VELOCIDADE_MAXIMA_PERMITIDA);
	
		//System.out.println(new Cavalo().cor);
	
	}
	
	static void imprimirVelocidade() {
		System.out.println("VMP: " + Veiculo.VELOCIDADE_MAXIMA_PERMITIDA);
	}
}
