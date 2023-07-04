<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Employee</title>
    <!-- Include CSS or Bootstrap -->
</head>
<body>
    <h1>Delete Employee</h1>
    <p>Are you sure you want to delete this employee?</p>
    <form action="EmployeeServlet" method="POST">
        <!-- Hidden field to pass employeeId -->
        <input type="hidden" name="employeeId" value="${employeeId}">
        <!-- Confirm delete button -->
        <input type="submit" name="action" value="Delete">
        <!-- Cancel button -->
        <input type="button" value="Cancel" onclick="window.history.back()">
    </form>
</body>
</html>
