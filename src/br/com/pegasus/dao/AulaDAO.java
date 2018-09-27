package br.com.pegasus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.pegasus.beans.Usuario;
import br.com.pegasus.conexao.Conexao;

public class AulaDAO {

	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public AulaDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	public Usuario consultarAula(String codigo) throws Exception {
		Usuario user = new Usuario();
		stmt = con.prepareStatement(
				"SELECT * FROM T_PEG_AULA  WHERE CD_AULA = ?");
		stmt.setString(1, codigo);		
		rs = stmt.executeQuery();
		if (rs.next()) {
			user.setCodigo(rs.getInt("CD_AULA"));
		}
		return user;
	}
	
	public void fechar() throws Exception {
		con.close();
	}
}
