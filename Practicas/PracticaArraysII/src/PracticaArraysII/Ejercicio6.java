package PracticaArraysII;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){

        /*6. Crea dos arrays de números con una posición pasado por teclado.
             Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior,
             después crea un nuevo array con el primer array (usa de nuevo new con el primer array) con el
             mismo tamaño que se ha pasado por teclado, rellenalo de nuevo con números aleatorios.

             Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo con
             la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente. Por último,
             muestra el contenido de cada array.*/

        // Creamos los arrays pidiendo el tamaño al usuario
        System.out.println("Dime el tamaño que quieras para los arrays");
        Scanner datosp=new Scanner(System.in);
        int tamaño = datosp.nextInt();
        int array1[]= new int[tamaño];
        int array2[]= new int[tamaño];

        //Rellenamos el primer array con números aleatorios del 1 al 100
        for (int cont =0; cont< tamaño; cont++){
            array1[cont]= (int) (Math.random()*(100-1));
        }
        //Rellenamos el segundo array con números aleatorios del 1 al 100
        for (int cont =0;cont<tamaño; cont ++){
            array2[cont]=(int) (Math.random()*(100-1));
        }

        //Creamos un tercer array para guardar los valores de las multiplicaciones
        int array3[] = new int[tamaño];
        for (int cont=0;cont<tamaño;cont++){
            array3[cont]=array1[cont]*array2[cont];
        }

        //Imprimimos los 3 arrays por pantalla
        System.out.println("El primer array es:");
        for (int cont=0; cont<tamaño-1; cont++){
            System.out.print(array1[cont]+" - ");
        }
        System.out.println(array1[tamaño-1]);

        System.out.println("El segundo array es:");
        for (int cont=0; cont<tamaño-1; cont++){
            System.out.print(array2[cont]+" - ");
        }
        System.out.println(array2[tamaño-1]);

        System.out.println("El tercer array con los resultados de las multiplicaciones es:");
        for (int cont=0; cont<tamaño-1; cont++){
            System.out.print(array3[cont]+" - ");
        }
        System.out.println(array3[tamaño-1]);



    }
}
