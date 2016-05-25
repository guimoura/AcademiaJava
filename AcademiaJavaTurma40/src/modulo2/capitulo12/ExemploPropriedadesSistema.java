package modulo2.capitulo12;

import java.io.File;

public class ExemploPropriedadesSistema {

	public static void main(String[] args) {
		
		String userName = System.getProperty("user.name");
		String versaoJava = System.getProperty("java.version");
		String os = System.getProperty("os.name");
		
		System.out.println(userName);
		System.out.println(versaoJava);
		System.out.println(os);
		
		String s = null;
		if(s != null) {
			System.out.println(s.length());
		}
		
		Number n = new Double("um");
		Double d = (Double) n;
		
		File file = new File("test");
		//file.createNewFile();
		
		int a = 10;
		int b = 0;
		
		try {
			int c = a/b;
		} catch (ArithmeticException ae) {
			System.out.println();
			ae.printStackTrace();
		}
	}
}
