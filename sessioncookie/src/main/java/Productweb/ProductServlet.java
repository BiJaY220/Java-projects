package Productweb;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/products")
public class ProductServlet extends HttpServlet {
	ProductDao pDao = new ProductDao();
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String msg = "hello from product";
		request.setAttribute("message",msg);
		try{
			List<Product> products = pDao.getAll();
		
		}catch(ClassNotFound)
		request.getRequestDispatcher("product.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product pd = new Product(
				request.getParameter("name"),
				request.getParameter("manufacturer"),
				request.getParameter("description"),
				Float.parseFloat(request.getParameter("price")),
				request.getParameter("inStock").equalsIgnoreCase("true")?true:false
			);
		
		
	int i=0;
	try {
		i = pDao.save(pd);
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	String msg;
	if(i==0) {
		msg="Product couldn't be added to the database!";
	}
	else {
		msg="Product added to the database!";
	}
	request.setAttribute("msg", msg);
	request.getRequestDispatcher("products.jsp").forward(request, response);
				
		
		
		
		
		doGet(request, response);
	}

}
