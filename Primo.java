import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        sc.close();

        //llamamos al método
        if (esPrimo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }

    // método para comprobar si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // tiene un divisor -> no es primo
            }
        }

        return true; // no se encontró ningún divisor
    }
}
