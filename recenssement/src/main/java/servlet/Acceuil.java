package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BaseDao;
import model.PopulationModel;

/**
 * Servlet implementation class Acceuil
 */
@WebServlet("/Acceuil")
public class Acceuil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Acceuil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		List<PopulationModel> listes = new ArrayList<PopulationModel>();
//		BaseDao dao = new BaseDao();
//		listes = dao.getAllPopu();
//		request.setAttribute("lste", listes);
//		this.getServletContext().getRequestDispatcher("/WEB-INF/Acceuil.jsp").forward(request, response);
//		
		 String recherche = request.getParameter("search"); // mot-clé
		    BaseDao dao = new BaseDao();
		    List<PopulationModel> listes;

		    if (recherche != null && !recherche.trim().isEmpty()) {
		        listes = dao.searchPopu(recherche);
		    } else {
		        listes = dao.getAllPopu();
		    }

		    request.setAttribute("lste", listes);
		    request.setAttribute("searchValue", recherche);

		    this.getServletContext().getRequestDispatcher("/WEB-INF/Acceuil.jsp")
		            .forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
