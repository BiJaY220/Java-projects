package servlets;


import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletHandler
 */
@WebServlet("/cookieHandler")
public class CookieHandler  extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		Cookie cookie1 = new Cookie("name", name);
		Cookie cookie2 = new Cookie("address", address);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
