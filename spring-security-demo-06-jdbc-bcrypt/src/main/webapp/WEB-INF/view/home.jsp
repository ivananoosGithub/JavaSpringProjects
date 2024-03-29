<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>

<html>

	<head>
		<title>ivankimanoos Company Home Page</title>
	</head>

	<body>
		<h2>ivankimanoos Company Home Page</h2>
		<hr>
		
		<p>
		WELCOME POTANG INA MOOOOOOOOOhahahwwwwwwwwwwwwwww
		</p>
		
		<hr>
		
		<!-- display username and role  -->
		
		<p>
			User: <security:authentication property="principal.username" />
			<br><br>
			Role(s): <security:authentication property="principal.authorities" />
		</p>
		
		<hr>
		
		<!-- Add a link to point  to /leaders.. this is for the managers -->
		
		<security:authorize access="hasRole('MANAGER')">
			<p>
				<a href="${pageContext.request.contextPath}/leaders">Leadership Meeting</a>
				(Only for Manager peeps)
			</p>
		<hr>
		</security:authorize>
		
		<!-- Add a link to point  to /leaders.. this is for the admins -->
		
		<security:authorize access="hasRole('ADMIN')">
			<p>
				<a href="${pageContext.request.contextPath}/systems">Admin Meeting</a>
				(Only for Admin peeps)
			</p>
		<hr>
		</security:authorize>
		
		
		<form:form action="${pageContext.request.contextPath}/logout" method="POST">
			<input type="submit" value="Logout" />
			
		</form:form>
	</body>

</html>