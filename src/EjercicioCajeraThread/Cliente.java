package EjercicioCajeraThread;

public class Cliente {

    private String nombre;
    private int [] carro;


    public Cliente (String nombre, int[] carro){
        this.nombre = nombre;
        this.carro = carro;
    }


    public String getNombre() {
        return nombre;
    }
    public int[] getCarro() {
        return carro;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarro(int[] carro) {
        this.carro = carro;
    }
}
