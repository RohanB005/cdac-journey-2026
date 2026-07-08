package com.register.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.register.dao.UserDAO;
import com.register.model.User;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		
		UserDAO dao = new UserDAO();
		
		boolean status = dao.registerUser(user);
		
		if(status) {
			response.sendRedirect("success.jsp");
		}else {
			response.sendRedirect("error.jsp");
		}
	
	}

}
