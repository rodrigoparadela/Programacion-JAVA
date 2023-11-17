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


        boolean tf;
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio < fin) {
            if (array[inicio] != array[fin]) {
                tf = false;
                break;
            }

            inicio++;
            fin--;
            tf=true;
        }

        //Imprimimos si es capicua o no mediante el booleano tf

        if (tf = true){
            System.out.println("El array es capicua");
        }
        else {
            System.out.println("El array no es capicua5");
        }


        //Imprimimos el array
        for (int cont = 0; cont < (array.length -1) ; cont ++){
            System.out.print(array[cont] + " - ");
        }
        System.out.println(array[19]);






    }
}
