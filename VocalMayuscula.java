import java.util.Scanner;

public class VocalMayuscula {
    //esto es una clase sin atributos, solo tiene un método
    public static void main(String [] args) {
        
        //pedimos una vocal
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una vocal: ");
        String letra = scanner.nextLine();
        scanner.close();

        //validamos la vocal 
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
            letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("Vocal en mayúscula: " + letra.toUpperCase());
        } else {
            System.out.println("No es una vocal.");
        }
    }
}