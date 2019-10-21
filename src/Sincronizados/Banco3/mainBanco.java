package Sincronizados.Banco3;

public class mainBanco {
    public static void main(String[] args) {
        CuentaBancaria2 cuenta = new CuentaBancaria2(200,500);
        Persona1 h1 = new Persona1("Ana",cuenta);
        Persona2 h2 = new Persona2("Juan",cuenta);

        h1.start();
        h2.start();
    }
}
