package senati;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int sueldo;
		float imp1 = 0, imp2 = 0;
		
		System.out.print("Ingrese sueldo: ");
		sueldo = scn.nextInt();
		
		imp1 = 0.05f * sueldo;
		imp2 = 0.02f * sueldo;
		
		if (sueldo > 2800)
		    System.out.println("Impuesto calculado: " + imp1);
		
		else if (sueldo <= 2800)
			System.out.println("Impuesto calculado: " + imp2);
	}
}
