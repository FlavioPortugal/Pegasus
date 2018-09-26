package br.com.pegasus.BO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.pegasus.beans.Usuario;
import br.com.pegasus.conexao.Conexao;

public class UsuarioBO {
	
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public UsuarioBO() throws Exception {
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
	
	
}
