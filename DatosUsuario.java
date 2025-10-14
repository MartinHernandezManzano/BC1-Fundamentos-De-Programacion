import java.util.Scanner; //para leer

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre completo: ");
        String nombre = scanner.nextLine(); //pedimos el nombre

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt(); //pedimos la edad
        scanner.nextLine();

        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble(); //pedimos la altura en metros (double)
        scanner.nextLine();

        System.out.print("¿Estudias actualmente? (true/false): ");
        boolean estudia = scanner.nextBoolean(); //pedimos esta info (true/false)
        scanner.nextLine();

        System.out.printf("\nNombre: %s\nEdad: %d años\nAltura: %.2f metros\n¿Estudia?: %b\n",
                          nombre, edad, altura, estudia);

        scanner.close();
    }
}
