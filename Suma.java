public class Suma{
    public static void main(String args[]){
        int[] numeros = {4,20,69,1,420}; //declaramos el array
        int suma = 0; // inicializamos la suma en 0

        //recorremos el array y sumamos cada elemento
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }

        //Mostrar el resultado
        System.out.println("La suma de los elementos es: " + suma);
    }
}