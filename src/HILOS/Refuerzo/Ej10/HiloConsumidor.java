package HILOS.Refuerzo.Ej10;

import java.io.*;

public class HiloConsumidor extends Thread {


    private ControladorHilos controladorHilos;
    char character;



    public HiloConsumidor(ControladorHilos controladorHilos) {

            this.controladorHilos = controladorHilos;
    }

    @Override
    public void run() {

       // synchronized (controladorHilos) {

            while ((character = controladorHilos.getCharacter()) != (char) -1) {
                System.out.print(character);
                System.out.println(getId());
            }
       // }
    }
}
