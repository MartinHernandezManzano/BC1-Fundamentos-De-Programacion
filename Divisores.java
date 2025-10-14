import java.util.Scanner;
public class Divisores{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        System.out.println("Los divisores de " + numero + " son: ");

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {  
            /*
 * int i = 1: Se declara una variable i que empieza en 1. Esta será nuestro contador.

i <= numero: El bucle se ejecuta mientras i sea menor o igual que el número que introdujo el usuario.

i++: Después de cada iteración, se incrementa i en 1.

if (numero % i == 0): Verifica si i es un divisor del número. Si el resto es 0, significa que numero es divisible por i.

System.out.println(i);: Si la condición se cumple, imprime el valor de i, porque es un divisor.

             */
                System.out.println(i);
            }
        }
        scanner.close();
        }
    }

    

