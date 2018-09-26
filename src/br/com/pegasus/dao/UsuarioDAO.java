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
	
	public Usuario consultarLogin(String login, String senha) throws Exception {
		Usuario user = new Usuario();
		stmt = con.prepareStatement(
				"SELECT NR_LOGIN , DS_SENHA , NR_NIVEL_ACESSO FROM T_PEG_USUARIO "
				+ "WHERE NR_LOGIN = ? AND DS_SENHA = ?");
		stmt.setString(1, login);
		stmt.setString(2, senha);
		rs = stmt.executeQuery();
		if (rs.next()) {
			user.setLogin(rs.getString("NR_LOGIN"));
			user.setSenha(rs.getString("DS_SENHA"));
		}
		return user;
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
