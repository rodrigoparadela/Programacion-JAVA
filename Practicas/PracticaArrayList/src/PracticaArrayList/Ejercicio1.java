package PracticaArrayList;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio1 {
    public static void main(String[] args) {

        /*1.Crear un arraylist con 5 valores de tipo integer. Calcular la media de todos los valores.
            Visualizar todos los valores y la media.*/

        //Creamos el arraylist y agregamos los 5 valores integer

        ArrayList<Integer> nums=new ArrayList<Integer>();
        nums.add(7);
        nums.add(9);
        nums.add(4 );
        nums.add(10);
        nums.add(5);

        //Imprimimos los valores

        System.out.println("Todos los valores del arraylist son: "+nums);

        //Calculamos la media y la imprimimos por pantalla

        int media = 0;

        for (int num:nums){
            media=media+num;
        }

        media=media/5;
        System.out.println("La media de los 5 números es: "+media);




    }
}