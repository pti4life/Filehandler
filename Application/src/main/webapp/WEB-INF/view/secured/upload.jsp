<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Upload</title>
    <meta charset="utf-8">
</head>

<body>
    <form:form method="POST" action="${pageContext.request.contextPath}/makeFile" >
        <input type="text" name="newFileName" value="${pageContext.request.getAttribute("newFileName")}" placeholder="irja be a fájl nevét">
        <input type="submit" value="Mentés" />
        <br><br><br>
        <label>
            <textarea rows="20" cols="30" name="newFileContent"  >${pageContext.request.getAttribute("newFileContent")}  </textarea>
        </label>

    </form:form>

</body>
</html>