package pa.com.ByteBank.modelo;
public class Gerente implements Autenticable{

	//metodo sobreescrito
	public double getBonificacion() {
		System.out.println("Ejecutando desde GERENTE");
    	return 2000;
		//return super.getSalario() + (this.getSalario() * 0.05);
    	
    }

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
