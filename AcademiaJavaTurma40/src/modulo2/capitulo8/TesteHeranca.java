package modulo2.capitulo8;

public class TesteHeranca {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		//System.out.println(animal);
		final Animal cavalo = new Cavalo("Corcel Negro", 300, "Preta", "Manga Larga", false);
		/*System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Cor: " + cavalo.getCor());
		System.out.println("Raça: " + cavalo.cor);*/
		System.out.println("--------------------------");
		cavalo.comer("Alfafa");
		System.out.println(cavalo);
		cavalo.setNome("Outro");
		
	}
}
