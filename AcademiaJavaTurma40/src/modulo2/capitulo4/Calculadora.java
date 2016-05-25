package modulo2.capitulo4;

public class Calculadora {

	public static void main(String[] args) {
		double soma1 = somar(10, 20.0);
		System.out.println(soma1);
	}
	
	/*private static int somar(int v1, int v2) {
		System.out.println("Somando dois valores int int");
		return v1 + v2;
	}*/
	
	/*private static long somar(long v1, int v2) {
		System.out.println("Somando dois valores int long");
		return v1 + v2;
	}*/
	
	static double somar(int... valores) {
		System.out.println("Somando dois valores int...");
		return 0;
	}
	
	static double somar(Integer i1, Double i2) {
		System.out.println("Somando dois valores Integer Integer");
		return 0;
	}
	
	/*static double somar(double v1, int v2) {
		System.out.println("Somando dois valores  double int");
		return v1 + v2;
	}*/
	
	private static double somar(int v1, short v2) {
		System.out.println("Somando dois valores int short");
		return v1 + v2;
	}
	
	/*private static int somar(int v1, int v2, int v3) {
		System.out.println("Somando três valores 3 int");
		//return somar(v1, v2) + v3;
		return 0;
	}*/
}
