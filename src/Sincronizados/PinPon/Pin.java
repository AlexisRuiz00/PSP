package Sincronizados.PinPon;

public class Pin extends Thread {
    PinPon pinPon;

    public Pin(PinPon pinPon){
        this.pinPon = pinPon;
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            pinPon.pin();
            //System.out.println(pinPon.pinp);
            //System.out.println(pinPon.pin());
        }
    }
}