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

<a href="usuarios/usuarios.jsp">Administrador de Usuarios</a>

</body>
</html>