public class Coche {
    //atributos
    String marca;
    String modelo;
    int año;
    double km;
    double litros;

    // MÉTODOS

    //encender
    public void encender() {
        System.out.println("El coche " + marca + " " + modelo + " está encendido.");
    }

    //apagar
    public void apagar() {
        System.out.println("El coche " + marca + " " + modelo + " está apagado.");
    }

    //conducir
    public void conducir(int kmRecorridos) {
        double litrosGastados = kmRecorridos * 0.08;  // 8 litros por 100km
        if (litros >= litrosGastados) {
            km += kmRecorridos;
            litros -= litrosGastados;
            System.out.println("Has conducido " + kmRecorridos + " km. Quedan " + litros + " litros.");
        } else {
            System.out.println("No hay suficiente combustible para recorrer " + kmRecorridos + " km.");
        }
    }

    //repostar
    public void repostar(double litrosAñadidos) {
        litros += litrosAñadidos;
        System.out.println("Has añadido " + litrosAñadidos + " litros. Ahora tienes " + litros + " litros.");
    }

    //imprimir info
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Kilómetros: " + km);
        System.out.println("Litros de combustible: " + litros);
    }


    //método principal con valores asignados
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.marca = "Audi";
        coche.modelo = "TT";
        coche.año = 2002;
        coche.km = 123456;
        coche.litros = 80.8;

        coche.encender();
        coche.apagar();
        coche.conducir(60);
        coche.repostar(19);
        coche.mostrarInformacion();
    }
}
