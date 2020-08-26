package fr.eni.projet.encheres;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.projetencherseni.BusinessException;
import fr.eni.projetencherseni.bll.UtilisateurManager;
import fr.eni.projetencherseni.bo.Utilisateur;

/**
 * Servlet implementation class ServletCreationCompte
 */
@WebServlet("/ServletCreationCompte")
public class ServletCreationCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCreationCompte() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("creationprofil.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pseudo;
		String prenom;
		String nom;
		String email;
		String telephone;
		String rue;
		String codepostal;
		String ville;
		String motdepasse;
		String confirmationmdp;
		
		try
		{
			prenom = request.getParameter("prenom");
			nom = request.getParameter("nom");
			email = request.getParameter("email");
			telephone = request.getParameter("telephone");
			rue= request.getParameter("rue");
			codepostal = request.getParameter("codepostal");
			ville = request.getParameter("ville");
			motdepasse = request.getParameter("motdepasse");
			confirmationmdp = request.getParameter("confirmationmdp");
			pseudo = request.getParameter("pseudo");
			
			UtilisateurManager utilisateurManager = new UtilisateurManager();
			Utilisateur utilisateur = utilisateurManager.ajouter(pseudo, prenom, nom, email, telephone, rue, codepostal, ville, motdepasse);
			request.setAttribute("utilisateur", utilisateur);
		}
		catch (BusinessException e) {
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("creationprofil.jsp");
		rd.forward(request, response);
	}
}
