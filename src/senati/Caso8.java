package senati;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int nota; 
		String estado = "";
		
		System.out.print("Ingrese nota: ");
		nota = scn.nextInt();
		
		if (nota >= 0 && nota <= 7)
			estado = "Sin Palabras";
		else if (nota >= 8 && nota <= 10)
			estado = "Malo";
		else if (nota >= 11 && nota <= 14)
			estado = "Regular";
		else if (nota >= 15 && nota <= 17)
			estado = "Notable";
		else if (nota >= 18 && nota <= 20)
			estado = "Excelente";
		
		System.out.println("Estado obtenido: " + estado);
	}

}
