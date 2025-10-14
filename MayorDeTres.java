import java.util.Scanner;

public class MayorDeTres {
    int numero1;
    int numero2;
    int numero3;

    //creamos el constructor
    public MayorDeTres(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    //método para mostrar el mayor
    public void mostrarMayor() {
        int mayor;

        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        System.out.println("El mayor es: " + mayor);
        }

        //metodo main para leer los datos, crear objeto y llamar al método
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce el primer numero: ");
            int numero1 = sc.nextInt();

            System.out.print("Introduce el segundo numero: ");
            int numero2 = sc.nextInt();

            System.out.print("Introduce el tercer numero: ");
            int numero3 = sc.nextInt();

            sc.close();

            MayorDeTres ejemplo = new MayorDeTres(numero1, numero2, numero3);
            ejemplo.mostrarMayor();
        }
}
