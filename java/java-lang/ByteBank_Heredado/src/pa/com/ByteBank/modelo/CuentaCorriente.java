package pa.com.ByteBank.modelo;
public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public void realizarRetiro(double valor) throws SaldoInsuficienteException{
	double valorARetirar = 0.2;
    super.realizarRetiro(valor + valorARetirar);
	}

	@Override
	public void realizarDeposito(double valor) {
		// TODO Auto-generated method stub
		
	}
	
}
