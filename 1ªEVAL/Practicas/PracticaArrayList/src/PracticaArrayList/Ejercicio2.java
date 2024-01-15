package PracticaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        /*2.Realiza un programa donde almacenamos los nombres de animales, dichos nombres se
            almacenan en un Arraylist. Se piden valores hasta que se teclea la palabra SALIR.
            Visualizar los valores, y el número de valores que se introducen.*/

        //Creamos el arraylist de tipo string

        ArrayList<String> animales= new ArrayList<String>();



        //Creamos un bucle con una condición para guardar los nombres hasta que se añada salir.
        Scanner datosp=new Scanner(System.in);
        String animal;
        do {
            System.out.println("Añada otro animal o Salir");
            animal = datosp.nextLine().toLowerCase();

            if (!animal.equals("salir")){
                animales.add(animal);
            }


        }while(!animal.equals("salir"));

        //Visualizamos los valores y la cantidad de valores que se introducen
        System.out.println(animales);
        System.out.println(animales.size());






    }
}
