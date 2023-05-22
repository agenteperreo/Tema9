package ejercicios;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Cremos ambos treemaps
		TreeMap<Integer, Integer> numeros = new TreeMap();
		TreeMap<Integer, Integer> estrellas = new TreeMap();

		// Numeros del euromillon
		int numero;

		// Numeros estrellas
		int estrella;

		// Variable para opcion del usuario
		String seguir = "";

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		do {

			// Pedimos los 5 numeros
			System.out.println("Introduzca 5 números");

			// Repetimos lo siguiente 5 veces
			for (int i = 0; i < 5; i++) {

				// Leemos el numero introducido
				numero = sc.nextInt();
				sc.nextLine();

				// Si el treemap de numeros contiene el numero
				if (numeros.containsKey(numero)) {

					// Reemplazamos por el valor siguiente
					numeros.replace(numero, numeros.get(numero) + 1);

					// Si no
				} else {
					// Añade el numero y le pone valor 1
					numeros.put(numero, 1);
				}
			}

			// Pedimos los dos numeros estrellas
			System.out.println("Introduzca 2 estrellas");
			for (int i = 0; i < 2; i++) {

				// Pedimos el numero
				estrella = sc.nextInt();
				sc.nextLine();

				// Si el numero se encuentra en el treemap
				if (estrellas.containsKey(estrella)) {

					// Reemplazamos con el siguiente numero
					estrellas.replace(estrella, estrellas.get(estrella) + 1);
				} else { // Si no
					// Lo añdimos con el valor 1
					estrellas.put(estrella, 1);
				}
			}

			// Mostramos los numeros y los estrellas
			System.out.println("Números: " + numeros);
			System.out.println("Estrellas: " + estrellas);
			
			// Preguntamos si quiere seguir
			System.out.println("¿Quiere seguir introduciendo números? (S/N)");
			seguir = sc.nextLine();
			
		} while (!seguir.equalsIgnoreCase("n")); // Fin del do/while
		
		// Mostramos mensaje de despedida
		System.out.println("Hasta pronto...");

		// Cerramos el escaner
		sc.close();
	}
}
