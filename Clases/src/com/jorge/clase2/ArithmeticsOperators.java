package com.jorge.clase2;

public class ArithmeticsOperators {
	
	//Metodo main. coore la aplicacion
	public static void main(String[] args) {
		/*
		 * Operadores basicos.
		 * 
		 * Suma: +
		 * Resta: -
		 * Multiplicacion: *
		 * Division: /
		 * Modulus: %
		 */
		int val1 = 10;
		int val2 = 5;
		int result;
		
		result = val1 + val2;System.out.println(result);
		result = val1 - val2;System.out.println(result);
		result = val1 * val2;System.out.println(result);
		result = val1 / val2;System.out.println(result);
		
		/*
		 * Operadores de incremento/decremento
		 * 
		 * incremento: ++
		 * decremento: --
		 */
		System.out.println("--------Operadores de incremento/decremento----");
		System.out.println("Incremento");
		int val3 = 10;
		System.out.println(val3++); //postincrement
		System.out.println(val3);
		
		val3 = 10;
		System.out.println(++val3); //preincrement
		System.out.println(val3);
		
		System.out.println("Decremento");
		val3 = 10;
		System.out.println(val3--); //postdecrement
		System.out.println(val3);
		
		val3 = 10;
		System.out.println(--val3); //predecrement
		System.out.println(val3);

		
		/*
		 * Operadores de asignacion
		 * 
		 * Suma: +=
		 * Resta: -=
		 * Multiplicacion: *=
		 * Division: /=
		 * Modulus: %=
		 */
		
		System.out.println("------Operadores de asignacion-----");
		int val4 = 100;
		val4 += 10;
		System.out.println(val4);
		
		val4 = 100;
		val4 -= 10;
		System.out.println(val4);
		
		val4 = 100;
		val4 *= 10;
		System.out.println(val4);
		
		val4 = 100;
		val4 /= 10;
		System.out.println(val4);
	}

}
