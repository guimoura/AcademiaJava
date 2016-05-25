package modulo4.capitulo2;

import java.io.File;

public class ExemploListagemArquivo {

	public static void main(String[] args) {
		File diretorio = new File("/home/hash/workspace/AcademiaJavaTurma40");
		
		File[] files = diretorio.listFiles();
		
		listarArquivos(files);

	
	}
		
	private static void listarArquivos(File[] files){
		for (File file : files) {
			if(file.isDirectory()){
				System.out.println(file.getName());
				listarArquivos(file.listFiles());
			} else {
				System.out.println(file.getName());
			}
		}
	}
	
}
