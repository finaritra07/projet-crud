<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"content="width=device-width, initial-scale=1.0">
    <title>Page Login</title>
       	<link rel="stylesheet"
   	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/Login.css">
</head>
<body>
    <div class="container">
        <div class="login-box">
        <h2>Connexion</h2>
            <form action ="login" method="post">
                <div class="input-box">
                    <label for="email"><i class="fa-solid fa-envelope"></i> Email</label>
                    <input type="email" id="email"name="email" placeholder="votre email.." required>
                </div>

                <div class="input-box">
                    <label for="password"><i class="fa-solid fa-lock"></i> Mot de passe</label>
                    <input type="password" id="password"name="password" placeholder="votre mot de passe.." required>
                </div>
                <c:if test="${ver == false }">
                	<p style="color:red">Email ou Mot de passe incorrect!</p>
                </c:if>

                    <button type="submit">Se connecter</button>

            </form>
        </div> 
</div>
</body>
</html>