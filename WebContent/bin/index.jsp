<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="dam2.dii.p12.controlUsuarios.Contacto"%>
<%@page import="dam2.dii.p12.Agenda"%>
<%@page import="dam2.dii.p12.EliminarContacto"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>


	<%
		String nombre = "";
		String apellidos = "";
		String correo = "";
		String numero = "";
		String comentarios = "";
		//comprobar si llega atributo contact
		//si llega rellenando 
		Contacto persona = (Contacto) request.getAttribute("contact");
		if (persona != null) {
			nombre = persona.getNombre();
		}
	%>

	<div class="modal-dialog">
		<div class="modal-content">
			<form class="registro-form"
				action="<%=request.getContextPath()%>/Agenda" method='POST'>
				<div class="modal-header">
					<h1 class="modal-title fs-5">Agenda</h1>

				</div>
				<div class="modal-body">

					<div class="mb-3">
						<label class="form-label">Nombre</label> <input type="text"
							name="nombre" class="form-control" required>

					</div>
					<div class="mb-3">
						<label class="form-label">Apellidos</label> <input type="text"
							name="apellidos" class="form-control" required>

					</div>
					<div class="mb-3">
						<label class="form-label">Email</label> <input type="text"
							name="correo" class="form-control" required>

					</div>
					<div class="mb-3">
						<label class="form-label">Telefono</label> <input type="number"
							name="telefono" class="form-control" required>

					</div>
					<div class="mb-3">
						<label class="form-label">Comentarios</label>
						<textarea class="form-control" name="comentario" required></textarea>
					</div>


				</div>
				<div class="modal-footer">
					<a href="Agenda">Cargar Contactos</a> <input type="submit"
						class="btn btn-primary" value="Registrar contacto">

				</div>
			</form>
		</div>
	</div>

	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h1 class="modal-title fs-5">Lista de Contactos</h1>
			</div>
			<%
				ArrayList<Contacto> lista = (ArrayList<Contacto>) request.getAttribute("listaContactos");

				if (lista != null) {
					for (int i = 0; i < lista.size(); i++) {
			%>
			<div class="modal-body">

				<div class="card">
					<div class="card-body">
						<%
							out.println("<h5>" + lista.get(i).getNombre() + "</h5>");
									out.println("<h6>" + lista.get(i).getApellidos() + "</h6>");
									out.println("<h6>" + lista.get(i).getMail() + "</h6>");
									out.println("<h6>" + lista.get(i).getNumero() + "</h6>");
									out.println("<h6>" + lista.get(i).getComentarios() + "</h6>");

									out.println("<a href=eliminar.jsp?id=" + lista.get(i).getId() + "&" + "nombre="
											+ lista.get(i).getNombre() + ">Eliminar</a>");

									out.println("<a href=Agenda?id=" + lista.get(i).getId() + ">Editar</a>");
						%>
					</div>
				</div>
				</div>
				<%
					}
					}
				%>



			</div>
		</div>
</body>
</html>