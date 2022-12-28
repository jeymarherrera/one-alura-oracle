package pa.com.ByteBank.test;

import pa.com.ByteBank.modelo.*;

public class TestArrayReferencias {

	 public static void main(String[] args) {

	        // alterando el tipo
	        Cuenta[] cuentas = new Cuenta[5];
	        CuentaCorriente cc1 = new CuentaCorriente(22, 11);
	        cuentas[0] = cc1;

	        // crea instancia de CuentaAhorro
	        CuentaAhorros ca2 = new CuentaAhorros(22, 22);
	        cuentas[1] = ca2;    

	        System.out.println(cuentas[1]);

	        // alterou o tipo, realizando o cast
	        CuentaCorriente ref = (CuentaCorriente) cuentas[0];
	        System.out.println(ca2);
	        System.out.println(ref);
	    }
}
