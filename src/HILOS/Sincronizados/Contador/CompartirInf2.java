package HILOS.Sincronizados.Contador;

public class CompartirInf2 {
    public static void main(String[] args) {

        Contador cont = new Contador(100);

            HiloIncrementa hi = new HiloIncrementa(cont);
            HiloDecrementa hd = new HiloDecrementa(cont);
            hi.start();
            hd.start();
   }
}
