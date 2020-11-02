package senati;

import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String cliente, producto, for_p, prod = "", form = "", a = "";
		int cant;
		float precio, importe, dscto = 0, total;
		
		System.out.print("Ingrese cliente: ");
		cliente = scn.nextLine();
		
		System.out.print("Ingrese producto [TB, LT, MN, IM]: ");
		producto = scn.nextLine();
		
		System.out.print("Ingrese cantidad: ");
		cant = scn.nextInt();
		
		scn.nextLine();
		
		System.out.print("Ingrese forma de pago [C1/C2]: ");
		for_p = scn.nextLine();
		
		switch (producto) {
		case "TB":
			prod = "Tablet";
			precio = 350; break;
		case "LT":
			prod = "Laptop";
			precio = 2300; break;
		case "MN":
			prod = "Monitor";
			precio = 850; break;
		case "IM":
			prod = "Impresora";
			precio = 680; break;
		default:
			prod = "No se encuentra ese producto en la lista";
			precio = 0;
		}
		
		importe = precio * cant;
		
		switch (for_p) {
		case "C1":
			form = "Contado";
			a = "Descuento: ";
			dscto = 0.05f * importe;
			total = importe - dscto; break;
		case "C2":
			form = "Crédito";
			a = "Incremento: ";
			dscto = 0.12f * importe;
			total = importe + dscto; break;
		default:
			form = "No hay método de pago";
			dscto = 0;
			total = 0;
		}
		
		System.out.println("\nCliente: " + cliente);
		System.out.println("Producto: " + prod);
		System.out.println("Precio: " + precio);
		System.out.println("Cantidad: " + cant);
		System.out.println("Importe: " + importe);
		System.out.println("Forma de pago: " + form);
		System.out.println(a + dscto);
		System.out.println("Total a pagar: " + total);
	}
}
