public class TablaMultiplicar {
    public static void main(String[] args) {
        //variable, condicion e incremento
        for(int contador = 0; contador <= 10; contador++) {
            for(int multiplicacion = 0; multiplicacion <= 10; multiplicacion++) {
                System.out.println(contador*multiplicacion);
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}
