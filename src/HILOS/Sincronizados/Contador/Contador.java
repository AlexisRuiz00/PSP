package HILOS.Sincronizados.Contador;

public class Contador {
    private int i = 0;

    public Contador(int i){
        this.i=i;
    }

    public void incrementa (){
        i+=1;}
    public void decrementa (){
        i-=1;}

    public int Valor(){
        return this.i;
    }
}
