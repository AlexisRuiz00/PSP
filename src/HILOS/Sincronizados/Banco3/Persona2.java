package HILOS.Sincronizados.Banco3;

public class Persona2 extends Thread{

            private CuentaBancaria2 cuenta;
            String nom;


            public Persona2(String n, CuentaBancaria2 cuenta){
                this.cuenta = cuenta;
                this.nom = n;
            }

            public String getNombre(){
                return nom;
            }


            @Override
            public void run() {

                    for (int x = 0; x <= 2; x++) {
                        cuenta.retirarDinero(((int) (Math.random()*500+1)), getNombre());
                    }

            }
}//run
