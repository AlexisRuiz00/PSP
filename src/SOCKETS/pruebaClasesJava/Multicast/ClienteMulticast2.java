package SOCKETS.pruebaClasesJava.Multicast;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ClienteMulticast2 {

    public static void main(String[] args) throws Exception{


        //1º Crear socket multicast
        int puerto = 12345;
        MulticastSocket ms = new MulticastSocket(puerto);

        InetAddress grupo = InetAddress.getByName("225.0.0.1");
        ms.joinGroup(grupo);

        String msg = "";

        while (!msg.trim().equals("*")) {

            byte[] buf = new byte[1000];

            DatagramPacket paquete = new DatagramPacket(buf,buf.length);
            ms.receive(paquete);
            msg = new String(paquete.getData());

            System.out.println("Recibido: "+msg.trim());
        }

        ms.close();
        System.out.println("Socket Cerrado");

    }

}
