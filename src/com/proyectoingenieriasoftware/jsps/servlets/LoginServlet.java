package com.proyectoingenieriasoftware.jsps.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proyectoingenieriasoftware.jsps.servlets.vo.VOLogin;

import databases.DBConnection;

import com.google.gson.Gson;


/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		System.out.println("Usuario : "+usuario);
		System.out.println("Password : "+password);
		if(usuario.equals("administrador") && password.equals("administrador")){
			
			//dbc.getClass();
			System.out.println("Welcome . . .");
			VOLogin vo = new VOLogin();
			vo.setUsuario(usuario);
			vo.setPassword(password);
			vo.setEdad("edad");
			vo.setNombre("Admi GG");
			HttpSession session = request.getSession(true);
			session.setAttribute("usuarioLogueado", vo);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}else{
			System.out.println("Error en credenciales de acceso . . .");
			response.sendRedirect("login.html");
		}
	}

}
