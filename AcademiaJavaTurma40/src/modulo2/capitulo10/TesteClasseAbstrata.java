package modulo2.capitulo10;

public class TesteClasseAbstrata {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Tobi");
		System.out.println(cachorro.getNome());
		cachorro.comer("");
		cachorro.sentar();
	}
}
