package PracticaArrays;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        /*2.Se pide por pantalla el número de posiciones que queremos que tenga nuestro array, se
            piden los datos por pantalla.
            Se crea otro array, pidiendo el número de posiciones por pantalla. Los valores se cargan con un
            bucle for.
            Crear un tercer array que contiene, los datos de los dos arrays*/

        //Pedimos por pantalla el tamaño del primer array y lo creamos.

        System.out.println("Dime las posiciones que quieras para el primer array");
        Scanner datosp=new Scanner(System.in);
        int tamaño1;
        tamaño1= datosp.nextInt();
        int array1[] = new int[tamaño1];

        //Mediante un bucle for pedimos los números por pantalla y los vamos agregando al array
        int nums1;
        for (int cont=0; cont<tamaño1; cont++){
            System.out.println("Dime número para el primer array");
            nums1 = datosp.nextInt();
            array1[cont] = nums1;
        }

        //Mostramos el primer array por pantalla

        for (int cont=0;cont<tamaño1;cont++){
            System.out.print(array1[cont]+" ");
        }
        System.out.println();

        //Pedimos por pantalla el tamaño del segundo array y lo creamos.

        System.out.println("Dime las posiciones que quieras para el segundo array");
        int tamaño2;
        tamaño2=datosp.nextInt();
        int array2[]=new int[tamaño2];

        //Mediante un bucle for pedimos los números por pantalla y los vamos agregando al array
        int nums2;
        for (int cont =0;cont<tamaño2;cont++){
            System.out.println("Dime número para el segundo array");
            nums2 = datosp.nextInt();
            array2[cont] = nums2;
        }

        //Mostramos el segundo array por pantalla

        for (int cont=0;cont<tamaño2;cont++){
            System.out.print(array2[cont]+" ");
        }
        System.out.println();

        //Creamos el tercer array a partir de los otros dos

        int tamaño3 = tamaño1+tamaño2;
        int array3[] = new int[tamaño3];

        //añadimos los valores de los dos arrays

        for (int cont=0; cont<tamaño1;cont++){
            array3[cont]=array1[cont];
        }
        for (int cont=0;cont<tamaño2;cont++) {
            array3[tamaño1 + cont] = array2[cont];
        }

        //Mostramos el Tercer array por pantalla
        for (int cont=0; cont<tamaño3;cont++){
            System.out.print(array3[cont]+" ");
        }



    }
}
