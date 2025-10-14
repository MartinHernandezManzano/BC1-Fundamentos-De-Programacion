public class CuentaBancaria {
    //atributos de la clase 
    String titular;
    double saldo;
    String numeroCuenta;

    //constructor de la clase
    public CuentaBancaria(String titular, double saldo, String numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo; 
        this.numeroCuenta = numeroCuenta;
    }

    //métodos de la clase

    //depositar dinero 
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    //retirar dinero
    public void retirar(double cantidad){
        if(saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    //mostrar saldo
    public void mostrarSaldo() {
        System.out.println("Saldo actual de la cuenta " + numeroCuenta + " : " + saldo);
    }

    //creamos un objeto y aplicamos los métodos
    public class Main {
        public static void main(String [] args) {

            //objetos
            CuentaBancaria cuenta1 = new CuentaBancaria("doctor Bacterio", 998765.78, "TIA1234");
            CuentaBancaria cuenta2 = new CuentaBancaria("Filemón Páez", 5678987.12, "TIA5678");

            //métodos
            cuenta1.depositar(500);
            cuenta1.retirar(350);
            cuenta1.mostrarSaldo();

            cuenta2.depositar(1000);
            cuenta2.retirar(2000);
            cuenta2.mostrarSaldo();
        }
    }
 }
    