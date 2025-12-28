<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Insert title here</title>
   	<link rel="stylesheet"
   	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
   	<link rel ="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/Acceuil.css">
</head>
<body>
	    <header class="header1">
        <div class="logo"><i class="fa-solid fa-house"></i></div>
         <div class="title">Recensement de la population</div>
         <div class="header-actions">
         <div class="add-product"><i class="fas fa-plus"></i> <a href="./AJOUTPOPU">Ajouter une personne</a></div>
         <div class="logout"><i class="fas fa-sign-out-alt"></i><a href="./Deconnex">Deconnexion</a></div>
        </div>
     </header>

        <div class="container">

        <nav class="sidebar">
        <ul>
        <li><i class="fas fa-user"></i><a href="#">Liste des personnes</a></li>
        <li><i class="fas fa-map"></i><a href="#">Carte d'Identite National</a></li>
        <li> <i class="fa-solid fa-bell"></i><a href="#">Notification</a></li>
        
        </ul>
        </nav>

        <main class="dashboard">
        
        


        

        <div class="dashboard-header">
        <form method="get" action="Acceuil">
            <div class="search">
            <i class="fas fa-search"></i>
            <input type="text" name="search" placeholder="Recherche ... " value="${serachValue }">
        </div>
        </form>
            <div class="filter">
            <i class="fas fa-filter"></i> Filtrer
            </div>
        <div class="expand">
            <i class="fas fa-expand"></i>
            </div>
        </div>


        <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>NOM</th>
                <th>PRENOM</th>
                <th>DATE NAISSANCE</th>
                <th>ARRONDISSAMENT</th>
                <th>CIN</th>
            </tr>
        </thead>
<c:forEach items ="${lste }" var ="population">
	
		<tbody>
		
			<tr>
			<td>${population.getId()}</td>
			<td>${population.getNom() }</td>
			<td>${population.getPrenom() }</td>
			<td>${population.getDateNaissance() }</td>
			<td>${population.getArrondissement() }</td>
			<td>${population.getNumCarte()}</td>
			<td><a href="./Delete?id=${population.getId()}"><i class="fas fa-trash delete-icon"></i>supprimer</a></td>
			<td><a href="./MODIFICATION?id=${population.getId()}"><i class="fas fa-edit edit-icon"></i>modifier</a></td>
			<td><a href="./DETAIL?id=${population.getId() }"><i class="fas fa-info-circle info-icon"></i>detail</a></td>
			</tr>

	</tbody>
</c:forEach>
	
</table>
</main>
</div>
</body>
</html>
