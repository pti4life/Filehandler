<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fájlkezelő</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/css/Footer-Basic.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/css/Login-Form-Clean.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/css/Navigation-Clean.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/css/styles.css">
</head>
<body>
<nav class="navbar navbar-light navbar-expand-md navigation-clean-button" style="font-size:28px;">
    <div class="container">
        <img src="${pageContext.request.contextPath}/resources/images/share_icon.png" class="icon" alt="filemanager_icon">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/" style="font-size:47px;">Fájlkezelő</a>
        <button class="navbar-toggler" data-toggle="collapse" data-target="#navcol-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navcol-1">
            <ul class="nav navbar-nav mr-auto">
                <li class="nav-item" role="presentation">
                    <a class="nav-link" href="${pageContext.request.contextPath}/">Rólunk</a>
                </li>
            </ul>
            <span class="navbar-text actions">
                <a href="${pageContext.request.contextPath}/login" class="login">Bejelentkezés</a>
                <a class="btn btn-light action-button" role="button" href="${pageContext.request.contextPath}/signup">Regisztráció</a>
            </span>
        </div>
    </div>
</nav>
<div class="jumbotron">
    <div class="container" style="margin:auto;">
        <div class="row">
            <div class="col-7" style=" vertical-align: center ; margin: auto; padding-left: 10em;">

                <h1>ERROR 404</h1>
                <h2>Ez az oldal sajnos nem létezik!</h2>
                <a class="btn btn-primary" href="rólunk.html" role="button"style="margin-top: 2em">Vissza a főoldalra</a>

            </div>
            <div class="col-5" style="padding: 1em; margin: auto;">
                <img src="${pageContext.request.contextPath}/resources/images/error_icon.png" class="img-fluid" alt="Responsive image">
            </div>

        </div>
    </div>
</div>
</body>
<script src="${pageContext.request.contextPath}/resources/css/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/bootstrap/js/bootstrap.min.js"></script>
</html>
