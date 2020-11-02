package senati;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("Ingrese número 1: ");
		n1 = scn.nextInt();
		
		System.out.print("Ingrese número 1: ");
		n2 = scn.nextInt();
		
		System.out.print("Ingrese número 1: ");
		n3 = scn.nextInt();
		
		String estado = "";
		
		if (n1 == n2 && n1 == n3)
			estado = "Los tres números son iguales";
		else if (n1 > n2 && n1 > n3)
			estado = "El primer número " + n1 + " es el mayor";
		else if (n2 > n1 && n2 > n3)
			estado = "El segundo número " + n2 + " es el mayor";
		else
			estado = "El tercer número " + n3 + " es el mayor";
		
		System.out.println("Resultado: " + estado);

	}

}
