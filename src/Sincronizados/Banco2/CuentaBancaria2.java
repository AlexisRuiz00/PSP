package Sincronizados.Banco2;

public class CuentaBancaria2 {

    private int saldo;
    private int maxSaldo;


    public CuentaBancaria2(int saldo, int maxSaldo){
        this.saldo = saldo;
        this.maxSaldo=maxSaldo;
    }


    public synchronized void retirarDinero(int cant, String nom) {

        if (consultaSaldo() >= cant) {
            System.out.println(nom + " va a retirar " + cant + ", saldo actual: " + consultaSaldo());
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            restar(cant);
        } else {
            System.out.println(nom + "va a retirar " + cant + ", No hay dinero suficiente " + consultaSaldo());
        }
        if (consultaSaldo() < 0) {
            System.out.println("Saldo negativo => " + consultaSaldo());
        }
    }

    public synchronized void ingresarDinero(int cant, String nom){

            if(cant+this.saldo>500){System.out.println(nom + "va a ingresar " + cant +" la cuenta tiene "+saldo+"€, no se puede realizar un ingreso que supere los 500€");}
            else {
                System.out.println(nom + " va a ingresar " + cant + ", saldo actual: " + consultaSaldo());
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ingreso(cant);
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
