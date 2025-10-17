import java.util.Scanner; 

public class Factorial {
    public static void main(String[] args) {
        //creamos el escáner 
        Scanner scanner = new Scanner(System.in);

        //imprimimos la petición de número
        System.out.println("Ingrese un número: ");

        //leemos el número ingresado por el usuario y lo guardamos en la variable n
        int n = scanner.nextInt();

        //declaramos la variable fact e inicializamos en 1 (factorial base)
        int fact = 1;

        //usamos un bucle for para calcular el factorial
        for (int i = 1; i <= n; i++) {
            fact *= i;
            /* en cada iteración multiplicamos fact por el valor actual de i
            esto equivale a fact = fact * i
            el bucle se repite desde i = 1 hasta i = n
            por ejemplo, si n = 4:
            fact = 1 * 1 = 1
            fact = 1 * 2 = 2
            fact = 2 * 3 = 6
            fact = 6 * 4 = 24
            al final, fact contiene el factorial de n */
        }

        //imprimimos el resultado del factorial
        System.out.println("Factorial de " + n + " es " + fact);

        //cerramos el escáner 
        scanner.close();
    }
}
