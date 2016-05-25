package modulo1.capitulo6;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		int x = 1;
		
		do {
			//System.out.println("Executando código 'do'");
			x++;
			System.out.println(x);
			if(x > 10) {
				break;
			}
		} while(true);
	}
}
