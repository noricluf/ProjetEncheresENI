package fr.eni.projetencherseni.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticlesVendu implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int noArticle;
	private String nomArticle, description;
	private Date dateDebutEncheres, dateFinEncheres;
	private float miseAPrix, prixVente;
	private String etatVente;
	private List<Enchere> listeEnchere;
	
	public ArticlesVendu() {
		this.listeEnchere = new ArrayList<Enchere>();
	}

	public ArticlesVendu(String nomArticle, String description, Date dateDebutEncheres, Date dateFinEncheres,
			float miseAPrix, float prixVente, String etatVente, List<Enchere> listeEnchere) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.listeEnchere = listeEnchere;
	}

	public ArticlesVendu(int noArticle, String nomArticle, String description, Date dateDebutEncheres, Date dateFinEncheres,
			float miseAPrix, float prixVente, String etatVente, List<Enchere> listeEnchere) {
		this(nomArticle, description,dateDebutEncheres,dateFinEncheres,miseAPrix,prixVente,etatVente,listeEnchere );
		this.noArticle = noArticle;
	}

	public int getNoArticle() {
		return noArticle;
	}

	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateDebutEncheres() {
		return dateDebutEncheres;
	}

	public void setDateDebutEncheres(Date dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}

	public Date getDateFinEncheres() {
		return dateFinEncheres;
	}

	public void setDateFinEncheres(Date dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}

	public float getMiseAPrix() {
		return miseAPrix;
	}

	public void setMiseAPrix(float miseAPrix) {
		this.miseAPrix = miseAPrix;
	}

	public float getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(float prixVente) {
		this.prixVente = prixVente;
	}

	public String getEtatVente() {
		return etatVente;
	}

	public void setEtatVente(String etatVente) {
		this.etatVente = etatVente;
	}

	public List<Enchere> getListeEnchere() {
		return listeEnchere;
	}

	public void setListeEnchere(List<Enchere> listeEnchere) {
		this.listeEnchere = listeEnchere;
	}

	@Override
	public String toString() {
		return "ArticlesVendu [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", dateDebutEncheres=" + dateDebutEncheres + ", dateFinEncheres=" + dateFinEncheres + ", miseAPrix="
				+ miseAPrix + ", prixVente=" + prixVente + ", etatVente=" + etatVente + ", listeEnchere=" + listeEnchere
				+ "]";
	}
	
	
	

}