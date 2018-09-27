package br.com.pegasus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.pegasus.beans.Usuario;
import br.com.pegasus.conexao.Conexao;

public class AlunoDAO {


	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public AlunoDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	public Usuario consultarBoletim(String codigo) throws Exception {
		Usuario user = new Usuario();
		stmt = con.prepareStatement(
				"SELECT * FROM T_PEG_ALUNO Aluno INNER JOIN T_PEG_FREQUENCIA freq on Aluno.CD_ALUNO = freq.CD_ALUNO WHERE CD_ALUNO = ?");
		stmt.setString(1, codigo);		
		rs = stmt.executeQuery();
		if (rs.next()) {
			user.setCodigo(rs.getInt("CD_CODIGO"));
		}
		return user;
	}
	
	public void fechar() throws Exception {
		con.close();
	}
}
