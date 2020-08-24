package fr.eni.projetencherseni.bo;

import java.io.Serializable;
import java.util.Date;

public class ArticleVendu implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int noArticle;
	private String nomArticle;
	private String description;
	private Date dateDebutEnchers;
	private Date dateFinEnchers;
	private float miseAPrix;
	private float prixVente;
	private String etatVente;
	
	public ArticleVendu(int noArticle, String nomArticle, String description, Date dateDebutEnchers,
			Date dateFinEnchers, float miseAPrix, float prixVente, String etatVente) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEnchers = dateDebutEnchers;
		this.dateFinEnchers = dateFinEnchers;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
	}

	public ArticleVendu(String nomArticle, String description, Date dateDebutEnchers, Date dateFinEnchers,
			float miseAPrix, float prixVente, String etatVente) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEnchers = dateDebutEnchers;
		this.dateFinEnchers = dateFinEnchers;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
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

	public Date getDateDebutEnchers() {
		return dateDebutEnchers;
	}

	public void setDateDebutEnchers(Date dateDebutEnchers) {
		this.dateDebutEnchers = dateDebutEnchers;
	}

	public Date getDateFinEnchers() {
		return dateFinEnchers;
	}

	public void setDateFinEnchers(Date dateFinEnchers) {
		this.dateFinEnchers = dateFinEnchers;
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

	@Override
	public String toString() {
		return "ArticleVendu [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", dateDebutEnchers=" + dateDebutEnchers + ", dateFinEnchers=" + dateFinEnchers + ", miseAPrix="
				+ miseAPrix + ", prixVente=" + prixVente + ", etatVente=" + etatVente + "]";
	}
	
	
	

}
