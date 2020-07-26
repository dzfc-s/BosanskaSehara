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

@WebServlet("/edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LocationDAOImplementation locationDAO = new LocationDAOImplementation();
		PrintWriter out = response.getWriter();
		
		String godisnjeDoba = request.getParameter("godisnjeDoba");
		String trenutniNazivLokacije = request.getParameter("nazivLokacije").toString();
		String opis = request.getParameter("opis").toString();
		String noviNazivLokacije = request.getParameter("noviNaziv").toString();
		
		try {
			if(godisnjeDoba.equals("jesen")) {
				if(Validation.nazivLokacijeJesenValidation(trenutniNazivLokacije)) {
					locationDAO.editLocationJesen(trenutniNazivLokacije, opis, noviNazivLokacije, godisnjeDoba);
					request.getRequestDispatcher("index.html").forward(request, response);
				} else
					out.print("nema");
			} 
			else if(godisnjeDoba.equals("proljece")) {
				if(Validation.nazivLokacijeProljeceValidation(trenutniNazivLokacije)) {
					locationDAO.editLocationProljece(trenutniNazivLokacije, opis, noviNazivLokacije, godisnjeDoba);
					request.getRequestDispatcher("index.html").forward(request, response);
				} else
					out.print("nema");
			} 
			if(godisnjeDoba.equals("ljeto")) {
				if(Validation.nazivLokacijeLjetoValidation(trenutniNazivLokacije)) {
					locationDAO.editLocationLjeto(trenutniNazivLokacije, opis, noviNazivLokacije, godisnjeDoba);
					request.getRequestDispatcher("index.html").forward(request, response);
				} else
					out.print("nema");
			} 
			if(godisnjeDoba.equals("zima")) {
				if(Validation.nazivLokacijeZimaValidation(trenutniNazivLokacije)) {
					locationDAO.editLocationZima(trenutniNazivLokacije, opis, noviNazivLokacije, godisnjeDoba);
					request.getRequestDispatcher("index.html").forward(request, response);
				} else
					out.print("nema");
			} 
		} catch (Exception e) {
			out.print(e);
		}
		
	}

}
