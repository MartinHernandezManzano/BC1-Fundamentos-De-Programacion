import java.util.ArrayList; //importamos la clase ArrayList para crear listas dinámicas
import java.util.Scanner;   //importamos Scanner 

public class BuscaArray {
    public static void main(String[] args) {
        //creamos el escáner 
        Scanner scanner = new Scanner(System.in);

        /*Creamos una lista dinámica de enteros para almacenar los números ingresados por el usuario.
        Usamos ArrayList<Integer> porque permite agregar elementos sin conocer el tamaño final de la lista. 
        Este array se usará para buscar un número específico y mostrar su posición si existe.*/
        ArrayList<Integer> numeros = new ArrayList<>();

        //pedimos al usuario cuántos números desea ingresar
        System.out.println("¿Cuántos números desea ingresar?");
        int cantidad = scanner.nextInt();

        //usamos un bucle for para leer los números uno por uno
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero); //agregamos el número a la lista
            /*
            .add(valor) agrega un elemento al final de la lista
            en este caso, añadimos cada número ingresado por el usuario
            */
        }

        //pedimos el número que se desea buscar
        System.out.println("Ingrese el número que desea buscar:");
        int buscado = scanner.nextInt();

        //usamos indexOf para buscar la posición del número en la lista
        int posicion = numeros.indexOf(buscado);
        /*
        .indexOf(valor) busca el valor en la lista
        si lo encuentra, devuelve la posición (índice)
        si no lo encuentra, devuelve -1
        */

        //mostramos el resultado de la búsqueda
        if (posicion == -1) {
            //si la posición es -1, el número no está en la lista
            System.out.println("No se encontró el valor " + buscado + ".");
        } else {
            //si la posición es distinta de -1, mostramos dónde está
            System.out.println("El valor " + buscado + " está en la posición: " + posicion);
        }

        //cerramos el escáner para liberar recursos
        scanner.close();
    }
}
