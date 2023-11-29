package PracticaArrayListII;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio1 {
    public static void main(String[] args) {
        /*1.Programa Java que lea una serie de valores numéricos enteros desde el teclado y los guarde
            en un ArrayList de tipo Integer. La lectura de números enteros termina cuando se introduzca el
            valor -99. Este valor no se guarda en el ArrayList.

            A continuación el programa mostrará por pantalla el número de valores que se han leído, su
            suma y su media. Por último se mostrarán todos los valores leídos, indicando cuántos de ellos
            son mayores que la media.*/

        //Creamos el array y pedimos los números por pantalla
        ArrayList<Integer> numeros= new ArrayList<Integer>();
        int num=0;
        int suma=0;
        double media=0;
        int mayoresMedia=0;
        Scanner datosp=new Scanner(System.in);

        while (num!=-99){
            System.out.println("Añade un número al array o '-99' ");
            num=datosp.nextInt();
            if (num!=-99){
                numeros.add(num);
            }
            else{
                break;
            }
        }

        //Calculamos el número de valores añadidos, la suma y la media de estos números.

        for (int cont = 0; cont < numeros.size(); cont++){

            num=cont;
            suma=suma+numeros.get(cont);
        }
        num = num+1;
        System.out.println("El número de valores añadidos es: "+num);
        System.out.println("La suma de los valores añadidos es: "+ suma);
        media = (double) suma/num;
        System.out.println("La media de los valores añadidos es: " +(media));

        //Mostramos los valores y cuantos de ellos son mayores que la media.
        for (int cont=0;cont<numeros.size();cont++){
            if (numeros.get(cont)>media){
                mayoresMedia++;
            }
            System.out.println("El valor número "+ (cont+1)+ " es: "+numeros.get(cont));
        }
        System.out.println("Hay " +mayoresMedia+" números mayores que la media.");


    }
}