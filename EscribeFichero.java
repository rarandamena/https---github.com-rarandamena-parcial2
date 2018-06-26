import java.io.*;
import java.util.*;


public class EscribeFichero
{
    private String nombrecito = null;
    private Scanner sc = new Scanner(System.in);
    private int Articulos = 0;
    private String nombre = null;
    public void escribiendo() {
        System.out.println("nombre del archivo a escribir:");
        nombrecito = sc.nextLine();

        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(nombrecito + ".txt");
            pw = new PrintWriter(fichero);
            System.out.println("cuantos articulos vas a ingresar (entero)?");
            Articulos = sc.nextInt();
            for (int i = 1; i <= Articulos; i++)
                pw.println("articulo " + i);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }


        }
    }

}
