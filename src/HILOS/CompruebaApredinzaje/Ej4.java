package HILOS.CompruebaApredinzaje;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ej4 {

    public static void main(String[] args) throws IOException {



        for (int i = 0; i<args.length;i++){
            File f = new File(args[i]);
            procesoLibro x = new procesoLibro(f);
            x.start();
        }


    }


    static class procesoLibro extends Thread{
        File f;
        int cuenta = 0;
        long comienzo = 0;
        long fin = 0;
        long tiempo = 0;

        procesoLibro(File f){
            this.f = f;
        }

        @Override
        public void run() {
            try {

                this.comienzo = System.currentTimeMillis();

                FileReader fr = new FileReader(f);
                int i;
                while ((i=fr.read()) != -1)
                    if((char)i == ' ' || (char)i == '\n')
                    cuenta++;

                 if(cuenta == 0){
                     fr = new FileReader(f);
                     if (fr.read()!=-1)cuenta++;
                 }

                this.fin = System.currentTimeMillis();
                System.out.println("El proceso "+getId()+" a tardado "+(this.fin-this.comienzo)+" milisegudos el fichero "+f.getName()+" tiene "+cuenta+" caracteres");
        } catch (Exception e) {
                e.printStackTrace();
            }



        }
    }




}
