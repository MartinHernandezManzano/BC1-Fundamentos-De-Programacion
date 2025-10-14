public class EncontrarMaximo{
    public static void main(String[] args){
        //defino el array
        int[] numeros = {3,56,5,6,7,33,4,5,77,6,34,98};

        //inicializamos la variable maximo con el primer numero del array
        int maximo = numeros[0];

        /*recorremos el array con un for para comparar cada número con el valor actual de
        maximo */
        for(int i = 1; i < numeros.length; i++){
            if (numeros[i] > maximo){
                maximo = numeros[i];
            }
        }
        // al terminar el bucle, el valor de maximo será el mayor número del array
        System.out.println("El valor máximo es: " + maximo);
    }
}