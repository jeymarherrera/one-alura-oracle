import java.util.ArrayList;

public class Clase6 {

    public static void main(String[] args) {

        Clase curso1 = new Clase("Java",30, new ArrayList<>()) ;
        curso1.addCurso(new Curso("ArrayList"));
        curso1.addCurso(new Curso("List"));
        curso1.addCurso(new Curso("LinkedList"));

        ArrayList<Clase> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(cursos.get(0).getCursoList());
    }
}
