<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Create an account</title>
	</head>

	<body>
		<form:form action="${pageContext.request.contextPath}/read" modelAttribute="userDTO" method="post">
			Name: <form:input path="name"/> <br>
			email: <form:input path="email"/> <br>
			username: <form:input path="username"/> <br>
			Password: <form:input path="password"/> <br>
			<input type="submit" value="Submit" />
		</form:form>

	</body>
</html>