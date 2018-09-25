package br.com.pegasus.beans;

import java.sql.Date;

import br.com.pegasus.beans.Aluno;

public class Avaliacao {
	
	private int codigoAvaliacao;
	private String nome;
	private float nota;
	private Date data;
	private Aluno codigoAluno;
	private Disciplina codigoDisciplina;
	
	public Avaliacao() {
		super();
	}
	
	public Avaliacao(int codigoAvaliacao, String nome, float nota, Date data, Aluno codigoAluno,
			Disciplina codigoDisciplina) {
		super();
		this.codigoAvaliacao = codigoAvaliacao;
		this.nome = nome;
		this.nota = nota;
		this.data = data;
		this.codigoAluno = codigoAluno;
		this.codigoDisciplina = codigoDisciplina;
	}

	public int getCodigoAvaliacao() {
		return codigoAvaliacao;
	}
	public void setCodigoAvaliacao(int codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Aluno getCodigoAluno() {
		return codigoAluno;
	}
	public void setCodigoAluno(Aluno codigoAluno) {
		this.codigoAluno = codigoAluno;
	}
	public Disciplina getCodigoDisciplina() {
		return codigoDisciplina;
	}
	public void setCodigoDisciplina(Disciplina codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
}
