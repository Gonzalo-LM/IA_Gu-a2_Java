package senati;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print("Ingrese n�mero: ");
		numero = scn.nextInt();
		
		String estado = "N�mero es impar";
		
		if (numero % 2 == 0)
			estado = "N�mero es par";
		
		System.out.println("El n�mero " + numero + " es" + estado);
	}

}
