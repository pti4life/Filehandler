<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Upload</title>
</head>

<body>
    <form:form method="POST" action="${pageContext.request.contextPath}/save" enctype="multipart/form-data">
        <table>
            <tr>
                <td><input type="file" name="file" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit" /></td>
            </tr>
        </table>
    </form:form>
<form:form method="POST" action="${pageContext.request.contextPath}/read" enctype="multipart/form-data">
    <input type="submit" value="gec">
</form:form>
</body>
</html>