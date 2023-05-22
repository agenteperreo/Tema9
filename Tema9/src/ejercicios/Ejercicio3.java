package ejercicios;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio3 {
	
	public static void main(String[] args) {

		// Creamos el treeset
		TreeSet<String> palabras = new TreeSet<>();

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Variable
		String palabra;

		// Hacer mientras la palabra no sea fin
		do {

			// Pedimos la palabra al usuario
			System.out.println("Introduzca la palabra(fin para finalizar)");
			palabra = sc.nextLine();

			// Si la palabra no es fin
			if (!palabra.equals("fin")) {

				// Añdimos la palabra al treeset
				palabras.add(palabra);
			}

		} while (!palabra.equals("fin"));

		// Mostramos el hashset
		System.out.println(palabras);

		// Cerramos el escaner
		sc.close();
	}

}
