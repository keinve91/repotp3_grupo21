package ar.edu.unju.escmi.poo.ejercicio1;
import java.time.LocalDate;
public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechanac;
	private String domicilio;
	private String provi;
	 //Constructor que es por defecto..
	public Persona() {}
	//Constructor con todos los parametros
	public Persona(String dni, String nombre, LocalDate fechanac, String domicilio, String provi) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechanac = fechanac;
		this.domicilio = domicilio;
		this.provi = provi;
	}
	//Constructor que inicializa en "JUJUY"
	public Persona(String dni, String nombre, LocalDate fechanac) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechanac = fechanac;
		this.provi = "Jujuy";
	}
	public int calcularEdad() {
	    LocalDate fechaActual = LocalDate.now();
	    int edad = fechaActual.getYear() - this.fechanac.getYear();

	    // Verificar si la persona aún no ha cumplido años en el año actual
	    if (fechaActual.getMonthValue() < this.fechanac.getMonthValue() ||
	        (fechaActual.getMonthValue() == this.fechanac.getMonthValue() && fechaActual.getDayOfMonth() < this.fechanac.getDayOfMonth())) {
	        edad--;
	    }

	    return edad;
	}
	 public boolean esMayor() {
	        return calcularEdad() >= 18;
	    }
	 public void mostrarDatos() {
	        System.out.println("DNI: " + dni);
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Fecha de Nacimiento: " + fechanac);
	        System.out.println("Domicilio: " + domicilio);
	        System.out.println("Provincia: " + provi);
	        System.out.println("Edad: " + calcularEdad());
	        if (esMayor()) {
	            System.out.println("La persona es mayor de edad.");
	        } else {
	            System.out.println("La persona no es mayor de edad.");
	        }
	    }
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechanac() {
		return fechanac;
	}
	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getProvi() {
		return provi;
	}
	public void setProvi(String provi) {
		this.provi = provi;
	}
	
}

