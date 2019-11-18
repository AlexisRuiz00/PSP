package HILOS.EjercicioCajeraThread;

public class princ {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Cliente1",new int[]{2,2,1,5,2,3});
        Cliente cliente2 = new Cliente("Cliente2",new int[]{1,3,5,1,1});

        Cajera cajera1 = new Cajera("Cajera1",cliente);
        Cajera cajera2 = new Cajera("Cajera2",cliente2);

        long tiempo = System.currentTimeMillis();

        //cajera1.start();
        //cajera2.start();

    }}//END}