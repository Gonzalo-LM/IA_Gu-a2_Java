package senati;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("Ingrese n�mero 1: ");
		n1 = scn.nextInt();
		
		System.out.print("Ingrese n�mero 1: ");
		n2 = scn.nextInt();
		
		System.out.print("Ingrese n�mero 1: ");
		n3 = scn.nextInt();
		
		String estado = "";
		
		if (n1 == n2 && n1 == n3)
			estado = "Los tres n�meros son iguales";
		else if (n1 > n2 && n1 > n3)
			estado = "El primer n�mero " + n1 + " es el mayor";
		else if (n2 > n1 && n2 > n3)
			estado = "El segundo n�mero " + n2 + " es el mayor";
		else
			estado = "El tercer n�mero " + n3 + " es el mayor";
		
		System.out.println("Resultado: " + estado);

	}

}
