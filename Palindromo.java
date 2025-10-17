import java.util.Scanner; 

public class Palindromo {
    public static void main(String[] args) {
        //creamos el escáner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);

        //imprimimos la petición de palabra o frase
        System.out.println("Ingrese una palabra o frase: ");

        //leemos la frase ingresada por el usuario y la guardamos en la variable texto
        String texto = scanner.nextLine();

        //normalizamos el texto: eliminamos espacios y convertimos a minúsculas
        String limpio = texto.replaceAll("\\s+", "").toLowerCase();
        /* 
        .replaceAll("\\s+", "") elimina todos los espacios en blanco del texto,
        "\\s+" es una expresión regular que representa uno o más espacios y
        .toLowerCase() convierte todo el texto a minúsculas para evitar errores por mayúsculas
        */

        //invertimos el texto limpio usando StringBuilder
        String revertido = new StringBuilder(limpio).reverse().toString();
        /*
        new StringBuilder(limpio) crea un objeto que permite modificar cadenas,
        .reverse() invierte el orden de los caracteres y
        .toString() convierte el resultado invertido nuevamente en un String
        */

        //comparamos el texto limpio con su versión invertida
        if (limpio.equals(revertido)) {
            //si son iguales, es un palíndromo
            System.out.println(texto + " es palíndromo");
        } else {
            //si no son iguales, no es palíndromo
            System.out.println(texto + " no es palíndromo");
        }

        //cerramos el escáner 
        scanner.close();
    }
}
