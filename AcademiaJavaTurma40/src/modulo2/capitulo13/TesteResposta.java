package modulo2.capitulo13;



public class TesteResposta {

	static void test() throws Error {
		if (true) throw new AssertionError();
		System.out.print("teste");
	}
	
	public static void main(String[] args) {
		try {
			test();
			System.out.println("eitaaaa");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
