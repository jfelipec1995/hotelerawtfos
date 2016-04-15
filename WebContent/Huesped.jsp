<%@page import="java.util.ArrayList"%>
<%@page import="Clases.TipoPlan"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de huesped en ConfortWare</title>
</head>
<body>
<h1>Datos del huesped del hotel</h1>
<form action="HuespedControlador" method ="post">
<p>documento del huesped: <input type="text" name="dochuesped" value="<%=request.getParameter("dochuesped")!=null?request.getParameter("dochuesped"):""%>"  />
<p>nombre del huesped: <input type="text" name="nomhuesped" value="<%=request.getParameter("nomhuesped")!=null?request.getParameter("nomhuesped"):""%>"  />		
<p>apellidos del huesped: <input type="text" name="apehuesped" value="<%=request.getParameter("apehuesped")!=null?request.getParameter("apehuesped"):""%>"  />	
<p>Teléfono del huesped: <input type="text" name="telhuesped" value="<%=request.getParameter("telhuesped")!=null?request.getParameter("telhuesped"):""%>"  />	
<p>Correo del huesped: <input type="text" name="corrhuesped" value="<%=request.getParameter("corrhuesped")!=null?request.getParameter("corrhuesped"):""%>"  />
<p>Estado Civil del huesped: 
			Casado:<input type="radio" name="estadohuesped" value="c" value="<%=request.getParameter("estadohuesped")!=null && request.getParameter("estadohuesped").equals("n")?"selected='selected'":""%>" checked="checked"/>
			Soltero:<input type="radio" name="estadohuesped" value="s" value="<%=request.getParameter("estadohuesped")!=null?request.getParameter("estadohuesped"):""%>" />
			Divorciado:<input type="radio" name="estadohuesped" value="d" value="<%=request.getParameter("estadohuesped")!=null?request.getParameter("estadohuesped"):""%>" />
			Viudo:<input type="radio" name="estadohuesped" value="v" value="<%=request.getParameter("estadohuesped")!=null?request.getParameter("estadohuesped"):""%>" />
 <p> Seleccione habitación <select name="habitacion">
   <option value="0">...</option> 
   <option value="101">101</option> 
   <option value="102">102</option> 
   <option value="103">103</option>
   <option value="104">104</option> 
   <option value="105">105</option> 
   <option value="201">201</option> 
   <option value="202">202</option> 
   <option value="203">203</option> 
   <option value="204">204</option> 
   <option value="205">205</option>
   <option value="301">301</option> 
   <option value="302">302</option> 
   <option value="303">303</option>
   <option value="304">304</option> 
   <option value="305">305</option> 
   <option value="401">401</option> 
   <option value="402">402</option> 
   <option value="403">403</option> 
   <option value="404">404</option> 
   <option value="405">405</option>
</select>			
<p><input type="submit" name="Ingresar" value="Ingresar Huesped"/>			
</form>
</body>
</html>