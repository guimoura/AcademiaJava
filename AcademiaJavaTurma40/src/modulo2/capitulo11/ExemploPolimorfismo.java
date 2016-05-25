package modulo2.capitulo11;


class ExemploPolimorfismo {
	
	public static void main(String[] args) {
		PessoaFisica pessoaFisica = new PessoaFisica("João", 30, "12345");
		Pessoa pessoaJuridica = new PessoaJuridica("Manuel", 40, "12345/678");
		imprimirDados(pessoaFisica);
		imprimirDados(pessoaJuridica);
		
		Pessoa p = pessoaFisica;
		
	}

	
	public static void imprimirDados(Pessoa pessoa) {
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Documento: " + pessoa.obterDocumento());
		if(pessoa instanceof PessoaFisica) {
			//PessoaFisica pf = (PessoaFisica) pessoa;
			System.out.println(((PessoaFisica) pessoa).getCpf());
		}
	}
	
}
