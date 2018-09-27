package br.com.pegasus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.pegasus.beans.Usuario;
import br.com.pegasus.conexao.Conexao;

public class AvaliacaoDAO {

	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public AvaliacaoDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	public Usuario consultarAvaliacao(String codigo) throws Exception {
		Usuario user = new Usuario();
		stmt = con.prepareStatement(
				"SELECT * FROM T_PEG_AVALIACAO  WHERE CD_AVALIACAO = ?");
		stmt.setString(1, codigo);		
		rs = stmt.executeQuery();
		if (rs.next()) {
			user.setCodigo(rs.getInt("CD_AVALIACAO"));
		}
		return user;
	}
	
	public void fechar() throws Exception {
		con.close();
	}
}
