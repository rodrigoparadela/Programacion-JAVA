package PracticaArraysII;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el tamaño del array para almacenar 15 nombres
        int numNombres = 15;
        String[] nombres = new String[numNombres];

        // Solicitar los nombres por pantalla
        System.out.println("Ingrese 15 nombres:");

        // Leer los nombres y almacenarlos en el array
        for (int i = 0; i < numNombres; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            // Verificar si el nombre ya existe en el array
            if (existeNombre(nombres, nombre)) {
                System.out.println("Usted ya fue inscrito. Ingrese otro nombre.");
                i--; // Decrementar el índice para volver a solicitar el mismo nombre
            } else {
                nombres[i] = nombre;
            }
        }

        // Mostrar el array de nombres
        System.out.println("\nArray de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Método para verificar si un nombre ya existe en el array
    private static boolean existeNombre(String[] array, String nombre) {
        for (String n : array) {
            if (n != null && n.equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
}
