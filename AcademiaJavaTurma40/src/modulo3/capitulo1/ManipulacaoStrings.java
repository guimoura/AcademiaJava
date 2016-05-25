package modulo3.capitulo1;

public class ManipulacaoStrings {

	public static void main(String[] args) {
		String curso = "Academia Java";
		char p1 = curso.charAt(0);
		
		//System.out.println(p1);
		
		curso =  curso.concat(" - Turma 40");
		//System.out.println(curso);
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		//System.out.println(s1 == s2);
		//System.out.println(s1.equals(s2));
		
		int indice = curso.indexOf('m');
		
		System.out.println("Posição da letra:" + indice);
		
		String email = "Teste@season.com";
		int indiceArroba = email.indexOf("@");
		boolean valido = indiceArroba > -1;
		System.out.println("Email valido: " + valido);
		
		int ultimoIndice = curso.lastIndexOf("m");
		System.out.println("Ultima letra:" +ultimoIndice);

		int tamanho = curso.length();
		System.out.println("tamanho da String : " + tamanho);
		
		//curso = curso.replace("a", "@");
		//System.out.println(curso);

		boolean comecaComA = curso.startsWith("Acad");
		System.out.println(comecaComA);
		
		boolean terminaCom = curso.endsWith("40");
		System.out.println(terminaCom);
		
		String nomeArquivo = curso.toLowerCase().trim().replace(" -", "").replace(" ", "_").concat(".zip");
		System.out.println(nomeArquivo);
		
		
	}
}
