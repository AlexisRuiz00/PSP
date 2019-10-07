package Sincronizados.Banco;

public class CompartirInf3 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(40);
        SacarDinero h1 = new SacarDinero("Ana",cuenta);
        SacarDinero h2 = new SacarDinero("Juan",cuenta);

        h1.start();
        h2.start();
    }
}
