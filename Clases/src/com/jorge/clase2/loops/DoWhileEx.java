package com.jorge.clase2.loops;

/**
 * 
 * @author Jorge Valadez
 *
 */

public class DoWhileEx {
	// Metodo main.corre la aplicacion
	public static void main(String[] args) {
		/*
		 * Bloque do-while primero ejecuta la sentencia y despues compara se ejecuta al
		 * menos una vez
		 */
		int i = 1;

		do {
			System.out.println(i);
			i++;
		} while (i <= 10);

	}

}
