import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase5 {

    public static void main(String[] args) {

        Clase curso1 = new Clase("PHP",30) ;
        Clase curso2 = new Clase("Ruby",10) ;
        Clase curso3 = new Clase("JavaScript",20) ;
        Clase curso4 = new Clase("Java",50) ;


        ArrayList<Clase> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);
        // sin usar el metodo comparateTo
        //Collections.sort(cursos,Comparator.comparing(Curso::getNombre).reversed());
        //cursos.sort(Comparator.comparing(Curso::getNombre));
        //System.out.println(cursos);

        List<Clase> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Clase::getTiempo)).collect(Collectors.toList());

        System.out.println(cursoList);
    }
}
