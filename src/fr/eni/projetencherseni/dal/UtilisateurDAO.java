package fr.eni.projetencherseni.dal;

import fr.eni.projetencherseni.BusinessException;
import fr.eni.projetencherseni.bo.Utilisateur;

public interface UtilisateurDAO {
	
	public void insert(Utilisateur utilisateur) throws BusinessException;
	
}
