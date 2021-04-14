import java.util.Scanner;

public class Direccion {
	String calle;
	int portal;
	int piso;
	char puerta;
	String localidad;
	int cp;
	
	Direccion(){
		this.calle="Calle amor";
		this.portal=1;
		this.piso=1;
		this.puerta=1;
		this.localidad="Segovia";
		this.cp=1234;
		
	}
	public void mostrar_datos() {
		System.out.println("Calle " +this.calle);
		System.out.println("Portal "+this.portal);
		System.out.println("Piso "+this.piso);
		System.out.println("Puerta "+this.puerta);
		System.out.println("Localidad "+this.localidad);
		System.out.println("Codigo postal "+this.cp);
	}
	public void leer_datos(Scanner t) {
		System.out.println("Dime la calle");
		t.nextLine();
		this.calle=t.nextLine();
		System.out.println("Dime el portal");
		this.portal=t.nextInt();
		System.out.println("Dime el piso");
		this.piso=t.nextInt();
		System.out.println("Dime la puerta");
		this.puerta=t.next().charAt(0); ;
		System.out.println("Dime la localidad");
		this.localidad=t.next();
		System.out.println("Dime el codigo postal");
		this.cp=t.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
