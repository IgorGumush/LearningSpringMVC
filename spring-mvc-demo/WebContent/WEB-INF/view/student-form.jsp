<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
	<title> Student Registration Form</title>
</head>

<body>


	<h2> Spring MVC Demo </h2>
	<h3> Student Registration Form:</h3>
	
	<!--  modelAttribute have to match the addAttribute we set in the controller -->
	<form:form action="processForm" modelAttribute="student">
	
		<!-- input path have to match the getter/setter of the modelAttribute Class (getFirstName) -->
		First Name: <form:input path="firstName"/>
		<br><br>
		Last Name: <form:input path="lastName"/>
		<br><br>
		<input type="submit" value="Submit">
	</form:form>

</body>
</html>
