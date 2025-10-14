import java.util.Scanner;

public class ChequeMultiplo { // Clase principal

    private int numeroBase; // Atributo para almacenar el número ingresado

    // Constructor que recibe el número base
    public ChequeMultiplo(int numeroBase) {
        this.numeroBase = numeroBase;
    }

    // Método que verifica si el número base es múltiplo del parámetro recibido
    public boolean esMultiploDe(int divisor) {
        if (divisor == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return false;
        }
        return numeroBase % divisor == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos el número base
        System.out.print("Ingrese un número: ");
        int numeroIngresado = scanner.nextInt();

        // Creamos el objeto con ese número
        ChequeMultiplo verificador = new ChequeMultiplo(numeroIngresado);

        // Pedimos el número para verificar si es múltiplo
        System.out.print("Ingrese el número para verificar si es múltiplo: ");
        int posibleDivisor = scanner.nextInt();

        // Usamos el método del objeto para verificar
        if (verificador.esMultiploDe(posibleDivisor)) {
            System.out.println("El número " + numeroIngresado + " es múltiplo de " + posibleDivisor);
        } else {
            System.out.println("El número " + numeroIngresado + " no es múltiplo de " + posibleDivisor);
        }

        scanner.close();
    }
}
