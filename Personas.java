package ejercicioPrimerCorte;

public class Personas {
	private int id;
	private String nombre;
	private String telefono;
	private String mail;
	
	public Personas(int id,String nombre,String telefono,String mail) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.mail = mail;		
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	};
	
	public String  mostrarDatos(){
		String mensaje;
		mensaje = String.format("Id: %d.\nNombre: %s.\nTelefono: %s\nE-mail: %s",id,nombre,telefono,mail);
		return mensaje;
	}


}
