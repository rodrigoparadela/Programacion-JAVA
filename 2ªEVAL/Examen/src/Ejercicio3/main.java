package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner datosp = new Scanner(System.in);

        System.out.print("Dime el nombre: ");
        String nombre = datosp.nextLine();
        System.out.print("Dime el contenido: ");
        String contenido = datosp.nextLine();

        crearFichero(nombre, contenido);
        leerSinEsp(nombre);
    }

    public static void crearFichero(String nombre, String contenido) {
        try {
            FileWriter fichero = new FileWriter(nombre);
            fichero.write(contenido);
            fichero.close();
            System.out.println("El fichero ha sido creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }
    }

    public static void leerSinEsp(String nombre) {
        try {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            int caracter;
            while ((caracter = br.read()) != -1) {
                // Si el caracter no es un espacio, imprimirlo
                if (caracter != ' ') {
                    System.out.print((char) caracter);
                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }


}
