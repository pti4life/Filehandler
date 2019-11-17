<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
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

<form:form action="${pageContext.request.contextPath}/read" modelAttribute="userDTO" method="post"/>
<form:form action="${pageContext.request.contextPath}/signup" modelAttribute="userDTO"  class="flex-row justify-content-center align-items-center align-content-center align-self-center" method="post">
    <h2 style="padding-bottom: 0.5em">Regisztráció</h2>
    <div class="illustration"></div>
    <div class="form-group"><form:input path="name" class="form-control" type="text" name="Teljes név" placeholder="Teljes név"/></div>
    <div class="form-group"><form:input path="email" class="form-control" type="email" name="E-mail" placeholder="E-mail"/></div>
    <div class="form-group"><form:input path="username" class="form-control" type="text" name="Felhasználónév" placeholder="Felhasználónév"/></div>
    <div class="form-group"><form:input path="password" class="form-control" type="password" name="password" placeholder="Jelszó"/></div>
    <div class="form-group"><button class="btn btn-primary btn-block" type="submit">Regisztráció</button></div>
</form:form>
</body>
</html>