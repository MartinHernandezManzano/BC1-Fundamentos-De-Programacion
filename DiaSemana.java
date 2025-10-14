import java.util.Scanner;
public class DiaSemana {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Ingresa un número del 1 al 7: ");//pedimos un num al usuario
         int numeroDia = scanner.nextInt();
         switch(numeroDia){ //configuramos un numero para cada dia
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3: 
                System.err.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7: 
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido"); //configuramos un "error" para el resto de numeros

         }
    }
}
