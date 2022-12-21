package pa.com.ByteBank.modelo;
public class Administrador extends Funcionario implements Autenticable{

	private AutenticacionUtil util;
	//una clase puede extender una sola clase, pero puede implementarm varias interfaces
	
	
	public double getBonificacion() {
		return this.getSalario();
	}

	public Administrador() {
		this.util =  new AutenticacionUtil();
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

}
