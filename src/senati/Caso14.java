package senati;

import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String nombre, carrera, turno, car = "", tur = "";
		int monto;
		float dscto, total = 0, TD = 0;
		
		System.out.print("Ingrese nombre: ");
		nombre = scn.nextLine();
		
		System.out.print("Ingrese carrera [DS, RC, DG]: ");
		carrera = scn.nextLine();
		
		System.out.print("Ingrese turno [M, T, N]: ");
		turno = scn.nextLine();
		
		switch (carrera) {
		case "DS":
			car = "Desarrollo de Software";
			monto = 1500; break;
		case "RC":
			car = "Redes y Conectividad";
			monto = 1400; break;
		case "DG":
			car = "Diseño Gráfico";
			monto = 1300; break;
		default:
			monto = 0;
		}
		switch (turno) {
		case "M":
			tur = "Mañana";
			dscto = 0.1f * monto; break;
		case "T":
			tur = "Tarde";
			dscto = 0.2f * monto; break;
		case "N":
			tur = "Noche";
			dscto = 0.15f * monto; break;
		default:
			dscto = 0;
		}
		
		total = monto - dscto;
		TD = total / 3.33f;
		
		System.out.println("----------------");
		System.out.println("---Resultados---");
		System.out.println("----------------");
		System.out.println("Monto: " + monto);
		System.out.println("Turno: " + tur);
		System.out.println("Descuento: " +dscto);
		System.out.println("Total a pagar: " + total);
		System.out.println("Total en dólares: " + TD);
	}
}
