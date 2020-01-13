package HILOS.Refuerzo.Ej10;

import java.io.*;
import java.util.Optional;

public class HiloProductor extends Thread {

    private InputStream inputStream;
    private InputStreamReader inputStreamReader;
    private ControladorHilos controladorHilos;
    int character;



    public HiloProductor (String fileName, ControladorHilos controladorHilos) {
        try {
            inputStream = new FileInputStream(new File(fileName));
            inputStreamReader = new InputStreamReader(inputStream);
            this.controladorHilos = controladorHilos;
        }catch (IOException e){ e.printStackTrace();}
    }

    @Override
    public void run() {
        synchronized ( controladorHilos){

            try {
                character = inputStreamReader.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            while (character != -1) {
                controladorHilos.setCharacter((char) character);
                try {
                    character = inputStreamReader.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            controladorHilos.setCharacter((char) character);

            System.out.println("\nProceso Finalizado");

        }
    }
}
