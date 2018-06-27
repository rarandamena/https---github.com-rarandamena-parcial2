import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class LeerFichero {

    private String condicional;
    private Scanner sc = new Scanner(System.in);
    private String nombrecito = null;


    public void lector() {

        System.out.println("cual es el nombre de tu archivo? (-1 para salir)");
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        nombrecito = sc.nextLine();
        if (nombrecito == "-1" ) {


            try {
                // Apertura del fichero y creacion de BufferedReader para poder
                // hacer una lectura comoda (disponer del metodo readLine()).
                archivo = new File(nombrecito + ".txt");

                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                // Lectura del fichero
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
                System.out.println("----este es el contenido de tu archivo----");

                System.out.println("------quieres editarlo?------");
                Scanner condi0 = new Scanner(System.in);
                String condicional02 = condi0.next();
                if (condicional02.equals("si")) {

                    try {

                        File objetofile = new File(nombrecito + ".txt");
                        Desktop.getDesktop().open(objetofile);
                        System.in.read();

                        System.out.println("todo de nuevo");


                    } catch (IOException ex) {

                        System.out.println(ex);

                    }
                }
                lector();

            } catch (Exception e) {
                System.out.println("rayos y centellas");
                System.out.println("el archivo no existe, lo creamos?");
                Scanner cond = new Scanner(System.in);
                String condicional = cond.next();
                if (condicional.equals("si")) {
                    EscribeFichero escribe01 = new EscribeFichero();
                    escribe01.escribiendo();

                } //no else

            } finally {
                // En el finally cerramos el fichero, para asegurarnos
                // que se cierra tanto si todo va bien como si salta
                // una excepcion.
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }else{
            System.exit(0);
        }
    }
}





