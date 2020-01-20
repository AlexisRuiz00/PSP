package HILOS.Refuerzo.Stock;

public class HiloConsume extends Thread {
    Almacen almacen;

    public HiloConsume(Almacen almacen){
        this.almacen = almacen;
    }


    @Override
    public void run() {

        while (true) {

            System.out.println("Almacen en espera, stock: " + almacen.stock);
            try {
                sleep(24000);
            } catch (Exception e) {
            }
            almacen.get();

        }
    }
}