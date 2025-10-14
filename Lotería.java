//imports para generar aleatorios y ordenar arrays
import java.util.Random;
import java.util.Arrays;

public class Lotería {
    public static void main(String [] args) {
        //declaramos el array de 6 elementos
        int[] numeros = new int[6];
        Random rand = new Random();

        //generar números aleatorios
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = rand.nextInt(49) + 1;
        }

        //ordenamos los números
        Arrays.sort(numeros);

        //mostramos los numeros
        System.out.println("Números de la lotería: " + Arrays.toString(numeros));
    }
}