package ArchivosI;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la ruta del archivo y el texto a escribir
        System.out.print("Introduce la ruta del archivo: ");
        String rutaArchivo = scanner.nextLine();

        System.out.print("Introduce el texto a escribir en el archivo: ");
        String texto = scanner.nextLine();

        // Escribir el texto en el archivo
        escribirEnArchivo(rutaArchivo, texto);

        // Mostrar el texto con mayúsculas y minúsculas intercambiadas
        String textoMayusculasMinusculas = intercambiarMayusculasMinusculas(texto);
        System.out.println("Texto con mayúsculas y minúsculas intercambiadas: " + textoMayusculasMinusculas);
    }

    public static void escribirEnArchivo(String rutaArchivo, String texto) {
        try {
            FileWriter archivo = new FileWriter(rutaArchivo);
            archivo.write(texto);
            archivo.close();
            System.out.println("El texto ha sido escrito en el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static String intercambiarMayusculasMinusculas(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isUpperCase(caracter)) {
                resultado.append(Character.toLowerCase(caracter));
            } else if (Character.isLowerCase(caracter)) {
                resultado.append(Character.toUpperCase(caracter));
            } else {
                resultado.append(caracter); // Conservar otros caracteres sin modificar
            }
        }
        return resultado.toString();
    }
}