
public class TestConexion {

	 public static void main(String[] args) throws Exception{

		 try(Conexion conexion = new Conexion ()){
		        conexion.leerDatos();
		} catch(IllegalStateException ex){
		        System.out.println("Surgió un error en la conexión ");
		        ex.printStackTrace();
		}
     }
}
