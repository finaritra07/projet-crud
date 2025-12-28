package servlet;

import java.io.File;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import model.PopulationModel;
import dao.BaseDao;

import javax.servlet.annotation.MultipartConfig;


/**
 * Servlet implementation class AjoutPopu
 */

@WebServlet("/AjoutPopu")
@MultipartConfig(
	    fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
	    maxFileSize = 1024 * 1024 * 10,      // 10 MB
	    maxRequestSize = 1024 * 1024 * 15    // 15 MB
	)
public class AjoutPopu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutPopu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/AjoutPopu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String dateNaissance = request.getParameter("dateNaissance");
		String lieuNaissance = request.getParameter("lieuNaissance");
		String profession = request.getParameter("lieuNaissance");
		String adresse = request.getParameter("adresse");
		String numCarte = request.getParameter("numCarte");
		String taille =request.getParameter("taille");
		String nomPere = request.getParameter("nomPere");
		String nomMere = request.getParameter("nomMere");
		String fabrication = request.getParameter("fabrication");
		String dateFabrication = request.getParameter("dateFabrication");
		String arrondissement = request.getParameter("arrondissement");
		
		Part imagePart = request.getPart("image");
		String fileName = imagePart.getSubmittedFileName();
		String uploadPath = getServletContext().getRealPath("") + "uploads";
		

	File uploadDir = new File(uploadPath);
	if (!uploadDir.exists()) uploadDir.mkdir();
	
	imagePart.write(uploadPath + File.separator + fileName);
		
		PopulationModel p = new PopulationModel();
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setNumCarte(numCarte);
		p.setDateNaissance(dateNaissance);
		p.setLieuNaissance(lieuNaissance);
		p.setAdresse(adresse);
		p.setProfession(profession);
		
		p.setTaille(taille);
		p.setNomPere(nomPere);
		p.setNomMere(nomMere);
		p.setFabrication(fabrication);
		p.setDateFabrication(dateFabrication);
		p.setArrondissement(arrondissement);
		p.setImage(fileName);

		
		BaseDao dao = new BaseDao();
		dao.AjoutP(p);
		
		response.sendRedirect("Acceuil");
	}

}
