package br.com.pegasus.beans;

public class Disciplina {

	private int codigoDisciplina;
	private String nome;
	
	
	public Disciplina() {
		super();
	}
	
	public Disciplina(int codigoDisciplina, String nome) {
		super();
		this.codigoDisciplina = codigoDisciplina;
		this.nome = nome;
	}

	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}
	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
		
}
