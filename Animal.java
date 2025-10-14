public class Animal{
    //creamos la clase animal con nombre, especie, edad y sonido
    String nombre;
    String especie;
    int edad;
    public void sonido(){
        System.out.println(nombre + " el " + especie + " hace ROARRR" + " y tiene " + edad + " años.");
    }
    //creamos el objeto Alex a partir de la clase animal
    public static void main(String [] args){
        Animal leon = new Animal();
        leon.nombre ="Alex";
        leon.especie = "Panthera leo";
        leon.edad = 5;
        leon.sonido();
    }
}

