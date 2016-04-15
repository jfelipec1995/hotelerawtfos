<%@page import="java.util.ArrayList"%>
<%@page import="Clases.TipoPlan"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reservar plan En Hotel</title>
</head>
<body>
<h1>Datos de reserva del hotel</h1>
<form action="ReservasHotelControlador" method ="post">
<p>documento de huesped: <input type="text" name="dochuesped" value="<%=request.getParameter("dochuesped")!=null?request.getParameter("dochuesped"):""%>"  />
<p>Edad: <input type="text" name="edadhuesped" value="<%=request.getParameter("edadhuesped")!=null?request.getParameter("edadhuesped"):""%>"  />
<p>Numero de Noches: <input type="text" name="numnoche" value="<%=request.getParameter("numnoche")!=null?request.getParameter("numnoche"):""%>"  />
<p>Nombre del plan: <select name="nomplan">
						<%ArrayList<TipoPlan> lista = (ArrayList<TipoPlan>)request.getAttribute("TipoPlan");
                        for (TipoPlan h : lista) {
                    %>                    
                    <option value="<%=h.getNombre_tipoplan()%>"><%=(h.getNombre_tipoplan())%></option>                    
                    <%}
                    %>
                </select><br>
<p>Sexo del huesped: 
			Masculino:<input type="radio" name="sexhuesped" value="m" value="<%=request.getParameter("sexhuesped")!=null && request.getParameter("sexhuesped").equals("n")?"selected='selected'":""%>" checked="checked"/>
			Femenino:<input type="radio" name="sexhuesped" value="f" value="<%=request.getParameter("sexhuesped")!=null?request.getParameter("sexhuesped"):""%>" />
<p>Pareja Huesped:
			Masculino:<input type="radio" name="parhuesped" value="m" value="<%=request.getParameter("parhuesped")!=null && request.getParameter("parhuesped").equals("n")?"selected='selected'":""%>" checked="checked"/>
			Femenino:<input type="radio" name="parhuesped" value="f" value="<%=request.getParameter("parhuesped")!=null?request.getParameter("parhuesped"):""%>" />
<p>Tiene Hijos?: 
			Si:<input type="radio" name="hijhuesped" value="s" value="<%=request.getParameter("hijhuesped")!=null && request.getParameter("hijhuesped").equals("n")?"selected='selected'":""%>" checked="checked"/>
			No:<input type="radio" name="hijhuesped" value="n" value="<%=request.getParameter("hijhuesped")!=null?request.getParameter("hijhuesped"):""%>" />
<p>Tienen habilidades para la Natación?: 
			Si:<input type="radio" name="nathuesped" value="s" value="<%=request.getParameter("nathuesped")!=null && request.getParameter("nathuesped").equals("n")?"selected='selected'":""%>" checked="checked"/>
			No:<input type="radio" name="nathuesped" value="n" value="<%=request.getParameter("nathuesped")!=null?request.getParameter("nathuesped"):""%>" />
<p>Reportado a Datacredito?: 
			Si:<input type="radio" name="dathuesped" value="s" value="<%=request.getParameter("dathuesped")!=null && request.getParameter("dathuesped").equals("n")?"selected='selected'":""%>" checked="checked"/>
			No:<input type="radio" name="dathuesped" value="n" value="<%=request.getParameter("dathuesped")!=null?request.getParameter("dathuesped"):""%>" />
<p>Capacidad Economica: <input type="text" name="caphuesped" value="<%=request.getParameter("caphuesped")!=null?request.getParameter("caphuesped"):""%>"  />
<p>Alguna Enfermedad?: 
			Si:<input type="radio" name="fhuesped" value="s" value="<%=request.getParameter("enfhuesped")!=null && request.getParameter("enfhuesped").equals("n")?"selected='selected'":""%>" checked="checked"/>
			No:<input type="radio" name="fhuesped" value="n" value="<%=request.getParameter("enfhuesped")!=null?request.getParameter("enfhuesped"):""%>" />
<p><input type="submit" name="Ingresar" value="Ingresar Reserva"/>
</form>
</body>
</html>