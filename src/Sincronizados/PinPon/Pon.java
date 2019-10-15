package Sincronizados.PinPon;

public class Pon extends Thread{
    PinPon pinPon;

    public Pon(PinPon pinPon){
            this.pinPon = pinPon;
        }

    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            pinPon.pon();
            //System.out.println(pinPon.pinp);
            //System.out.println(pinPon.pon());
        }
    }
}
