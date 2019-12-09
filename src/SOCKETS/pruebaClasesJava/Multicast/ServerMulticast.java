package SOCKETS.pruebaClasesJava.Multicast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ServerMulticast {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int puerto = 12345;

        MulticastSocket ms = new MulticastSocket(puerto);

        InetAddress grupo = InetAddress.getByName("225.0.0.1");
        String msg = "";

        while (!msg.trim().equals("*")) {

            System.out.print("Escribe: ");
            msg = br.readLine();

            DatagramPacket paquete = new DatagramPacket(msg.getBytes(), msg.length(), grupo, puerto);
            ms.send(paquete);
        }

        ms.close();
        System.out.println("Socket Cerrado");





    }


}
