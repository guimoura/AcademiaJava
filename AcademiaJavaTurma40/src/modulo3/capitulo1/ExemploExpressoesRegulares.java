package modulo3.capitulo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExemploExpressoesRegulares {

	public static void main(String[] args) {
		String cpf = "337.511.842-91";
		String padraoCpf = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}";

		String texto = "O cpf do funcionario Jão é 123.132.123-32 ";
		texto += "O cpf do funcionario zoologico é 111.111.111-33 ";
		texto += "O cpf do funcionario Bochecha rosa é 222.333.444-33 ";

		boolean encontrouCpf = encontrarTexto(texto, padraoCpf);
		boolean valido = validar(cpf, padraoCpf);

		// boolean aa = cpf.matches(padraoCpf);

		System.out.println(valido);
		// System.out.println(aa);
		System.out.println("Econtrou o CPF do JAO?: " + encontrouCpf);

		String resultado = extrairResultado(texto, padraoCpf);
		System.out.println("Resultado: " + resultado);

		String[] cpfs = resultado.split("#");

		for (String string : cpfs) {
			System.out.println("CPF: " + string);
		}

	}

	static boolean validar(String valor, String padrao) {

		return Pattern.matches(padrao, valor);
	}

	static boolean encontrarTexto(String texto, String padrao) {
		Pattern pattern = Pattern.compile(padrao);
		Matcher matcher = pattern.matcher(texto);
		return matcher.find();
	}

	static String extrairResultado(String texto, String padrao) {
		Pattern pattern = Pattern.compile(padrao);
		Matcher matcher = pattern.matcher(texto);
		StringBuilder builder = new StringBuilder();

		while (matcher.find()) {
			builder.append(matcher.group() + "#");

		}

		return builder.toString();
	}
}
