public class ContarPares{
    public static void main(String[] args){
        int [] numeros = {1,2,3,4,5,6,7,8,9}; //declaramos el array
        int contadorPares = 0; //inicializamos el contador

        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0) {
                contadorPares++; //si el numero es par, aumentamos el contador

            }
        }
        System.out.println("Cantidad de números pares: " + contadorPares);
    }
}