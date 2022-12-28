
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Clase10 {

    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>(){
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {
        Clase curso1 = new  Clase("Historia",30) ;
        Clase curso2 = new  Clase("Algebra",10) ;
        Clase curso3 = new  Clase("Aritmetica",20) ;
        Clase curso4 = new  Clase("Geometria",50) ;
        Clase curso5 = new  Clase("Fisica",60) ;
        Clase curso6 = new  Clase("Quimica",80) ;
        Clase curso7 = new  Clase("Quimica",70) ;
        Clase curso8 = new  Clase("Fisica",30) ;



        ArrayList<Clase> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        cursos.add(curso7);
        cursos.add(curso8);


        List<Clase> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Clase::getTiempo)).collect(Collectors.toList());

        System.out.println(cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Clase::getTiempo).sum());

        System.out.println(cursos.stream().mapToInt(Clase::getTiempo).average().getAsDouble());

        System.out.println(cursos.stream().mapToInt(Clase::getTiempo).max().getAsInt());

        System.out.println(cursos.stream().mapToInt(Clase::getTiempo).min().getAsInt());

        Map<String, List<Clase>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Clase::getNombre));

        groupCurso.forEach((key , value) -> System.out.println(key + " - " + value.size()));

        System.out.println(cursos.parallelStream().mapToInt(Clase::getTiempo).sum());

    }
}
