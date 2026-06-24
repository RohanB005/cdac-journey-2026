package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/getcount")
public class Counterservlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String str = request.getParameter("count");
		int cnt;
		
		if(str == null) {
			cnt = 1;
		}else {
			cnt = Integer.parseInt(str);
			cnt++;
		}
		out.println("<h1>You clicked " + cnt + " Times</h1>");
		
		out.println("<a href='getcount?count=" + cnt + "'>Click Me</a>");
	}
}
