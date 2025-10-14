import java.util.Scanner;
public class InversoCaracteresString{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        //pedimos el string
        System.out.println("Introduce una cadena de texto: ");
        String texto = sc.nextLine();

        //método para mostrarlo al revés
        System.out.print("Texto invertido: ");
        for (int i = texto.length() -1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        sc.close();
    }
}