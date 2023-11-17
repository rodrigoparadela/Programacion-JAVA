package PracticaArraysII;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        /*1.Elabora un programa que carga un Array con 15 nombres. Comprobar:

             Hay que comprobar que estos nombres no están repetidos.
             Si se introduce un nombre y ya existe, aparece el mensaje “Usted ya fue inscrito”.
             Imprimir el array*/

        //creamos el array de nombres y un string para guardar los nombres por separado

        String nombres[] = new String[15];
        String nombre = new String();
        Scanner datosp = new Scanner(System.in);

        //Pedimos los 15 nombres por pantalla
        for (int cont=0; cont< nombres.length; cont ++){
            System.out.print("Nombre " + (cont +1) + ": ");
            nombre = datosp.nextLine();

            //se añade una condicion para que añada solo el primer nombre ya que no entra en el segundo bucle
            if (cont==0){
                nombres[cont] = nombre;
            }

            //añadimos otro bucle para comprobar si el nombre ya se ha agregado al array

            for (int cont2=0; cont2< cont; cont2++){
                //Condición para ver si nombre es igual a algún elemento de nombres
                if (nombre.equals(nombres[cont2])){
                    System.out.println("Usted ya fue inscrito");
                    cont--;
                    break;
                }
                else {
                    nombres[cont]=nombre;
                }
            }



        }


        //imprimimos el array nombres

        System.out.println("Los nombres son: ");
        for (int cont =0; cont < (nombres.length -1); cont++){
            System.out.print(nombres[cont] + " - ");
        }
        System.out.println(nombres[14]);
    }
}
