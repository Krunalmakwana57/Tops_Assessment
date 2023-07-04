<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Employee</title>
    <!-- Include CSS or Bootstrap -->
</head>
<body>
    <h1>Edit Employee</h1>
    <form action="EmployeeServlet" method="POST">
        
        <input type="text" name="employeeId" value="${employee.employeeId}" readonly><br>
        <input type="text" name="firstName" value="${employee.firstName}" placeholder="First Name"><br>
        <input type="text" name="lastName" value="${employee.lastName}" placeholder="Last Name"><br>
        <input type="email" name="email" value="${employee.email}" placeholder="Email"><br>
        <input type="tel" name="mobile" value="${employee.mobile}" placeholder="Mobile"><br>
        <input type="text" name="address" value="${employee.address}" placeholder="Address"><br>
        Male<input type="radio" name="gender" value="${employee.gender}"><br>
        Female<input type="radio" name="gender" value="${employee.gender}"><br>
        <input type="password" name="password" value="${employee.password}"><br>
        <input type="password" name="cp" value="${employee.cpassword}"><br>
        <!-- Submit button -->
        <input type="submit" value="Update Employee">
    </form>
</body>
</html>
