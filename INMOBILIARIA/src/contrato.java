import java.util.Scanner;

public class contrato {
	Fecha fecha;
	Persona arrendatario;
	Persona arrendador;
	Vivienda vivienda;
	float importe;

	contrato() {
		this.fecha = new Fecha("12/02/2002");
		this.arrendatario = new Persona();
		this.arrendador = new Persona();
		this.vivienda = new Vivienda();
		this.importe = 0;
	}

	public static void main(String[] args) {
		System.out.println("KLk maniiinnsss");
		Scanner t = new Scanner(System.in);
		int opcion;
		contrato c = null;
		do {
			System.out.println("Menú");
			System.out.println("1. Introduceir datos de un nuevo contrato");
			System.out.println("2. Ver contrato");
			System.out.println("0. Salir");

			opcion = t.nextInt();

			switch (opcion) {
			case 1:
				c = new contrato();
				c.vivienda.leer_datos(t);
				c.vivienda.direccion.leer_datos(t);
				System.out.println("Datos del arrendador");
				c.arrendador.leer_datos(t);
				System.out.println("Datos del arrendatario");
				c.arrendatario.leer_datos(t);
				System.out.println("Dime el importe");
				c.importe = t.nextFloat();
				break;
			case 2:

				c.arrendador.mostrar_datos();
				c.arrendatario.mostrar_datos();

			case 0:

				break;
			default:
				System.out.println("Gracias por usarlo");

			}
		} while (opcion != 0);
	}
}
