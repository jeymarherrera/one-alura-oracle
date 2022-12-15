

public class EjemploScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad = 20;
        int cantidadPersonas = 3;
        
        boolean esPareja;

        if (cantidadPersonas > 1) {
           esPareja = true;
        } else {
           esPareja = false;
        }
        
        if (edad >= 18 && esPareja) {
            System.out.println("Usted puede entrar");
        } else {
            System.out.println("Usted no esta permitido a entrar");
        }
	}

}
