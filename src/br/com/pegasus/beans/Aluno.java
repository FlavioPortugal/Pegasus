package br.com.pegasus.beans;

public class Aluno extends Usuario { // extends Usuario (?)
		
		private Usuario usuario;
		private Turma turma;
		private String numeroMatricula;
		private String dataMatricula;
		private int nivelAcesso;
		
		public Aluno() {
			super();
		}

		public Aluno(Usuario usuario, Turma turma, String numeroMatricula, String dataMatricula, int nivelAcesso) {
			super();
			this.usuario = usuario; // Removi o espaco
			this.turma = turma;
			this.numeroMatricula = numeroMatricula;
			this.dataMatricula = dataMatricula;
			this.nivelAcesso = nivelAcesso;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public Turma getTurma() {
			return turma;
		}

		public void setTurma(Turma turma) {
			this.turma = turma;
		}

		public String getNumeroMatricula() {
			return numeroMatricula;
		}

		public void setNumeroMatricula(String numeroMatricula) {
			this.numeroMatricula = numeroMatricula;
		}

		public String getDataMatricula() {
			return dataMatricula;
		}

		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}

		public int getNivelAcesso() {
			return nivelAcesso;
		}

		public void setNivelAcesso(int nivelAcesso) {
			this.nivelAcesso = nivelAcesso;
		}				
		
}