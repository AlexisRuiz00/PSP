package Sincronizados.PinPon;

public class Pin extends Thread {
    PinPon pinPon;

    public Pin(PinPon pinPon){
        this.pinPon = pinPon;
    }

    @Override
    public void run() {
        pinPon.pin();
    }
}