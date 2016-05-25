package modulo3.capitulo2;

import java.io.Serializable;
import java.util.Date;

public class Funcionario implements Comparable<Funcionario>, Serializable{

	private Integer id;
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private Integer idDepartamento;
	
	public Funcionario() {}
	
	public Funcionario(Integer id, String nome, String cpf, Date dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public Funcionario(Integer id, String nome, String cpf,
			Date dataNascimento, Integer idDepartamento) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.idDepartamento = idDepartamento;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Integer getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public boolean equals(Object obj) {
		Funcionario outroFuncionario = (Funcionario) obj;
		return this.cpf.equals(outroFuncionario.cpf) 
				&& this.nome.equals(outroFuncionario.nome);
	}
	
	public int hashCode() {
		return cpf.hashCode() + nome.hashCode();
	}

	@Override
	public int compareTo(Funcionario f) {
		int comp = this.nome.compareTo(f.nome);
		
		if(comp != 0) {
			return comp;
		}
		
		return this.cpf.compareTo(f.cpf);
	}
}
