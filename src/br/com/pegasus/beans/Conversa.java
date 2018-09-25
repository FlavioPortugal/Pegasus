package br.com.pegasus.beans;

public class Conversa {
	
	private int codigo;
	private String descricao;
	private Usuario usuario;
	private Disciplina disciplina;
	
	public Conversa() {
		super();
	}

	public Conversa(int codigo, String descricao, Usuario usuario, Disciplina disciplina) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.usuario = usuario;
		this.disciplina = disciplina;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	

}
