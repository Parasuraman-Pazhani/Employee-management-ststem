<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Besant Technologies</title>
</head>
<body>

	<h1>Welcome to Home Screen</h1>
	<form action="Employee.jsp">
	<input type="text" name="employeename" />
	<input type="submit" value="DisplayEmployee" />
	</form>
	<form action="EmployeeList.jsp">
	<input type="submit" value="DisplayAll" />
	</form>
	
	<form action="EmployeeAdd.jsp">
	<input type="text" name="employeename" />
	<input type="text" name="emplocation" />
	<input type="number" name="empage" />
	<input type="submit" value="Add Employee" />
	</form>
	
	<form action="EmployeeDelete.jsp">
	<input type="text" name="employeename" />
	<input type="submit" value="Delete Employee" />
	</form>
	
</body>
</html>