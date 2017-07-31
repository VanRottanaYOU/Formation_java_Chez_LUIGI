<%@ page pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Affichage de la liste des pizzas du menu</title>
    </head>

    <body>
        <p>***** Pizzeria Administration *****</p>
		<p><a href="<c:url value="/afficherListePizzas"/>">1. Lister les pizzas</a></p>
		<p><a href="<c:url value="/ajouterPizza.jsp"/>">2. Ajouter une nouvelle pizza</a></p>
		<p><a href="<c:url value="/miseaJourPizza.jsp"/>">3. Mettre à jour une pizza</a></p>
		<p><a href="<c:url value="/supprimerPizza.jsp"/>">4. Supprimer une pizza</a></p>
		<p><a href="<c:url value="/sortie"/>">99. Sortir</a></p>
       
    </body>
</html>