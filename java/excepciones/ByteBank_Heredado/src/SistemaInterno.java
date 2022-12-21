public class SistemaInterno {

    private String clave = "AluraCursoOnline";

    public void autenticar(Autenticable gerente) {

        boolean autenticacion = gerente.iniciarSesion(clave);

        if (autenticacion) {
            System.out.println("Puede entrar al sistema");
        } else {
            System.out.println("No puede entrar al sistema");
        }
    }

}