package ArchivosII;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Archivos {

    public void escribirArchivo(String ruta, String texto){
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(ruta));
            bw.write(texto);
        } catch (IOException e){
            System.out.println("Error al escribir el archivo: "+e.getMessage());

        } finally {
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e){
                    System.out.println("Error al cerrar el archivo: "+e.getMessage());

                }
            }
        }
    }

    public static void mostrarContenido(String ruta){
        try {
            Scanner datosp = new Scanner(String.valueOf(new FileWriter(ruta)));
            while (datosp.hasNext()){
                String palabra = datosp.next();
                StringBuilder resultado = new StringBuilder();
                for (int i = 0; i < palabra.length(); i++) {
                    char c = palabra.charAt(i);
                    if (Character.isLowerCase(c)) {
                        resultado.append(Character.toUpperCase(c));
                    } else if (Character.isUpperCase(c)) {
                        resultado.append(Character.toLowerCase(c));
                    } else {
                        resultado.append(c);
                    }
                }
                System.out.print(resultado + " ");
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }





}
