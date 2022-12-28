package pa.com.ByteBank.test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import pa.com.ByteBank.modelo.Cuenta;
import pa.com.ByteBank.modelo.CuentaCorriente;
public class TestArrayList {

	public static void main(String[] args) {
		//List<Cuenta> lista = new ArrayList<Cuenta>(); //usa array por debajo
        //List<Cuenta> lista = new LinkedList<Cuenta>(); //lista linkada
       // List<Cuenta> lista = new Vector<Cuenta>(); //usa array por debajo, pero también es threadsafe
		//obligatorio expecificar -  no obligatorio
		List<Cuenta> lista = new ArrayList<>();
		Collection<Cuenta> lista2 = new Vector<Cuenta>(); 
        Cuenta cc = new CuentaCorriente(22, 11);
        lista.add(cc);

        Cuenta cc2 = new CuentaCorriente(22, 22);
        lista.add(cc2);

        Cuenta obtenerCuenta = (Cuenta) lista.get(0);
        System.out.println("Tamano: " + lista.size());

        Cuenta ref = (Cuenta) lista.get(0);
        System.out.println(ref);

        lista.remove(0);
        System.out.println("Tamano: " + lista.size());

        Cuenta cc3 = new CuentaCorriente(33, 311);
        lista.add(cc3);

        Cuenta cc4 = new CuentaCorriente(33, 322);
        lista.add(cc4);

        for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("----------");

        for(Object oRef : lista) {
            System.out.println(oRef);
        }

	}
}
