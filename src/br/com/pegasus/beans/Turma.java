package br.com.pegasus.beans;

public class Turma {

	private int codigoTurma;
	private String nome;
	
	
	public Turma() {
		super();
	}
	public Turma(int codigoTurma, String nome) {
		super();
		this.codigoTurma = codigoTurma;
		this.nome = nome;
	}
	public int getCodigoTurma() {
		return codigoTurma;
	}
	public void setCodigoTurma(int codigoTurma) {
		this.codigoTurma = codigoTurma;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
