package com.jorge.clase2;

/**
 * 
 * @author Jorge Valadez
 *Clase IfStatement
 */

public class IfStatement {
	
	//Metodo main. corre la aplicacion
	public static void main(String[] args) {
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
		 * a <= b menor e igual que
		 * a >= b mayor igual que
		 * a != b diferente de
		 * 
		 */
		System.out.println("If Statement");
		int val = 5;
		int val2 = 10;
		if (val == val2) {
			System.out.println(val + " Es igual a " + val2);
		}else if (val < val2){
			System.out.println(val + " Es menor a " + val2);
		}else if (val > val2){
			System.out.println(val + " Es mayor a " + val2);
			
		}
		/*
		 * Ternary operator
		 * result = condition ? true value : FalseValue
		 */
		System.out.println("Ternary operator"); 
		String str = (val > val2) ? "La condicion  es verdadera" : "La condicion es falsa";
			System.out.println(str);
		
	}

}
