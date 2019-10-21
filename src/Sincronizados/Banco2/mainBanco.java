package Sincronizados.Banco2;

public class mainBanco {
    public static void main(String[] args) {
        CuentaBancaria2 cuenta = new CuentaBancaria2(500,500);
        Persona h1 = new Persona("Ana",cuenta);
        Persona h2 = new Persona("Juan",cuenta);

        h1.start();
        h2.start();
    }
}
