package modulo2.capitulo9;

public enum StatusPedido {
	AGUARDANDO_APROVACAO("Aguardando Aprovação", 10), 
	APROVADO("Aprovado", 20),
	ENVIADO("Enviado", 30);
	
	private String label;
	private int codigo;

	private StatusPedido(String label, int codigo) {
		this.label = label;
		this.codigo = codigo;
	}

	public String getLabel() {
		return label;
	}
	
	public int getCodigo() {
		return codigo;
	}
}

