public class Estudiante{
    //creamos al estudiante con sus atributos
    String nombre;
    int edad;
    String carrera;
    public void saludo(){
        System.out.println( "Hola, soy " + this.nombre +  ", tengo " + this.edad + " años y estudio " + this.carrera + ".");
    }

    //método
    public void Estudiar(String asignatura){
        System.out.println(this.nombre + " está estudiando " + asignatura + ".");
    }

    //creamos un estudiante
    public static void main(String[] args){
        Estudiante Lore = new Estudiante();
        Lore.nombre ="La Lore";
        Lore.edad = 19;
        Lore.carrera = "trabajo social";
        Lore.saludo();
        Lore.Estudiar("integración");
    }
}