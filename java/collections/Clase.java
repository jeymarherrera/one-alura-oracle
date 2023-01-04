import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Clase implements Comparable<Clase>{
    private String nombre;
    private int tiempo;
    private List<Curso> cursoList = new ArrayList<>();
    private Collection<Alumno> alumnos = new HashSet<>();
    //private Collection<Alumno> alumnos = new LinkedHashSet<>();
    private Map<String, Alumno> alumnoMap = new HashMap<>();
    //private Map<String, Alumno> alumnoMap = new LinkedHashMap<>();

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

    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
        this.alumnoMap.put(alumno.getCodigo(), alumno);
    }

    public boolean verificarAlumno(Alumno alumno){
       return this.alumnos.contains(alumno);
    }

   
    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }
    
    public Clase(Map<String, Alumno> alumnoMap) {
        this.alumnoMap = alumnoMap;
    }

    @Override
    public int compareTo(Clase o) {
        return this.nombre.compareTo(o.getNombre());
    }

    public Map<String, Alumno> getAlumnoMap() {
        return alumnoMap;
    }

   

}
