package modulo2.capitulo13;

public class Cavalo extends Animal{

	private String raca;
	private boolean marchador;
	
	static {
		System.out.println("Bloco static classe Cavalo");
	}
	
	{
		System.out.println("Bloco inicializa��o classe Cavalo");
	}
	
	public Cavalo(String nome, int peso, 
			String cor, String raca, boolean marchador) {
		super(nome, peso, cor);
		System.out.println("Construtor Cavalo(String nome, int peso...)");
		this.raca = raca;
		this.marchador = marchador;
	}
	
	public Cavalo() {
		System.out.println("Construtor Cavalo()");
	}
	
	public Cavalo(String raca, boolean marchador) {
		this.raca = raca;
		this.marchador = marchador;
	}

	public void comer(String alimento) {
		super.comer(alimento);
		System.out.println("Cavalo " + super.getNome() + " de peso " + getPeso()
				+ " degustando " + alimento);
	}
	
	public String toString() {
		String mensagem = super.toString();
		mensagem += " Ra�a: " + raca;
		return mensagem;
	}

	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public boolean isMarchador() {
		return marchador;
	}
	public void setMarchador(boolean marchador) {
		this.marchador = marchador;
	}
	
	
	
	

	
	
	
	
	
}
