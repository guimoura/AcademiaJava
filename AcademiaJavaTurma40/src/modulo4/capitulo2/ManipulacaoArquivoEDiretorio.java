package modulo4.capitulo2;

import java.io.File;
import java.io.IOException;

public class ManipulacaoArquivoEDiretorio {

	public static void main(String[] args) throws Exception {
		File arquivo1 = new File("arquivo1.txt");
		if(!arquivo1.exists()){
			arquivo1.createNewFile();
		}

		File arquivo2 = new File("arquivo2.txt");
		arquivo1.renameTo(arquivo2);
		
		/*File diretorioExistente = new File("diretorio_teste1");
		boolean excluiu = diretorioExistente.delete();
		System.out.println(excluiu);*/
		
		/*String userHome = System.getProperty("user.home");
				
		File diretorio = new File("diretorio_teste1");
		if(!diretorio.exists()){
			diretorio.mkdirs();
		}
		
		File diretorios = new File("diretorio_teste2", "subdiretorio_teste2");
		if(!diretorios.exists()){
			diretorios.mkdirs();
		}
		
		System.out.println(diretorio.isDirectory());
		System.out.println(diretorio.getPath());
		
		File arquivo1 = new File(userHome, "arquivo_teste1.txt");
		if(!arquivo1.exists()){
			arquivo1.createNewFile();
		}
		
		File arquivo = new File(diretorio, "arquivo_teste1.txt");
		if(!arquivo.exists()){
			arquivo.createNewFile();
		}*/
		
	}
}
