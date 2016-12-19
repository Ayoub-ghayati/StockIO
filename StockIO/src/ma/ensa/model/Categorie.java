package ma.ensa.model;
// Generated 18 déc. 2016 21:13:46 by Hibernate Tools 5.2.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Categorie generated by hbm2java
 */
public class Categorie implements java.io.Serializable {

	private Integer idCategorie;
	private String nomCategorie;
	private String descCategorie;
	private Set produits = new HashSet(0);

	public Categorie() {
	}

	public Categorie(String nomCategorie, String descCategorie) {
		this.nomCategorie = nomCategorie;
		this.descCategorie = descCategorie;
	}

	public Categorie(String nomCategorie, String descCategorie, Set produits) {
		this.nomCategorie = nomCategorie;
		this.descCategorie = descCategorie;
		this.produits = produits;
	}

	public Integer getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return this.nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public String getDescCategorie() {
		return this.descCategorie;
	}

	public void setDescCategorie(String descCategorie) {
		this.descCategorie = descCategorie;
	}

	public Set getProduits() {
		return this.produits;
	}

	public void setProduits(Set produits) {
		this.produits = produits;
	}

}