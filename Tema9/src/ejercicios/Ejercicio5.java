package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos el hashmap
		HashMap<String, Double> productos = new HashMap<>();

		// Variable para la opcion del usuario
		int opc;

		// Nombre del producto
		String nombre;

		// Precio del producto
		double precio;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Hacer mientras opc no sea 0
		do {

			// Mostramos el menu
			menu();

			// Preguntamos que quiere hacer
			System.out.print("¿Que deseas hacer?: ");
			opc = sc.nextInt();
			sc.nextLine();

			// En función del valor de opc
			switch (opc) {

			// Si opc es 1
			case 1 -> {// Dar de alta el producto

				// Pedimos el nombre del producto
				System.out.println("Introduzca el nombre del producto:");
				nombre = sc.nextLine();

				// Pedimos su precio
				System.out.println("Introduzca el precio del producto:");
				precio = sc.nextDouble();
				sc.nextLine();

				// Si ninguno de los productos en el hashmap contiene el nombre introducido
				if (!productos.containsKey(nombre)) {

					// Introducimos el nombre y el precio
					productos.put(nombre, precio);
				} else { // Si no
					// Mostramos que ya existe
					System.out.println("El producto ya existe");
				}

			}

			// Si opc es 2
			case 2 -> {// Baja de producto

				// Pedimos el nombre del producto
				System.out.println("Introduzca el nombre del producto:");
				nombre = sc.nextLine();

				// Si el hashmap contiene el nombre
				if (productos.containsKey(nombre)) {

					// Lo borramos del hashmap
					productos.remove(nombre);
				} else { // Si no
					// Mostramos que no existe el producto
					System.out.println("No existe el producto indicado.");
				}

			}

			// Si opc es 3
			case 3 -> { // Listar
				// Mostramos el hashmap
				System.out.println(productos);
			}

			// Si opc es 0
			case 0 -> { // Salir
				// Msotramos un mensaje de despedida
				System.out.println("Saliendo del sistema...");
			}

			// Si no
			default -> {
				// Mostramos que la opcion no es valida
				System.err.println("Opción no válida");
			}
			}

		} while (opc != 0); // Fin del do/while

		// Cerramoes el escaner
		sc.close();

	}

	/**
	 * Función para mostrar el menu
	 */
	private static void menu() {
		System.out.println("Seleccione una opción");
		System.out.println("1. Alta producto");
		System.out.println("2. Baja producto");
		System.out.println("3. Listar existencias");
		System.out.println("0. Salir");
	}
}
