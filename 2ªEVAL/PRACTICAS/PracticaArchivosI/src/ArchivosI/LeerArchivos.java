package ArchivosI;

import java.io.FileReader;
import java.io.IOException;

public class LeerArchivos {
    public void leerSinEsp(){
        String ruta="C:/Users/rodri/Desktop/Programacion-JAVA/2ªEVAL/PRACTICAS/PracticaArchivosI/prueba.txt";

        FileReader fichero=null;

        try {
            fichero = new FileReader(ruta);
            int caracter;
            while ((caracter = fichero.read()) !=-1){
                if (caracter != ' '){
                    System.out.print((char) caracter);

                }
            }

        } catch (IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());

        } finally {
            try {
                if (fichero !=null){
                    fichero.close();
                }

            } catch (IOException e){
                System.out.println("Error al cerrar el archivo: "+e.getMessage());
            }
        }
    }
}
