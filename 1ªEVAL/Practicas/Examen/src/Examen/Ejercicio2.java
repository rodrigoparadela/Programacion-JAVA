package Examen;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        /*2. Crea dos arrays de números enteros de igual longitud. El usuario debe ingresar los
             elementos para ambos arrays.
             Combina los dos arrays en un tercer array, intercalando los elementos de ambos. Por ejemplo,
             si los arrays originales son [1, 2, 3] y [4, 5, 6], el array combinado debe ser [1, 4, 2, 5, 3, 6].

             Operaciones
             • Calcula la suma de los elementos en el array combinado.
             • Calcula la suma de los elementos en cada uno de los arrays originales por separado.
             • Muestra en la consola los arrays originales, el array combinado y las sumas obtenidas.*/

        //Creamos los 3 arrays preguntando al usuario el tamaño y los elementos del primer y segundo array
        int tamaño;
        Scanner datosp=new Scanner(System.in);
        System.out.print("Dime el tamaño de los arrays: ");
        tamaño = datosp.nextInt();
        int array1[] = new int[tamaño];
        int array2[] = new int[tamaño];
        int array3[] = new int[tamaño*2];

        //Llenamos los dos primeros arrays preguntando al usuario los elementos
        int elemento = 1;
        System.out.println("Llenamos el primer array: ");
        for (int cont=0; cont<tamaño;cont++){
            System.out.print("Elemento " + elemento+": ");
            array1[cont] = datosp.nextInt();
            elemento++;
        }
        System.out.println("Llenamos el segundo array: ");
        elemento = 1;
        for (int cont=0; cont<tamaño;cont++){
            System.out.print("Elemento " + elemento+": ");
            array2[cont] = datosp.nextInt();
            elemento++;
        }

        //Llenamos el tercer array con una condición dentro de un for
        int par=0, impar=0;
        for (int cont=0; cont<tamaño*2;cont++){
            if (cont%2==0){
                array3[cont]=array1[impar];
                impar++;
            }
            else {
                array3[cont]=array2[par];
                par++;
            }
        }

        //Calculamos la suma de los 3 arrays por separado
        int suma1=0,suma2=0,suma3=0;
        for (int cont=0;cont<tamaño;cont++){
            suma1= suma1+array1[cont];
            suma2= suma2+array2[cont];
        }
        for (int cont=0;cont<tamaño*2;cont++){
            suma3=suma3+array3[cont];
        }

        //Imprimimos los arrays y las sumas
        System.out.println("Array 1: ");
        for (int cont=0;cont<tamaño-1;cont++){
            System.out.print(array1[cont]+" - ");
        }
        System.out.println(array1[tamaño-1]);
        System.out.println("La suma es: "+suma1);

        System.out.println("Array 2: ");
        for (int cont=0;cont<tamaño-1;cont++){
            System.out.print(array2[cont]+" - ");
        }
        System.out.println(array2[tamaño-1]);
        System.out.println("La suma es: "+suma2);

        System.out.println("Array 3: ");
        for (int cont=0;cont<(tamaño*2)-1;cont++){
            System.out.print(array3[cont]+" - ");
        }
        System.out.println(array3[tamaño*2-1]);
        System.out.println("La suma es: "+suma3);



    }
}
