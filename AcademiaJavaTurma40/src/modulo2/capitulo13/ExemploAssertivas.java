package modulo2.capitulo13;

public class ExemploAssertivas {

	//java ExemploAssertivas
	
	
	
	public static void main(String[] args) {
		assert args.length == 2 : "Informe dois parametros";
		
		System.out.println(args.length);
		
		System.out.println("Nome : " + args[0]);
		System.out.println("Idade : " + args[1]);

	}

}
