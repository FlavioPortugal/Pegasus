package br.com.pegasus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.pegasus.beans.Usuario;
import br.com.pegasus.conexao.Conexao;

public class UsuarioDAO {

	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public UsuarioDAO() throws Exception {
		con = Conexao.conectar();
	}	
	
	public Usuario consultarPorNumero(int codigo) throws Exception {
		stmt = con.prepareStatement(
				"SELECT * FROM T_PEG_CHATBOT WHERE CD_PERGUNTA=?"); // Fix this later.
		stmt.setInt(1, codigo);
		rs = stmt.executeQuery();
		Usuario user = new Usuario();
		if(rs.next()) {
			user.setCodigo(rs.getInt("CD_PERGUNTA"));			
		}
		return user;
	}
	
	public void fechar() throws Exception {
		con.close();
	}
	
}
