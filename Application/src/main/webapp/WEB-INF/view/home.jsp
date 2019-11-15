<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Create an account</title>
</head>

<body>


<form:form action="${pageContext.request.contextPath}/read" modelAttribute="userDTO" method="post">
	Name: <form:input path="username"/> <br>
	Password: <form:input path="password"/> <br>
	<input type="submit" value="Submit" />
</form:form>
<c:forEach items="${set}" var="item">
	<li>${item}</li>
</c:forEach>

</body>
</html>