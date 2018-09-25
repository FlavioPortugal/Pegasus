package br.com.pegasus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.pegasus.conexao.Conexao;

public class AlunoDAO {


	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public AlunoDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	public void fechar() throws Exception {
		con.close();
	}
}
