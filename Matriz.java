import java.util.Scanner;

public class Matriz {
    private int [][] matriz;

    // Constructor para inicializar la matriz
    public Matriz(int[][] matriz){
        this.matriz = matriz;
    }

    // Método para recorrer la matriz y sumar elementos
    public int sumaElementos(){
        int suma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    // Método para buscar el máximo
    public int maximoElemento(){
        int max = matriz[0][0];
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        return max; 
    }

    // Método para buscar el mínimo
    public int minimoElemento() {
        int min = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
            }
        }
        return min;
    }

    // Clase Main para probar el programa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] datos = new int[3][3];  // matriz 3x3

        System.out.println("Introduce 9 números para la matriz 3x3:");

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Número [" + i + "][" + j + "]: ");
                datos[i][j] = sc.nextInt();
            }
        }

        Matriz matriz = new Matriz(datos);

        System.out.println("Suma de elementos: " + matriz.sumaElementos());
        System.out.println("Máximo elemento: " + matriz.maximoElemento());
        System.out.println("Mínimo elemento: " + matriz.minimoElemento());

        sc.close();
    }
}
