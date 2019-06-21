<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ include file="/WEB-INF/views/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome from TrustCore Training Center<br>
<h3>${msg}</h3>
<h4>Please type your name!</h4>
<form:form method="post" action="${pageContext.request.contextPath}/pp.htm" commandName="person">
First Name: <form:input path="firstName" type="text"/>
Last Name: <form:input path="lastName" type="text" />
<input type="submit" value="Submit" />
</form:form>
</body>
</html>