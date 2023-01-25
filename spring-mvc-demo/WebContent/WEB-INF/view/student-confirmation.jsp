<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="loop" %>

<!DOCTYPE html>

<html>

	<head>
		<title>HAHAHASHASHASH SUCCESS</title>	
	</head>
	
	
	<body>
		<h2>Success full name of the student: ${student.firstName} ${student.lastName}</h2>
		<h2>The grade is: ${student.grade} </h2>
		<h2>The course code is: ${student.courseCode} </h2>
		<h2>The postal code is: ${student.postalCode} </h2>
		<h2>The Country is: ${student.country}</h2>
		<h2>The favorite language of the student is: ${student.favoriteLang}</h2>
		<h2>The operating system/s is/are:</h2>
		<ul>
			<loop:forEach var="userChoice" items="${student.operatingSys}">
				<li> ${userChoice}</li>
			</loop:forEach>
		</ul>
	
	</body>

</html>