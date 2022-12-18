
public class PruebaEncapsulamiento {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1);
		Cliente cliente = new Cliente();
		cliente.setNombre("Dylan");
		cliente.setDocumento("5465456");
		
		cuenta.setTitular(cliente);
		
		Cliente titular =  cuenta.getTitular();
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
		System.out.println(titular);
	}
}
