package Ejercicio4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner datosp = new Scanner(System.in);

        System.out.print("Dime la ruta: ");
        String ruta = datosp.nextLine();

        System.out.print("Dime el contenido: ");
        String texto = datosp.nextLine();

        escribirEnArchivo(ruta, texto);
        String textoModificado = mayusPorMinus(texto);
        System.out.println(textoModificado);
    }

    public static void escribirEnArchivo(String ruta, String texto) {
        try {
            FileWriter archivo = new FileWriter(ruta);
            archivo.write(texto);
            archivo.close();
            System.out.println("El texto se ha escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }

    public static String mayusPorMinus(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isUpperCase(caracter)) {
                resultado.append(Character.toLowerCase(caracter));
            } else if (Character.isLowerCase(caracter)) {
                resultado.append(Character.toUpperCase(caracter));
            } else {
                resultado.append(caracter);
            }
        }
        return resultado.toString();
    }

}
