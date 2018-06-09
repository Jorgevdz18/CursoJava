package Poo;

/**
 * 
 * @author Jorge Valadez Methods Class
 *
 */

public class Methods {
	// Metodo main. corre la aplicacion
	public static void main(String[] args) {
		for(int i = 1; i <=10;i++) {
			System.out.println("-----Tabla del " + i + "-------");
			imprimirTabla(i);
		}
	}

	/*
	 * modificador de acceso - tipo - nombre del metodo(parametros){ }
	 */

	/**
	 * Metodo suma: regresa la suma e dos numeros.
	 * 
	 * @param num1
	 * @param num2
	 * @param num1
	 *            + 2
	 */
	public static void imprimirTabla(int num) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}
