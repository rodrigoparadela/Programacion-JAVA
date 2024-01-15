package PracticaArraysII;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        /*4. Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos
             el array con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada
             posición y la suma de todos los valores.*/

        //Creamos el array pidiendo el tamaño al usuario
        System.out.println("Dime el tamaño que quieras para el array:");
        Scanner datosp = new Scanner(System.in);
        int tamaño = datosp.nextInt();
        int array[] = new int[tamaño];

        //Llenamos el array con valores aleatorios

        for (int cont=0; cont < tamaño; cont++){
            array[cont] = (int) (Math.random() * 10);
        }

        //Mostramos los valores por separado
        for (int cont=0; cont<tamaño; cont++){
            System.out.println("Posición " + (cont+1) + ": " + array[cont]);
        }

        //Sumamos los valores y mostramos el resultado por pantalla
        int res =0;
        for (int cont=0; cont<tamaño;cont++){
            res = res + array[cont];
        }

        System.out.println("La suma de todos los números del array es: " + res);



    }
}
