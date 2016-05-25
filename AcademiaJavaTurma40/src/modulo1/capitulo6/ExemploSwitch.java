package modulo1.capitulo6;

public class ExemploSwitch {

	enum Cor {AMARELO, AZUL, VERDE};
	
	public static void main(String[] args) {

		Cor cor = Cor.AMARELO;
		
		switch (cor) {
		case AMARELO:
			System.out.println("cor amarela");
			break;
		case AZUL:
			System.out.println("azul");
		default:
			break;
		}
		
		/*byte mes = 13;
		
		final int valor = 10;

		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case (byte) 128:
			System.out.println("Abril");
			break;
		case valor:
			System.out.println("Abril");
			break;
		// demais meses até o 12
		}*/
	}
}
