package pa.com.ByteBank.modelo;

public class GuardaCuentas {

	private Cuenta[] referencias;
	private int posicionLibre;

	public GuardaCuentas() {
		this.referencias = new Cuenta[10];
		this.posicionLibre = 0;
	}

	public void adicionar(Cuenta cc) {
		referencias[this.posicionLibre] = cc;
		this.posicionLibre++;
	}

	public int getCantidadDeElementos() {
		return this.posicionLibre;
	}

	public Cuenta getReferencia(int pos) {
		return this.referencias[pos];
	}
}
