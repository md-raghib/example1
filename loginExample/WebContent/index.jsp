<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<div  class="container">

<div class="header">
	<h1>Login</h1>
</div>
<hr>
<div class="row">
<div class="col-sm-4">

<s:form action="loginAction">
	
	
			<s:textfield name="email" label="email" placeholder="email" class="form-control"></s:textfield>
			
	
	
			<s:password name="password" label="password" placeholder="password" class="form-control"></s:password>
	
			
	
	<s:submit  value="Submit"></s:submit>
<s:token></s:token>
</s:form>


</div>
</div>

</div>





</body>
</html>