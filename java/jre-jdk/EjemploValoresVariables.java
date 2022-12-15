

public class EjemploValoresVariables {

	public static void main(String[] args) {
		
		int numero1 = 5;
		int numero2 = 9;
		
		System.out.println(numero1);
		
		numero1 = numero2;
		System.out.println(numero1);
		
		numero2 = 88;
		System.out.println(numero1);
		
		String saludo = "Hola, mi nombre es ";
		String nombre = "Rómulo ";
		String continuacion = "y mi edad es ";
		int edad = 100;
		System.out.println (saludo + nombre + continuacion + edad);
	}
}
