package HILOS.Refuerzo.Ej10;

public class HiloAlerta extends Thread {
    ControladorHilos controladorHilos;
    boolean flag =  true;

    public HiloAlerta(ControladorHilos controladorHilos){
        this.controladorHilos = controladorHilos;
    }

    @Override
    public void run() {

        while (flag) {
            flag=false;
            for (HiloConsumidor i : ControladorHilos.hiloConsumidors) {
                if (!i.getState().toString().equals("TERMINATED")){
                    flag = true;
            }}
        }
        controladorHilos.notifi();

    }
}
