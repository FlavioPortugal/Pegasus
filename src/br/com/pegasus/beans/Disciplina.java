package br.com.pegasus.beans;

public class Disciplina {

	private int codigo;
	private String nome;
	
	
	public Disciplina() {
		super();
	}
	
	public Disciplina(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigoDisciplina() {
		return codigo;
	}
	public void setCodigoDisciplina(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
		
}
