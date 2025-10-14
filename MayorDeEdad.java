import java.util.Scanner; //para leer informacion
import java.time.LocalDate; //para extraer la fecha actual
public class MayorDeEdad {  //creamos la clase
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //creamos el objeto scanner
        System.out.print("Ingresa tu año de nacimiento: ");
        int FechaNacimiento = scanner.nextInt(); //lee el año de nacimineto
        int FechaActual = LocalDate.now().getYear(); //declaramos la fecha actual
        int edad = FechaActual - FechaNacimiento; //calculamos la edad 
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad");
        }
        scanner.close();
    }
}