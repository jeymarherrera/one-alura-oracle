
public class EjemploCaracteres {

	public static void main(String[] args) {

		char caracter = 'a';
		System.out.println(caracter);
		
		caracter = 64;
		System.out.println(caracter);
		
		caracter = 65 + 1;
		char segundoCaracter = (char) (caracter + 1);
		System.out.println(segundoCaracter);
		
		String palabra = "Alura cursos online";
		
		palabra = palabra + " 2022";
		System.out.println(palabra);
		
		String cuota1 = "10";
		String cuota2 = "20";
		System.out.println (cuota1 + cuota2);
		
	}

}
