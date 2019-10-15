package Sincronizados.ProductorConsumidor3;

public class Consumidor extends Thread{

    private Cola cola;
    private int n;
    public static int creados = 0;

    public Consumidor(Cola cola,int n){
        this.cola = cola;
        Consumidor.creados++;
        this.n = n;
    }


    @Override
    public void run() {
    for (int i=0;i<5;i++) {
        cola.get(i,n);
        System.out.println(this.getName());
        }
    }
}