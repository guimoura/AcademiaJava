package modulo2.capitulo10;

public abstract class Animal {

	private String nome;
	private int peso;
	protected String cor;
	
	static {
		System.out.println("Bloco static classe animal");
	}
	
	{
		System.out.println("Bloco inicialização classe Animal");
	}
	
	public Animal() {
		super();
		System.out.println("Construtror Animal()");
	}

	public Animal(String nome, int peso, String cor) {
		this();
		System.out.println("Construtror Animal(String nome, int peso, String cor)");
		this.nome = nome;
		this.peso = peso;
		this.cor = cor;
	}
	
	public void comer(String alimento) {
		System.out.println("Animal " + nome + " comendo " + alimento);
	}
	
	public abstract void mover(int velocidade);
	
	public String toString() {
		return "Animal -> Nome: " + nome + " Cor: " + cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	 String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}