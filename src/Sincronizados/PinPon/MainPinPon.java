package Sincronizados.PinPon;

public class MainPinPon {

    public static void main(String[] args) {

        PinPon pinpon = new PinPon();
        Pin hiloPin = new Pin(pinpon);
        Pon hiloPon = new Pon(pinpon);

        hiloPin.start();
        hiloPon.start();

    }
}
