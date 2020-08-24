package fr.eni.projetencherseni.dal;

public abstract class DAOFactory {
	
	public static UtilisateurDAO getUtilisateurDAO(){
		return new UtilisateurDAOJdbcImpl();
		
	}

}
