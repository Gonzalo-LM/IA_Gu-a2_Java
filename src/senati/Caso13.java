package senati;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float num1, num2;
		int op;
		String oper = "";
		
		System.out.print("Primer n�mero: ");
		num1 = scn.nextFloat();
		
		System.out.print("Segundo n�mero: ");
		num2 = scn.nextFloat();
		
		System.out.print("Operaci�n [1-6]: ");
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
			oper ="Multiplicaci�n";
			operacion = num1 * num2; break;
		case 4:
			oper = "Divisi�n";
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
			oper = "No hay operaci�n por realizar";
			operacion = 0;
		}
		
		System.out.println("----------------");
		System.out.println("---Resultados---");
		System.out.println("----------------");
		System.out.println("N�mero 1: " + num1);
		System.out.println("N�mero 2: " + num2);
		System.out.println("Operaci�n: " + oper);
		System.out.println("Resultado: " + operacion);
	}
}
