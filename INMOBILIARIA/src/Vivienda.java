import java.util.Scanner;

public class Vivienda {
	Direccion direccion;
	int m2;
	int habitaciones;
	int banos;
	boolean garaje;
	boolean trastero;

	Vivienda() {
		this.direccion = new Direccion();
		this.m2 = 0;
		this.banos = 0;
		this.garaje = false;
		this.trastero = false;
	}
	public static void mostrar_datos() {
		
	}

	public void leer_datos(Scanner t) {
	
		System.out.println("Dime cuantos m2 tiene");
		this.m2 = t.nextInt();
		System.out.println("Dime cuantos baños tiene");
		this.banos = t.nextInt();
		System.out.println("Dime cuantas habitaciones tiene");
		this.habitaciones = t.nextInt();
		System.out.println("Tiene garaje?");
		this.garaje = t.nextBoolean();
		System.out.println("Tiene trastero?");
		this.trastero = t.nextBoolean();
		System.out.println("Dime la direccion");
		this.direccion = new Direccion();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		
	}

}
