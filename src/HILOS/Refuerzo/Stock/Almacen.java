package HILOS.Refuerzo.Stock;

import static java.lang.Thread.sleep;

public class Almacen {

    int stock;
    boolean lleno = false;

    public Almacen (){
        this.stock = 19900;
    }



    public static void main(String[] args) {
        Almacen almacen = new  Almacen();
        HiloAbastace hiloAbastace = new HiloAbastace(almacen);
        HiloConsume hiloConsume = new HiloConsume(almacen);
        hiloAbastace.start();
        hiloConsume.start();

    }



    public synchronized void get(){

        this.stock = this.stock - ((int) (Math.random() * 501) + 2000);
        System.out.println("Almacen consume, stock: " + this.stock);

        if (this.lleno) {
            notifyAll();
            this.lleno = false;
        }
    }




    public synchronized void put(int entrega) {

        System.out.println("Entra hilo entrega");

        if (stock + entrega > 20000) {
            System.out.println("Almacen lleno, se para la entrega. Stock actual: "+this.stock);
            this.lleno = true;
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.stock = stock+entrega;
        System.out.println("Se realiza entrega, stock: "+this.stock);
    }

}