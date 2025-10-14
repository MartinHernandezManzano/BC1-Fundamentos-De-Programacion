import java.util.Scanner;

public class ValidarHora {
    //atributos de la clase
    int hora;
    int minuto;
    int segundo;

    //constructor de la clase
    public ValidarHora(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    //método para validar horas
    public boolean esHoraValida() {
        if (hora >= 0 && hora < 24 && 
            minuto >= 0 && minuto < 60 && 
            segundo >= 0 && segundo < 60) {
            return true;
        } else {
            return false;
        }
    }


    //pedimos al usuario los detalles e interactuamos en consola
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Introduce la hora: ");
        int hora = scanner.nextInt();

        System.out.println("Introduce los minutos: ");
        int minuto = scanner.nextInt();

        System.out.println("Introduce los segundos: ");
        int segundo = scanner.nextInt();


        //llamamos al método
        ValidarHora horaUsuario = new ValidarHora (hora, minuto, segundo);
        if (horaUsuario.esHoraValida()) {
            System.out.println("La hora introducida es válida");
        } else {
            System.out.println("La hora no es válida");
        }

        scanner.close();

    } 
}