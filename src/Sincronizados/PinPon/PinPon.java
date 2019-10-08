package Sincronizados.PinPon;

public class PinPon {

    boolean wait;
    public PinPon(){
        wait  = false;
    }


    public synchronized void pin(){

        for (int i=0;i<5;i++) {

            while (wait) {
                try {
                    wait();
                    //System.out.println("ENTRA PIN");
                } catch (Exception e) { }
            }
            try {
                wait(100);
            }catch (Exception e) {}
                wait = true;
                notify();
                System.out.println("PIN");

        }

   }

    public synchronized void pon(){
       for (int i=0;i<5;i++) {

            while (!wait) {
                try {
                    wait();
                    //System.out.println("ENTRA PON");
                } catch (Exception e) {
                    e.printStackTrace();
                }}
               try {
                   wait(100);
               }catch (Exception e) {}
                wait = false;
                notify();
                System.out.println("PON");



        }
    }

}