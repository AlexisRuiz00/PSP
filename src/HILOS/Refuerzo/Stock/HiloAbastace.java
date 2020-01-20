package HILOS.Refuerzo.Stock;

public class HiloAbastace extends Thread {

    Almacen almacen;
    int entrega;


    public HiloAbastace(Almacen almacen){
        this.almacen = almacen;
    }



    @Override
    public void run() {

        while (true){

            entrega = ((int) (Math.random() * 601) + 400);
            almacen.put(entrega);

            try {
                sleep(8000);
            } catch (Exception e) {
            }
        }
    }
}
