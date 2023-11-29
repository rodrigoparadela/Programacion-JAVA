package PracticaMatricesII;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args){
        /*4. Generar una matriz de 3×3 con números aleatorios sin repetirse.*/

        //Creamos la matriz 3x3
        int[][] numeros = new int[3][3];

        //Rellenamos la matriz
        int num;
        //hacemos un array con todos los números disponibles del 1 al 100
        ArrayList<Integer> numerosDisponibles=new ArrayList<Integer>();
        for (int cont=0;cont<=100;cont++){
            numerosDisponibles.add(cont);
        }

        Random random = new Random();
        for (int i=0;i<numeros.length;i++){
            for (int j=0;j<numeros[i].length;j++){
                num = random.nextInt(numerosDisponibles.size());
                numeros[i][j]= numerosDisponibles.get(num);
                numerosDisponibles.remove(num);
            }
        }

        //imprimimos la matriz
        for (int i=0;i<numeros.length;i++){
            for (int j=0;j<numeros[i].length;j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }


    }
}
