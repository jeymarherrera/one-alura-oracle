package pa.com.ByteBank.test;

import pa.com.ByteBank.modelo.Cuenta;
import pa.com.ByteBank.modelo.CuentaCorriente;
import pa.com.ByteBank.modelo.GuardaCuentas;

public class TestGuardaCuentas {

	public static void main(String[] args) {

		GuardaCuentas guardador = new GuardaCuentas();

		Cuenta cc = new CuentaCorriente(11 , 22);
		guardador.adicionar(cc);

		Cuenta cc2 = new CuentaCorriente(22, 24);
		guardador.adicionar(cc2);

		int tamano = guardador.getCantidadDeElementos();
		System.out.println(tamano);

		Cuenta ref = (Cuenta)guardador.getReferencia(0);
		System.out.println(ref);
		System.out.println(guardador.getReferencia(1)); 
		
	}
}
