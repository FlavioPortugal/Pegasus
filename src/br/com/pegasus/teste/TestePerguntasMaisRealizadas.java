package br.com.pegasus.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.pegasus.beans.Usuario;
import br.com.pegasus.dao.UsuarioDAO;
import br.com.pegasus.excecao.Excecao;

public class TestePerguntasMaisRealizadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UsuarioDAO dao = new UsuarioDAO();
			List<Usuario> clientes = new ArrayList<Usuario>();
			clientes = dao.consultarPorNome(JOptionPane.showInputDialog("Digite o nome"));
			for (Cliente cli : clientes) {
				System.out.println("Nome.....: " + cli.getNome());
				System.out.println("Número...: " + cli.getNumero());
				System.out.println("Estrelas.: " + cli.getQtdeEstrelas());
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}
	}

}
