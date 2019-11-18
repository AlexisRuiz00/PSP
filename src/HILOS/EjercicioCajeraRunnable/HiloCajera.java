package HILOS.EjercicioCajeraRunnable;

import HILOS.EjercicioCajeraThread.Cajera;
import HILOS.EjercicioCajeraThread.Cliente;

public class HiloCajera implements Runnable{

    private Cajera cajera;
    private Cliente cliente;
    private long time;

    public HiloCajera (Cajera cajera, Cliente cliente, long time){
        this.cajera = cajera;
        this.cliente = cliente;
        this.time = time;
    }

    public void run() {

        System.out.println("Cajera "+ this.cajera.getName()+ " Procesa la compra de "
        + cliente.getNombre() + " En el tiempo "+ (System.currentTimeMillis() - time)/1000+" seg");

        for (int i=0; i<cliente.getCarro().length; i++){
            this.espera(cliente.getCarro()[i]);
            System.out.println("Cajera "+cajera.getName()+" procesado el producto "+ (i+1+" en ") + (System.currentTimeMillis() - time)/1000+" seg");
        }

        System.out.println(cliente.getNombre()+" Terminado en "+ (System.currentTimeMillis() - time)/1000+" seg");
    }


    private void espera (int seg){
        try {
            Thread.sleep(seg*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }






}//endCajera}