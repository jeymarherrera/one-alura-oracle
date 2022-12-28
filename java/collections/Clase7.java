import java.util.ArrayList;
import java.util.List;

public class Clase7 {

    public static void main(String[] args) {

        Clase curso1 = new Clase("Java",30) ;
        curso1.addCurso(new Curso("ArrayList"));
        curso1.addCurso(new Curso("List"));
        curso1.addCurso(new Curso("LinkedList"));
        curso1.addCurso(new Curso("Inmutable"));

        List<Curso> aulaList = curso1.getCursoList();

       // aulaList.add(new Curso("Inmutable"));

        ArrayList<Clase> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(aulaList);
    }
}
