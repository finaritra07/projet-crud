package model;

public class PopulationModel {
	private int id;
	private String nom;
	private String prenom;
	private String dateNaissance;
	private String lieuNaissance;
	private String taille;
	private String numCarte;
	private String nomPere;
	private String nomMere;
	private String adresse;
	private String profession;
	private String arrondissement;
//	
	private String fabrication;
	private String dateFabrication;
	private String dateCreate;
	private String image;

	public String getImage() { return image; }
	public void setImage(String image) { this.image = image; }

//	private String image;
	
	
//	public String getImage() {
//		return image;
//	}
//	
//	public void setImage(String image) {
//		this.image = image;
//	}
//	
	public String getArrondissement() {
		return arrondissement;
	}
	public void setArrondissement(String arrondissement) {
		this.arrondissement = arrondissement;
	}
	public String getDateCreate() {
		return dateCreate;
	}
	public void setDateCreate(String dateCreate) {
		this.dateCreate = dateCreate;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	public String getTaille() {
		return taille;
	}
	public void setTaille(String taille) {
		this.taille = taille;
	}
	public String getNumCarte() {
		return numCarte;
	}
	public void setNumCarte(String numCarte) {
		this.numCarte = numCarte;
	}
	public String getNomPere() {
		return nomPere;
	}
	public void setNomPere(String nomPere) {
		this.nomPere = nomPere;
	}
	public String getNomMere() {
		return nomMere;
	}
	public void setNomMere(String nomMere) {
		this.nomMere = nomMere;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getFabrication() {
		return fabrication;
	}
	public void setFabrication(String fabrication) {
		this.fabrication = fabrication;
	}
	public String getDateFabrication() {
		return dateFabrication;
	}
	public void setDateFabrication(String dateFabrication) {
		this.dateFabrication = dateFabrication;
	}
}
