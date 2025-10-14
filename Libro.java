public class Libro{
    String titulo;
    String autor;
    int añoPublicacion;
    public void detalles(){
        System.out.println("El libro " + this.titulo + " por " + autor + " fue publicado en " + añoPublicacion + ".");
    }

    public static void main(String[] args){
        Libro libro = new Libro();
        libro.titulo = "El pollo Pepe";
        libro.autor = "Nick Denchfield";
        libro.añoPublicacion = 2002;
        libro.detalles();

    }
}