
import java.util.Scanner;

public class ContarCaracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pedimos las entradas
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();
        
        System.out.print("Introduce un carácter: ");
        char letra = sc.nextLine().charAt(0);

        //llamamos al método
        int veces = contarVecesCaracter(cadena, letra);
        System.out.println("El carácter '" + letra + "' aparece " + veces + " veces.");
        
        sc.close();
    }
    
    // Método para contar
    public static int contarVecesCaracter(String cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }
}


