package br.com.pegasus.beans;

public class Coordenador extends Usuario { // extends Usuario (?)
		
		private Usuario usuario;
		private String numeroMatricula;
		private String dataAdmissao;
		private String dataDemissao;
		private int nivelAcesso;
		
		public Coordenador() {
			super();
		}

		public Coordenador(Usuario usuario, String numeroMatricula, String dataAdmissao, String dataDemissao,
				int nivelAcesso) {
			super();
			this.usuario = usuario;
			this.numeroMatricula = numeroMatricula;
			this.dataAdmissao = dataAdmissao;
			this.dataDemissao = dataDemissao;
			this.nivelAcesso = nivelAcesso;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public String getNumeroMatricula() {
			return numeroMatricula;
		}

		public void setNumeroMatricula(String numeroMatricula) {
			this.numeroMatricula = numeroMatricula;
		}

		public String getDataAdmissao() {
			return dataAdmissao;
		}

		public void setDataAdmissao(String dataAdmissao) {
			this.dataAdmissao = dataAdmissao;
		}

		public String getDataDemissao() {
			return dataDemissao;
		}

		public void setDataDemissao(String dataDemissao) {
			this.dataDemissao = dataDemissao;
		}

		public int getNivelAcesso() {
			return nivelAcesso;
		}

		public void setNivelAcesso(int nivelAcesso) {
			this.nivelAcesso = nivelAcesso;
		}		
}