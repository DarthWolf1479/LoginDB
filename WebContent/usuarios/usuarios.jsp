<%@page import="com.proyectoingenieriasoftware.jsps.servlets.vo.VOLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p style="font-weight: bold; font-size: 20px;">
Bienvenido al Sistema Académico : <%= ((VOLogin)session.getAttribute("usuarioLogueado")).getNombre() %>
</p>

<table>
<tr>
<td colspan="2" style="font-weight: bold; size: 20px;">Ingresa tu usuario y contraseña</td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue">Usuario : </td>
<td><input type="text" name="usuario" id="usuario"></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue">Password : </td>
<td><input type="password" name="password" id="password"></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue">Nombre(s) : </td>
<td><input type="text" name="nombre" id="nombre"></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue">Edad(s) : </td>
<td><input type="text" name="edad" id="edad"></td>
</tr>
<tr>
<td>
<td><input type="button" value="Guardar" style="font-weight: bold; size: 14px; color: blue"></td>
<td><input type="button" value="Actualizar" style="font-weight: bold; size: 14px; color: blue"></td>
<td><input type="button" value="Eliminar" style="font-weight: bold; size: 14px; color: blue"></td>
</td>
</tr>
</table>

</body>
</html>