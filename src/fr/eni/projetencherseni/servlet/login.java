package fr.eni.projetencherseni.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.projetencherseni.bo.ConnexionForm;
import fr.eni.projetencherseni.bo.Utilisateur;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public static final String ATT_USER = "utilisateur";
	public static final String ATT_FORM = "form";
	public static final String ATT_SESSION_USER = "sessionUser";
	public static final String VIEW = "/WebContent/WEB-INF/affichage/login.jsp";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(VIEW);
		rd.forward(request, response);
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ConnexionForm form = new ConnexionForm();
		
		Utilisateur user =form.connecterUtilisateur(request);
		
		//Récupération de la session depuis la requête
		HttpSession session = request.getSession();
		
		if(form.getErreurs().isEmpty()) {
			session.setAttribute(ATT_SESSION_USER, user);
		}else {
			session.setAttribute(ATT_SESSION_USER, null);
		}
		
		
		request.setAttribute(ATT_FORM, form);
		request.setAttribute(ATT_USER, user);
		
		this.getServletContext().getRequestDispatcher(VIEW).forward(request, response);
	}

}
