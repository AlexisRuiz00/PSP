package Sincronizados.ProductorConsumidor3;

public class Productor extends Thread{
    private Cola cola;
    private int n;
    public static int creados = 0;


    public Productor(Cola cola, int n){
        this.cola = cola;
        this.n = n;
    }


    @Override
    public void run() {
           for (int i=1; i<5; i++){
              cola.put(i,n);
           }
    }
}
