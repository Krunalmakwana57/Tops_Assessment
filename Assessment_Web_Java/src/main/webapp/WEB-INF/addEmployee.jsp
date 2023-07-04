<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Employee</title>
    <style>
      input {
        display: block;
      }
    </style>
  </head>
  <body>
    <h1>Add Employee</h1>
    <form action="EmployeeServlet" method="POST">
      <!-- Employee form fields -->
      <input type="text" name="firstName" placeholder="First Name" /><br />
      <input type="text" name="lastName" placeholder="Last Name" /><br />
      <input type="email" name="email" placeholder="Email" /><br />
      <input type="tel" name="mobile" placeholder="Mobile Number" /><br />
      <textarea
        rows="3"
        cols="20"
        placeholder="Address"
        name="address"
      ></textarea
      ><br />
      <label for="gender">Male</label><input type="radio" name="gender" />
      <label for="gender">Female</label><input type="radio" name="gender" />
      <input type="password" name="password" placeholder="Password" />
      <input type="password" name="cp" placeholder="Confirm Password" />

      <input type="submit" value="Add Employee" />
    </form>
  </body>
</html>
