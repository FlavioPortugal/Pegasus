package br.com.pegasus.beans;

import br.com.pegasus.beans.Aluno;

public class AlunoAula {

	private Aluno codigoUsuario;
	private Aula codigoAula;
	private int faltas;
	
	public AlunoAula() {
		super();
	}
	
	public AlunoAula(Aluno codigoUsuario, Aula codigoAula, int faltas) {
		super();
		this.codigoUsuario = codigoUsuario;
		this.codigoAula = codigoAula;
		this.faltas = faltas;
	}

	public Aluno getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(Aluno codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public Aula getCodigoAula() {
		return codigoAula;
	}
	public void setCodigoAula(Aula codigoAula) {
		this.codigoAula = codigoAula;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
	
}
