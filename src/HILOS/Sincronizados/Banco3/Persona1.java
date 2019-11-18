package HILOS.Sincronizados.Banco3;

public class Persona1 extends Thread{

            private CuentaBancaria2 cuenta;
            String nom;

            public Persona1(String n, CuentaBancaria2 cuenta){
                this.cuenta = cuenta;
                this.nom = n;
            }

            public String getNombre(){
                return nom;
            }


            @Override
            public void run() {

                    for (int x = 0; x <= 2; x++) {
                        cuenta.ingresarDinero((int) (Math.random()*500+1), getNombre());
                    }

            }
}//run
