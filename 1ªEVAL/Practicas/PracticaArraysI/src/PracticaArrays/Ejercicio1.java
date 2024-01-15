package PracticaArrays;
import java.util.Arrays;
public class Ejercicio1 {
    public static void main(String[] args){
        /*1. Diseñar un array, que almacena los números del 1 al 10. Consideraciones:

             Utilizar un bucle for para cargar el array
             Se deben imprimir los datos del array en sentido inverso*/

        int numeros[] = new int[10];

        //se usa el bucle para añadir los números al array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Mostramos los números de mayor a menor.

        for (int cont = 9; cont>=0;cont--){
            System.out.print(numeros[cont] + " ");
        }



    }
}