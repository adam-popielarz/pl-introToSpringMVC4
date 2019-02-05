<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Event</title>

<style type="text/css">
.error {
	color: #ff0000;
}

.errorblock {
	color: #0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 3px;
	margin: 16px;
}
</style>

</head>
<body>

<form:form modelAttribute="event">
	<form:errors path="*" cssClass="errorblock" element="div"/>
	<label for="textinput1" >Enter Minutes</label>
	<form:input path="name" cssErrorClass="error"  />
	<form:errors path="name" cssClass="error" />
	<br>
	<input  type="submit" class="btn" value="Enter Event">


</form:form>

</body>
</html>