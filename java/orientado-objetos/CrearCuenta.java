
public class CrearCuenta {

	public static void main(String[] args) {
		// instancia
		Cuenta primeraCuenta = new Cuenta(1);
		primeraCuenta.setSaldo(400);
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta(1);
		segundaCuenta.setSaldo(400);
		System.out.println(segundaCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto instanciado");
		}else {
			System.out.println("Son objetos diferentes");
		}
		
		if (primeraCuenta.getSaldo() == segundaCuenta.getSaldo()) {
			System.out.println("Tienen el mismo saldo");
		}else {
			System.out.println("Son saldos diferentes");
		}
	}
	

}
