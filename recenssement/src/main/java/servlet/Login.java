package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.ResultSet;

import model.PopulationModel;
import model.UtilisateurModel;
import common.AccesBdd;
import dao.BaseDao;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String mdp = request.getParameter("password");
		
		UtilisateurModel u = new UtilisateurModel();
		u.setEmail(email);
		u.setMdp(mdp);
		
		BaseDao dao = new BaseDao();
		boolean verification = false;
		verification = dao.VerifUti(u);
		
		if(verification == true) {
			response.sendRedirect("Acceuil");
		}else {
			request.setAttribute("ver", verification);
			this.getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
		}
		
	}
	


}