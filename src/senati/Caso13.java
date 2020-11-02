package senati;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float num1, num2;
		int op;
		String oper = "";
		
		System.out.print("Primer número: ");
		num1 = scn.nextFloat();
		
		System.out.print("Segundo número: ");
		num2 = scn.nextFloat();
		
		System.out.print("Operación [1-6]: ");
		op = scn.nextInt();
		
		float operacion = 0;
		
		switch (op) {
		case 1:
			oper = "Suma";
			operacion = num1 + num2; break;
		case 2:
			oper = "Resta";
			operacion = num1 - num2; break;
		case 3:
			oper ="Multiplicación";
			operacion = num1 * num2; break;
		case 4:
			oper = "División";
			if (num2 != 0)
				operacion = num1 / num2;
			else
				oper = "No es posible dividir entre 0"; break;
		case 5:
			oper = "Resto Entero";
			if (num2 != 0)
				operacion = num1 % num2;
			else
				oper = "No es posible hallar el resto entero"; break;	
		case 6:
			oper = "Promedio";
			operacion = (num1 + num2) / 2; break;
		default:
			oper = "No hay operación por realizar";
			operacion = 0;
		}
		
		System.out.println("----------------");
		System.out.println("---Resultados---");
		System.out.println("----------------");
		System.out.println("Número 1: " + num1);
		System.out.println("Número 2: " + num2);
		System.out.println("Operación: " + oper);
		System.out.println("Resultado: " + operacion);
	}
}
