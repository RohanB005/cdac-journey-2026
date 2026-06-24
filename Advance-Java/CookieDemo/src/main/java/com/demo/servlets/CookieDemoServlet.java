package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cookiedemo")
public class CookieDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String cname = request.getParameter("name");
		String val = request.getParameter("cval");
		String btn = request.getParameter("btn");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		switch(btn) {
		case "add"->{
			Cookie c = new Cookie(cname, val);
			response.addCookie(c);
			out.println("<h1>Cookie Added!!!</h1>");
		}
		case "del"->{
			Cookie[] carr = request.getCookies();
			for(Cookie c:carr) {
				if(c.getName().equals(cname)) {
					c.setMaxAge(0);
				response.addCookie(c);
				break;
		}
		}
		out.println("<h1>Cookie deleted!!!</h1>");
	}
		case "show" -> {
			Cookie[] carr = request.getCookies();
			for(Cookie c:carr) {
				out.println(c.getName() + "---->" + c.getValue());
			}
			
		}
	}
		RequestDispatcher rd = request.getRequestDispatcher("Cookiedemo.html");
		rd.include(request, response);
	}
}