package ar.edu.unju.escmi.poo.ejercicio5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Producto> productos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1 – Alta de producto");
            System.out.println("2 – Mostrar productos");
            System.out.println("3 – Incrementar precio de productos");
            System.out.println("4 – Ordenar productos");
            System.out.println("5 – Filtrar productos por precio");
            System.out.println("6 – Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el descripcion del producto: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = sc.nextDouble();
                    Producto aux = new Producto(nombre, descripcion, precio);
                    productos.add(aux);
                    
                    break;

                case 2:
                    
                    System.out.println("Lista de productos:");
                    productos.stream().forEach(producto -> 
                        System.out.println("Codigo del producto: " + producto.getCodigo() + "\n" + "Descripcion: " + producto.getDescripcion() + "\n" + "Precio: $" + producto.getPrecio() + "\n" + "Descripcion: " + producto.getDescripcion())
                    );
                    System.out.println();
                    break;

                case 3:
                    
                	 double incremento = 300.00;
                     productos = productos.stream()
                             .map(producto -> new Producto(producto.getCodigo(),producto.getDescripcion(), producto.getPrecio() + incremento))
                             .collect(Collectors.toCollection(ArrayList::new));
                     System.out.println("El precio de todos los productos ha sido incrementado en $" + incremento + ".\n");
                     break;

                case 4:
                	productos.sort(Comparator.comparing(Producto::getPrecio));
                    System.out.println("Productos ordenados por precio (ascendente).\n");
                    break;

                case 5:
                	System.out.print("Ingrese el precio mínimo para filtrar: ");
                    double precioMinimo = sc.nextDouble();
                    System.out.println("Productos con precio mayor o igual a $" + precioMinimo + ":");
                    productos.stream()
                            .filter(producto -> producto.getPrecio() >= precioMinimo)
                            .forEach(producto -> 
                                System.out.println("Código: " + producto.getCodigo() + " - Precio: $" + producto.getPrecio())
                            );
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Fin del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta. \n");
            }
        } while (opcion != 6);
        sc.close();
	}

}
