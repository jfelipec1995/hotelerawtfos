<%@page import="java.util.ArrayList"%>
<%@page import="Clases.TipoPlan"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ACTIVIDADES</title>
</head>
<body>
<h1>ACTIVIDADES</h1>
<form action="ActividadesControlador" method ="post">
<p>Horarios De Las Actividades:
<p>Lunes A Viernes: 8am - 4pm
<p>Sabados - Domingos:8am - 2pm
<p>Documento: <input type="text" name="dochuesped" value="<%=request.getParameter("dochuesped")!=null?request.getParameter("dochuesped"):""%>"  />
<p>Nombre De Actividad: <input type="text" name="nomacti" value="<%=request.getParameter("nomacti")!=null?request.getParameter("nomacti"):""%>"  />	
<p>Fecha reserva: <input type="text" name="fechrese" value="<%=request.getParameter("fechrese")!=null?request.getParameter("fechrese"):""%>"  />
<p>Hora reserva: <input type="text" name="horeser" value="<%=request.getParameter("horeser")!=null?request.getParameter("horeser"):""%>"  />
<p><input type="submit" name="Reservar" value="Reservar"/>			
</form>
</body>
</html>