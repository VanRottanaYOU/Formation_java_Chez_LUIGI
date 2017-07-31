package com.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.beans.Pizza;


public class SupprimerPizza extends HttpServlet {
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		
		String code = request.getParameter( "codePizza" );


        HttpSession session = request.getSession();
    	ArrayList<Pizza> list = (ArrayList<Pizza>)session.getAttribute("listePizzas");
    	for (int i = 0 ; i< list.size();i++)
		{
			if (list.get(i).getCode().equals(code))
			{
				list.remove(i);
				
			}
		}
        session.setAttribute("listePizzas",list);
        
		this.getServletContext().getRequestDispatcher("/afficherListePizzas.jsp").forward( request, response );
	}
}
