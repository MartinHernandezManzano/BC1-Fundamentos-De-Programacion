import java.util.Scanner; // Importamos la clase Scanner para leer datos del usuario

public class AreaRectangulo {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese la base del rectángulo
        System.out.print("Ingresa la base del rectángulo: ");
        double base = scanner.nextDouble(); // Leemos la base como un número decimal (double)

        // Pedimos al usuario que ingrese la altura del rectángulo
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble(); // Leemos la altura como un número decimal (double)

        // Calculamos el área del rectángulo (base * altura)
        double area = base * altura;

        // Mostramos el resultado al usuario
        System.out.println("El área del rectángulo es: " + area);

        // Cerramos el scanner para liberar recursos
        scanner.close();
    }
}
