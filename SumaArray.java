import java.util.Scanner;
public class SumaArray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        //pedimos al ususario los numeros para el array
        System.out.println("Introduce 10 números enteros:");

        //bucle para colocar y guardar los números
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            //esto crea un array de 10 ints y lo llena con los inputs del usuario
        }
        //llamamos al método declarado abajo
        int resultado = sumarArray(numeros);
        System.out.println("La suma de los elementos es: " + resultado);
        scanner.close(); 
    }
    public static int sumarArray(int[] array){
        int suma = 0;
        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        return suma;
            //este método recorre el array y acumula la suma  
    }

}