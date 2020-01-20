package SOCKETS.COAC;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Pantalla2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        InetAddress grupo = InetAddress.getByName("225.0.0.1");
        int puerto = 1209;
        MulticastSocket socket = new MulticastSocket(puerto);
        socket.joinGroup(grupo);

        byte[] recibidos = new byte[1024];
        DatagramPacket recibo = new DatagramPacket(recibidos,recibidos.length);

        while (true){
            socket.receive(recibo);
                Mensaje mensaje = Mensaje.fromByteArray(recibidos);
                System.out.println(mensaje);
        }

    }

}
