package com.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.Pizza;

public class MiseaJourPizza extends HttpServlet {
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		
		String code = request.getParameter( "codePizza" );
        String nom = request.getParameter( "nomPizza" );
        String prix = request.getParameter( "prixPizza" );
        double prixd = Double.parseDouble(prix);
        Pizza pep = new Pizza(code,nom,prixd);
        
        
//    	ArrayList<Pizza> list = (ArrayList<Pizza>)request.getAttribute("listePizzas");
        HttpSession session = request.getSession();
    	ArrayList<Pizza> list = (ArrayList<Pizza>)session.getAttribute("listePizzas");
    	for (int i = 0 ; i< list.size();i++)
		{
			if (list.get(i).getCode().equals(code))
			{
				list.get(i).setNom(nom);
				list.get(i).setPrix(prixd);
			}
		}
        session.setAttribute("listePizzas",list);
        
		this.getServletContext().getRequestDispatcher("/afficherListePizzas.jsp").forward( request, response );
	}
}
