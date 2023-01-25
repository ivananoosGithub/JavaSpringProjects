<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>

<html>
	<head>
		<title>FORRRRRRRRRRRMMMMMM</title>
		
		<style>
			.error{color:blue}
			.error1{color:red})
			.error2{color:red}
		</style>
		
	</head>
	
	<body>
		
		<form:form action="processForm" modelAttribute="student">
		
		First name: <form:input path="firstName"/>
		
		<br><br>
		
		Last name (required *): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"></form:errors>
		
		<br><br>
		Grade: <form:input path="grade"/>
		<form:errors path="grade" cssClass="error1"></form:errors>
		
		<br><br>
		CourseCode: <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error1"></form:errors>
		
		<br><br>
		
		Postal Code: <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error2"></form:errors>

		<br><br>
		Country:
		
		<form:select path="country">
			<form:options items = "${student.countryOptions}" />
		</form:select>
		
		<br><br>
		
		Favorite Languages:
		
		<form:radiobutton path="favoriteLang" value="Java"/>Java
		<form:radiobutton path="favoriteLang" value="C#"/>C#
		<form:radiobutton path="favoriteLang" value="C"/>C
		<form:radiobutton path="favoriteLang" value="Python"/>Python
		<form:radiobutton path="favoriteLang" value="JavaScript"/>JavaScript
		
<%--         <form:radiobuttons path="favoriteLanguage" 
		        items="${student.favoriteLanguageOptions}"  /> --%>
		
		<br><br>
		
		Operating Systems:
		
		<form:checkbox path="operatingSys" value="Linux" /> Linux
		<form:checkbox path="operatingSys" value="MAC" />Mac OS
		<form:checkbox path="operatingSys" value="MS" />Windows
		<form:checkbox path="operatingSys" value="Ubuntu" /> Ubuntu
		
		
		<br><br>
		<input type="submit" value="SubmitForm" />
		
		</form:form>
	
	</body>

</html>