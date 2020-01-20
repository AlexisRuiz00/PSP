package HILOS.Refuerzo.Ej10;

import java.io.*;
import java.util.ArrayList;

public class ControladorHilos {

    private static ControladorHilos controladorHilos;
    private char character;
    private boolean available = true;
    static ArrayList<HiloConsumidor> hiloConsumidors;


    public static void main(String[] args) throws InterruptedException {
        controladorHilos = new ControladorHilos();
        hiloConsumidors = new ArrayList<>();

        HiloProductor hiloProductor = new HiloProductor("Refuerzo10.txt",controladorHilos);
        HiloConsumidor hiloConsumidor = new HiloConsumidor(controladorHilos);
        HiloConsumidor hiloConsumidor1 = new HiloConsumidor(controladorHilos);
        HiloConsumidor hiloConsumidor2 = new HiloConsumidor(controladorHilos);
        HiloAlerta hiloAlerta = new HiloAlerta(controladorHilos);

        hiloConsumidors.add(hiloConsumidor);
        hiloConsumidors.add(hiloConsumidor2);
        hiloConsumidors.add(hiloConsumidor1);
        hiloProductor.start();
        hiloConsumidor.start();
        hiloConsumidor1.start();
        hiloConsumidor2.start();
        hiloAlerta.start();


    }


    public void notifi(){
        for (HiloConsumidor i : hiloConsumidors) {
            System.out.println(i.getId()+" "+i.getState());
        }
    }



    public synchronized char getCharacter() {

        while (!available){
            try {
                wait();
            }catch (InterruptedException e){ e.printStackTrace();}
        }
        available = false;
        if ((character==(char)-1))available=true;
        notifyAll();
        return character;
    }

    public synchronized void setCharacter(char character) {

        while (available){
            try {
                wait();
            }catch (InterruptedException e){e.printStackTrace();}
        }
        this.character = character;
        available = true;
        notify();
    }
}
