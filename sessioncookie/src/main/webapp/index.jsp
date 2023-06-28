<%@page import="jakarta.servlet.http.Cookie"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
<h1>Products</h1>
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

<form action="sessions" method="post">
	<input type="text" name="item" placeholder="Item"><br>
	<input type="submit" value="submit">
</form>

<ul>
	<%
		ArrayList<String> items = (ArrayList<String>)session.getAttribute("items");
		if(items!=null){
			for(String item:items){
				out.append("<li>"+item+"</li>");
			}
		}
	%>
</ul>
<form action = "cookieHandler" method ="POST">
	<input type = "text" name = "name" placeholder = "Name"><br>
	<input type = "text" name = "address" placeholder = "address"><br>
	<input type = "submit" value = "submit">
	
	
</form>
<%
	Cookie[] cookies = request.getCookies();
	if(cookies!=null){
		for(int i=0; i<cookies.length-1; i++){
			out.print(cookies[i].getName()+" : "+cookies[i].getValue()+"<br>");
			
		}
	}
	

%>
</body> 
</html>