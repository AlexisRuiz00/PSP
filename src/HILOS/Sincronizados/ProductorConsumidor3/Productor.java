package HILOS.Sincronizados.ProductorConsumidor3;

public class Productor extends Thread{
    private Cola cola;
    private int n =0;
    public static int creados = 0;


    public Productor(Cola cola, int n){
        Productor.creados++;
        this.cola = cola;
        this.n = n;
    }


    @Override
    public void run() {
           for (int i=0; i<5; i++){
              cola.put(i,n);
               System.out.println(this.getName());
           }
    }
}
