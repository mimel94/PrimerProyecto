package ejercicioPrimerCorte;

public class Actividades {
	private int id;
	private String descripcion;
	private String tipo;
	private String fecha;
	private String hora;
	private String duracion;
	private String nombrePersona;
	private String nombreOrganizacion;
	private String nombreNegocio;
	
	public Actividades(int id,String descripcion, String tipo, String fecha,String hora, String duracion, 
			String nombrePersona,String nombreOrganizacion, String nombreNegocio) {
		this.id = id;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.nombrePersona = nombrePersona;
		this.nombreOrganizacion = nombreOrganizacion;
		this.nombreNegocio = nombreNegocio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getNombreOrganizacion() {
		return nombreOrganizacion;
	}

	public void setNombreOrganizacion(String nombreOrganizacion) {
		this.nombreOrganizacion = nombreOrganizacion;
	}

	public String getNombreNegocio() {
		return nombreNegocio;
	}

	public void setNombreNegocio(String nombreNegocio) {
		this.nombreNegocio = nombreNegocio;
	}
	public String  mostrarDatos(){
		String mensaje;
		mensaje = String.format("Id: %d.\nDescripcion: %s.\nTipo: %s.\nFecha: %s.\nHora: %s.\n" +
				"Jefe: %s.\nOrganizacion:  %s.\nNegocio: %s.",id,descripcion,tipo,fecha,hora,nombrePersona,
				nombreOrganizacion,nombreNegocio);
		return mensaje;
	}
}
