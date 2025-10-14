import java.util.Scanner;
public class DiasMes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número del 1 al 12: ");
        int numeroMes = scanner.nextInt();

        int dias;
        String nombreMes;

        //definimos los meses
        switch(numeroMes){
            case 1:
                nombreMes = "Enero";
                dias = 31;   //declaramos el nombre del mes y los dias que tiene
                break;
            case 2:
                nombreMes = "Febrero";
                dias = 28;
                break;
            case 3: 
                nombreMes = "Marzo";
                dias = 31;
                break;
            case 4:
                nombreMes = "Abril";
                dias = 30;
                break;
            case 5:
                nombreMes ="Mayo";
                dias = 31;
                break;
            case 6:
                nombreMes = "Junio";
                dias = 30;
                break;
            case 7:
                nombreMes = "Julio";
                dias = 31;
                break;
            case 8: 
                nombreMes = "Agosto";
                dias = 31;
                break;
            case 9:
                nombreMes = "Septiembre";
                dias = 30;
                break;
            case 10:
                nombreMes = "Octubre";
                dias = 31 ;
                break;
            case 11: 
                nombreMes = "Noviembre";
                dias = 30;
                break;
            case 12: 
                nombreMes = "Diciembre";
                dias = 31;
                break;
            default: 
                nombreMes = "No encontrado";
                dias = 0;

        }
        if (dias > 0){
            System.out.println(nombreMes + " tiene " + dias + " dias");
            // lo juntamos para la salida
        } else {
             System.out.println("Error"); //descartamos las demas opciones
        }
        scanner.close();
    }    
}