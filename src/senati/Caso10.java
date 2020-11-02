package senati;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int ht = 0, th = 0, min = 0, imp = 0;
		float bono = 0, dscto, x;
		String nombre;
		
		System.out.print("Trabajador: ");
		nombre = scn.nextLine();
		
		System.out.print("Horas trabajadas: ");
		ht = scn.nextInt();
		
		System.out.print("Tarifa por horas: ");
		th = scn.nextInt();
		
		System.out.print("minutos de tardanza: ");
		min = scn.nextInt();
		
		imp = ht * th;
		
		if (ht > 60)
			bono = 0.13f * imp;
		else
			bono = 0.04f * imp;
		
		if (min > 15)
			dscto = 0.03f * imp;
		else
			dscto = 0;
		
		x = (ht * 100) / 70;
		
		System.out.println("----------------");
		System.out.println("---Resultados---");
		System.out.println("----------------");
		System.out.println("Trabajador: " + nombre);
		System.out.println("Horas trabajadas: " + ht);
		System.out.println("Tarifa por horas: " + th);
		System.out.println("Importe: " + imp);
		System.out.println("Bono: " + bono);
		System.out.println("Descuento: " + dscto);
		System.out.println("Meta alcanzada: " + x + "%");
	}
}
