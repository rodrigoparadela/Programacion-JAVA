package PracticaArraysII;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        /*1.Elabora un programa que carga un Array con 15 nombres. Comprobar:

             Hay que comprobar que estos nombres no están repetidos.
             Si se introduce un nombre y ya existe, aparece el mensaje “Usted ya fue inscrito”.
             Imprimir el array*/

        //Creamos el array con tamaño 15 y una variable para guardar los nombres por separado dentro del bucle
        String nombres[] = new String[15];
        String nombre=new String();
        boolean existe = false;
        Scanner datosp= new Scanner(System.in);

        //Pedimos los nombres por pantalla con un bucle

        for (int cont = 0; cont< nombres.length; cont++){
            System.out.println("Nombre " + (cont+1));
            nombre = datosp.next();

            //con un bucle y una condición verificamos que los nombres no se repitan
            for (int cont2 = 0; cont2 < cont ; cont2 ++ ){

                if (nombre.equalsIgnoreCase(nombres[cont2])){
                    System.out.println("Usted ya fue inscrito");
                    existe = true;
                }
                else {
                    existe = false;
                }
            }
            if (existe==true){
                cont--;

            }
            else{
                nombres[cont] = nombre;
            }

        }

        //imprimimos el array por pantalla

        for (int cont = 0; cont < nombre.length() ; cont ++){
            System.out.print(nombres[cont] + " - ");
        }
        //
        System.out.println(nombres[14]);

    }
}