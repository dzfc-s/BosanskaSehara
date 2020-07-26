package com.UI;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BO.Validation;
import com.DAO.LocationDAOImplementation;

@WebServlet("/add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LocationDAOImplementation locationDAO = new LocationDAOImplementation();
		PrintWriter out = response.getWriter();
		
		String godisnjeDoba = request.getParameter("godisnjeDoba");
		String nazivLokacije = request.getParameter("nazivLokacije").toString();
		String opis = request.getParameter("opis").toString();
		
		try {
			if(godisnjeDoba.equals("jesen")) {
				if(!Validation.nazivLokacijeJesenValidation(nazivLokacije)) { 
				locationDAO.addLocationJesen(nazivLokacije, opis, godisnjeDoba);
				request.getRequestDispatcher("index.html").forward(request, response);
				} else 
					out.print("vec postojii");
			} 
			else if(godisnjeDoba.equals("proljece"))  { 
				if(!Validation.nazivLokacijeProljeceValidation(nazivLokacije)) { 
				locationDAO.addLocationProljece(nazivLokacije, opis, godisnjeDoba);
				request.getRequestDispatcher("index.html").forward(request, response);
				} else 
					out.print("vec postojii");
			} 
			else if(godisnjeDoba.equals("ljeto"))  { 
				if(!Validation.nazivLokacijeLjetoValidation(nazivLokacije)) { 
					locationDAO.addLocationLjeto(nazivLokacije, opis, godisnjeDoba);
					request.getRequestDispatcher("index.html").forward(request, response);
				} else 
					out.print("vec postojii");
			} 
			else if(godisnjeDoba.equals("zima")) {
				if(!Validation.nazivLokacijeZimaValidation(nazivLokacije)) { 
					locationDAO.addLocationZima(nazivLokacije, opis, godisnjeDoba);
					request.getRequestDispatcher("index.html").forward(request, response);
				} else 
					out.print("vec postojii");
			} else 
				request.getRequestDispatcher("uredjivanje.jsp").forward(request, response);
		}  catch (Exception e) {
			out.print(e);
		}
	}

}
