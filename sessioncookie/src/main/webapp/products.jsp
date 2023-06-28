<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1>Products</h1>
<a
<table>
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Manufacturer</th>
		<th>Description</th>
		<th>Price</th>
		<th>Active</th>
		<th>
	</tr>
	<c:forEach var= "product" items ="${ products }">
	<tr>
	<td>${ product.id }</td>
	<td>${ product.name }</td>
	<td>${ product.manufacturer }</td>
	<td>${ product.description }</td>
	<td>${ product.price }</td>
	<td>${ product.inStock }</td>
	
	
	</tr>
	</c:forEach>
	
		
</table>
<c:if test = "${ msg =='addProduct' ">
<h2>Add Product From</h2>
<form action = "products" method = "post">
	<input type="text" name = "name" placeholder = "Product Name"><br>
	<input type="text" name = "manufacturer" placeholder = "Product Manufacturer"><br>
	<input type="text" name = "description" placeholder = "Product Description"><br>
	<input type="number" name = "price" placeholder = "Product Price"><br>
	<input type="radio" name = "inStock" value = "true"><label>is in stock</label><br>
	<input type="radio" name = "inStock" value = "false"><label>is out of stock</label><br>
	<input type = "submit" value = "submit">
	

</form>

</body>
</html>