package Sincronizados.Banco;

public class SacarDinero extends Thread{

            private CuentaBancaria cuenta;
            String nom;

            public SacarDinero(String n, CuentaBancaria cuenta){
                super();
                this.cuenta = cuenta;
                this.nom = n;
            }

            public String getNombre(){
                return nom;
            }


            @Override
            public void run() {
                for (int x=1; x<= 4; x++){
                    cuenta.retirarDinero(10,getNombre());
                }
            }
}//run
