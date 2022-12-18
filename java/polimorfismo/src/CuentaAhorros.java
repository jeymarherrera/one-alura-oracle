
public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public void realizarDeposito(double valor) {
		this.saldo = this.saldo + valor;
		
	}

	
}
