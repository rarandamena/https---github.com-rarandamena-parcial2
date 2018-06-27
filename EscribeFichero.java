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


                float total = 0;

            for (int i = 1; i <= Articulos; i++) {
                Scanner puercos = new Scanner(System.in);
                Scanner puercos02 = new Scanner(System.in);


                Item producto00 = new Item ("null", 0);

                System.out.println("ingrese nombre producto " + i);
                String producto = puercos02.nextLine();
                producto00.setProducto(producto);


                System.out.println("ingrese costo de producto " + i);
                float costo = puercos.nextFloat();
                producto00.setCosto(costo);



                float costito = producto00.getCosto();

                total = costito + total;

                pw.println("articulo "+ i + " " + producto + " "+ " " + costo);


            }
            pw.println("el total es: " + total);

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
