package Sincronizados.Contador;

public class HiloDecrementa extends Thread{

        private Contador contador;

        public HiloDecrementa(Contador contador){
            this.contador = contador;
        }

        @Override
        public void run() {
            synchronized(contador) {

                super.run();
                for (int i = 0; i <= 300; i++) {
                    contador.decrementa();
                    try {
                        sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        }
            System.out.println("HILO "+this.getName()+" vale "+this.contador.Valor());
        }//Run
    }//HiloDecrementa
