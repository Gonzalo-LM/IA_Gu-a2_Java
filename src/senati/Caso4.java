package senati;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Ingrese primer número: ");
		num1 = scn.nextInt();
		
		System.out.print("Ingrese segundo número: ");
		num2 = scn.nextInt();
		
		if (num1 < num2)
			System.out.println("El primer número es menor");
		
		else if (num2 < num1)
			System.out.println("El segundo número es menor");
		
		else if (num1 == num2)
			System.out.println("Los números ingresados son iguales");
	}
}
