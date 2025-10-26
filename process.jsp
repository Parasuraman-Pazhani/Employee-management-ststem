<%@ page import="org.besanttechnologies.LoginDAO" %>

<jsp:useBean id="login" class="org.besanttechnologies.Login" />

<jsp:setProperty property="*" name="login" />

<%
boolean status = LoginDAO.validateLogin(login);
if(status){
	out.print("User Authenticated");
	%>
	<jsp:forward page="Welcome.jsp" />
	<%
} else {
	out.print("Invalid username or password");
	%>
	<jsp:forward page="index.jsp" />
	<%
}
%>