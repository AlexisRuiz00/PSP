package SOCKETS.pruebaClasesJava;

import java.net.MalformedURLException;
import java.net.URL;

public class Ejemplo1URL {
    public static void main(String[] args) {
        URL url;
        try {
            System.out.println("Constructor simple para una URL: ");
            url = new URL("http://docs.oracle.com/");
            Visualizar(url);

            System.out.println("Otro constructor simple para una URL: ");
            url = new URL("http://localhost/PFC/gest/cli/_gestion.php?S=3");
            Visualizar(url);

            System.out.println("Const. para protocolo +URL+ directorio: ");
            url = new URL("http","docs.oracle.com","/javase/10");
            Visualizar(url);

            System.out.println("Constructor para PROTOCOLO + URL + PUERTO + DIRECTORIO");
            url = new URL("http","localhost",8084,"/WebApp/Controlador?accion=modificar");
            Visualizar(url);

            System.out.println("Constructor para un objeto URL en un contexto");
            URL urlbase = new URL("http://docs.oracle.com/");
            Visualizar(url);


        }catch (MalformedURLException e){e.printStackTrace();}



    }

    private static void Visualizar (URL url){
        System.out.println("\tURL Completa: "+url.toString());
        System.out.println("\tgetProtocol(): "+url.getProtocol());
        System.out.println("\tgetHost(): "+url.getHost());
        System.out.println("\tgetPort(): " +url.getPort());
        System.out.println("\tgetFile(): "+url.getFile());
        System.out.println("\tgetUserInfo(): "+url.getUserInfo());
        System.out.println("\tgetPath(): "+url.getPath());
        System.out.println("\tgetAuthority(): "+url.getAuthority());
        System.out.println("\tgetQuery(): "+url.getQuery());
        System.out.println("\tgetDefaultPort(): " +url.getDefaultPort());

        System.out.println("===================================================================");
    }

}
