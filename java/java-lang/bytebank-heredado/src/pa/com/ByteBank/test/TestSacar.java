package pa.com.ByteBank.test;
import pa.com.ByteBank.modelo.Cuenta;
import pa.com.ByteBank.modelo.CuentaCorriente;
import pa.com.ByteBank.modelo.SaldoInsuficienteException;

public class TestSacar {

	 public static void main(String[] args) {
		 Cuenta cuenta = new CuentaCorriente(123, 321);

         cuenta.realizarDeposito(200.0);

         try {
             cuenta.realizarRetiro(210.0);
         } catch(SaldoInsuficienteException ex) {
             System.out.println("Exception: " + ex.getMessage());
             ex.printStackTrace();
         }

         System.out.println(cuenta.getSaldo());
     }
}
