package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/displayall")
public class ShowProductServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		ProductService pservice = new ProductServiceImpl();
		List<Product> plist = pservice.getAll();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Product Details</h1>");
		out.println("<table border='2'><tr><th>Productid</th><th>Name</th><th>Quantity</th><th>Price</th><th>MfgDate</th><th>Action</th></tr>");
		for(Product p : plist) {
			if(p.getMfgdate() != null) {
				out.println("<tr> <td>" + p.getPid() + "</td><td>" + p.getPrice() + "</td><td>" + p.getMfgdate().toString() + "</td>");
			}else {
				out.println("<tr><td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getQty()+"</td><td>"+p.getPrice()+"</td><td></td>");
			}
			out.println("<td><a href='editproduct?pid="+p.getPid()+"'>edit</a> / <a href='#'>delete</a></td></tr>");
		}
		out.println("</table>");
		out.println("<a href = 'addproduct.html'>Add new product</a>");
		
		
	}
	

}
