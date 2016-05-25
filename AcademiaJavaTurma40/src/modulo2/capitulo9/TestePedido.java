package modulo2.capitulo9;


public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(
				"123", 1000, StatusPedido.AGUARDANDO_APROVACAO);
		
		System.out.println("Código: " + pedido1.getStatus().getCodigo() 
				+ " Status: " + pedido1.getStatus().getLabel());
		
		StatusPedido[] status = StatusPedido.values();
		
		for (StatusPedido statusPedido : status) {
			System.out.println(statusPedido.getLabel());
		}
	}
}
