package br.com.pegasus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.pegasus.conexao.Conexao;

public class AvaliacaoDAO {

	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public AvaliacaoDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	public void fechar() throws Exception {
		con.close();
	}
}
