package dam2.dii.p12;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dam2.dii.p12.controlUsuarios.Contacto;
import dam2.dii.p12.controlUsuarios.ContactoDAO;

/**
 * Servlet implementation class EdiccionContacto
 */
@WebServlet("/EditarContacto")
public class EditarContacto extends HttpServlet {
	private ContactoDAO usuarioDAO ;	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarContacto() {
        super();
    	usuarioDAO = new ContactoDAO();

        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String paramID = request.getParameter("id");
		int numeroID = Integer.parseInt(paramID);

		String nombre=request.getParameter("nombre");
		String apellidos=request.getParameter("apellidos");
		String correo=request.getParameter("correo");
		String telefono= request.getParameter("telefono");
		String comentario=request.getParameter("comentario"); 
		
		Contacto persona = new Contacto();
		
		persona.setId(numeroID);
		persona.setNombre(nombre);
		persona.setApellidos(apellidos);
		persona.setMail(correo);
		persona.setNumero(telefono);
		persona.setComentarios(comentario);
		
		usuarioDAO.actualizarContacto(persona);

		request.setAttribute("listaContactos", usuarioDAO.devolverListaUsuarios());
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

}

