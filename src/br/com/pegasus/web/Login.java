package br.com.pegasus.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.pegasus.BO.UsuarioBO;
import br.com.pegasus.beans.Usuario;
import br.com.pegasus.dao.UsuarioDAO;

@WebServlet(urlPatterns = "/Login")
public class Login extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
				
				HttpSession session = req.getSession();					
				
				Usuario usuario = new Usuario();		
				UsuarioBO usuarioBO = new UsuarioBO();
				
				String email = req.getParameter("e-mail");
				String senha = req.getParameter("senha");
				
				usuario = usuarioBO.consultarLogin(email,senha);
				
				session.setAttribute("clienteLogado", usuario);
				RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
				rd.forward(req,resp);
								
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}

