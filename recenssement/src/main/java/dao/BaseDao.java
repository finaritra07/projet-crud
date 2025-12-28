package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.AccesBdd;
import model.PopulationModel;
import model.UtilisateurModel;

public class BaseDao {
	public boolean VerifUti(UtilisateurModel m) {
		boolean reponse = false;
		String sql = "SELECT email,MDP FROM admin WHERE email='"+m.getEmail()+"' AND MDP='"+m.getMdp()+"'";
		AccesBdd a = new AccesBdd();
		a.loadDriver();
		ResultSet rs = (ResultSet)a.executeSelect(sql);
		try {
			if(rs.next()) {
				reponse= true;
			}
		}catch(SQLException e) {}
		a.closeConnection();
		return reponse; 
	}
	
	public void AjoutP(PopulationModel u) {
		String sql="INSERT INTO population(nom,prenom,numCarte,dateNaissance,lieuNaissance,taille,profession,nomPere,nomMere,adresse,arrondissement,fabrication,dateFabrication,image) VALUES('"+u.getNom()+"','"+u.getPrenom()+"',"+u.getNumCarte()+",'"+u.getDateNaissance()+"','"+u.getLieuNaissance()+"','"+u.getTaille()+"','"+u.getAdresse()+"','"+u.getNomPere()+"','"+u.getNomMere()+"','"+u.getProfession()+"','"+u.getArrondissement()+"','"+u.getFabrication()+"','"+u.getDateFabrication()+"','"+u.getImage()+"')";
		AccesBdd a = new AccesBdd();
		a.loadDriver();
		a.executeUpdate(sql);
		a.closeConnection();
	}
	
	public List<PopulationModel> getAllPopu(){
		List<PopulationModel> liste = new ArrayList<PopulationModel>();
		String sql ="SELECT * FROM population ";
		AccesBdd a = new AccesBdd();
		a.loadDriver();
		ResultSet rs = (ResultSet)a.executeSelect(sql);
		try {
			while(rs.next()) {
				int id = Integer.valueOf(rs.getString("id"));
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String numCarte = rs.getString("numCarte");
				String dateNaissance = rs.getString("dateNaissance");
				String arrondissement = rs.getString("arrondissement");
				String image = rs.getString("image");
				
				PopulationModel lst = new PopulationModel();
				
				lst.setId(id);
				lst.setNom(nom);
				lst.setPrenom(prenom);
				lst.setNumCarte(numCarte);
				lst.setDateNaissance(dateNaissance);
				lst.setArrondissement(arrondissement);
				lst.setImage(image);
				
				liste.add(lst);
				
			}
		}
		catch(SQLException e) {}
		
		a.closeConnection();
		return liste;
	}
	
	public void deletePopu(int id) {
		String sql="DELETE FROM population WHERE id ="+id;
		AccesBdd a = new AccesBdd();
		a.loadDriver();
		a.executeUpdate(sql);
		a.closeConnection();
	}
	
	public PopulationModel detailPopu(int id) {
		PopulationModel p = new PopulationModel();
		String sql ="SELECT * FROM population WHERE id ="+id;
		AccesBdd a = new AccesBdd();
		a.loadDriver();
		ResultSet rs = (ResultSet)a.executeSelect(sql);
		try {
			if(rs.next()) {
				int idPo = Integer.valueOf(rs.getString("id"));
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String dateNaissance = rs.getString("dateNaissance");
				String lieuNaissance = rs.getString("lieuNaissance");
				String taille = rs.getString("taille");
				String numCarte = rs.getString("numCarte");
				String adresse = rs.getString("adresse");
				String profession = rs.getString("profession");
				String nomPere = rs.getString("nomPere");
				String nomMere = rs.getString("nomMere");
				String fabrication = rs.getString("fabrication");
				String arrondissement = rs.getString("arrondissement");
				String dateFabrication = rs.getString("dateFabrication");
				String image = rs.getString("image");
				

				p.setId(idPo);
				p.setNom(nom);
				p.setPrenom(prenom);
				p.setDateNaissance(dateNaissance);
				p.setLieuNaissance(lieuNaissance);
				p.setTaille(taille);
				p.setNumCarte(numCarte);
				p.setAdresse(adresse);
				p.setProfession(profession);
				p.setNomPere(nomPere);
				p.setNomMere(nomMere);
				p.setFabrication(fabrication);
				p.setArrondissement(arrondissement);
				p.setDateFabrication(dateFabrication);
				p.setImage(image);
				
			}
		}catch(SQLException e) {}
		a.closeConnection();
		return p;
	}
	
