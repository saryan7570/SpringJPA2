<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee DetailsL:</h1>
<form:form method="POST" action="save.html" modelAttribute="employee">
First Name: <form:input path="firstName"/>
Last Name:<form:input path="lastName"/>
Designation:<form:select path="designation">
<form:option value="">Please select Designation</form:option>
<form:options items="${designations}"></form:options>

</form:select>
Salary :<form:input path="salary"/>
<button type="button">Add Emp</button>
</form:form>
</body>
</html>