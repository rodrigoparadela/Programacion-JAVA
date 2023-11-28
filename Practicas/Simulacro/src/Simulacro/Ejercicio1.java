package Simulacro;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio1 {
    public static void main(String[] args) {
        /*1. Escribe un programa en Java que implemente una calculadora básica utilizando la estructura
             switch. La calculadora debe ser capaz de realizar operaciones simples como suma, resta,
             multiplicación y división.

             Operaciones
                 Solicita al usuario ingresar dos números y seleccionar la operación que desea realizar
                  (suma, resta, multiplicación o división).
                 Implementa una estructura switch para realizar la operación seleccionada por el
                  usuario.
                 Muestra en la consola el resultado de la operación.
                 Devuelve el resultado de las operaciones sin posiciones decimales
                 Si el usuario elige la operación de división y el segundo número es cero, muestra un
                   mensaje de error indicando que la división por cero no está permitida.*/

        //Solicitamos al usuario que operación quiere realizar y los dos números por pantalla
        int num1,num2;
        double res;
        String operacion;
        Scanner datosp=new Scanner(System.in);

        System.out.println("Dime el primer número");
        num1=datosp.nextInt();
        System.out.println("Dime el segundo número");
        num2=datosp.nextInt();
        System.out.println("Dime la operación que quieras realizar (+,-,*,/)");
        operacion=datosp.next();

        //Hacemos el switch-case con las 4 operaciones.
        switch (operacion){
            case "+":
                res=num1+num2;
                System.out.println("El resultado de la operación es: "+ Math.round(res));
                break;
            case "-":
                res=num1-num2;
                System.out.println("El resultado de la operación es: "+ Math.round(res));
                break;
            case "*":
                res=num1*num2;
                System.out.println("El resultado de la operación es: "+ Math.round(res));
                break;
            case "/":
                if (num2==0){
                    System.out.println("ERROR. No se puede dividir entre 0");
                }
                else{
                    res=num1/num2;
                    System.out.println("El resultado de la operación es: "+ Math.round(res));
                }
        }



    }
}