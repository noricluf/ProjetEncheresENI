<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/MEPaccueil.css" > 
<meta charset="UTF-8">
	<title>Page d'identification</title>
</head>
	<h3 class="gauche">ENI-Enchères</h3>
<body>
	<br><br><br><br><br><br><br><br><br>
	<form action="login" name="identification" method="post">
		<div class="formtest">
			<label for="identifiant" >Identifiants : </label>
			<input type="text" name="identifiant" id="identifiant">
			<span class="erreur">${form.erreurs['identifiant'] }</span>
		</div>
		<br>
		<div class="formtest">
			<label for="mdp" >Mot de passe : </label>
			<input type="password" name="mdp" id="mdp">
			<span class="erreur">${form.erreurs['motDePasse'] }</span>
		</div>
		<br>
		<br>
		<div class="center">
			<input class="bouttoncarre" type="submit" value="Connexion">
			<input name="sesouvenir" id="sesouvenir" type="checkbox">
			<label for="sesouvenir" >Se souvenir de moi <br><a href="">Mot de passe oublié</a></label>
			<br>
		</div>
		<p class="${empty form.erreurs ? 'succes' : 'erreur' }">${form.resultat}</p>
		<c:if test="${!empty sessionScope.sessionUtilisateur}">
			<p class="succes">Vous etes connecté avec l'identifiant : ${sessionScope.sessionUtilisateur.identifiant }</p>
		</c:if>
		<br><br>
	</form>
	<form method="GET" action="creationprofil.jsp">
		<div class="center">
			<input type="submit" value="Créer un compte">
		</div>	
	</form>
</body>
</html>