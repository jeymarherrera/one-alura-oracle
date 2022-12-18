package segunda_practica;

public class Alumno {
    private String nombre;
    private String matricula;
    
    public String getNombre(){
    	   return this.nombre;
    	}

    	public String getMatricula(){
    	   return this.matricula;
    	}

    	public void setMatricula(String matricula){
    	   this.matricula = matricula;
    	}

    	public void setNombre(String nombre){
    	   this.nombre = nombre;
    	}
}