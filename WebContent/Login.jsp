<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logearse Como Administrador</title>
</head>
<body>
<h1>Digite Su Usuario y Administrador</h1>
<form action="LoginControlador" method ="post">
<p>Nombre Administrador: <input type="text" name="nomadministrador" value="<%=request.getParameter("nomadministrador")!=null?request.getParameter("nomadministrador"):""%>"  />
<p>Contraseña Administrador: <input type="password" name="contadministrador" value="<%=request.getParameter("contadministrador")!=null?request.getParameter("contadministrador"):""%>"  />
<p><input type="submit" name="Ingresar" value="Ingresar Administrador"/>
</form>
</body>
</html>