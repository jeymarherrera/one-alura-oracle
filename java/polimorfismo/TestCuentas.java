
public class TestCuentas {
 public static void main(String[] args) {
    
	    CuentaCorriente cc = new CuentaCorriente(111, 111);
	    cc.realizarDeposito(100.0);

	    CuentaAhorros cp = new CuentaAhorros(222, 222);
	    cp.realizarDeposito(100.0);

	    cc.realizarTransferencia(10.0, cp);
	    System.out.println("CC: " + cc.getSaldo());
	    System.out.println("CP: " + cp.getSaldo());
}
}
