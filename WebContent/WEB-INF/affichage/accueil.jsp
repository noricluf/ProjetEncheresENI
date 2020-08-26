<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="fr.eni.projetencherseni.bo.Utilisateur"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/MEPaccueil.css" > 
<meta charset="UTF-8">
<title>Page d'accueil</title>
</head>
<body>
<h3 class="gauche">ENI-Enchères</h3>
<br>
<a href="../identification.jsp" class="droite">S'inscrire - Se connecter</a>
<br>
<br>
<% Utilisateur utilisateur = (Utilisateur)request.getAttribute("utilisateur");
		if(utilisateur!=null) { 
	%> <p style="color:green;">L'utilisateur a été ajouté avec succès :</p>
	   <p><%=utilisateur %></p>
	<%	} %> 
<h1 style="text-align: center;">Liste des enchères</h1>
<h3 style="margin-left: 5em">Filtres :</h3>
<form name="filtres" method="post" action="ProjetEncheresENI/ServletFiltres">
<input style="margin-left: 7em; width: 300px" type="text" name="nomarticle" id="nomarticle" placeholder="Le nom de l'article contient">
<br>
<br>
<label for="categorie" style="margin-left: 6em">Catégorie</label>
<select type="text" name="categorie" id="categorie">
<option>Toutes
<option>Informatique
<option>Ameublement
<option>Vêtement
<option>Sport&Loisirs
</select>
<input type="submit" value="Rechercher">
</form>
</body>
</html>