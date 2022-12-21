package pa.com.ByteBank.test;
import pa.com.ByteBank.modelo.*;

public class TestString {

	public static void main(String[] args) {
		String nombre = "Mario"; //objeto literal
	    String otro = new String("Alura"); //En la práctica, siempre se prefiere sintaxis literal
	    String nuevo = otro.replace("A", "a");

	    System.out.println(nuevo);
	    nuevo = nombre.toLowerCase(); //también pruebe toUpperCase()
	    System.out.println(nuevo);
	    
	    char c = nombre.charAt(3); //char i
	    System.out.println(c);

	    int pos = nombre.indexOf("rio");
	    System.out.println(pos);

	    String sub = nombre.substring(1);
	    System.out.println(sub);
	    
	    Object cuenta = new CuentaAhorros(344, 522);
	    
	    for(int i = 0; i < nombre.length(); i++) {
	        printLine(nombre.charAt(i));
	    } 
	}
	
	public static void printLine (Object valor) {
		System.out.println(valor.toString());
	}
}


