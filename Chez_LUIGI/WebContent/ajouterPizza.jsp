<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Ajouter une pizza</title>
        <link type="text/css" rel="stylesheet" href="inc/style.css" />
    </head>
    <body>

        <div>
            <form method="get" action="<c:url value="/creerPizza"/>">
                <fieldset>
                    <legend>Informations nouvelle pizza</legend>
<%--                     <c:import url="/inc/inc_client_form.jsp" /> --%>
					<label for="codePizza">Code<span class="requis">*</span></label>
                    <input type="text" id="codePizza" name="codePizza" value="" size="20" maxlength="20" />
                    <br />
                    
                    <label for="nomPizza">Nom </label>
                    <input type="text" id="nomPizza" name="nomPizza" value="" size="20" maxlength="20" />
                    <br />
    
                    <label for="prixPizza">Prix  <span class="requis">*</span></label>
                    <input type="text" id="prixPizza" name="prixPizza" value="" size="20" maxlength="20" />
                    <br />                       
                </fieldset>
                <input type="submit" value="Valider"  />
                <input type="reset" value="Remettre à zéro" /> <br />
            </form>
        </div>
    </body>
</html>