package com.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.Pizza;

public class AfficherListePizzas extends HttpServlet {

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
    	
//    	ArrayList<Pizza> arrays=new ArrayList<>();
//		
//		Pizza pep = new Pizza("PEP","P�p�roni",12.50);
//		Pizza mar = new Pizza("MAR","Margherita",14);
//		Pizza rein = new Pizza("REIN","La Reine",11.5);
//		Pizza fro = new Pizza("FRO","La 4 fromages",12);
//		Pizza can = new Pizza("CAN","La cannibale",12.5);
//		Pizza sav = new Pizza("SAV","La savoyarde",13);
//		Pizza ori = new Pizza("ORI","L�orientale",13.5);
//		Pizza ind = new Pizza("IND","L�indienne",14);
//		
//		arrays.add(pep);
//		arrays.add(mar);
//		arrays.add(rein);
//		arrays.add(fro);
//		arrays.add(can);
//		arrays.add(sav);
//		arrays.add(ori);
//		arrays.add(ind);
//		HttpSession session = request.getSession();
//		session.setAttribute("listePizzas",arrays);
//		request.setAttribute("listePizzas",arrays);
        /* Transmission � la page JSP en charge de l'affichage des donn�es */
        this.getServletContext().getRequestDispatcher( "/afficherListePizzas.jsp" ).forward( request, response );
    }
}