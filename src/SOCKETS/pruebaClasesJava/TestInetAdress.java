package SOCKETS.pruebaClasesJava;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAdress {

    public static void main(String[] args) {

        System.out.println("====================================================================");
        System.out.println("SALIDA PARA LOCALHOST: ");
        InetAddress dir = null;


        try {
            //LOCALHOST
            InetAddress p = InetAddress.getByName("225.222.222.222");
            System.out.println(p.getHostName());


            dir = InetAddress.getByName("localhost");
            pruebaMetodos(dir);

            //URL WW.GOOGLE.ES
            System.out.println("====================================================================");
            System.out.println("SALIDA PARA UNA URL:");
            dir = InetAddress.getByName("www.google.es");
            pruebaMetodos(dir);

            //ARRAY DE TIPO INETADRESS CON TODAS LAS DIRECCIONES IP
            System.out.println("DIRECCIONES IP PARA: "+dir.getHostName());
            InetAddress[] direcciones = InetAddress.getAllByName(dir.getHostName());
            for (int i=0; i<direcciones.length;i++){
                System.out.println(direcciones[i].toString());
            }

        }catch (UnknownHostException e){
            e.printStackTrace();
        }



    }
    private static void pruebaMetodos(InetAddress dir){
        System.out.println("Metodo getByName() "+dir);
        InetAddress dir2;
        try {
            dir2 = InetAddress.getLocalHost();
            System.out.println("Metodo getLocalHost() "+dir2);
        }catch (UnknownHostException e){e.printStackTrace();}

        //USAMOS MÉTODOS DE LA CLASE
        System.out.println("Metodo getHostName(): "+dir.getHostName());
        System.out.println("Metodo getHostAdress(): "+dir.getHostAddress());
        System.out.println("Metodo toString(): "+dir.toString());
        System.out.println("Metodo getCanonicalHostname(): "+dir.getCanonicalHostName());
    }

}
