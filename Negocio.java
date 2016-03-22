package ejercicioPrimerCorte;

public class Negocio {
	private int id;	
	private String titulo;
	private String descripcion;
	private String nombreOrganizacion;
	private double valor;
	private String nombrePersona;
	private String Estado;
	private String FechaCierre;
	public Negocio(int id, String titulo,String descripcion,String nombreOrganizacion,double valor,
			String nombrePersona,String fechaCierre,String estado) {
		this.id=  id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.nombreOrganizacion = nombreOrganizacion;
		this.valor = valor;
		this.nombrePersona = nombrePersona;
		FechaCierre = fechaCierre;
		Estado = estado;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombreOrganizacion() {
		return nombreOrganizacion;
	}
	public void setNombreOrganizacion(String nombreOrganizacion) {
		this.nombreOrganizacion = nombreOrganizacion;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getFechaCierre() {
		return FechaCierre;
	}
	public void setFechaCierre(String fechaCierre) {
		FechaCierre = fechaCierre;
	}
	
	public String  mostrarDatos(){
		String mensaje;
		mensaje = String.format("Id: %d.\nTitulo: %s.\nDescripción: %s\nNombre de organización: %s" +
				"\nValor: $ %.0f\n Nombre del Dueño: %s.\nFecha de cierre: %s.\nEstado: %s",id,
				titulo,descripcion,nombreOrganizacion,valor,nombrePersona,FechaCierre,Estado);
		return mensaje;
	}
	
	
	

}
