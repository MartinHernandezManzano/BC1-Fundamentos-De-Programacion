import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt(); //solicitamos y declaramos los numeros

        //operaciones
        System.out.printf("Suma:%d ", numero1 + numero2);
        System.out.printf("Resta:%d ", numero1 - numero2);
        System.out.printf("Multiplicacion:%d ", numero1 * numero2);

        //division con manejo del 0
        if (numero2 != 0) {
            System.out.printf("Division:%.2f ", (double)numero1 / numero2);           
            } else {
            System.out.println("No se puede dividir entre 0");
        }
        scanner.close();
    }
}
