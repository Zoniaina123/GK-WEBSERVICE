<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="ws.BanqueWS" %>
<%@page import="ws.BanqueService" %>
<%
	double montant = 0;
	double resultat = 0;
	if (request.getParameter("montant")!=null){
		montant = Double.parseDouble(request.getParameter("montant"));
		BanqueService stub =  new BanqueWS().getBanqueServicePort(); 
		resultat = stub.conversionEuroToD(montant);
	}
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cours de change</title>
</head>
<body>
	<form action="Client.jsp">
		Montant :  <input type="text" name="montant" value="<%=montant%>">
		<input type="submit" value="ok">
	</form>
	<%=montant %> 
	en Euro est égale à 
	<%=resultat %> 
	en Dollars
</body>
</html>