package PrácticaMath;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        /*2.Diseñar un código que pide por pantalla cuantos números aleatorios se desean calcular. Se
        deben generar estos números y mostrar los valores por pantalla*/

        //declaramos variables y pedimos el número de números que se quieran calcular
        int num;
        double random;
        Scanner datosp=new Scanner(System.in);
        System.out.println("Dime cuantos numeros aleatorios quieres generar");
        num= datosp.nextInt();
        for (int cont=0; cont<num;cont++){
            random = Math.random();
            System.out.println(random);
        }

    }


}
