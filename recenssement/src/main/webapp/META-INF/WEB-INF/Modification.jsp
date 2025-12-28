<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   	<link rel="stylesheet"
   	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/Modification.css">
</head>
<body>
	<div class="card">

    <div class="header">Modification de la fiche d'identité</div>

    
        


    <form action="Modification" method ="post">

    	

        <div>
            <label>Nom :</label>
            <input type="text" name ="nom" value="${mo.getNom()}">
        </div>

        <div>
            <label>Prénom :</label>
            <input type="text" name ="prenom" value="${mo.getPrenom()}">
        </div>

        <div>
            <label>Date de naissance :</label>
            <input type="date" name ="dateNaissance" value="${mo.getDateNaissance()}">
        </div>

        <div>
            <label>Lieu de naissance :</label>
            <input type="text" name ="lieuNaissance" value="${mo.getLieuNaissance()}">
        </div>

        <div>
            <label>Taille :</label>
            <input type="text" name ="taille"  value="${mo.getTaille()}">
        </div>

        <div>
            <label>Profession :</label>
            <input type="text" name ="profession" value="${mo.getProfession()}">
        </div>

        <div class="full">
            <label>Adresse :</label>
            <input type="text" name ="adresse" value="${mo.getAdresse()}">
        </div>

        <div>
            <label>Numéro de la carte :</label>
            <input type="text" name ="numCarte" value="${mo.getNumCarte()}">
        </div>

        <div>
            <label>Arrondissement :</label>
            <input type="text" name ="arrondissement" value="${mo.getArrondissement()}">
        </div>

        <div>
            <label>Nom du père :</label>
            <input type="text" name ="nomPere" value="${mo.getNomPere()}">
        </div>

        <div>
            <label>Nom de la mère :</label>
            <input type="text" name ="nomMere" value="${mo.getNomMere()}">
        </div>

        <div>
            <label>Fait à :</label>
            <input type="text" name ="fabrication" value="${mo.getFabrication()}">
        </div>

        <div>
            <label>Date de fabrication :</label>
            <input type="date" name ="dateFabrication" value="${mo.getDateFabrication()}">
        </div>

        <div>
            <label>Photo :</label>
            <input type="file" accept="image/*">
        </div>
        
        <div>
            <input type="number" name="id" disable hidden value="${mo.getId()}">
        </div>
        

        

        <button class="btn">Enregistrer les modifications</button>
        	
       		<div class="back">
				<a href="./ACCEUIL"><i class="fas fa-undo"></i>RETOUR</a>
			</div>
        </form>
</div>
</body>
</html>