package modulo2.capitulo9;

public class Pedido {

	/*public static final int AGUARDANDO_APROVACAO = 0;
	public static final int APROVADO = 1;
	public static final int ENVIADO = 2;*/
	
	/*public enum StatusPedido {AGUARDANDO_APROVACAO, APROVADO,
		ENVIADO};*/
	
	private String codigo;
	private double valor;
	private StatusPedido status;

	public Pedido(String codigo, double valor, StatusPedido status) {
		super();
		this.codigo = codigo;
		this.valor = valor;
		this.status = status;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

}
