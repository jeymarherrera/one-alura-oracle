
public interface Autenticable{
	
//en interface todos los metodos son abstractos, pero no es necesario ponerlo
//no puede extender a otra clase
	public void setClave(String clave);
	
	public boolean iniciarSesion(String clave);

}
