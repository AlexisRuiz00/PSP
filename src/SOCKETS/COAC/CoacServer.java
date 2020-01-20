package SOCKETS.COAC;

import java.io.*;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class CoacServer {
    public static void main(String[] args) {

    try {
        InetAddress grupo = InetAddress.getByName("225.0.0.1");
        int puerto = 1209;
        MulticastSocket socket = new MulticastSocket();


        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("¿Introducir agrupación? S/N");
        if (br.readLine().equalsIgnoreCase("n")){}
        else {
            do {
                String nombre = "";
                String tipo = "";
                int clasificacion = 0;

                System.out.print("Nombre: ");
                nombre = br.readLine();

                System.out.print("Tipo: ");
                tipo = br.readLine();

                System.out.print("Clasificación: ");
                try {
                 clasificacion = Integer.valueOf(br.readLine());
                }catch (Exception e){clasificacion = -1;}
                Mensaje mensaje = new Mensaje(nombre, tipo, clasificacion);

                DatagramPacket envio = new DatagramPacket(mensaje.toByteArray(), mensaje.toByteArray().length, grupo, puerto);
                socket.send(envio);

                System.out.println("Pulsa intro para introducir una nueva agrupación, o una letra para terminar");
            } while (br.readLine().equalsIgnoreCase(""));
            socket.leaveGroup(grupo);
            socket.close();
        }
    } catch (Exception e) {e.printStackTrace();}



    }//main


}//end
