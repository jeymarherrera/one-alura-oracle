
public class TestReferencia {

	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(1);
		primeraCuenta.setSaldo(200);
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.setSaldo(100);
		
		System.out.println("Saldo primera cuenta: "+primeraCuenta.getSaldo());
		System.out.println("Saldo segunda cuenta: "+segundaCuenta.getSaldo());

		segundaCuenta.setSaldo(400);
		System.out.println("Saldo primera cuenta: "+primeraCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto instanciado");
		}else {
			System.out.println("Son objetos diferentes");
		}
	}

}
