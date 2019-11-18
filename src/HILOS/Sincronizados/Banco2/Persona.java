package HILOS.Sincronizados.Banco2;

public class Persona extends Thread{

            private CuentaBancaria2 cuenta;
            String nom;

            public Persona(String n, CuentaBancaria2 cuenta){
                this.cuenta = cuenta;
                this.nom = n;
            }

            public String getNombre(){
                return nom;
            }


            @Override
            public void run() {

                    for (int x = 1; x <= 2; x++) {
                        cuenta.retirarDinero(((int) (Math.random()*500+1)), getNombre());
                        cuenta.ingresarDinero((int) (Math.random()*500+1), getNombre());
                    }

            }
}//run
