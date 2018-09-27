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
				"SELECT U.NM_USUARIO,AVAL.NR_NOTA,FREQ.DT_FREQUENCIA FROM T_PEG_USUARIO U INNER JOIN  T_PEG_ALUNO ALUNO on U.CD_USUARIO = Aluno.CD_ALUNO INNER JOIN T_PEG_AVALIACAO AVAL on Aluno.CD_ALUNO = aval.CD_ALUNO LEFT JOIN T_PEG_FREQUENCIA FREQ on AVAL.CD_ALUNO=FREQ.CD_ALUNO WHERE CD_ALUNO = ?");
		stmt.setString(1, codigo);		
		rs = stmt.executeQuery();
		if (rs.next()) {
			user.setCodigo(rs.getInt("CD_ALUNO"));
		}
		return user;
	}
	
	public void fechar() throws Exception {
		con.close();
	}
}
