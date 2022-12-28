package pa.com.ByteBank.test;
import pa.com.ByteBank.modelo.CuentaCorriente;
import pa.com.ByteBank.modelo.CuentaAhorros;

public class TestCuentas {
 public static void main(String[] args) throws pa.com.ByteBank.modelo.SaldoInsuficienteException{
    
	 	CuentaCorriente cc = new CuentaCorriente(111, 111);
	    cc.realizarDeposito(100.0);

	    CuentaAhorros cp = new CuentaAhorros(222, 222);
	    cp.realizarDeposito(100.0);

	    cc.realizarTransferencia(10.0, cp);
	    System.out.println("CC: " + cc.getSaldo());
	    System.out.println("CP: " + cp.getSaldo());
}
}
