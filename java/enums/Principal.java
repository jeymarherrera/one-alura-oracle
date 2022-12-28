//usando enums
public class Principal {
	public static void main(String[] args) {
		for (Dia dia: Dia.values()) {
			System.out.println("El dia de la semana es: " + dia);
		}
		Dia domingo = Dia.Domingo;
		//nombre
		System.out.println(domingo.name());
		//numero donde se encuentra
		System.out.println(domingo.ordinal());
		// parlo a string
		System.out.println(domingo.toString());
	}
}
