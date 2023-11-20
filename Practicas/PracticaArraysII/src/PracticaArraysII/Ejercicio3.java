package PracticaArraysII;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        /*3. Elabora un programa que lee dos arrays de n elementos cada uno, e intercambie sus
             elementos. Se debe mostrar el array original y el array después del intercambio*/

        //Creamos los dos arrays con el tamaño que nos pida el usuario
        System.out.println("¿Que tamaño quieres que tengan los arrays?");
        Scanner datosp = new Scanner(System.in);
        int tamaño = datosp.nextInt();
        int arrayOriginal[] = new int[tamaño];
        int arrayIntercambio[] = new int[tamaño];

        //Pedimos los elementos del array original al usuario y llenamos el array intercambio con unos para intercambiarlos por
        //los valores del original más tarde

        for (int cont = 0; cont< tamaño;cont++){
            System.out.print("Dime el número " + (cont+1)+": ");
            arrayOriginal[cont]=datosp.nextInt();
        }

        for (int cont = 0 ; cont< tamaño; cont++){
            arrayIntercambio[cont] = 1;
        }

        //Imprimimos los dos arrays antes del intercambio
        System.out.println("El array original antes del intercambio es:");
        for (int cont=0; cont<tamaño-1;cont++){
            System.out.print(arrayOriginal[cont] + " - ");
        }
        System.out.println(arrayOriginal[tamaño-1]);

        System.out.println("El array intercambio antes del intercambio es:");
        for (int cont=0; cont<tamaño-1;cont++){
            System.out.print(arrayIntercambio[cont] + " - ");
        }
        System.out.println(arrayIntercambio[tamaño-1]);

        //Intercambiamos los valores de los arrays. Se necesita un tercer array auxiliar
        int arrayAux[] = new int[tamaño];
        //llenamos el array auxiliar con los valores del array original
        for (int cont=0;cont<tamaño;cont++){
            arrayAux[cont] = arrayOriginal[cont];
        }
        //Llenamos el array original con los valores del array intercambio.
        for (int cont=0;cont<tamaño;cont++){
            arrayOriginal[cont] = arrayIntercambio[cont];
        }
        //Llenamos el array intercambio con los valores del array auxiliar
        for (int cont=0;cont<tamaño;cont++){
            arrayIntercambio[cont] = arrayAux[cont];
        }

        //Imprimimos los dos arrays despues del intercambio
        System.out.println("El array original después del intercambio es:");
        for (int cont=0; cont<tamaño-1;cont++){
            System.out.print(arrayOriginal[cont] + " - ");
        }
        System.out.println(arrayOriginal[tamaño-1]);

        System.out.println("El array intercambio después del intercambio es:");
        for (int cont=0; cont<tamaño-1;cont++){
            System.out.print(arrayIntercambio[cont] + " - ");
        }
        System.out.println(arrayIntercambio[tamaño-1]);



    }
}
