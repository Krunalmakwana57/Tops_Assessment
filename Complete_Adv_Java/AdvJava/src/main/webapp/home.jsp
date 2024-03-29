<%@page import="dao.UserDao"%>
<%@page import="java.util.List"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	User u = null;
	if (session.getAttribute("data") != null) {
		u = (User) session.getAttribute("data");
	} else {
		response.sendRedirect("login.jsp");
	}
	%>
	<h1>Welcome,</h1>
	<br>
	<h3><%=u.getName()%></h3>
	<br>

	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Contact</th>
			<th>Address</th>
			<th>Email</th>
			<th>Password</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<%
		List<User> list = UserDao.getAllUsers();
		%>
		<%
		for (User u1 : list) {
		%>
		<tr>
			<td><%=u1.getId()%></td>
			<td><%=u1.getName()%></td>
			<td><%=u1.getContact()%></td>
			<td><%=u1.getAddress()%></td>
			<td><%=u1.getEmail()%></td>
			<td><%=u1.getPassword()%></td>
			<td>
				<form action="UserController" method="post">
					<input type="hidden" name="id" value=<%=u1.getId() %>>
					<input type="submit" name="action" value="edit">
				</form>
			</td>
			<td>
				<form action="UserController" method="post">
					<input type="hidden" name="id" value=<%=u1.getId() %>>
					<input type="submit" name="action" value="delete">
				</form>
			</td>
		</tr>
		<%
		}
		%>
	</table>
	<h1>
		<a href="logout.jsp">Logout</a>
	</h1>
</body>
</html>