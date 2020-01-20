package HILOS.Sincronizados.ProductorConsumidor3;

public class MainProductorConsumidor3 {
    public static void main(String[] args) {

        Cola cola = new Cola();
        Productor p1 = new Productor(cola,1);
        Consumidor c1 = new Consumidor(cola,1);
        Productor p2 = new Productor(cola,2);
        Consumidor c2 = new Consumidor(cola,2);
        Productor p3 = new Productor(cola,3);
        Consumidor c3= new Consumidor(cola,3);

        System.out.println(Productor.creados);
        System.out.println(Consumidor.creados);

        p1.start();
        c1.start();
        p2.start();
        c2.start();
        p3.start();
        c3.start();




    }
}
