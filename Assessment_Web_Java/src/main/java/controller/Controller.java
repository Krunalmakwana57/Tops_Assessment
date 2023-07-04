package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import model.Employee;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EmployeeDao employeeDAO;

    public void init() {
        employeeDAO = new EmployeeDao(); // Initialize EmployeeDAO
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        Employee employee = new Employee(firstName, lastName);
        employeeDAO.addEmployee(employee);
        response.sendRedirect("viewEmployees.jsp");
    }
}

