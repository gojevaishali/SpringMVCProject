<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
	<p><h1>${headerName}</h1>
	</p>
	<div>
		<form:form method="POST" action="/School/standard"
			modelAttribute="stand" >
			<table>
				<tr>
					<td>Name</td>
					<td><form:input type="text" path="name"></form:input></td>
				</tr>
				<tr>
					<td>Student Count</td>
					<td><form:input type="text" path="count"></form:input></td>
				</tr>
				<tr>
					<td>Faculty_Name</td>
					<td><form:input type="text" path="faculty"></form:input></td>
				</tr>
				
				<tr>
					<td colspan=2><input type="submit" value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>