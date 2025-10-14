import java.util.Scanner;
public class SumaNumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //declarar suma total
        int sumaTotal = 0;
        int numero;
        //bucle para pedir numeros hasta que sea negativo
        //solicitar numeros
        System.out.print("Introduce un número: ");
        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();
            if (numero >=0) {   //si el numero es positivo, se suma
                sumaTotal += numero;
            }
        } while (numero >= 0);  //declaramos que el bucle es mientras sea positivo
        System.out.println("La suma total es: " + sumaTotal);  //mostramos la suma

        

        scanner.close();
    }
}
