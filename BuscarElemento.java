public class BuscarElemento {
    public static void main(String[] args){
        // defino el array 
        int [] numeros = {3, 7, 1, 9, 5};

        // defino el numero a buscar
        int buscado = 1;

        //defino la variable para guardar la posición
        int posicion = -1;  //-1 es no encontrado

        //recorro el array
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
            posicion = i; //guardamos la posicion
            break;        //salimos del bucle si lo enocntramos
            }
        }

        //mostramos el resultado
        if (posicion == -1) {
            System.out.println("No se encontró el valor " + buscado + ".");
        } else {
            System.out.println("El valor " + buscado + " está en la posición: " + posicion);
        }

    }
}
