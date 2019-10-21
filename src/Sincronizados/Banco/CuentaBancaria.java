package Sincronizados.Banco;

public class CuentaBancaria {

    private int saldo;

    public CuentaBancaria(int saldo){
        this.saldo = saldo;
    }


    public synchronized void retirarDinero(int cant, String nom){

        if (consultaSaldo() >= cant){
            System.out.println(nom+" va a retirar "+cant+", saldo actual: "+consultaSaldo());
                    try {
                        Thread.sleep(500);
                    }catch (Exception e ){
                        e.printStackTrace();
                    }
             restar(cant);
        }else{
            System.out.println("No hay dinero suficiente "+consultaSaldo());
        }
        if(consultaSaldo()<0){
            System.out.println("Saldo negativo => "+consultaSaldo());
        }
    }

    public void restar(int dinero){
        this.saldo-=dinero;
    }
    public void ingreso(int dinero){
        this.saldo += dinero;
    }
    public int consultaSaldo(){
        return saldo;
    }

}
