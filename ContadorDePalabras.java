import java.util.Scanner;

public class ContadorDePalabras {
    public static void main(String [] args){
        //creamos el escáner
        Scanner scanner = new Scanner(System.in);

        //imprimimos la petición de frase
        System.out.println("Ingrese una frase: ");

        //declaramos la variable palabras y leemos la frase
        String palabras = scanner.nextLine();

        int cuentaPalabras = palabras.trim().split("\\s+").length;
        /*el método trim() elimina espacios al inicio y al final del string
        el método split("\\s+") convierte el string en array cuando encuentra uno o más espacios y
        luego usamos .length para contar cuántos elementos hay en el array (es decir, cuántas palabras)*/

        System.out.println(cuentaPalabras);
        //imprimimos
        scanner.close();
    }
}
   