package com.demo.controller;

import java.io.IOException;
import java.util.List;

import com.demo.dao.EmployeeDAO;
import com.demo.model.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EmployeeDAO dao = new EmployeeDAO();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action == null) {
			action = "list";
		}
		
		switch(action) {
		case "list":
			List<Employee> list = dao.getAllEmployees();
			request.setAttribute("employeeList", list);
			RequestDispatcher rd = request.getRequestDispatcher("listEmployees.jsp");
			rd.forward(request, response);
			break;
			
		case "delete":
			int empId = Integer.parseInt(request.getParameter("empId"));
			dao.deleteEmployee(empId);
			response.sendRedirect("EmployeeController?action=list");
			break;
			
		default:
			response.sendRedirect("EmployeeController?action=list");
			
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if("add".equals(action)) {
			String empName = request.getParameter("empName");
			String department = request.getParameter("department");
			double salary = Double.parseDouble(request.getParameter("salary"));
			
			Employee e = new Employee();
			
			e.setEmpName(empName);
			e.setDepartment(department);
			e.setSalary(salary);
			
			dao.addEmployees(e);
			
			response.sendRedirect("EmployeeController?action=list");
		}
		
	}
	
}
