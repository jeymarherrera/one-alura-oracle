
public class TestReferencia3 {
	public static void main(String[] args) {
		Cuenta cuentaNueva = new Cuenta(1);
		//Cliente nuevoCliente = new Cliente();
		//cuentaNueva.titular = nuevoCliente;
		//cuentaNueva.titular = new Cliente();
		//cuentaNueva.getTitular().nombre = "Jeymar";
		
		System.out.println(cuentaNueva.getTitular().getNombre());
		
		Cliente p = new Cliente();
	    p.setNombre("Paulo");
	   // p.direccion = new Direccion();
	   // p.setDireccion().setCalle()  = "Avenida XYZ";
	    //System.out.println(p.direccion.calle);
	}
}
