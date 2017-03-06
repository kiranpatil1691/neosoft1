<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier Main Page</title>

</head>
<body>
	<%@ include file="header.jsp" %>
<center>
 <table style="background-color:powderblue"; border="1" width="35%" cellpadding="5">
	<thead>
		<tr>
			<th>Id</th> <th>First Name</th> <th>Last Name</th> <th>Email</th> 
			<th>Address</th> <th>Mobile Number</th> <th>Office Number </th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${viewSupplier}" var="obj">
		<tr>
 			<form  method="get">
 	 			<td><c:out value="${obj.id}"></c:out><input name="id" type="hidden" value="${obj.id}"> </td>
 				<td><c:out value="${obj.fname}"></c:out><input name="fname" type="hidden" value="${obj.fname}"></td>
 				<td><c:out value="${obj.lname}"></c:out><input name="lname" type="hidden" value="${obj.lname}"></td>
 				<td><c:out value="${obj.email}"></c:out><input name="email" type="hidden" value="${obj.email}"></td>
 				<td><c:out value="${obj.address}"></c:out><input name="address" type="hidden" value="${obj.address}"></td>
 				<td><c:out value="${obj.mobileNumber}"></c:out><input name="mobileNumber" type="hidden" value="${obj.mobileNumber}"></td>
 				<td><c:out value="${obj.officeNumber}"></c:out><input name="officeNumber" type="hidden" value="${obj.officeNumber}"></td>
 				<td><input type="submit" value="update" name="action"></td>
 				<td><input type="submit" value="delete" name="action"></td>
			</form>
		</tr>
	 </c:forEach>
	</tbody>
	<tfoot>
			<tr><td><a href="supplierInsert.jsp">AddSupplier</a></td>
 			<td><a href="SupplierController?action=view">ViewSuppier</a></td></tr>
	</tfoot>
 </table>
 </center> 
<%@ include file="footer.jsp" %> 
</body>
</html>