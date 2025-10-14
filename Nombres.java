import java.util.Scanner;
public class Nombres {
    public static void main(String[] args){
        //declaramos el array de nombres
        String[] nombres = new String[3];

        //pedimos al usuario que introduzca los nombres
        Scanner scanner = new Scanner(System.in);

        //bucle para repetir la accion y declarar la posicion
        for (int i = 0; i < nombres.length; i++){
            System.out.println("Introduce el nombre " + (i+1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        //recorremos el array y mostramos cada nombre
        System.out.println("Los nombres introducidos son:");
        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }
}
