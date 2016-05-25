package modulo2.capitulo10;


public class Cachorro extends Animal implements Domesticavel{

	@Override
	public void comer(String alimento) {
		System.out.println("Cachorro comendo...");
	}

	public void mover(int velocidade) {
		System.out.println("Cachorro se movendo na velocidade "
				+ velocidade);
	}

	@Override
	public void sentar() {
		System.out.println("Cachorro sentando...");
	}

	@Override
	public void darAPatinha() {
		System.out.println("Cachorro dando a patinha...");
	}

	@Override
	public void fingirDeMorto() {
		System.out.println("Cachorro fingindo de morto...");
	}
	
	
}
