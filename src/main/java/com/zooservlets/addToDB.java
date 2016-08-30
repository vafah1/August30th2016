package com.zooservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zooanimals.Animals;
import com.zooanimals.DAO;

/**
 * Servlet implementation class addToDB
 */
@WebServlet("/addToDB")
public class addToDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addToDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Animals addToDB = new Animals();
		
		addToDB.setSpecies(request.getParameter("species"));
		addToDB.setName(request.getParameter("name"));
		addToDB.setHabitat(request.getParameter("habitat"));
		addToDB.setAge(Integer.parseInt(request.getParameter("age")));
		addToDB.setWeight(Double.parseDouble(request.getParameter("weight")));
		
		DAO.writeToDB(addToDB);
	}
}
