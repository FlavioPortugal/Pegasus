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

	public String gravar(Usuario usuario) throws Exception {
		stmt = con.prepareStatement("INSERT INTO T_PEG_USUARIO (CD_USUARIO , NM_USUARIO, DT_NASCIMENTO, DS_EMAIL, DS_ENDERECO, NR_TELEFONE , DS_SEXO , NR_LOGIN , DS_SENHA) VALUES (? , ? , ?, ?, ? , ?, ?, ? , ?)");
		stmt.setInt(1, usuario.getCodigo());
		stmt.setString(2, usuario.getNome());
		stmt.setString(3, usuario.getDataNascimento());
		stmt.setString(4, usuario.getEmail());
		stmt.setString(5, usuario.getEndereco());
		stmt.setString(6, usuario.getTelefone());
		stmt.setString(7, usuario.getSexo());
		stmt.setString(8, usuario.getLogin());
		stmt.setString(9, usuario.getSenha());		
		stmt.executeUpdate(); // Execute returns a boolean value. Usually recommended to use ExecuteUpdate, which returns an int value.
		return "Cadastrado com sucesso!";
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
