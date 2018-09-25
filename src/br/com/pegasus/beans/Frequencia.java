package br.com.pegasus.beans;

public class Frequencia {
	
	private int codigo;
	private Aluno aluno;
	private Aula aula;
	private String data;
	
	public Frequencia() {
		super();
	}

	public Frequencia(int codigo, Aluno aluno, Aula aula, String data) {
		super();
		this.codigo = codigo;
		this.aluno = aluno;
		this.aula = aula;
		this.data = data;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	

}
