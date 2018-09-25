package br.com.pegasus.excecao;

public class Excecao extends Exception {

	public static String tratarExcecao(Exception e) {
		
		if (e.getClass().getName().equals("java.sql.SQLException")) {
			return "Não foi possível realizar uma conexão com o banco de dados!";
		} else {
			return "Ocorreu algum erro!";
		}
	}
}
