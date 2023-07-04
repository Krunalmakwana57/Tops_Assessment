<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>View Employees</title>
    <!-- Include CSS or Bootstrap -->
</head>
<body>
    <h1>View Employees</h1>
    <table>
        <tr>
            <th>Employee ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <!-- Loop through employees and display them in the table -->
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td>${employee.employeeId}</td>
                <td>${employee.firstName}</td>
                <td>${employee.lastName}</td>
                <td>${employee.email}</td>
                <td>${employee.mobile}</td>
                <td><a href="editEmployee.jsp?employeeId=${employee.employeeId}">Edit</a></td>
                <td><a href="deleteEmployee.jsp?employeeId=${employee.employeeId}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
