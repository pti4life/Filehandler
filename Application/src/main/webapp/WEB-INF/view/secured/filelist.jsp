<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <li class="nav-item" role="presentation"><a class="nav-link" href="">Profil</a></li>
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
                    <div class="col"><button class="btn btn-success" type="button">Fájl létrehozása</button></div>
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
                            <th style="width:20%">Fájlnév</th>
                            <th style="width:20%">Méret</th>
                            <th style="width:20%">Módosítás dátuma</th>
                            <th style="width:20%">Küldte</th>
                            <th style="width:20%">Műveletek</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>jegyzet.txt</td>
                            <td>5 byte</td>
                            <td>2019/11/09</td>
                            <td>Név 1</td>
                            <td><a href="#" class="btn btn-sq-xs btn-danger">
                                <i class="fas fa-trash-alt" ></i><br />
                            </a>
                                <a href="#" class="btn btn-sq-xs btn-light">
                                    <i class="fas fa-download" ></i><br />
                                </a>
                                <a href="#" class="btn btn-sq-xs btn-light">
                                    <i class="fas fa-share" ></i><br />
                                </a>
                            </td>
                        </tr>
                        <tr>
                            <td>nothing.docx</td>
                            <td>36 gb</td>
                            <td>Soha</td>
                            <td>Név 2</td>
                            <td><a href="#" class="btn btn-sq-xs btn-danger">
                                <i class="fas fa-trash-alt" ></i><br />
                            </a>
                                <a href="#" class="btn btn-sq-xs btn-light">
                                    <i class="fas fa-download" ></i><br />
                                </a>
                                <a href="#" class="btn btn-sq-xs btn-light">
                                    <i class="fas fa-share" ></i><br />
                                </a>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="col-4" style="padding-top:5.3em;">
                <div style="border:1px solid;padding:0.5em;"><label>Fájl feltöltése</label>
                    <div class="row">
                        <div class="col" style="padding-bottom:1em;">
                            <button class="btn btn-primary" type="button">Tallózás</button>
                            <label class="col-form-label" style="padding-left:1em;">.........</label>
                        </div>
                    </div><button class="btn btn-primary" type="button">Feltöltés</button>
                </div>
            </div>
        </div>
    </div>
    </body>
</html>
