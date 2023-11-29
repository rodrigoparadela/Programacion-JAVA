package PracticaMatricesII;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        /*2. Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra
             matriz. Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices
             originales y el resultado.*/

        //Creamos las matrices pidiendo el tamaño al usuario
        int tamaño;
        Scanner datosp=new Scanner(System.in);
        System.out.println("Dime el tamaño de la matriz cuadrada.");
        tamaño= datosp.nextInt();
        int[][] numeros=new int[tamaño][tamaño];
        int[][] numeros2=new int[tamaño][tamaño];
        int[][] suma=new int[tamaño][tamaño];
        //Rellenamos la primera matriz con valores pedidos al usuario
        System.out.println("Rellenamos la primera matriz:");
        for (int i=0;i<numeros.length;i++){
            for (int j=0;j<numeros[i].length;j++){
                System.out.print("Añada valor a la matriz: ");
                numeros[i][j]=datosp.nextInt();
            }
        }
        System.out.println("Primera matriz entera.");

        //Rellenamos la segunda matriz con valores pedidos al usuario
        System.out.println("Rellenamos la segunda matriz: ");
        for (int i=0;i<numeros2.length;i++){
            for (int j=0;j<numeros2[i].length;j++){
                System.out.print("Añada valor a la matriz: ");
                numeros2[i][j]=datosp.nextInt();
            }
        }
        System.out.println("Segunda matriz entera.");

        //Rellenamos la matriz suma con la suma de las otras dos matrices de números
        for (int i=0;i<suma.length;i++){
            for (int j=0;j<suma[i].length;j++){
                suma[i][j]=numeros[i][j]+numeros2[i][j];
            }
        }

        //Imprimimos las 3 matrices por pantalla
        System.out.println("Primera matriz de números: ");
        for (int i=0; i< numeros.length;i++){
            for (int j=0;j<(numeros[i].length);j++){
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Segunda matriz de números: ");
        for (int i=0; i< numeros2.length;i++){
            for (int j=0;j<(numeros2[i].length);j++){
                System.out.print(numeros2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matriz de sumas: ");
        for (int i=0; i< suma.length;i++){
            for (int j=0;j<(suma[i].length);j++){
                System.out.print(suma[i][j]+" ");
            }
            System.out.println();
        }



    }
}
