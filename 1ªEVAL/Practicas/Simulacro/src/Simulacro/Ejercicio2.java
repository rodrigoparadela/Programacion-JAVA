package Simulacro;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        /*2. Escribe un programa en Java que implemente un juego de adivinanza. El programa debe
             generar un número aleatorio entre 1 y 100 y desafiar al usuario a adivinar ese número.
             Proporciona pistas al usuario indicando si el número a adivinar es mayor o menor que el
             número ingresado.

             Operaciones
                 Utiliza la clase Random para generar un número aleatorio entre 1 y 100.
                 Implementa un bucle que permita al usuario ingresar números hasta que adivine
                  correctamente o decida salir del juego.
                 Muestra un mensaje al usuario solicitándole que ingrese un número.
                 Utiliza condicionales anidadas para comparar el número ingresado por el usuario con
                  el número aleatorio generado.
                 Si el número es correcto, muestra un mensaje de felicitación y termina el juego.
                 Si el número es incorrecto, proporciona pistas indicando si el número a adivinar es
                  mayor o menor.
                 Permite al usuario salir del juego en cualquier momento ingresando un valor especial
                  (por ejemplo, 0).*/

        //Generamos un número aleatorio entre el 1 y el 100
        int aleatorio= (int) (Math.random() * 100);
        int num=1;
        Scanner datosp=new Scanner(System.in);
        //Hacemos el bucle para el usuario
        System.out.println("A continuación empezamos. Para salir del juego, ingrese 0");
        while (num!=0){
            System.out.println("Ingrese un número");
            num=datosp.nextInt();
            if (num==aleatorio){
                System.out.println("Felicidades, has acertado el número");
                break;
            }
            else{
                if (num<aleatorio){
                    System.out.println("El número aleatorio es mayor.");
                }
                else{
                    System.out.println("El número aleatorio es menor");
                }
            }
        }
        System.out.println("Se acabó el juego.");


    }
}
