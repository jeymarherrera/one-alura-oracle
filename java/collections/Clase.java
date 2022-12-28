import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Clase implements Comparable<Clase>{
    private String nombre;
    private int tiempo;
    private List<Curso> cursoList = new ArrayList<>();

    public Clase(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Clase(String nombre, int tiempo, List<Curso> cursoList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.cursoList = cursoList;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Curso> getCursoList() {
        return Collections.unmodifiableList(cursoList);
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    public void addCurso(Curso curso){
        this.cursoList.add(curso);
    }

    public String toString(){
        return this.nombre;
    }

    @Override
    public int compareTo(Clase o) {
        return this.nombre.compareTo(o.getNombre());
    }

}
