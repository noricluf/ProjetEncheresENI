<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<form action="" name="identification" method="get">
		<div class="formtest">
			<label for="identifiant" >Identifiants : </label>
			<input type="text" name="identifiant" id="identifiant">
		</div>
		<br>
		<div class="formtest">
			<label for="mdp" >Mot de passe : </label>
			<input type="text" name="mdp" id="mdp">
		</div>
		<br>
		<br>
		<div class="center">
			<input class="bouttoncarre" type="submit" value="Connexion">
			<input name="sesouvenir" id="sesouvenir" type="checkbox">
			<label for="sesouvenir" >Se souvenir de moi <br><a href="">Mot de passe oublié</a></label>
			<br>
		</div>
		<br><br>
		<input class="btncreercompte" type="submit" value="Créer un compte">
	</form>
</body>
</html>