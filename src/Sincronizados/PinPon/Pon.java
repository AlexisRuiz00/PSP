package Sincronizados.PinPon;

public class Pon extends Thread{
        PinPon pinPon;

        public Pon(PinPon pinPon){
            this.pinPon = pinPon;
        }
        @Override
        public void run() {
            pinPon.pon();
        }
}
