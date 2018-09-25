package br.com.pegasus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.pegasus.conexao.Conexao;

public class DisciplinaDAO {

	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public DisciplinaDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	// Need to prepare the insert and update statements according to DB structure
	
	public void fechar() throws Exception {
		con.close();
	}
}
