<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font_awesome/css/all.css">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
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
            <div class="col-8"><input required="required" type="search" class="search"><button class="btn btn-secondary"
                                                                           type="button">Keresés</button></div>
            <div class="col-4">
                <div>
                   <a href="${pageContext.request.contextPath}/fileMake"> <div  class="col"><button class="btn btn-success" type="button" >Fájl létrehozása</button></div></a>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-8" >
                <h2 style="padding-top:0.5em;">Fájlok</h2>
                <div class="table" style="padding-top:1.5em;">
                    <table class="table">
                        <thead>
                        <tr style="text-align:center;">
                            <th >Fájlnév</th>
                            <th >Méret</th>
                            <th >Módosítás dátuma</th>
                            <th >Küldte</th>
                            <th >Műveletek</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${files}" var="file">
                            <tr>
                                <td>${file.fileName}</td>
                                <td>${file.fileSize}</td>
                                <td>${file.modify}</td>
                                <td>${file.sender}</td>
                                <td  class="d-flex flex-row bd-highlight mb-3">
                                    <form:form method="post" action="${pageContext.request.contextPath}/delete"
                                    cssStyle="padding: 0em" >
                                       <!-- <label for="del" ><i class="fas fa-trash-alt" ></i></label>-->
                                        <input type="hidden" name="deletedFile" value="${file.id}+${file.fileName}">
                                        <input id="del" type="submit" value="&#xf2ed;"  class="btn btn-sq-xs btn-danger"
                                               style="font-family: 'Font Awesome 5 Free';">
                                        <br/>
                                    </form:form>
                                    <form:form method="post" action="${pageContext.request.contextPath}/download"
                                               cssStyle="padding: 0em" >
                                        <!-- <label for="del" ><i class="fas fa-trash-alt" ></i></label>-->
                                        <input type="hidden" name="fileID" value="${file.id}">
                                        <input id="del" type="submit"  value="&#xf019"  class="btn btn-sq-xs btn-light"
                                               style="font-family: 'Font Awesome 5 Free';">
                                        <br/>
                                    </form:form>
                                    <form:form method="post" action="${pageContext.request.contextPath}/"
                                               cssStyle="padding: 0em" >
                                        <!-- <label for="del" ><i class="fas fa-trash-alt" ></i></label>-->
                                        <input id="del" type="submit" value="&#xf2ed;"  class="btn btn-sq-xs btn-light"
                                               style="font-family: 'Font Awesome 5 Free';">
                                        <br/>
                                    </form:form>
                                    <form:form method="post" action="${pageContext.request.contextPath}/fileMake"
                                               cssStyle="padding: 0em" >
                                        <!-- <label for="del" ><i class="fas fa-trash-alt" ></i></label>-->
                                        <input type="hidden" name="modifyFile" value="${file.id}+${file.fileName}">
                                        <input id="del" type="submit" value="&#xf044;"  class="btn btn-sq-xs btn-success"
                                               style="font-family: 'Font Awesome 5 Free';">
                                        <br/>
                                    </form:form>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="col-4" id="upload" style="padding-top:3em;left: -1.8em;" >
                <form:form method="POST" action="${pageContext.request.contextPath}/save" enctype="multipart/form-data">
                    <div class="custom-file" >
                        <input  type="file" class="custom-file-input" name="file" id="customFile"/>
                        <label class="custom-file-label" for="customFile">Tallózás</label>
                    </div>
                    <div id="submit">
                        <input class="btn btn-primary" type="submit" value="Feltöltés">
                    </div>
                </form:form>
            </div>
        </div>
    </div>
    <script>
        // Add the following code if you want the name of the file appear on select
        $(".custom-file-input").on("change", function() {
            var fileName = $(this).val().split("\\").pop();
            $(this).siblings(".custom-file-label").addClass("selected").html(fileName);
        });
    </script>
    </body>
</html>
