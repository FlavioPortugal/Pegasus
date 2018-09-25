package br.com.pegasus.beans;

import br.com.pegasus.beans.Professor;

public class Aula {

	private int codigoAula;
	private String dataHorarioInicio;
	private int tempoDuracao;
	private String sala;
	private Professor professor;
	private Disciplina disciplina;
	
	public Aula() {
		super();
	}
	
	
	public Aula(int codigoAula, String dataHorarioInicio, int tempoDuracao, String sala, Professor professor,
			Disciplina disciplina) {
		super();
		this.codigoAula = codigoAula;
		this.dataHorarioInicio = dataHorarioInicio;
		this.tempoDuracao = tempoDuracao;
		this.sala = sala;
		this.professor = professor;
		this.disciplina = disciplina;
	}


	public int getCodigoAula() {
		return codigoAula;
	}	
	public void setCodigoAula(int codigoAula) {
		this.codigoAula = codigoAula;
	}
	public String getDataHorarioInicio() {
		return dataHorarioInicio;
	}

	public void setDataHorarioInicio(String dataHorarioInicio) {
		this.dataHorarioInicio = dataHorarioInicio;
	}
	public int getTempoDuracao() {
		return tempoDuracao;
	}
	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
}
