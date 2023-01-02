package dam2.dii.p12.controlUsuarios;

import java.util.ArrayList;
import java.util.Arrays;

public class ContactoDAO {
	private static final ArrayList<Contacto> USUARIOS_BD = new ArrayList<Contacto>();

	public ContactoDAO() {
		if (USUARIOS_BD.isEmpty()) {
			crearNuevoUsuario(new Contacto("Laura", "Munoz", "laura@gmail.com", "000000", "Estudia DAM"));
			crearNuevoUsuario(new Contacto("Noemi", "Romero", "noemi@gmail.com", "111111", "Estudia Bachiller"));

		}
	}

	public ArrayList<Contacto> devolverListaUsuarios() {

		return USUARIOS_BD;
	}

	public Contacto crearNuevoUsuario(Contacto nuevoUsuario) {
		nuevoUsuario.setId(obtenerID());
		USUARIOS_BD.add(nuevoUsuario);
		return nuevoUsuario;
	}

	private int obtenerID() {
		int idUusuario = 0;
		for (int i = 0; i < USUARIOS_BD.size(); i++) {
			Contacto userActual = USUARIOS_BD.get(i);
			if (userActual.getId() > idUusuario) {
				idUusuario = userActual.getId();
			}
		}
		idUusuario++;
		return idUusuario;
	}

	public boolean eliminarUsuarioPorID(int id) {
		for (int i = 0; i < USUARIOS_BD.size(); i++) {
			Contacto userActual = USUARIOS_BD.get(i);
			if (userActual.getId() == id) {
				USUARIOS_BD.remove(i);
				return true;
			}
		}
		return false;

	}

	public Contacto devolverUsuarioConID(int id) {
		for (int i = 0; i < USUARIOS_BD.size(); i++) {
			Contacto userActual = USUARIOS_BD.get(i);
			if (userActual.getId() == id) {
				return userActual;
			}
		}

		return new Contacto();
	}

	public boolean actualizarContacto(Contacto contacto) {
		for (int i = 0; i < USUARIOS_BD.size(); i++) {
			Contacto userActual = USUARIOS_BD.get(i);
			if (userActual.getId() == contacto.getId()) {
				userActual.setNombre(contacto.getNombre());
				userActual.setApellidos(contacto.getApellidos());
				userActual.setMail(contacto.getMail());
				userActual.setNumero(contacto.getNumero());
				userActual.setComentarios(contacto.getComentarios());

				return true;
			}
		}
		return false;
	}


}
