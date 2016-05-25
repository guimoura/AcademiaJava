package modulo4.capitulo2;

import java.io.File;

public class ExercicioListar {

	public static void main(String[] args) throws Exception {
		File folder = new File("/home/hash/workspace/AcademiaJavaTurma40");

		int level = 0;
		System.out.println(listaDiretorio(folder, level, new StringBuilder(), false));
	}

	private static StringBuilder listaDiretorio(File folder, int level, StringBuilder sb, boolean isLast) {
		identar(sb, level, isLast).append("[D] ").append(folder.getName()).append("\n");

		File[] objects = folder.listFiles();

		for (int i = 0; i < objects.length; i++) {
			boolean last = ((i + 1) == objects.length);

			if (objects[i].isDirectory()) {
				listaDiretorio(objects[i], level + 1, sb, last);
			} else {
				listaArquivos(objects[i], level + 1, sb, last);
			}
		}

		return sb;
	}

	private static StringBuilder listaArquivos(File file, int level, StringBuilder sb, boolean isLast) {
		return identar(sb, level, isLast).append("- ").append(file.getName()).append("\n");
	}

	private static StringBuilder identar(StringBuilder sb, int level, boolean isLast) {
		for (int i = 1; i < level; i++) {
			sb.append("|  ");
		}

		if (level > 0) {
			sb.append(isLast ? "+-" : "+-");
		}

		return sb;
	}

}
