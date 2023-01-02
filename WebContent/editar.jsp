<%@page import="dam2.dii.p12.controlUsuarios.Contacto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		Contacto persona = (Contacto) request.getAttribute("contacto");
		if (persona != null) {
	%>
	<div class="modal-dialog">
		<div class="modal-content">
			<form class="registro-form"
				action=" <%=request.getContextPath()%>/EditarContacto"
				method='POST'>

				<div class="modal-header">
					<h1 class="modal-title fs-5">Editar contacto</h1>

				</div>
				<div class="modal-body">

					<div class="mb-3">

						<input type="hidden" name="id" value="<%=persona.getId()%>">


						<label class="form-label">Nombre</label> <input type="text"
							name="nombre" id="nombre" class="form-control"
							value="<%=persona.getNombre()%>">

					</div>
					<div class="mb-3">
						<label class="form-label">Apellidos</label> <input type="text"
							name="apellidos" id="apellidos" class="form-control"
							value="<%=persona.getApellidos()%>">

					</div>
					<div class="mb-3">
						<label class="form-label">Email</label> <input type="email"
							name="correo" id="correo" class="form-control"
							value="<%=persona.getMail()%>">

					</div>
					<div class="mb-3">
						<label class="form-label">Telefono</label> <input type="number"
							name="telefono" id="telefono" class="form-control"
							value="<%=persona.getNumero()%>">

					</div>
					<div class="mb-3">
						<label class="form-label">Comentarios</label>
						<input type="text" name="comentario" id="comentario" class="form-control" value="<%=persona.getComentarios()%>">
					</div>


				</div>
				<div class="modal-footer">

					<input type="submit" class="submitBtn" value="Editar contacto">
				</div>

			</form>
			<%
				}
			%>
		</div>
	</div>

</body>
</html>