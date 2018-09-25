package br.com.pegasus.beans;

public class Usuario {
		
		private int codigo;
		private String nome;
		private String dataNascimento;
		private String email;
		private String endereco;
		private String telefone;
		private String sexo;
		private String login;
		private String senha;		
		
		public Usuario() {
			super();
		}

		public Usuario(int codigo, String nome, String dataNascimento, String email, String endereco, String telefone,
				String sexo, String login, String senha) {
			super();
			this.codigo = codigo;
			this.nome = nome;
			this.dataNascimento = dataNascimento;
			this.email = email;
			this.endereco = endereco;
			this.telefone = telefone;
			this.sexo = sexo;
			this.login = login;
			this.senha = senha;			
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}		
		
}
