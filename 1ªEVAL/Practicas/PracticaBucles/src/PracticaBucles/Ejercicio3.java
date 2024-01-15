package PracticaBucles;

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Calcular el factorial del número 15.

        //Definimos variables.
        double num = 15;


        //Hacemos un bucle en el que el contador vaya de 14 a 1 para que se vaya multiplicando y poder hacer el factorial.
        //guardamos en la variable num el resultado de la multiplicación para que en la siguiente ronda del bucle se multiplique por el resultado anterior.
        for (int cont = 14; cont>0; cont--){
            num= num * cont;

        }
        //Una vez calculado el resultado lo imprimimos por pantalla.
        System.out.println("El resultado del factorial de 15 es: "+num);


    }





}
