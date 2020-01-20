package HILOS.Refuerzo.Stock;

public class hiloAbastace extends Thread {

    Almacen almacen;
    int entrega;

    @Override
    public void run() {

    try {
        sleep(8000);
    }catch (Exception e){}

    entrega = entrega - ((int) (Math.random()*601)+400);
    if (almacen.getStock() + entrega > 20000){
    }

        (almacen.getStock() >= 20000){

        }


    }
}
