<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<%@ page import="java.util.List, java.util.ArrayList" %>
<%@ page import="com.beans.Pizza" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Affichage de la liste des pizzas</title>
        <link type="text/css" rel="stylesheet" href="inc/style.css" />
    </head>
    <body>
        <table>
        <tr>
        	<td>Code pizza</td>
        	<td>Nom pizza</td>
        	<td>Prix pizza</td>
        </tr>
<%--         <c:forEach var="item" items="${listePizzas}"> --%>
<!--  		    <tr> -->
<%--   				<td><c:out value="${ item.code }"/></td> --%>
<%--             	<td><c:out value="${ item.nom}"/></td> --%>
<%--            		<td><c:out value="${ item.prix }"/></td> --%>
<!--             </tr> -->
<%-- 		</c:forEach> --%>
<!--         </table> -->
<%
// 	ArrayList<Pizza> list = (ArrayList<Pizza>)request.getAttribute("listePizzas");
ArrayList<Pizza> list = (ArrayList<Pizza>)session.getAttribute("listePizzas");
	for(int i = 0; i < list.size();i++){
		out.println("<tr>");
		out.println("<td>"+ list.get(i).getCode()+"</td>");
		out.println("<td>"+ list.get(i).getNom()+"</td>");
		out.println("<td>"+ list.get(i).getPrix()+"</td>");
		out.println("</tr>");
	}
%>
    </body>
</html>