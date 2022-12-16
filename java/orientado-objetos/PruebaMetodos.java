
public class PruebaMetodos {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1);
		cuenta.setSaldo(400);
		cuenta.realizarDeposito(300);
		System.out.println("Saldo de cuenta: "+cuenta.getSaldo());
		
		cuenta.realizarRetiro(100);
		System.out.println("Saldo de cuenta luego del retiro: "+cuenta.getSaldo());
		
		Cuenta miCuenta = new Cuenta(1);
		miCuenta.realizarDeposito(1000);
		System.out.println("Saldo de mi cuenta: "+miCuenta.getSaldo());
		
		boolean puedeTransferir = miCuenta.realizarTransferencia(400, cuenta);
		if (puedeTransferir) {
			System.out.println("Transferencia Exitosa");
		}else {
			System.out.println("Error de transferencia, saldo insuficiente");
		}
		
		
		System.out.println("Saldo de mi cuenta luego de la transferencia: "+miCuenta.getSaldo());
		System.out.println("Saldo de cuenta luego de recibir transeferencia: "+cuenta.getSaldo());
	}

}
