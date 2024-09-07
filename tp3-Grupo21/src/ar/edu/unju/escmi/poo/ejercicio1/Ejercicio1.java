package ar.edu.unju.escmi.poo.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<Persona> personas= new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int opcion; 
		do {
			
			System.out.println("Menú de opciones:");
            System.out.println("1. Crear objeto con Constructor por defecto.");
            System.out.println("2. Crear objeto con Constructor parametrizado.");
            System.out.println("3. Crear objeto con Constructor (dni, nombre, fecha de nacimiento).");
            System.out.println("4. Mostrar personas.");
            System.out.println("5. Salir.");
            System.out.print("Ingrese una opción: ");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1:
                    Persona personaPorDefecto = new Persona();
                    System.out.print("Ingrese DNI: ");
                    personaPorDefecto.setDni(scan.nextLine());
                    System.out.print("Ingrese nombre: ");
                    personaPorDefecto.setNombre(scan.nextLine());
                    System.out.print("Ingrese fecha de nacimiento (aaaa-mm-dd): ");
                    personaPorDefecto.setFechanac(LocalDate.parse(scan.nextLine()));
                    System.out.print("Ingrese domicilio: ");
                    personaPorDefecto.setDomicilio(scan.nextLine());
                    System.out.print("Ingrese provincia: ");
                    personaPorDefecto.setProvi(scan.nextLine());
                    personas.add(personaPorDefecto);
                    break;
                case 2:
                    System.out.print("Ingrese DNI: ");
                    String dni = scan.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = scan.nextLine();
                    System.out.print("Ingrese fecha de nacimiento (aaaa-mm-dd): ");
                    LocalDate fechanac = LocalDate.parse(scan.nextLine());
                    System.out.print("Ingrese domicilio: ");
                    String domicilio = scan.nextLine();
                    System.out.print("Ingrese provincia: ");
                    String provincia = scan.nextLine();
                    Persona personaParametrizada = new Persona(dni, nombre, fechanac, domicilio, provincia);
                    personas.add(personaParametrizada);
                    break;
                case 3:
                    System.out.print("Ingrese DNI: ");
                    String dniSimple = scan.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombreSimple = scan.nextLine();
                    System.out.print("Ingrese fecha de nacimiento (aaaa-mm-dd): ");
                    LocalDate fechaNacimientoSimple = LocalDate.parse(scan.nextLine());
                    Persona personaSimple = new Persona(dniSimple, nombreSimple, fechaNacimientoSimple);
                    personas.add(personaSimple);
                    break;
                case 4:
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas registradas.");
                    } else {
                        for (Persona p : personas) {
                        	
                            p.mostrarDatos();
                            System.out.println("------------------------");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);
        scan.close();

	}

}
