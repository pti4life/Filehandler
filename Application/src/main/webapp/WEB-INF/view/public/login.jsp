<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Loginpage</title>
    </head>
    <body>
        <form:form action="${pageContext.request.contextPath}/login" modelAttribute="userDTO" method="post">
            Username: <form:input path="username"/> <br>
            password: <form:input path="password"/> <br>
            <input type="submit" value="Submit" />
        </form:form>
    </body>
</html>
