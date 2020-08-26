package fr.eni.projetencherseni.bll;

import fr.eni.projetencherseni.BusinessException;
import fr.eni.projetencherseni.bo.Utilisateur;
import fr.eni.projetencherseni.dal.DAOFactory;
import fr.eni.projetencherseni.dal.UtilisateurDAO;

public class UtilisateurManager {
	
	private UtilisateurDAO utilisateurDAO;
	
	public UtilisateurManager() {
		this.utilisateurDAO=DAOFactory.getUtilisateurDAO();
	}
	
	public Utilisateur ajouter(String pseudo, String prenom, String nom, String email, String telephone,
			String rue, String codepostal, String ville, String motdepasse) throws BusinessException {
		
		Utilisateur utilisateur = new Utilisateur();
		
		return utilisateur;
	}
}
