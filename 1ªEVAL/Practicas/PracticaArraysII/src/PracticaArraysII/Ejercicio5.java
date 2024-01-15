package PracticaArraysII;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){

        /*5. Crea un array de números de un tamaño pasado por teclado, el array contendrá números
        aleatorios primos entre los números deseados, por último nos indica cual es el mayor de
        todos.*/

        //Pedimos el tamaño del array por pantalla y creamos el array
        System.out.println("Dime el tamaño que quieras para el array:");
        Scanner datosp = new Scanner(System.in);
        int tamaño = datosp.nextInt();
        int array[] = new int[tamaño];

        //Pedimos el máximo y el mínimo de los números primos.
        System.out.println("Dime el máximo que quieras");
        int max = datosp.nextInt();
        System.out.println("Dime el mínimo que quieras");
        int min = datosp.nextInt();

        //Generamos los números primos y los añadimos al array
        int numprimo;
        int i;
        for (int cont =0; cont< tamaño; ){
            numprimo = (int) (Math.random() * (max - min +1 )+min);
            i =0;
            for (int cont2=2; cont2<Math.sqrt(numprimo); cont2++){
                if (numprimo % cont2==0){
                    i++;
                    break;

                }

            }
            if (i == 0 && numprimo > 1) {
                array[cont] = numprimo;
                cont++;
            }

        }

        //Imprimimos el número primo mayor
        int maximo =0;
        for (int cont=0;cont < tamaño; cont++){
            if (maximo<array[cont]){
                maximo = array[cont];
            }
        }
        System.out.println("El número primo mayor de todos es: "+ maximo);

        //Imprimimos el array
        for (int cont=0; cont<tamaño-1;cont++){
            System.out.print(array[cont] + " - ");
        }
        System.out.println(array[tamaño-1]);



    }
}
