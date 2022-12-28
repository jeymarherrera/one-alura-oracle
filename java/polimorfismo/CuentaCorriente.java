
public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public boolean realizarRetiro(double valor){
	double valorARetirar = 0.2;
	    return super.realizarRetiro(valor + valorARetirar);
	}

	@Override
	public void realizarDeposito(double valor) {
		// TODO Auto-generated method stub
		
	}
	
}
