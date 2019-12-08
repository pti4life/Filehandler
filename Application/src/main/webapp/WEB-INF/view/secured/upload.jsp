<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload</title>
    <meta charset="utf-8">
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
                <li class="nav-item" role="presentation"><a class="nav-link" href="${pageContext.request.contextPath}/">Rólunk</a></li>
                <li class="nav-item" role="presentation"><a class="nav-link" href="${pageContext.request.contextPath}/filelist">Fájlok</a></li>
                <li class="nav-item" role="presentation"><a class="nav-link" href="${pageContext.request.contextPath}/profile">Profil</a></li>
            </ul>
            <span class="navbar-text actions">
                <a class="btn btn-light action-button" role="button" href="${pageContext.request.contextPath}/signup">Kijelentkezés</a>
            </span>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col" style="position: relative; " >
            <form:form method="POST" action="${pageContext.request.contextPath}/makeFile" cssStyle="" >
                <div style="margin-left: 2em; padding-bottom: 1em; position: relative; width: 100%; left: -80%;">
                    <input type="text" name="newFileName" value="${pageContext.request.getAttribute("newFileName")}" placeholder="Írja be a fájl nevét">
                    <input type="submit" value="Mentés" />
                </div>
                <div class="input-group" style="width: 60vw;height: 60vh; margin-left: 2em;left: -80%;">
                    <textarea class="form-control" name="newFileContent">${pageContext.request.getAttribute("newFileContent")}</textarea>
                </div>
            </form:form>
        </div>
    </div>
</div>

</body>
</html>