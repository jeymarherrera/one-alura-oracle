
public class TestReferencia2 {

	public static void main(String[] args) {
		Cliente nuevoCliente = new Cliente();
		nuevoCliente.setNombre("Jeymar");
		nuevoCliente.setDocumento("4548966413");
		nuevoCliente.setTelefono("1242122");
		
		Cuenta cuentaNueva = new Cuenta(1);
		//cuentaNueva.setAgencia(1);
		cuentaNueva.setTitular(nuevoCliente);
		
		System.out.println(cuentaNueva.getTitular().getDocumento());
		System.out.println(cuentaNueva.getTitular());
		System.out.println(nuevoCliente);
	}
}
