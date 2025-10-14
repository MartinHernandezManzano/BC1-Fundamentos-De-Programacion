import java.util.Scanner;
public class Fibonacci{
    public static void main(String [] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el orden de la sucesión de Fibonacci: ");
        int orden = scanner.nextInt(); //para ver cuántos términos se quieren ver
        int a = 0, b = 1; 
        // a es el primer numero y b el segundo

        //mostramos la sucesion con un bucle for que se repite "orden" veces. 
        System.out.println("Sucesión de Fibonacci: ");
        for (int i = 0; i < orden; i++){
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
            //actualizamos a y b para la siguiente vuelta
        }
        scanner.close();
    }
}