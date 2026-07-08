package com.student.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.student.dao.StudentDAO;
import com.student.model.Student;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    StudentDAO dao = new StudentDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action == null) {
            action = "list";
        }

        switch (action) {

        case "list":

            List<Student> list = dao.getAllStudents();

            request.setAttribute("studentList", list);

            RequestDispatcher rd = request.getRequestDispatcher("listStudents.jsp");
            rd.forward(request, response);
            break;

        case "delete":

            int id = Integer.parseInt(request.getParameter("id"));

            dao.deleteStudent(id);

            response.sendRedirect("StudentController?action=list");
            break;

        default:

            response.sendRedirect("StudentController?action=list");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if ("add".equals(action)) {

            String name = request.getParameter("name");
            int age = Integer.parseInt(request.getParameter("age"));
            String course = request.getParameter("course");

            Student s = new Student();

            s.setName(name);
            s.setAge(age);
            s.setCourse(course);

            dao.addStudent(s);

            response.sendRedirect("StudentController?action=list");
        }
    }
}