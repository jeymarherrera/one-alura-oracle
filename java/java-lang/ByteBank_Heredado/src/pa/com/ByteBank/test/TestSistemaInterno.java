package pa.com.ByteBank.test;
import pa.com.ByteBank.modelo.SistemaInterno;
import pa.com.ByteBank.modelo.Administrador;
import pa.com.ByteBank.modelo.Gerente;

public class TestSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Administrador admin = new Administrador();
		Gerente gerente = new Gerente();
		
		sistema.autenticar(admin);
		sistema.autenticar(gerente);
			
	}
}
