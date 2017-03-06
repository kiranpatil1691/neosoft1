<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier edit page</title>
</head>
<body>
<center>
	<form action="update" method="get">
		<table border="1" width="35%" cellpadding="5">
			<thead> 
				<tr><th colspan="2">Enter update Information Here</th></tr>
			</thead>
			<tbody>
				<tr><td><input type="hidden" name="id" value="${updateMessage.id }"> </td> </tr>
				<tr><td>Enter First Name :</td>
					<td><input type="text" name="fname" value="${updateMessage.fname }"></td></tr>
				
				<tr><td>Enter Last Name :</td>
					<td><input type="text" name="lname" value="${updateMessage.lname }"></td></tr>
	
				<tr><td>Enter Email Id :</td>
					<td><input type="text" name="email" value="${updateMessage.email }"></td></tr>

				<tr><td>Enter Address :</td>
					<%-- <td><textarea rows="3" cols="10" name="address" value="${updateMessage.address }"></textarea></td> --%>
					<td><input type="text" name="address" value="${updateMessage.address}"> </td></tr>

				<tr><td>Enter Mobile number :</td>
				<td><input type="text" name="mobileNumber" value="${updateMessage.mobileNumber }"></td></tr>
		
				<tr><td>Enter Office Number :</td>
				<td><input type="text" name="officeNumber" value="${updateMessage.officeNumber }"/></td></tr>

				<tr><td></td><td><input type="submit" value="updateView" name="action"></td></tr>
			</tbody>
	</table>
</form>
</center>
</body>
</html>