import java.util.Scanner;

public class GestorNotas {
    //declaramos los arrays de nombres de estudiantes y notas
    static String[] nombres = new String[10];
    static double[] notas = new double[10];

    //declaramos un contador para saber cuantos estudiantes hay
    static int contador = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      /*para el menu interactivo, usaremos un while para que se 
       repita hasta que el user decida salir y un switch para 
       ejecutar la opcion elegida */  
       while(true) {
            System.out.println("---MENÚ---");
            System.out.println("1. Registrar nuevo estudiante");
            System.out.println("2. Calcular media");
            System.out.println("3. Mostrar estadísticas");
            System.out.println("4. Buscar estudiante");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            //declaramos la opcion
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion) {
                case 1:
                /*pedimos el nombre y la nota para registrar un estudiante,
                y nos aseguramos que haya menos de 10*/
                if (contador < 10){
                    System.out.println("Ingresa el nombre del estudiante: ");
                    String nombre = scanner.nextLine();

                    System.out.println("Ingresa la nota: ");
                    double nota = scanner.nextDouble();
                    scanner.nextLine();

                    //añadimos al contador
                    nombres[contador] = nombre;
                    notas[contador] = nota;
                    contador++;

                    //imprimimos mensajes de error o éxito
                    System.out.println("Estudiante registrado con éxito.");
                } else {
                    System.out.println("No se pueden registrar más estudiantes.");
                }
                    break;


                case 2:
                //calculamos el promedio y lo imprimimos junto a un mensaje de calificación global
                if (contador == 0) {
                    System.out.println("No hay estudiantes registrados.");
                } else {
                    double suma = 0;
                    for (int i = 0; i < contador; i++){
                        suma += notas[i];//añadimos las notas a la suma
                    }
                    double promedio = suma / contador; //para sacar la media
                    System.out.println("Promedio general: " + promedio);

                    if (promedio >= 5) {
                        System.out.println("Calificación global: Aprobado");
                    } else {
                        System.out.println("Calificación global: Suspenso");
                    }
                }
                    break;


                case 3:
                /*recorremos el array para encontrar las estadísticas:
                 * nota mas alta, mas baja, nº aprobados y nº suspensos
                 */
                if (contador == 0) {
                    System.out.println("No hay estudiantes registrados.");
                } else {
                    double max = notas[0]; //declaramos la primera posicion
                    double min = notas[0];
                    int aprobados = 0; //declaramos el nº de apr. y susp.
                    int suspensos = 0;

                    //bucle para buscar el max y min y añadir nº apro y nº susp
                    for (int i = 0; i < contador; i++){
                        if(notas[i] > max) {
                            max = notas[i];
                        }
                        if(notas[i] < min) {
                            min = notas[i];
                        }
                        if(notas[i] >= 6) {
                            aprobados++;
                        } else {
                            suspensos++;
                        }
                    }

                    System.out.println("Nota más alta: " + max);
                    System.out.println("Nota más baja: " + min);
                    System.out.println("Cantidad de aprobados: "+ aprobados);
                    System.out.println("Cantidad de suspensos: " + suspensos);
                }
                    break;


                case 4:
                /* para buscar un estudiante, pedimos el nombre y lo comparamos con los 
                 * valores del array nombres */
                if (contador == 0) {
                    System.out.println("No hay estudiantes registrados.");
                } else {
                    System.out.print("Ingresa el nombre del estudiante a buscar: ");
                    String nombreBuscado = scanner.nextLine(); //declaramos el nombre buscado
                    boolean encontrado = false;

                    for (int i = 0; i < contador; i++) {
                        if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                            System.out.println("Nota de " + nombres[i] + ": " + notas[i]);
                            encontrado = true; //encontrado
                            break; //salimos del bulce
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Estudiante no encontrado.");
                    }
                }               
                    break;

                case 5:
                //
                    System.out.println("Saliendo del programa...");
                    return; //salir del método
                default:
                    System.out.println("Opción no válida. Ingresa un número válido.");
                    
            }
        }
    }
}