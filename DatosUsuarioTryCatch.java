import java.util.Scanner;
import java.util.InputMismatchException;

public class DatosUsuarioTryCatch {
    public static void main(String[] args) {
        boolean entradaValida = false;
        int edad = 0;
        Scanner scanner = new Scanner(System.in);
        //Leer nombre completo
        System.out.print("Introduce tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        //Leer edad
        while (!entradaValida){
            System.out.print("Introduce tu edad: ");

            try{
                edad = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida, por favor introduce un entero");
                scanner.nextLine();
            }
        }
    }
}
