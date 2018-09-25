package br.com.pegasus.beans;

public class ProfessorDisciplina {
		
		private Professor professor;
		private Disciplina disciplina;
		
		public ProfessorDisciplina() {
			super();
		}

		public ProfessorDisciplina(Professor professor, Disciplina disciplina) {
			super();
			this.professor = professor;
			this.disciplina = disciplina;
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
