package modulo3.capitulo1;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestHarness {

	public static void main(String[] args) {
		Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
		while (true) {
			
			Pattern pattern = Pattern.compile(console.readLine("%nEntre com o Regex; "));
			
			Matcher matcher = pattern.matcher(console.readLine("Entre com a String para procurar: "));
			
			boolean found = false;
			
			while (matcher.find()) {
				console.format("O texto foi encontrado " + " \" %s\" iniciado em " + "index %d e fim at index %d.%n" , matcher.group(), matcher.start(), matcher.end());
				
				found = true;
				
			}
		if(!found){
			console.format("Não Encontrado");
		}
		}

	}

}
