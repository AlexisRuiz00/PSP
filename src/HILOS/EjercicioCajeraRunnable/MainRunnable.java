package HILOS.EjercicioCajeraRunnable;
import HILOS.EjercicioCajeraThread.Cajera;
import HILOS.EjercicioCajeraThread.Cliente;

public class MainRunnable {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Cliente1",new int[]{2,2,1,5,2,3});
        Cliente cliente2 = new Cliente("Cliente2",new int[]{1,3,5,1,1});
        Cajera cajera1 = new Cajera("Cajera1", cliente);
        Cajera cajera2 = new Cajera("Cajera2", cliente2);

        HiloCajera cajeraRunnable1 = new HiloCajera(cajera1,cliente,System.currentTimeMillis());
        HiloCajera cajeraRunnable2 = new HiloCajera(cajera2,cliente2,System.currentTimeMillis());

        Thread hilo1 = new Thread(cajeraRunnable1);
        Thread hilo2 = new Thread(cajeraRunnable2);

        hilo1.start();
        hilo2.start();

    }}//END}