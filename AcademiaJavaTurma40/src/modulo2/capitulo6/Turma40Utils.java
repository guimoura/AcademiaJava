package modulo2.capitulo6;

public class Turma40Utils {
	
	static {
		System.out.println("Bloco de inicialização estático");
	}
	
	{
		System.out.println("Bloco de inicialização de instância");
		
	}
	
	public static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	public static String transformarEmMaisuculo(String texto) {
		return texto.toUpperCase();
	}
}
