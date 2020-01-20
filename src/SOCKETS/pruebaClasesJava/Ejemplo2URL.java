package SOCKETS.pruebaClasesJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ejemplo2URL {
    public static void main(String[] args) throws IOException {

        URL url = null;
        try {
            url = new URL("https://www.elpais.com");
        }catch (MalformedURLException e){e.printStackTrace();}

        URLConnection urlConn = url.openConnection();
        BufferedReader in;

        try {
            //InputStream inputStream = url.openStream();
            InputStream inputStream = urlConn.getInputStream();
            in = new BufferedReader(new InputStreamReader(inputStream));

            String inputLine;
            while((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        }catch (IOException e){e.printStackTrace();}
    }//
}//Ejemplo2URL
