<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier Login Page</title>

<!-- validation to the form -->

<script type="text/javascript" src="${pageContext.request.contextPath}/js/insertPageValidation.js"></script>
</head>

<body>
<%@ include file="header.jsp" %>

<form name="supplierForm" method="post" action="insert" onsubmit="return validationForm()">

	<!-- <input type="hidden" name="action" value="insert"> -->
<center>
	<table border="1" width="35%" cellpadding="5">
		<thead> 
			<tr> <th colspan="2">Enter Information Here</th></tr></thead>
		<tbody>
			<tr><td>Enter Id :</td>
			<td><input type="text" name="id"/><span id="vid"></span></td></tr>
		
			<tr><td>Enter First Name :</td>
			<td><input type="text" name="fname"><span id="vfname"></span></td></tr>
	
			<tr><td>Enter Last Name :</td>
			<td><input type="text" name="lname"><span id="vlname"></span></td></tr>
			
			<tr><td>Enter Email Id :</td>	
			<td><input type="text" name="email"><span id="vemail"></span></td></tr>
	
			<tr><td>Enter Address :</td>
			<td><input type="text" name="address"><span id="vaddress"></span> </td></tr>

			<tr><td>Enter Mobile number :</td>	
			<td><input type="text" name="mobile"/><span id="vmobile"></span></td></tr>

			<tr><td>Enter Office Number :</td>
			<td><input type="text" name="office"/><span id="voffice"></span></td></tr>
	
			<tr><td><input type="submit" value="insert" name="action"></td></tr>
		</tbody>
	</table>
</center>
</form>
<%@ include file="footer.jsp" %>
</body>
</html>