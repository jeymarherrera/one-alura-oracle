public class Factorial {
/* El factorial de 0 es 1.
El factorial de 1 es (0!) * 1 = 1.
El factorial de 2 es (1!) * 2 = 2
El factorial de 3 es (2!) * 3 = 6
El factorial de 4 es (3!) * 4 = 24
El factorial de un número n es n * n-1 * n-2 ... hasta n = 1. */
public static void main(String[] args) {
    int factorial = 1;
    for (int i = 1; i < 11; i++) {
        factorial *= i;
        System.out.println("Factorial de " + i + " = " + factorial);
    }
}
}
