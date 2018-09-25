package br.com.pegasus.beans;

import br.com.pegasus.beans.Professor;

public class Aula {

	private int codigoAula;
	private String dataHorarioInicio;
	private String dataHorarioFim;
	private String diaDaSemana;
	private String sala;
	private Professor professor;
	private Disciplina disciplina;
	private Turma turma;
	
	public Aula() {
		super();
	}

	public Aula(int codigoAula, String dataHorarioInicio, String dataHorarioFim, String diaDaSemana, String sala,
			Professor professor, Disciplina disciplina, Turma turma) {
		super();
		this.codigoAula = codigoAula;
		this.dataHorarioInicio = dataHorarioInicio;
		this.dataHorarioFim = dataHorarioFim;
		this.diaDaSemana = diaDaSemana;
		this.sala = sala;
		this.professor = professor;
		this.disciplina = disciplina;
		this.turma = turma;
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

	public String getDataHorarioFim() {
		return dataHorarioFim;
	}

	public void setDataHorarioFim(String dataHorarioFim) {
		this.dataHorarioFim = dataHorarioFim;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
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

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
		
	
}
