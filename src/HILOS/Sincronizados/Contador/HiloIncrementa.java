package HILOS.Sincronizados.Contador;

public class HiloIncrementa extends Thread{
    private Contador contador;

    public HiloIncrementa(Contador contador){
        this.contador = contador;
    }

    @Override
    public void run() {
        synchronized(contador) {

            super.run();
            for (int i = 0; i <= 300; i++) {
                contador.incrementa();
                try {
                    sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("HILO "+this.getName()+" vale "+this.contador.Valor());
    }//Run
}//HiloIncrementa
