
public class Fecha {

	int dia;
	int mes;
	int a�o;

	Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.a�o = 1900;
	}

	Fecha(String date) {
		String[] numeros = date.contains("/") ? date.split("/") : date.split("-");

		this.dia = Integer.parseInt(numeros[0]);
		this.mes = Integer.parseInt(numeros[1]);
		this.a�o = Integer.parseInt(numeros[2]);
	}

	Fecha(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	boolean mayorDe18(Fecha fecha) {
		if (fecha.a�o - this.a�o == 18) {
			if (fecha.mes == this.mes && fecha.dia >= this.dia) {
				return true;
			} else if (fecha.mes > this.mes) {
				return true;
			}
		} else if (fecha.a�o - this.a�o > 18) {
			return true;
		}
		return false;
	}

	public String getString() {
		return this.dia + "/" + this.mes + "/" + this.a�o;
	}

	public static void main(String[] args) {
		Fecha cumple = new Fecha("22/03/2002");

		System.out.println(cumple.mayorDe18(new Fecha("23/03/2020")));
	}

}