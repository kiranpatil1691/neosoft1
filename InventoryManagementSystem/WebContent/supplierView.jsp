<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<form action="view" method="post">
<input type="hidden" name="name" value="view"> 
 <table border="1">
<tr>
<th>Id</th> <th>First Name</th> <th>Last Name</th> 
<th>Email</th> <th>Address</th> 
<th>Mobile Number</th> <th>Office Number </th>
</tr>
	<c:forEach items="${viewSupplier}" var="obj">
 <tr>
 	<td><c:out value="{obj.id}"></c:out></td>
 	<td><c:out value="{out.fname}"></c:out></td>
 	<td><c:out value="{out.lname}"></c:out></td>
 	<td><c:out value="{out.email}"></c:out></td>
 	<td><c:out value="{out.address}"></c:out></td>
 	<td><c:out value="{out.mobileNumber}"></c:out></td>
 	<td><c:out value="{out.officeNumber}"></c:out></td>
 	 
 </tr>
 </c:forEach>
<tr>
<td><a href="SupplierLogin.jsp">AddSupplier</a></td>
<td><a href="SupplierEdit.jsp">UpdateSupplier</a></td>
<td><a href="deleteSupplier.jsp">DeleteSupplier</a></td>
</tr>

</table>
</form>
<%@ include file="footer.jsp" %>
</body>
</html>