package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese nombre de alumno: ");
		String nombre = scn.nextLine();
		
		System.out.print("Ingrese nota 1: ");
		int nota1 = scn.nextInt();
		
		System.out.print("Ingrese nota 2: ");
		int nota2 = scn.nextInt();
		
		System.out.print("Ingrese asistencia [1-12]: ");
		int num_asistencia = scn.nextInt();
		
		float promedio = nota1 * 0.3f + nota2 * 0.7f;
		float porc_asistencia = num_asistencia / 12;
		
		String estado = "Desaprobado";
		
		if (promedio >= 13 && porc_asistencia >= 0.7)
			estado = "Aprobado";
		
		System.out.println("\nResultados");
		System.out.println("============");
		System.out.println("Alumno: " + nombre);
		System.out.println("Promedio: " + promedio);
		System.out.println("Asistencia: " + porc_asistencia * 100 + "%");
		System.out.println("Estado: " + estado);
	}

}
