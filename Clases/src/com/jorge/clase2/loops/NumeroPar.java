package com.jorge.clase2.loops;
/**
 * 
 * @author Jorge Valadez
 *
 */

public class NumeroPar {
	//Metodo main. corre la aplicacion
	
	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 100){
			if (i % 2 == 0) {
			System.out.println(i);
			}
			i ++;
		}
		
	}
}
