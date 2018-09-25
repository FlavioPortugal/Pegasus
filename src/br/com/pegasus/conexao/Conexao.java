package br.com.pegasus.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	/**
	 * Establishes a connection to the database
	 * @return DriverManager connection
	 * @throws Exception
	 */
	
	/*
	// This connects to my database. Alter as needed.
	public static Connection conectar() throws Exception {
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
	}
	*/
	
	// This connects to Flavio's database on FIAP
	public static Connection conectar() throws Exception {
		return DriverManager.getConnection
				("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","RM79605","250593");
	}
}
