package Sincronizados.ProductorConsumidor3;

public class Consumidor extends Thread{

    private Cola cola;
    private int n;
    public static int creados = 0;
    private int i;

    public Consumidor(Cola cola,int n){
        this.cola = cola;
        creados++;
        this.n = n;
    }


    @Override
    public void run() {
    for (int i=1;i<5;i++) {
        cola.get(n,i);
        }
    }
}