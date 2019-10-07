package EjercicioCajeraThread;

public class Cajera //extends Thread
    {
    private String nombre;
    private Cliente cliente;

    public Cajera(String nombre, Cliente cliente){
        this.nombre = nombre;
        this.cliente = cliente;
    }


    /*
    public void run() {
        long time = System.currentTimeMillis();
        System.out.println("Cajera "+nombre+ " Procesa la compra de "
        + cliente.getNombre() + "En el tiempo "+ (System.currentTimeMillis() - time)/1000+" seg");


        for (int i=0; i<cliente.getCarro().length; i++){
            this.espera(cliente.getCarro()[i]);
            System.out.println("Cajera "+nombre+" procesado el producto "+ (i+1+" en ") + (System.currentTimeMillis() - time)/1000+" seg");
        }

        System.out.println(cliente.getNombre()+" Terminado en "+ (System.currentTimeMillis() - time)/1000+" seg");
    }
    */

    private void espera (int seg){
        try {
            Thread.sleep(seg*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public String getName (){
        return  this.nombre;
    }




}//endCajera}