package HILOS.Refuerzo.Stock;

import static java.lang.Thread.sleep;

public class Almacen {

    private Almacen almacen;
    private int stock;
    boolean notify = false;

    public Almacen (){
        this.stock = 8000;
    }



    public static void main(String[] args) {
        Almacen almacen = new  Almacen();


        while(true){
            try {
                sleep(24000);
                almacen.stock = almacen.stock - ((int) (Math.random()*501)+2000);

                if (almacen.notify){

                }


            }catch (Exception e){}
        }
    }


    public synchronized void put(int entrega) throws InterruptedException {

        if (stock + entrega > 20000)
            notify = true;
            wait();


        this.stock = stock+entrega;
    }


    public synchronized int getStock() {
        return stock;
    }
}