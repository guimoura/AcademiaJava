package modulo1.capitulo4;

public class VariaveisTipoRefence {
	
	static int a;

	public static void main(String[] args) {
		//String curso = new String("Academia Java");
		//String curso2 = "Academia Web"; //new String("Academia Web");
		//curso2 = curso;
		
		
		int valor = 10;
		double nota;
		nota = 10;
		int y;
		System.out.println(a);
		testarVariavelPrimitiva(valor);
		System.out.println("Dentro do método main. Valor = " + valor);
		System.out.println(nota);
		Pessoa pessoa = new Pessoa();
		System.out.println(pessoa.idade);
		pessoa.idade = 20;
		testarVariavelReference(pessoa);
		System.out.println("Dentro do método main. Idade = " + pessoa.idade);
		
		if(true){
			int valor10 = 10;
			System.out.println(a);
		}
		
		System.out.println(valor);
		
	}
	
	static void testarVariavelPrimitiva(int copia){
		System.out.println(a);
		copia = 20;
		System.out.println(
				"Dentro do método testarVariavelPrimitiva. valor = " + copia);
	}
	
	static void testarVariavelReference(Pessoa copia){
		System.out.println();
		copia.idade = 30;
		System.out.println(
				"Dentro do método testarVariavelReference. Idade = " + copia.idade);
	}
}
