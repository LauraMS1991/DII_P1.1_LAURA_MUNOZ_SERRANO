package dam2.dii.p12.controlUsuarios;

public class Contacto {
	private int id;
	private String nombre;
	private String apellidos;
	private String mail;
	private String numero;
	private String comentarios;

	public Contacto(int id, String nombre, String apellidos, String mail, String numero, String comentarios) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.mail = mail;
		this.numero = numero;
		this.comentarios = comentarios;
	}

	public Contacto(String nombre, String apellidos, String mail, String numero, String comentarios) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.mail = mail;
		this.numero = numero;
		this.comentarios = comentarios;
	}

	public Contacto() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
}
