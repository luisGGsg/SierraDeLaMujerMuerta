
public class Fecha {

	int dia;
	int mes;
	int año;

	Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.año = 1900;
	}

	Fecha(String date) {
		String[] numeros = date.contains("/") ? date.split("/") : date.split("-");

		this.dia = Integer.parseInt(numeros[0]);
		this.mes = Integer.parseInt(numeros[1]);
		this.año = Integer.parseInt(numeros[2]);
	}

	Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	boolean mayorDe18(Fecha fecha) {
		if (fecha.año - this.año == 18) {
			if (fecha.mes == this.mes && fecha.dia >= this.dia) {
				return true;
			} else if (fecha.mes > this.mes) {
				return true;
			}
		} else if (fecha.año - this.año > 18) {
			return true;
		}
		return false;
	}

	public String getString() {
		return this.dia + "/" + this.mes + "/" + this.año;
	}

	public static void main(String[] args) {
		Fecha cumple = new Fecha("22/03/2002");

		System.out.println(cumple.mayorDe18(new Fecha("23/03/2020")));
	}

}