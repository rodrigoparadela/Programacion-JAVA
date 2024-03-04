package ArchivosII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datosp = new Scanner(System.in);
        System.out.print("Dime la ruta del archivo: ");
        String ruta = datosp.nextLine();
        System.out.print("Dime el texto que quieras introducir: ");
        String texto = datosp.nextLine();

        Archivos archivo1 = new Archivos();
        archivo1.escribirArchivo(ruta,texto);
        archivo1.mostrarContenido(ruta);

    }
}