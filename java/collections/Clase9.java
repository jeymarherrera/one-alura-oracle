import java.util.*;
import java.util.stream.Collectors;

public class Clase9 {

    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>(){
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {
        Clase curso1 = new Clase("Historia",30) ;
        Clase curso2 = new Clase("Algebra",10) ;
        Clase curso3 = new Clase("Aritmetica",20) ;
        Clase curso4 = new Clase("Geometria",50) ;


        ArrayList<Clase> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //System.out.println(cursos);

        Collections.sort(cursos,Comparator.comparing(Clase::getNombre).reversed());

        int suma = 0;
        for(Clase curso: cursos){
            if(!curso.getNombre().equalsIgnoreCase("Historia")) {
                suma += curso.getTiempo();
            }
        }

        System.out.println(suma);

        //System.out.println(cursos);

        List<Clase> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Clase::getTiempo)).collect(Collectors.toList());

        System.out.println(cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Clase::getTiempo).sum());

    }
}
