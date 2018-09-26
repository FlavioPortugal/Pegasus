package br.com.pegasus.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pegasus.beans.Usuario;
import br.com.pegasus.dao.UsuarioDAO;

@WebServlet(urlPatterns = "/Login")
public class Login extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
				PrintWriter writer = resp.getWriter();
				
				String email = req.getParameter("email");
				String senha = req.getParameter("senha");
				
						
				writer.println("<html><body>");
				
				
				UsuarioDAO usuarioDAO = new UsuarioDAO();
				
				Usuario usuarios = usuarioDAO.consultarLogin(email, senha);		
				
				
				if(usuarios == null) {
					writer.println("<p>login incorreto</p>");
				}
				else {
					if(usuarios.getNivelAcesso() == 1) {
											   
						resp.sendRedirect("url");
					    return;
					}
					else if(usuarios.getNivelAcesso() == 2) {
						resp.sendRedirect("url");
					    return;
					}
					else if(usuarios.getNivelAcesso() == 3) {
						resp.sendRedirect("url");
					    return;
					}
					else {
						writer.println("<p>Usuario não possui nível de acesso</p>");
					}
				}
				writer.println("</body></html>");
				
				writer.close();
			}
			catch(Exception e){
				
			}
		}
	}

