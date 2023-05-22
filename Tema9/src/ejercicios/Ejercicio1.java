package ejercicios;

import java.util.LinkedHashSet;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos el linkedhashset
		LinkedHashSet<Integer> numeros = new LinkedHashSet<Integer>();

		// Generamos 20 numeros aleatorios y los añadimos al linkedhashset
		for (int i = 0; i < 20; i++) {

			int num = (int) (Math.random() * 100 + 1);

			numeros.add(num);
		}

		// Mostramos los numero creados
		System.out.println(numeros);
	}
}
