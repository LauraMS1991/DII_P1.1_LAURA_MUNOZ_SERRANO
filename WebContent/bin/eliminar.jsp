<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="dam2.dii.p12.controlUsuarios.Contacto"%>
<%@page import="dam2.dii.p12.Agenda"%>
<%@page import="dam2.dii.p12.EliminarContacto"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<title>Eliminar contacto</title>
</head>
<body>
	<div class="modal-dialog">
		<div class="modal-content">
			<br>
			<div class="modal-body">
				<div class="mb-3">
					<h3 class="modal-title fs-5">
						¿Desea eliminar a 
						<%=request.getParameter("nombre")%>
						de su agenda de contactos?
					</h3>

    <div class="modal-footer">
					<a
						href="<%=request.getContextPath()%>/EliminarContacto?id=<%=request.getParameter("id")%>">Aceptar</a>
					<a href="<%=request.getContextPath()%>/index.jsp">Volver</a>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>