	public PopulationModel modifPopu(int id) {
		PopulationModel m = new PopulationModel();
		String sql ="SELECT * FROM population WHERE id ="+id;
		AccesBdd a = new AccesBdd();
		a.loadDriver();
		ResultSet rs = (ResultSet)a.executeSelect(sql);
		try {
			if(rs.next()) {
				int idPo = Integer.valueOf(rs.getString("id"));
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String dateNaissance = rs.getString("dateNaissance");
				String lieuNaissance = rs.getString("lieuNaissance");
				String taille = rs.getString("taille");
				String numCarte = rs.getString("numCarte");
				String adresse = rs.getString("adresse");
				String profession = rs.getString("profession");
				String nomPere = rs.getString("nomPere");
				String nomMere = rs.getString("nomMere");
				String fabrication = rs.getString("fabrication");
				String arrondissement = rs.getString("arrondissement");
				String dateFabrication = rs.getString("dateFabrication");
				
				m.setId(idPo);
				m.setNom(nom);
				m.setPrenom(prenom);
				m.setDateNaissance(dateNaissance);
				m.setLieuNaissance(lieuNaissance);
				m.setTaille(taille);
				m.setNumCarte(numCarte);
				m.setAdresse(adresse);
				m.setProfession(profession);
				m.setNomPere(nomPere);
				m.setNomMere(nomMere);
				m.setFabrication(fabrication);
				m.setArrondissement(arrondissement);
				m.setDateFabrication(dateFabrication);
				
			}
		}catch(SQLException e) {}
		a.closeConnection();
		return m;
	}
	
	public void Modification(PopulationModel m) {
		String sql ="UPDATE population SET nom='"+m.getNom()+"',prenom='"+m.getPrenom()+"',dateNaissance='"+m.getDateNaissance()+"',lieuNaissance='"+m.getLieuNaissance()+"',taille='"+m.getTaille()+"',profession='"+m.getProfession()+"',adresse='"+m.getAdresse()+"',numCarte='"+m.getNumCarte()+"',nomPere='"+m.getNomPere()+"',nomMere='"+m.getNomMere()+"',arrondissement='"+m.getArrondissement()+"',fabrication='"+m.getFabrication()+"',dateFabrication='"+m.getDateFabrication()+"'WHERE id ="+m.getId();
		AccesBdd a = new AccesBdd();
		a.loadDriver();
		a.executeUpdate(sql);
		a.closeConnection();
	}
	
	
	public List<PopulationModel> searchPopu(String mot) {
	    List<PopulationModel> liste = new ArrayList<>();
	    String sql = "SELECT * FROM population WHERE "
	            + "nom LIKE '%"+mot+"%' OR "
	            + "prenom LIKE '%"+mot+"%' OR "
	            + "numCarte LIKE '%"+mot+"%'";

	    AccesBdd a = new AccesBdd();
	    a.loadDriver();
	    ResultSet rs = (ResultSet)a.executeSelect(sql);

	    try {
	        while(rs.next()) {
	            PopulationModel p = new PopulationModel();
	            p.setId(rs.getInt("id"));
	            p.setNom(rs.getString("nom"));
	            p.setPrenom(rs.getString("prenom"));
	            p.setNumCarte(rs.getString("numCarte"));
	            p.setDateNaissance(rs.getString("dateNaissance"));
	            p.setArrondissement(rs.getString("arrondissement"));
	            liste.add(p);
	        }
	    } catch(Exception e) {}

	    a.closeConnection();
	    return liste;
	}

}