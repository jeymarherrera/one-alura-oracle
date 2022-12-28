package pa.com.ByteBank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import pa.com.ByteBank.modelo.Cliente;
import pa.com.ByteBank.modelo.Cuenta;
import pa.com.ByteBank.modelo.CuentaAhorros;
import pa.com.ByteBank.modelo.CuentaCorriente;

public class TestOrdenarListas {
	public static void main(String[] args) {

		Cuenta cc1 = new CuentaCorriente(2, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Nico");
		cc1.setTitular(clienteCC1);
		cc1.realizarDeposito(333.0);

		Cuenta ca2 = new CuentaAhorros(3, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNombre("Guilermo");
		ca2.setTitular(clienteCC2);
		ca2.realizarDeposito(444.0);

		Cuenta cc3 = new CuentaCorriente(1, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNombre("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.realizarDeposito(111.0);

		Cuenta ca4 = new CuentaAhorros(5, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNombre("Ana");
		ca4.setTitular(clienteCC4);
		ca4.realizarDeposito(222.0);
		
		
		List<Cuenta> lista = new ArrayList();
		lista.add(cc1);
		lista.add(ca2);
		lista.add(cc3);
		lista.add(ca4);
		
		
		//clase anonima
		//lista.sort(new TitularDeCuentaComparator()); // Ya dejándolo mai delgado
		Collections.sort(lista, new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}
			
		});
		//Collections.sort(lista, new NumeroDeCuentaComparator());
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}

		System.out.println("---------");

		//Comparator<Cuenta> comparator = new NumeroDeCuentaComparator();
		//lista.sort(comparator);
		lista.sort(new Comparator<Cuenta>(){

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return Integer.compare(o1.getNumero(), o2.getNumero());
			}
			
		});
	}

}

class NumeroDeCuentaComparator implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta c1, Cuenta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
}

class TitularDeCuentaComparator implements Comparator<Cuenta> {

    @Override
    public int compare(Cuenta c1, Cuenta c2) {
        String nombreC1 = c1.getTitular().getNombre();
        String nombreC2 = c2.getTitular().getNombre();
        return nombreC1.compareTo(nombreC2);
    }
}

