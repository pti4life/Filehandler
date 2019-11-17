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
            <a class="navbar-brand" href="${pageContext.request.contextPath}/home" style="font-size:47px;">Fájlkezelő</a>
            <button class="navbar-toggler" data-toggle="collapse" data-target="#navcol-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav mr-auto">
                    <li class="nav-item" role="presentation">
                        <a class="nav-link" href="${pageContext.request.contextPath}/home">Rólunk</a>
                    </li>
                </ul>
                <span class="navbar-text actions">
                <a href="${pageContext.request.contextPath}/filelist" class="login">Bejelentkezés</a>
                <a class="btn btn-light action-button" role="button" href="${pageContext.request.contextPath}/signup">Regisztráció</a>
            </span>
            </div>
        </div>
    </nav>
    <div class="container">
        <h2>Rólunk</h2>
        <p style="font-size:28px;"><br>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute
            irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.<br><br></p>
    </div>
    </body>
    <script src="${pageContext.request.contextPath}/resources/css/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/css/bootstrap/js/bootstrap.min.js"></script>
</html>
