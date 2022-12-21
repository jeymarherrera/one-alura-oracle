
public class TestSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Administrador admin = new Administrador();
		Gerente gerente = new Gerente();
		
		sistema.autenticar(admin);
		sistema.autenticar(gerente);
			
	}
}
