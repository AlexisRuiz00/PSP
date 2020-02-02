package SERVICIOS;

import javafx.stage.FileChooser;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class App_Ftp implements ActionListener {

    private static App_Ftp app;
    FTPClient client;

    public App_Ftp(){

    }

    public static App_Ftp getApp(){
        if (app == null){
            app = new App_Ftp();
        }
        return app;
    }


    public static void main(String[] args) {
        getApp();

        String servidor = "localhost";
        String user = "usuario1";
        String pasw = "usuario1";

        try {
            app.client = new FTPClient();
            app.client.enterLocalPassiveMode();
            app.client.connect(servidor);
            boolean login = app.client.login(user, pasw);

            if (login){
                System.out.println("CONECTADO");

                View view = new View(app);
            }else{
                //ventana
            }



            app.client.setFileType(FTP.BINARY_FILE_TYPE);
        } catch (Exception e) { e.printStackTrace();
        }



    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        switch (actionEvent.getActionCommand()){

            case "subir":
                System.out.println("entras");

                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                chooser.showOpenDialog(new JFrame("Selcciona un fichero"));

                File selectedFile = chooser.getSelectedFile();
                if (selectedFile == null) {
                    System.out.println("No file selected!");
                }
                else {
                    try {
                        String directorio = selectedFile.getParent().replaceAll("/","\\");

/*                        if (!(app.client.changeWorkingDirectory(directorio))){
                            System.out.println(directorio);
                            if (client.makeDirectory(directorio)){
                                client.changeWorkingDirectory(directorio);

                            }else {
                                System.out.println("ERROR AL  CREAR EL DIRECTORIO");
                                //ventana no se ha podido crear el directorio
                                System.exit(0);
                            }
                        }*/

                        BufferedInputStream in = new BufferedInputStream(new FileInputStream(selectedFile));
                        if (client.storeFile(selectedFile.getName(),in)){
                            System.out.println("SUBIDO");
                            //ventana se ha subido
                        }else {
                            System.out.println("ERROR AL SUBIR");
                            //ventana no se ha subido
                        }


                    } catch (IOException e) {e.printStackTrace();}
                }



                break;

            case "baja":
                System.out.println("entras");

                chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                chooser.showOpenDialog(new JFrame("Selcciona un fichero"));

                selectedFile = chooser.getSelectedFile();
                if (selectedFile == null) {
                    System.out.println("No file selected!");
                }
                else {

                }



                break;
        }

    }
}
