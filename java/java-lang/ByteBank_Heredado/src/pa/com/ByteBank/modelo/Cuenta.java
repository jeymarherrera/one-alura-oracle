package pa.com.ByteBank.modelo;
/**
 * @version 1.0
 * @since 2022
 * @author Jeymar
 *
 */
public abstract class Cuenta {

	//public - accesible desde cualquier parte
	//default - accesible dentro del paquete
	//protected - default + clases hijas
	//private - solo desde la misma clase
	protected  double saldo;
	private  int agencia;
	private  int numero;
	private Cliente titular = new Cliente();
	
	private static int totalCuentas = 0;

	public Cuenta(int agencia, int numero) {
		if (agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		}else {
			this.agencia = agencia;
		}
		totalCuentas++;
		System.out.println("Se han creado un total de "+totalCuentas+" cuentas.");
	}
	
	public abstract void realizarDeposito(double valor);
	
	public void realizarRetiro(double valor) throws SaldoInsuficienteException{
		if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }

        this.saldo -= valor;  
		
	}
	
	public void realizarTransferencia(double valor, Cuenta cuenta){
			this.saldo = this.saldo - valor;	
			//cuenta.saldo = cuenta.saldo + valor;
			cuenta.realizarDeposito(valor);	
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/*
	public void setAgencia(int nuevaAgencia){
		if(nuevaAgencia > 0) {
			this.agencia = nuevaAgencia;
		}else {
			System.out.println("No estan permitidos valores negativos o igual a cero");
		}
	}*/
	
	public int getAgencia() {
		return agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Cuenta.totalCuentas;
	}
	
	@Override
	public String toString() {
		 return "Numero: " + this.numero + ", Agencia: " + this.agencia;
		
	}
}
