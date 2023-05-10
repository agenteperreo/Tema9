package ejercicios;

import java.util.LinkedHashSet;

public class Ejercicio1 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> numeros = new LinkedHashSet<Integer>();

		for (int i = 0; i < 20; i++) {

			int num = (int) (Math.random() * 100 + 1);

			numeros.add(num);
		}

		System.out.println(numeros);
	}
}
