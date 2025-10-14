import java.util.Scanner;
import java.time.LocalDate;  // <-- import para trabajar con fechas

public class EdadCien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir año de nacimiento
        System.out.print("Introduce tu año de nacimiento: ");
        int nacimiento = scanner.nextInt();

        // Obtener automáticamente el año actual
        int actual = LocalDate.now().getYear();

        // Calcular edad
        int edad = actual - nacimiento;
        System.out.println("Tu edad aproximada es: " + edad + " años.");

        // Comprobaciones
        if (edad < 100) {
            int faltan = 100 - edad;
            System.out.println("Te faltan " + faltan + " años para cumplir 100.");
        } else if (edad == 100) {
            System.out.println("¡Felicidades! Este año haces 100 años");
        } else {
            System.out.println("Ya superaste los 100 años!");
        }

        scanner.close();
    }
}
