package modulo1.capitulo4;

public class VariaveisPrimitivasNumericas {

	
	int valorTotal = 10;
	
	public static void main(String[] args) {
		System.out.println("Iniciando exemplos variáveis");
		
		/*byte b = 127; // 8 bit -> -128 até 127 10001010
											// 01111101
		short s = (short)33000; // 16 bit 0000000000000010
		int valor = 100; // 32 bit; 0000000011100000101010110
		long l = 20000000000L; // 64 bit
		short s2 = (short) valor;
		byte b2 = (byte) 255;
		valor = b;
		System.out.println(s);*/
		
		// Número Octal
		//byte oct1 = 031;
		//System.out.println(oct1);
		
		// Número Hexadecimal
		//int dec1 = 0XDEADcafE;
		//System.out.println("dec1: " + dec1);
		
		float f = 2.5f;
		System.out.println("Float: " + f);
		
		double d = 2.5;
		System.out.println("Double: " + d);
		
		int i3 = (int) 2.9999;
		System.out.println("2.9 convertido pra int: " + i3);
		
		
	
	}
}
