package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.Employee;

public class EmployeeDao {

    public void addEmployee(Employee employee) {
        try {
			Connection cn = DBConnection.createConnection();
			String sql = "INSERT INTO employee (first_name, last_name) VALUES (?, ?)";
			PreparedStatement statement = cn.prepareStatement(sql);
            statement.setString(1, employee.getFirstName());
            statement.setString(2, employee.getLastName());
            statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
            
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        try {
			Connection cn = DBConnection.createConnection();
			String sql = "SELECT * FROM employee";
			Statement statement = cn.createStatement();
	                ResultSet resultSet = statement.executeQuery(sql);
	                while (resultSet.next()) {
	                    int employeeId = resultSet.getInt("employee_id");
	                    String firstName = resultSet.getString("first_name");
	                    String lastName = resultSet.getString("last_name");
	                    Employee employee = new Employee(employeeId, firstName, lastName);
	                    employees.add(employee);
	                }
		} catch (Exception e) {
			e.printStackTrace();
		}
        return employees;
    }
}

