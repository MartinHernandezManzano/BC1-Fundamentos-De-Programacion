import java.util.Scanner; // Importamos la clase Scanner para leer datos del usuario

public class PromedioTresNumeros {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble(); // Leemos el primer número como decimal

        // Pedimos al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble(); // Leemos el segundo número como decimal

        // Pedimos al usuario que ingrese el tercer número
        System.out.print("Ingresa el tercer número: ");
        double num3 = scanner.nextDouble(); // Leemos el tercer número como decimal

        // Calculamos el promedio sumando los tres números dividiendo entre 3
        double promedio = (num1 + num2 + num3) / 3;

        // Mostramos el promedio al usuario con dos decimales
        System.out.printf("El promedio de los tres números es: %.2f\n", promedio);


        // Cerramos el scanner para liberar recursos
        scanner.close();
    }
}
