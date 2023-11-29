package PracticaMatricesII;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*1. Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números
             aleatorios entre 0 y 10*/

        //Creamos la matriz preguntando al usuario las columnas
        int col;
        Scanner datosp=new Scanner(System.in);
        System.out.println("Dime las columnas que quieras para la matriz");
        col = datosp.nextInt();
        int[][] numeros= new int[5][col];

        //Rellenamos la matriz
        for (int i=0; i< numeros.length;i++){
            for (int j=0;j<numeros[i].length;j++){
                numeros[i][j]= (int) (Math.random()*10);
            }
        }
        //Imprimimos la matriz
        for (int i=0; i< numeros.length;i++){
            for (int j=0;j<(numeros[i].length);j++){
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println();
        }
    }
}