package dam2.dii.p12;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dam2.dii.p12.controlUsuarios.ContactoDAO;

/**
 * Servlet implementation class EliminarContacto
 */
@WebServlet("/EliminarContacto")
public class EliminarContacto extends HttpServlet {

	private ContactoDAO usuarioDAO ;	
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarContacto() {
        super();
    	usuarioDAO = new ContactoDAO();

        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int numeroid = Integer.parseInt(request.getParameter("id"));
		usuarioDAO.eliminarUsuarioPorID( numeroid);

		request.setAttribute("listaContactos", usuarioDAO.devolverListaUsuarios());
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}



}

