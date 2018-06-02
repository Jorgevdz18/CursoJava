package com.jorge.clase2;

import java.util.Scanner;

/**
 * 
 * @author Jorge Valadez
 *
 */
public class IfStatementEx1 {
	
	//Metodo main. corre la aplicacion
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		int val1 = scan.nextInt();
		
		System.out.println("Escribe otro numero");
		int val2 = scan.nextInt();
		if (val1 == val2) {
			System.out.println(val1 + " Es igual a " + val2);
		}if (val1 < val2){
			System.out.println(val1 + " Es menor a " + val2);
		}if (val1 > val2){
			System.out.println(val1 + " Es mayor a " + val2);
		}if (val1 <= val2){
			System.out.println(val1 + " Es menor igual que " + val2);
		}if (val1 >= val2){
			System.out.println(val1 + " Es mayor igual que " + val2);
		}if (val1 != val2){
			System.out.println(val1 + " Es diferente de " + val2);
	}
		
		
		//Sentecias if evaluan una condicion
		/*
		 * if (condicion){
		 * print("string");
		 * Se ejecuta si la sentencia resulta verdadera
		 * }
		 * operadores de comparacion
		 * a == b igual que
		 * a > b menor que
		 * a < b mayor que 
		 * a <= b menor igual que
		 * a >= b mayor igual que
		 * a != b diferente de
		 * 
		 */
		
}

}

