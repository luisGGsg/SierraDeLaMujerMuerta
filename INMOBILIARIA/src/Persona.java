import java.util.Scanner;

public class Persona {
	String DNI;
	String Nombre;
	String Apellido1;
	String Apellido2;
	Fecha F_nacimiento;
	String Telefono;
	String Mail;

	Persona() {
		this.DNI = "00000000A";
		this.Nombre = "Pepe";
		this.Apellido1 = "Apellido1";
		this.Apellido2 = "Apellido2";
		this.Telefono = "123456789";
		this.Mail = "Pepe@correo.com";

	}
	public void mostrar_datos(){
		System.out.println("Nombre: "+ this.Nombre );
		System.out.println("DNI :" +this.DNI);
		System.out.println("1 Apellido "+this.Apellido1);
		System.out.println("2 Apellido "+this.Apellido2);
		System.out.println("Telefono "+this.Telefono);
		System.out.println("Fecha nacimiento "+ this.F_nacimiento );
		System.out.println("Mail " +this.Mail);


	}
	public void leer_datos(Scanner t) {
		System.out.println("Dime el dni");
		this.DNI = t.next();
		System.out.println("Dime el nombre");
		this.Nombre = t.next();
		System.out.println("Dime el Apellido1");
		this.Apellido1 = t.next();
		System.out.println("Dime el Apellido2");
		this.Apellido2 = t.next();
		System.out.println("Dime el telefono");
		this.Telefono = t.next();
		System.out.println("Dime el mail");
		this.Mail = t.next();
		System.out.println("Dime tu fecha de nacimiento");
		this.F_nacimiento = new Fecha(t.next());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
