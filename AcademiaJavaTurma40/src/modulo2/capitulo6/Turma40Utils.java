package modulo2.capitulo6;

public class Turma40Utils {
	
	static {
		System.out.println("Bloco de inicializa��o est�tico");
	}
	
	{
		System.out.println("Bloco de inicializa��o de inst�ncia");
		
	}
	
	public static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	public static String transformarEmMaisuculo(String texto) {
		return texto.toUpperCase();
	}
}
