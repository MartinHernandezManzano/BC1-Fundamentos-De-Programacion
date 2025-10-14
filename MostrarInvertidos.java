public class MostrarInvertidos{
    public static void main(String[] args){
        //creo un array 
        int[] numeros = {1,5,4,5,6,7,3,4,55};

        //bucle for en sentido contrario, desde -1 hasta 0
        for(int i = numeros.length-1; i >=0; i--){
            //i-- hace que el indice disminuya en 1
            System.out.print(numeros[i] + " ");
        }
    }
}