package ejercicioPrimerCorte;

import java.util.ArrayList;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Personas> personas = new ArrayList<Personas>();	
		ArrayList<Organizacion>organizaciones = new ArrayList<Organizacion>();
		ArrayList<Negocio>negocios = new ArrayList<Negocio>();
		ArrayList<Actividades>actividades = new ArrayList<Actividades>();
		int opcion = 0;
		int guardar=0;
		String nombrePersona ="";		
		do{
			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");
			System.out.println("Software de Gestion :D\n\n");
			System.out.println(
					"1)Registrar.\n" +
					"2)Consultar.\n" +
					"3)Modificar.");
			System.out.printf("Ingrese su opcion: ");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:	
				int opcion2=0;
				do{
					System.out.println("----------------------------------------");
					System.out.println("¿Que desea Registrar?\n\n");
					System.out.println(
							"1)Persona.\n" +
							"2)Organización.\n" +
							"3)Negocio.\n" +
							"4)Actividad.\n" +
							"5)Volver.");
					System.out.printf("Ingrese su opcion: ");
					opcion2 = entrada.nextInt();
					switch (opcion2) {					
					case 1:
						guardar=0;
						do{				
							System.out.println("\n\nIngrese los siguientes datos:");
							System.out.printf("ID: ");
							int id = entrada.nextInt();	
							entrada.nextLine();
							System.out.printf("Nombre: ");						
							String nombre = entrada.nextLine();						
							System.out.printf("Telefono: ");
							String tel = entrada.nextLine();						
							System.out.printf("E-mail: ");
							String mail = entrada.nextLine();						
							System.out.println("¿Quiere guardar los datos?");
							System.out.println("1)si\n2)no");
							guardar = entrada.nextInt();
							switch (guardar) {
							case 1:
								personas.add(new Personas(id,nombre,tel,mail));
								guardar =2;
								break;
							case 2:
								guardar = 2;
								break;
							default:
								break;
							}
						}while (guardar != 2);
						break;
					case 2:
						guardar=0;
						do{				
							System.out.println("\n\nIngrese los siguientes datos:");
							System.out.printf("ID: ");
							int id = entrada.nextInt();	
							entrada.nextLine();
							System.out.printf("Nombre: ");						
							String nombre = entrada.nextLine();	
							System.out.printf("Direccion: ");
							String direccion = entrada.nextLine();
							System.out.printf("Telefono: ");
							String tel = entrada.nextLine();
							System.out.println("¿Quiere guardar los datos?");
							System.out.println("1)si\n2)no");
							guardar = entrada.nextInt();
							switch (guardar) {
							case 1:
								organizaciones.add(new Organizacion(id,nombre,direccion,tel));
								guardar =2;
								break;
							case 2:
								guardar = 2;
								break;
							default:
								break;
							}
						}while (guardar != 2);
						break;
					case 3:
						guardar=0;
						do{				
							System.out.println("\n\nIngrese los siguientes datos:");
							System.out.printf("ID: ");
							int id = entrada.nextInt();	
							entrada.nextLine();
							System.out.printf("Titulo: ");						
							String titulo = entrada.nextLine();						
							System.out.printf("Descripcion: ");
							String descripccion= entrada.nextLine();
							System.out.println("--------------------------------");
							System.out.println("Quiere Elegir una persona: ");
							System.out.println("1)si\n2)no");
							guardar = entrada.nextInt();
							System.out.println("----------------------------------");
							if(guardar ==  1){
								if(personas.isEmpty()==true){
									System.out.println("no hay personas creadas. no se le asignnara nombre");
								}
								else{
									int cont=1;
									for (Personas i : personas) {										
										System.out.println(cont+")"+i.getNombre());
										cont++;
									}
									System.out.println("Eliga la persona: ");
									int opcionperso= entrada.nextInt();
									nombrePersona = personas.get((opcionperso-1)).getNombre();	
								}															
							}else
								nombrePersona = "";														
							System.out.printf("valor: ");
							double valor = entrada.nextDouble();	
							entrada.nextLine();
							System.out.println("Quiere Elegir una Organizacion: ");
							System.out.println("1)si\n2)no");
							guardar = entrada.nextInt();
							entrada.nextLine();
							System.out.println("----------------------------------");
							String nombreOrganizacion="";
							if(guardar ==  1){
								if(organizaciones.isEmpty()==true){
									System.out.println("no hay organizaciones creadas. no se le asignnara organizacion");
								}
								else{
									int cont =1;
									for (Organizacion i : organizaciones) {
									System.out.println(cont+")"+i.getNombre());
									cont++;
								}
								System.out.println("Eliga la organizacion: ");
								int opcionperso= entrada.nextInt();
								nombreOrganizacion = organizaciones.get((opcionperso-1)).getNombre();
								}
							}else
								nombreOrganizacion = "";	
							entrada.nextLine();
							System.out.printf("Fecha de cierre: ");
							String fechaCierre = entrada.nextLine();
							System.out.printf("Estado: ");
							String estado = entrada.nextLine();
							System.out.println("¿Quiere guardar los datos?");
							System.out.println("1)si\n2)no");
							guardar = entrada.nextInt();
							switch (guardar) {
							case 1:
								negocios.add(new Negocio(id,titulo,descripccion,nombreOrganizacion,valor,
										nombrePersona,fechaCierre,estado));
								guardar =2;
								break;
							case 2:
								guardar = 2;
								break;
							default:
								break;
							}
						}while (guardar != 2);
						break;
					case 4:
						guardar=0;
						do{				
							System.out.println("\n\nIngrese los siguientes datos:");
							System.out.printf("ID: ");
							int id = entrada.nextInt();	
							entrada.nextLine();												
							System.out.printf("Descripcion: ");
							String descripccion= entrada.nextLine();
							System.out.printf("Tipo: ");						
							String tipo= entrada.nextLine();
							System.out.printf("Fecha: ");						
							String fecha= entrada.nextLine();
							System.out.printf("hora: ");						
							String hora= entrada.nextLine();
							System.out.printf("Duracion: ");						
							String duracion= entrada.nextLine();
							System.out.println("--------------------------------");
							System.out.println("Quiere Elegir una persona: ");
							System.out.println("1)si\n2)no");
							guardar = entrada.nextInt();
							System.out.println("----------------------------------");
							if(guardar ==  1){
								if(personas.isEmpty()==true){
									System.out.println("no hay personas creadas. no se le asignnara nombre");
								}
								else{
									int cont=1;
									for (Personas i : personas) {										
										System.out.println(cont+")"+i.getNombre());
										cont++;
									}
									System.out.println("Eliga la persona: ");
									int opcionperso= entrada.nextInt();
									nombrePersona = personas.get((opcionperso-1)).getNombre();	
								}															
							}else
								nombrePersona = "";														
							System.out.printf("valor: ");
							double valor = entrada.nextDouble();
							
							
							entrada.nextLine();
							System.out.println("Quiere Elegir una Organizacion: ");
							System.out.println("1)si\n2)no");
							guardar = entrada.nextInt();
							entrada.nextLine();
							System.out.println("----------------------------------");
							String nombreOrganizacion="";
							if(guardar ==  1){
								if(organizaciones.isEmpty()==true){
									System.out.println("no hay organizaciones creadas. no se le asignnara organizacion");
								}
								else{
									int cont =1;
									for (Organizacion i : organizaciones) {
									System.out.println(cont+")"+i.getNombre());
									cont++;
								}
								System.out.println("Eliga la organizacion: ");
								int opcionperso= entrada.nextInt();
								nombreOrganizacion = organizaciones.get((opcionperso-1)).getNombre();
								}
							}else
								nombreOrganizacion = "";	
							entrada.nextLine();
							
							System.out.println("Quiere Elegir un Negocio: ");
							System.out.println("1)si\n2)no");
							guardar = entrada.nextInt();
							entrada.nextLine();
							System.out.println("----------------------------------");
							String nombreNegocio="";
							if(guardar ==  1){
								if(negocios.isEmpty()==true){
									System.out.println("no hay organizaciones creadas. no se le asignnara organizacion");
								}
								else{
									int cont =1;
									for (Negocio i : negocios) {
									System.out.println(cont+")"+i.getTitulo());
									cont++;
								}
								System.out.println("Eliga la organizacion: ");
								int opcionperso= entrada.nextInt();
								nombreNegocio = negocios.get((opcionperso-1)).getTitulo();
								}
							}else
								nombreNegocio = "";	
							
							System.out.printf("Fecha de cierre: ");
							String fechaCierre = entrada.nextLine();
							System.out.printf("Estado: ");
							String estado = entrada.nextLine();
							System.out.println("¿Quiere guardar los datos?");
							System.out.println("1)si\n2)no");
							guardar = entrada.nextInt();
							switch (guardar) {
							case 1:
								actividades.add(new Actividades(id,descripccion,tipo,fecha,hora,duracion,
										nombrePersona,nombreOrganizacion,nombreNegocio));
								guardar =2;
								break;
							case 2:
								guardar = 2;
								break;
							default:
								break;
							}
						}while (guardar != 2);
						break;
					case 5:
						opcion = 5;
						break;
					default:
						System.out.println("\n!!Ingreso mal la opcion.¡¡¡\n\n");
						break;
					}
					
					
				}while(opcion2!=5);				
				break;
			case 2:
				opcion2=0;
				do{
					System.out.println("----------------------------------------");
					System.out.println("¿Que desea Consultar?\n\n");
					System.out.println(
							"1)Persona.\n" +
							"2)Organización.\n" +
							"3)Negocio.\n" +
							"4)Actividad.\n" +
							"5)Volver.");
					System.out.printf("Ingrese su opcion: ");
					opcion2 = entrada.nextInt();
					switch (opcion2) {
					case 1:
						opcion2 =0;
						do{
							System.out.println("----------------------------------------");
							System.out.println("Consulta personas:");
							System.out.println(
									"1)Ver todo\n" +									
									"2)Volver.");
							System.out.printf("Ingrese su opcion: ");
							opcion2 = entrada.nextInt();
							switch (opcion2) {
							case 1:
								System.out.println("----------------------------------------");
								System.out.println("Registros: ");
								for (Personas i : personas) {									
									System.out.println(i.mostrarDatos()); 
									System.out.println("");									
								}	
								opcion2 = 2;
								break;
							case 2:
								opcion2 = 2;
								break;

							default:
								break;
							}
							
						}while(opcion2 != 2);
						break;						
					case 2:
						opcion2 =0;
						do{
							System.out.println("----------------------------------------");
							System.out.println("Consulta Organizacion:");
							System.out.println(
									"1)Ver todo\n" +									
									"2)Volver.");
							System.out.printf("Ingrese su opcion: ");
							opcion2 = entrada.nextInt();
							switch (opcion2) {
							case 1:
								System.out.println("----------------------------------------");
								System.out.println("Registros: ");
								for (Organizacion i : organizaciones) {									
									System.out.println(i.mostrarDatos()); 
									System.out.println("");									
								}	
								opcion2 = 2;
								break;
							case 2:
								opcion2 = 2;
								break;

							default:
								break;
							}
							
						}while(opcion2 != 2);
						break;
					case 3:
						opcion2 =0;
						do{
							System.out.println("----------------------------------------");
							System.out.println("Consulta Negocio:");
							System.out.println(
									"1)Ver todo\n" +									
									"2)Volver.");
							System.out.printf("Ingrese su opcion: ");
							opcion2 = entrada.nextInt();
							switch (opcion2) {
							case 1:
								System.out.println("----------------------------------------");
								System.out.println("Registros: ");
								for (Negocio i : negocios) {									
									System.out.println(i.mostrarDatos()); 
									System.out.println("");									
								}	
								opcion2 = 2;
								break;
							case 2:
								opcion2 = 2;
								break;

							default:
								break;
							}
							
						}while(opcion2 != 2);
						break;
					case 4:
						opcion2 =0;
						do{
							System.out.println("----------------------------------------");
							System.out.println("Consulta Actividades:");
							System.out.println(
									"1)Ver todo\n" +									
									"2)Volver.");
							System.out.printf("Ingrese su opcion: ");
							opcion2 = entrada.nextInt();
							switch (opcion2) {
							case 1:
								System.out.println("----------------------------------------");
								System.out.println("Registros: ");
								for (Actividades i : actividades) {									
									System.out.println(i.mostrarDatos()); 
									System.out.println("");									
								}	
								opcion2 = 2;
								break;
							case 2:
								opcion2 = 2;
								break;

							default:
								break;
							}
							
						}while(opcion2 != 2);
						break;
					case 5:
						opcion = 5;
						break;
					default:
						System.out.println("\n!!Ingreso mal la opcion.¡¡¡\n\n");
						break;
					}					
				}while(opcion2!=5);
				break;
			case 3:
				opcion2=0;
				do{
					System.out.println("----------------------------------------");
					System.out.println("¿Que desea Modificar?\n\n");
					System.out.println(
							"1)Persona.\n" +
							"2)Organización.\n" +
							"3)Negocio.\n" +
							"4)Actividad.\n" +
							"5)Volver.");
					System.out.printf("Ingrese su opcion: ");
					opcion2 = entrada.nextInt();
					int id ;
					int cont=0;
					switch (opcion2) {
					case 1:			
						System.out.println("---------------------------------------");
						System.out.printf("Digite el Id de la persona: ");
						id = entrada.nextInt();
						cont=0;
						for (Personas i : personas) {
							if (i.getId() == id){
								do{
									System.out.println("-----------------------------");
									System.out.println("Que Desea modificar");
									System.out.println(
										"1)Nombre.\n" +
										"2)Telefono.\n" +
										"3)email.\n" +
										"4)volver.\n");
									System.out.printf("Ingrese su opcion: ");
									opcion2= entrada.nextInt();
									entrada.nextLine();
									switch (opcion2) {
									case 1:		
										System.out.printf("Nombre nuevo: ");
										String nombre= entrada.nextLine();
										i.setNombre(nombre);
										break;
									case 2:
										System.out.printf("Telfono nuevo: ");
										String telefono = entrada.nextLine();
										i.setTelefono(telefono);
										break;
									case 3:
										System.out.printf("Email nuevo: ");
										String mail = entrada.nextLine();
										i.setMail(mail);
										break;
									case 4:
										opcion = 4;
										break;								
									default:
										break;
								}
								}while(opcion != 4);
								cont = 1;
								break;								
							}							
						}
						if(cont==0){
							System.out.println("No se encontro la busqueda");								
						}						
						break;
					case 2:
						System.out.println("---------------------------------------");
						System.out.printf("Digite el Id de la Organizacion: ");
						id = entrada.nextInt();
						cont=0;
						for (Organizacion i : organizaciones) {
							if (i.getId() == id){
								do{
									System.out.println("-----------------------------");
									System.out.println("Que Desea modificar");
									System.out.println(
										"1)Nombre.\n" +
										"2)Direccion.\n" +
										"3)Telefono.\n" +
										"4)volver.\n");
									System.out.printf("Ingrese su opcion: ");
									opcion2= entrada.nextInt();
									entrada.nextLine();
									switch (opcion2) {
									case 1:		
										System.out.printf("Nombre nuevo: ");
										String nombre= entrada.nextLine();
										i.setNombre(nombre);
										break;
									case 2:
										System.out.printf("Direccion nuevo: ");
										String direccion= entrada.nextLine();
										i.setDireccion(direccion);
										break;
									case 3:										
										System.out.printf("Telfono nuevo: ");
										String telefono = entrada.nextLine();
										i.setTelefono(telefono);
										break;
									case 4:
										opcion = 4;
										break;								
									default:
										break;
								}
								}while(opcion != 4);
								cont = 1;
								break;								
							}							
						}
						if(cont==0){
							System.out.println("No se encontro la busqueda");								
						}	
						break;
					case 3:
						System.out.println("---------------------------------------");
						System.out.printf("Digite el Id Del negocio: ");
						id = entrada.nextInt();
						cont=0;
						for (Negocio i : negocios) {
							if (i.getId() == id){
								do{
									System.out.println("-----------------------------");
									System.out.println("Que Desea modificar");
									System.out.println(
										"1)Titulo.\n" +
										"2)Descripcion.\n" +
										"3)valor.\n" +
										"4)Fecha de cierre.\n" +
										"5)Estado.\n " +
										"6)Volver\n");									
									System.out.printf("Ingrese su opcion: ");
									opcion2= entrada.nextInt();
									entrada.nextLine();
									switch (opcion2) {
									case 1:		
										System.out.printf("Titulo nuevo: ");
										String titulo= entrada.nextLine();
										i.setTitulo(titulo);
										break;
									case 2:
										System.out.printf("Descripcion nuevo: ");
										String descripcion= entrada.nextLine();
										i.setDescripcion(descripcion);
										break;
									case 3:										
										System.out.printf("Valor nuevo: ");
										double valor = entrada.nextDouble();
										i.setValor(valor);
										entrada.nextLine();
										break;
									case 4:
										System.out.printf("Fecha de Cierre nuevo: ");
										String fechaCierre= entrada.nextLine();
										i.setFechaCierre(fechaCierre);										
										break;	
									case 5:
										System.out.printf("Estado nuevo: ");
										String estado= entrada.nextLine();
										i.setEstado(estado);
										break;
									case 6:
										opcion = 6;
										break;
									default:
										break;
								}
								}while(opcion != 6);
								cont = 1;
								break;								
							}							
						}
						if(cont==0){
							System.out.println("No se encontro la busqueda");								
						}	
						break;
					case 4:
						System.out.println("---------------------------------------");
						System.out.printf("Digite el Id de la actividad: ");
						id = entrada.nextInt();
						cont=0;
						for (Actividades i : actividades) {
							if (i.getId() == id){
								do{
									System.out.println("-----------------------------");
									System.out.println("Que Desea modificar");
									System.out.println(
										"1)Descripcion.\n" +
										"2)Tipo.\n" +
										"3)Fecha.\n" +
										"4)Hora.\n" +
										"5)Duracion.\n " +
										"6)Volver\n");									
									System.out.printf("Ingrese su opcion: ");
									opcion2= entrada.nextInt();
									entrada.nextLine();
									switch (opcion2) {
									case 1:		
										System.out.printf("Descripcion nueva: ");
										String descripcion= entrada.nextLine();
										i.setDescripcion(descripcion);
										break;
									case 2:
										System.out.printf("Tipo nuevo: ");
										String tipo= entrada.nextLine();
										i.setTipo(tipo);
										break;
									case 3:										
										System.out.printf("Fecha nueva: ");
										String fecha= entrada.nextLine();
										i.setFecha(fecha);										
										break;
									case 4:
										System.out.printf("Hora nueva: ");
										String hora= entrada.nextLine();
										i.setHora(hora);										
										break;	
									case 5:
										System.out.printf("Duracion nueva: ");
										String duracion = entrada.nextLine();
										i.setDuracion(duracion);
										break;
									case 6:
										opcion = 6;
										break;
									default:
										break;
								}
								}while(opcion != 6);
								cont = 1;
								break;								
							}							
						}
						if(cont==0){
							System.out.println("No se encontro la busqueda");								
						}	
						
						break;
					case 5:
						opcion = 5;
						break;
					default:
						System.out.println("\n!!Ingreso mal la opcion.¡¡¡\n\n");
						break;
					}					
				}while(opcion2!=5);
				break;
			default:
				System.out.println("\n!!Ingreso mal la opcion.¡¡¡\n\n");
				break;
			}		
		}while(opcion != 30);
	

		
		
		
	}

}
