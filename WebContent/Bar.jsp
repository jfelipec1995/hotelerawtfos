<%@page import="java.util.ArrayList"%>
<%@page import="Clases.TipoPlan"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BAR</title>
</head>
<body>
<h1>BAR</h1>
<form action="BarControlador" method ="post">
<p>HORARIO DE ATENCION:
<p>lunes  a  jueves: 6pm  -  12pm   
<p>viernes   sabados   domingos: 6pm  -  3am
<p>Documento: <input type="text" name="dochuesped" value="<%=request.getParameter("dochuesped")!=null?request.getParameter("dochuesped"):""%>"  />
<p>Numero de personas: <input type="text" name="numper" value="<%=request.getParameter("numper")!=null?request.getParameter("numper"):""%>"  />	
<p>Rango de Edades: <input type="text" name="edper" value="<%=request.getParameter("edper")!=null?request.getParameter("edper"):""%>"  />	
<p>Fecha reserva: <input type="text" name="fechrese" value="<%=request.getParameter("fechrese")!=null?request.getParameter("fechrese"):""%>"  />
<p>Hora reserva: <input type="text" name="horeser" value="<%=request.getParameter("horeser")!=null?request.getParameter("horeser"):""%>"  />
<p><input type="submit" name="Reservar" value="Reservar"/>			
</form>
</body>
</html>