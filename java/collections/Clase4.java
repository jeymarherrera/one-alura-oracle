
import java.util.ArrayList;

public class Clase4 {

    public static void main(String[] args) {

        Clase curso1 = new Clase("Geometria",30) ;
        Clase curso2 = new Clase("Fisica",10) ;
        Clase curso3 = new Clase("Quimica",20) ;
        Clase curso4 = new Clase("Historia",50) ;


        ArrayList<Clase> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);

    }
}
