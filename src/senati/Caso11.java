package senati;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese número [1-7]: ");
		int num_dia = scn.nextInt();
		
		String nombre_dia = "";
		
		switch (num_dia) {
		case 1 :
			nombre_dia = "Lunes";
			break;
		case 2 :
			nombre_dia = "Martes";
			break;
		case 3 :
			nombre_dia = "Miércoles";
			break;
		case 4 :
			nombre_dia = "Jueves";
			break;
		case 5 :
			nombre_dia = "Viernes";
			break;
		case 6 :
			nombre_dia = "Sábado";
			break;
		case 7 :
			nombre_dia = "Domingo";
			break;
		default:
			nombre_dia = "Día desconocido";
		}
		
		System.out.println("\nResultados");
		System.out.println("============");
		System.out.println("Día de la semana: " + nombre_dia);
	}

}
