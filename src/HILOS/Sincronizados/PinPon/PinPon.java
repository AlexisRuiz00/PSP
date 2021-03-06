package HILOS.Sincronizados.PinPon;

public class PinPon {
    String pinp;

    boolean wait = false;
    public PinPon(){
        wait  = false;
    }


    public synchronized void pin() {

        while (wait) {
            try {
                wait();
            } catch (Exception e) {}
        }

        pinp = "PIN";
        wait = true;
        System.out.println(pinp);
        notifyAll();
    }

    public synchronized void pon() {

        while (!wait) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("PON");
        pinp = "PON";
        wait = true;
        System.out.println(pinp);
        notifyAll();
    }
}