import java.util.Scanner;

// clase principal
public class SumaDiagonal {
    private int[][] matriz;

    // constructor: recibe la matriz y la guarda en la clase
    public SumaDiagonal(int[][] matriz) {
        this.matriz = matriz;
    }

    // método que suma los elementos de la diagonal principal
    public int sumaDiagonalPrincipal() {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i]; // cogemos solo los [0][0], [1][1], [2][2]
        }
        return suma;
    }

    // método main para probar el programa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] datos = new int[3][3]; // matriz 3x3 vacía

        System.out.println("Introduce 9 números para llenar la matriz 3x3:");

        // rellenamos la matriz con datos del usuario
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Número [" + i + "][" + j + "]: ");
                datos[i][j] = sc.nextInt();
            }
        }

        // creamos el objeto y usamos el método
        SumaDiagonal matriz = new SumaDiagonal(datos);

        // mostramos la matriz en formato tabla
        System.out.println("\nMatriz introducida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }

        // mostramos la suma de la diagonal
        System.out.println("\nSuma de la diagonal principal: " + matriz.sumaDiagonalPrincipal());

        sc.close();
    }
}
