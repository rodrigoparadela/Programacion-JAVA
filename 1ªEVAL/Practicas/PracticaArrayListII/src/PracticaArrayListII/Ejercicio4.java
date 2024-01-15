package PracticaArrayListII;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        /*4. Crea un programa en Java para gestionar una lista de números utilizando tanto un ArrayList
             como un array convencional. El programa permitirá realizar operaciones básicas como agregar
             números, calcular la suma y encontrar el número más grande en ambas estructuras.*/

        // Creamos el ArrayList
        ArrayList<Integer> listaNumerosArrayList = new ArrayList<>();

        // Creamos el array
        int[] listaNumerosArray = new int[100];

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar número");
            System.out.println("2. Calcular suma");
            System.out.println("3. Encontrar número más grande");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un número: ");
                    int numero = scanner.nextInt();

                    // Agregamos número al ArrayList
                    listaNumerosArrayList.add(numero);

                    // Agregamos número al array convencional
                    for (int i = 0; i < listaNumerosArray.length; i++) {
                        if (listaNumerosArray[i] == 0) {
                            listaNumerosArray[i] = numero;
                            break;
                        }
                    }
                    break;

                case 2:
                    // Calculamos la suma del ArrayList
                    int sumaArrayList = 0;
                    for (int i = 0; i < listaNumerosArrayList.size(); i++) {
                        sumaArrayList += listaNumerosArrayList.get(i);
                    }
                    System.out.println("Suma del ArrayList: " + sumaArrayList);

                    // Calculamos la suma del array convencional
                    int sumaArray = 0;
                    for (int i = 0; i < listaNumerosArray.length; i++) {
                        sumaArray += listaNumerosArray[i];
                    }
                    System.out.println("Suma del Array: " + sumaArray);
                    break;

                case 3:
                    // Encontramos el número más grande en el ArrayList
                    int maxArrayList = 0;
                    for (int i = 0; i < listaNumerosArrayList.size(); i++) {
                        int num = listaNumerosArrayList.get(i);
                        if (num > maxArrayList) {
                            maxArrayList = num;
                        }
                    }
                    System.out.println("El número más grande del ArrayList es: " + maxArrayList);

                    // Encontramos el número más grande en el array convencional
                    int maxArray = 0;
                    for (int i = 0; i < listaNumerosArray.length; i++) {
                        int num = listaNumerosArray[i];
                        if (num > maxArray) {
                            maxArray = num;
                        }
                    }
                    System.out.println("El número más grande del Array es: " + maxArray);
                    break;

                case 4:
                    System.out.println("Apagando el programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Seleccione otra opción");
            }

        } while (opcion != 4);
    }
}
