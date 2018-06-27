import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] ar) {
        LeerFichero lector01 = new LeerFichero();

        try {


            lector01.lector();


        } catch (Exception e) {
            System.out.println("ups, se salio de control");
            System.out.println("intentemos nuevamente desde 0");
            lector01.lector();

        }
        System.out.println("volver a iniciar? si o nel pastel");
        Scanner iterar = new Scanner(System.in);
        String iterando = iterar.next();
        if (iterando.equals("si")) {
            lector01.lector();
        } //no else
        System.out.println("solo estas jugando conmigo.....");
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("como ella lo hizo u.u");
    }
}
