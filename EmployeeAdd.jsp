<%@page import="java.util.List"%>
<%@page import="org.besanttechnologies.Employee"%>
<%@ page import="org.besanttechnologies.EmployeeDAO" %>

<jsp:useBean id="emp" class="org.besanttechnologies.Employee" />

<jsp:setProperty property="*" name="emp" />

<%
List<Employee> empl = EmployeeDAO.insertEmployee(emp); 
out.print("<table>");
for(Employee employ:empl){
out.print("<h2>EmployeeName:"+employ.getEmployeename()+"</h2><hr>");
out.print("<h2>EmployeeLocation:"+employ.getEmplocation()+"</h2><hr>");
out.print("<h2>EmployeeAge:"+employ.getEmpage()+"</h2><hr>");
}
out.print("</table>");
%>