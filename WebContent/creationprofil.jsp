<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/MEPaccueil.css" > 
<meta charset="UTF-8">
<title>Page créer profil</title>
</head>
<body>
	<h3 class="gauche">ENI-Enchères</h3>
	<br><br><br>
	<h1 class="center"> Mon profil</h1>
		<form action="<%=request.getContextPath()%>/ServletCreationCompte" method="post">
			<div class="centerprofil">
				<div>
					<label for="pseudo">Pseudo : </label>
					<input type="text" name="pseudo" id="pseudo">
				</div>
				<div>
					<label for="nom">Nom : </label>
					<input type="text" name="nom" id="nom">
				</div>
			</div>
			<br><br>
			<div class="centerprofil">
				<div>
					<label for="prenom">Prénom : </label>
					<input type="text" name="prenom" id="prenom">
				</div>
				<div>
					<label for="email">Email : </label>
					<input type="email" name="email" id="email">
				</div>
			</div>
			<br><br>
			<div class="centerprofil">
				<div>
					<label for="telephone">Téléphone : </label>
					<input type="text" name="telephone" id="telephone">
				</div>
				<div>
					<label for="rue">Rue : </label>
					<input type="text" name="rue" id="rue">
				</div>
			</div>
			<br><br>
			<div class="centerprofil">
				<div>
					<label for="codepostal">Code Postal : </label>
					<input type="text" name="codepostal" id="codepostal">
				</div>
				<div>
					<label for="ville">Ville : </label>
					<input type="text" name="ville" id="ville">
				</div>
			</div>
			<br><br>
			<div class="centerprofil">
				<div>
					<label for="motdepasse">Mot de passe : </label>
					<input type="password" name="motdepasse" id="motdepasse">
				</div>
				<div>
					<label for="confirmationmdp">Confirmation : </label>
					<input type="password" name="confirmationmdp" id="confirmationmdp">
				</div>
			</div>
			<br><br>
			<div class="centerprofil">
				<input type="submit" value="Créer">
				<input type="reset" value="Annuler">
			</div>
		</form>
</body>
</html>