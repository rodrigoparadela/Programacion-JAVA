package PracticaArraysII;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*2.Diseña un array de 20 posiciones y comprobar si es capicúa.*/

        //creamos el array y pedimos los valores al usuario

        int array[] = new int[20];
        int num;
        Scanner datosp = new Scanner(System.in);
        for (int cont =0; cont< array.length;cont++){
            System.out.println("Ingrese número: ");
            num = datosp.nextInt();
            array[cont] = num;
        }

        //Comprobamos si el array es capicua o no
        boolean tf = true;
        for (int cont = 0; cont <(array.length/2) ; cont++){
            if (array[cont] != array[array.length-1-cont]){
                tf =false;
                break;
            }
        }

        //Mostramos si es capicua o no mediante una condición

        if (tf){
            System.out.println("Es capicua");
        }
        else {
            System.out.println("No es capicua");
        }

        //Imprimimos el array
        for (int cont = 0; cont < (array.length -1) ; cont ++){
            System.out.print(array[cont] + " - ");
        }
        System.out.println(array[19]);






    }
}
