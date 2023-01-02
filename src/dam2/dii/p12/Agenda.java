package dam2.dii.p12;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dam2.dii.p12.controlUsuarios.Contacto;

import dam2.dii.p12.controlUsuarios.ContactoDAO;

/**
 * Servlet implementation class Agenda
 */
@WebServlet("/Agenda")
public class Agenda extends HttpServlet {
	
	private ContactoDAO usuarioDAO ;	


	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Agenda() {
    	super();

    	usuarioDAO = new ContactoDAO();
    	
      // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    

    @Override

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	String paramID = request.getParameter("id");
    	if (paramID==null) {
        	ArrayList<Contacto>lista = usuarioDAO.devolverListaUsuarios();
        	

    		request.setAttribute("listaContactos", lista);
    		request.getRequestDispatcher("index.jsp").forward(request, response);
    	}
    	else {
    		int numeroID = Integer.parseInt(paramID);
    		Contacto llegadaUsuario = usuarioDAO.devolverUsuarioConID(numeroID);
    		
    		request.setAttribute("contacto", llegadaUsuario);
    		request.getRequestDispatcher("editar.jsp").forward(request, response);
    	}

		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		

		String nombre=request.getParameter("nombre");
		String apellidos=request.getParameter("apellidos");
		String correo=request.getParameter("correo");
		String telefono= request.getParameter("telefono");
		String comentario=request.getParameter("comentario"); 
		

		
		Contacto persona = new Contacto();
		
		persona.setNombre(nombre);
		persona.setApellidos(apellidos);
		persona.setMail(correo);
		persona.setNumero(telefono);
		persona.setComentarios(comentario);

		if (persona.getMail().length()>0) {
			usuarioDAO.crearNuevoUsuario(persona);
			

		}
		//comprobar gmail 
		//si mail esta bien hacer lo de abajo 

		else {
			request.setAttribute("contact", persona);		
		}
		request.setAttribute("listaContactos", usuarioDAO.devolverListaUsuarios());			
		request.getRequestDispatcher("index.jsp").forward(request, response);


}}