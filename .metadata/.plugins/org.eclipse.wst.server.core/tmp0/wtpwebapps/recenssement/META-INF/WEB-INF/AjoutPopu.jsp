<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   	<link rel="stylesheet"
   	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/AjoutPopu.css">
</head>
<body>
	<header>
        <h1>Ajout de population</h1>
    </header>

    <div class="form-container">
        <form action="AjoutPopu" method="post" enctype="multipart/form-data">


            <label><i class="fa-solid fa-user"></i> Nom :</label>
            <input type="text" id="nom" name="nom"placeholder="Entrez le nom">

            <label><i class="fa-solid fa-user"></i> Prénom :</label>
            <input type="text" id="prenom" name="prenom" placeholder="Entrez le prénom">

            <label>Date de naissance :</label>
            <input type="date"id="dateNaissance" name="dateNaissance">

            <label>Lieu de naissance :</label>
            <input type="text" id="lieuNaissance" name="lieuNaissance" placeholder="Entrez le lieu de naissance">

            <label>Profession :</label>
            <input type="text" id ="profession" name="profession" placeholder="Entrez la profession">

            <label>Adresse :</label>
            <input type="text" id="adresse" name="adresse" placeholder="Entrez l'adresse">

            <label>Taille :</label>
            <input type="text" id="taille" name="taille"placeholder="En cm">

            <label>Numéro de carte :</label>
            <input type="number" id="numCarte" name="numCarte"placeholder="Numéro de carte">

            <label>Nom du père :</label>
            <input type="text" id="nomPere" name="nomPere" placeholder="Nom du père">

            <label>Nom de la mère :</label>
            <input type="text" id ="nomMere" name="nomMere" placeholder="Nom de la mère">

            <label>Fait à :</label>
            <input type="text" id="fabrication" name="fabrication" placeholder="Lieu de fabrication">

            <label>Date de fabrication :</label>
            <input type="date" id ="dateFabrication" name="dateFabrication">
            
            <label>Arrondissement :</label>
            <input type="text" id ="arrondissement" name="arrondissement">

            <label>Photo :</label>
            <input type="file" id="image" name="image" accept="image/*">
 

            <button type="submit">Enregistrer</button>
            <div class="back"><a href="./ACCEUIL">Retour</a></div>
        </form>
    </div>
</body>
</html>