
public class PruebaAcceso {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1);
		//cuenta.setAgencia(22);
		//cuenta.saldo = 200;
		cuenta.realizarDeposito(400);
		cuenta.realizarRetiro(200);
		//cuenta.saldo = cuenta.saldo - 300;
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
	}
}
