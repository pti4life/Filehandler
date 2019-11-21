<%--
  Created by IntelliJ IDEA.
  User: hidie
  Date: 2019. 11. 19.
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profil</title>
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

<form:form action="${pageContext.request.contextPath}/profile/email" modelAttribute="userDTO"  class="flex-row justify-content-center align-items-center align-content-center align-self-center" method="post">
    <h2 style="padding-bottom: 0.5em">Email</h2>
    <c:if test="${!empty errors}">
        <div class="alert alert-danger col-xs-offset-1 col-xs-10">
            <c:forEach items="${errors}" var="error">
            <c:out value = "${error}"/><p>
            </c:forEach>
        </div>
    </c:if>
    <c:if test="${empty errors && errors!=null}">
        <div class="alert alert-success col-xs-offset-1 col-xs-10">
            Sikeres módosítás
        </div>
    </c:if>
    <div class="illustration"></div>
    <div class="form-group"><form:input path="email" class="form-control" required="required" type="email" name="E-mail" placeholder="E-mail"/></div>
    <div class="form-group"><form:input path="password" class="form-control" required="required" type="password" name="password" placeholder="Jelszó"/></div>
    <div class="form-group"><button class="btn btn-primary btn-block" type="submit">Frissítés</button></div>
</form:form>

<form:form action="${pageContext.request.contextPath}/profile/username" modelAttribute="userDTO"  class="flex-row justify-content-center align-items-center align-content-center align-self-center" method="post">
    <h2 style="padding-bottom: 0.5em">Felhasználónév</h2>
    <c:if test="${!empty errors}">
        <div class="alert alert-danger col-xs-offset-1 col-xs-10">
            <c:forEach items="${errors}" var="error">
            <c:out value = "${error}"/><p>
            </c:forEach>
        </div>
    </c:if>
    <c:if test="${empty errors && errors!=null}">
        <div class="alert alert-success col-xs-offset-1 col-xs-10">
            Sikeres módosítás
        </div>
    </c:if>
    <div class="illustration"></div>
    <div class="form-group"><form:input path="username" class="form-control" required="required" type="text" name="username" placeholder="Felhasználónév"/></div>
    <div class="form-group"><form:input path="password2" class="form-control" required="required" type="password" name="password" placeholder="Jelszó"/></div>
    <div class="form-group"><button class="btn btn-primary btn-block" type="submit">Frissítés</button></div>
</form:form>

<form:form action="${pageContext.request.contextPath}/profile/password" modelAttribute="userDTO"  class="flex-row justify-content-center align-items-center align-content-center align-self-center" method="post">
    <h2 style="padding-bottom: 0.5em">Jelszó</h2>
    <c:if test="${!empty errors}">
        <div class="alert alert-danger col-xs-offset-1 col-xs-10">
            <c:forEach items="${errors}" var="error">
            <c:out value = "${error}"/><p>
            </c:forEach>
        </div>
    </c:if>
    <c:if test="${empty errors && errors!=null}">
        <div class="alert alert-success col-xs-offset-1 col-xs-10">
            Sikeres módosítás
        </div>
    </c:if>
    <div class="illustration"></div>
    <div class="form-group"><form:input path="password3" class="form-control" required="required" type="password" name="oldPass" placeholder="Régi jelszó"/></div>
    <div class="form-group"><form:input path="password4" class="form-control" required="required" type="password" name="password" placeholder="Új Jelszó"/></div>
    <div class="form-group"><button class="btn btn-primary btn-block" type="submit">Frissítés</button></div>
</form:form>

</body>

<script src="${pageContext.request.contextPath}/resources/css/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/css/bootstrap/js/bootstrap.min.js"></script>

</html>
