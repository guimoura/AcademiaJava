package modulo2.capitulo5;

public class Curso {

	private String nome = "Curso Padrão";
	private String descricao = "Descrição padrão";
	private String codigo = "AJT40";
	private int duracao = 120;
	static String valor = "Valor da declaração";
	
	static {
		System.out.println("Bloco de inicialização estático");
		valor = "Valor bloco estático";
	}
	
	{
		System.out.println("Bloco de inicialização de instância");
		
	}
	
	static {
		System.out.println("Bloco de inicialização estático 2");
		valor = "Valor bloco estático 2";
	}
	
	public Curso() {
		//System.out.println("Contrutor default Curso");
	}
	
	public Curso(String nome, String descricao, String codigo, int duracao) {
		this(nome, duracao);
		setDescricao(descricao);
		setCodigo(codigo);
	}
	
	public Curso(String nome, int duracao) {
		this();
		setNome(nome);
		setDuracao(duracao);
	}
	
	public Curso(String codigo) {
		setCodigo(codigo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	{
		//System.out.println("final da classe Curso");
	}
	
	
	public void finalize() {
		System.out.println("Removendo curso com código " + codigo);
	}
	
}
