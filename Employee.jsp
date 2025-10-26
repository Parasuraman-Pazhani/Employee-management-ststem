<%@page import="org.besanttechnologies.Employee"%>
<%@ page import="org.besanttechnologies.EmployeeDAO" %>

<jsp:useBean id="emp" class="org.besanttechnologies.Employee" />

<jsp:setProperty property="*" name="emp" />

<%
Employee empl = EmployeeDAO.getEmployee(emp.getEmployeename());

out.print("<h1>EmployeeName:"+empl.getEmployeename()+"</h1>");
out.print("<h1>EmployeeLocation:"+empl.getEmplocation()+"</h1>");
out.print("<h1>EmployeeAge:"+empl.getEmpage()+"</h1>");

%>