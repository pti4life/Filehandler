<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fájlkezelő</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/Footer-Basic.css">
    <link rel="stylesheet" href="assets/css/Login-Form-Clean.css">
    <link rel="stylesheet" href="assets/css/Navigation-Clean.css">
    <link rel="stylesheet" href="assets/css/Navigation-with-Button.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <nav class="navbar navbar-light navbar-expand-md navigation-clean-button" style="font-size:28px;">
        <div class="container"><a class="navbar-brand" href="rólunk.html" style="font-size:47px;">Fájlkezelő</a><button class="navbar-toggler" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div
                class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav mr-auto">
                    <li class="nav-item" role="presentation"><a class="nav-link" href="rólunk.html">Rólunk</a></li>
                </ul><span class="navbar-text actions"> <a href="fájlok.html" class="login">Bejelentkezés</a><a class="btn btn-light action-button" role="button" href="untitled.html">Regisztráció</a></span></div>
        </div>
    </nav>
    <div></div>
    <form class="flex-row justify-content-center align-items-center align-content-center align-self-center" method="post">
        <h2 class="sr-only">Login Form</h2>
        <div class="illustration"></div>
        <div class="form-group"><input class="form-control" type="text" name="Teljes név" placeholder="Teljes név"></div>
        <div class="form-group"><input class="form-control" type="email" name="E-mail" placeholder="E-mail"></div>
        <div class="form-group"><input class="form-control" type="text" name="Felhasználónév" placeholder="Felhasználónév"></div>
        <div class="form-group"><input class="form-control" type="password" name="password" placeholder="Jelszó"></div>
        <div class="form-group"><button class="btn btn-primary btn-block" type="submit">Regisztráció</button></div></form>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>