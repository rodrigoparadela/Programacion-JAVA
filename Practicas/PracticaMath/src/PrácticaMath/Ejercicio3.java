package PrácticaMath;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        /*3.Diseñar un programa que pide dos números por pantalla, y se deben generar los números
            aleatorios entre ellos.*/

        //definimos las variables necesarias y pedimos los valores por pantalla al usuario.
        double num1, num2, num;
        Scanner datosp=new Scanner(System.in);
        System.out.println("Dime el primer número");
        num1 = datosp.nextInt();
        System.out.println("Dime el segundo número");
        num2 = datosp.nextInt();
        System.out.println("Dime cuantos números aleatorios entre ellos quieres mostrar.");
        num= datosp.nextInt();

        for (int cont=1; cont<=num; cont++){
            System.out.println((Math.random() * (num2 - num1 + 1) + num1));
        }
        




    }

}
