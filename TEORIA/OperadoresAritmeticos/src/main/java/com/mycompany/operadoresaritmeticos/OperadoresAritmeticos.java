
package com.mycompany.operadoresaritmeticos;
import java.util.Scanner;
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        /*OPERADORES ARITMÉTICOS
        + SUMA
        - RESTA 
        * MULTIPLICACIÓN
        /DIVISIÓN
        %MÓDULO
        */
        
        int num1;
        int num2;
        String nombre;
        double euros;
        //Utilizamos el objeto Scanner
        Scanner datosp=new Scanner(System.in);
        System.out.println("Introduce el primer valor: ");
        num1 = datosp.nextInt();
        
        System.out.println("Introduce el segundo valor:");
        num2 = datosp.nextInt();
        
        System.out.println("Introduce tu nombre: ");
        nombre=datosp.next();
        
        System.out.println("Introduce el importe en euros");
        euros=datosp.nextDouble();
        
        //mostramos los resultados de los operadores aritméticos
        System.out.println("Hola " + nombre);
        System.out.println("La suma de los dos números es igual a: " + (num1+num2));
        System.out.println("La resta de los dos números es igual a: " + (num1-num2));
        System.out.println("La multiplicación de los dos números es igual a: " + (num1*num2));
        System.out.println("La división de los dos números es igual a: " + (num1/num2));
        System.out.println("El módulo de los dos números es igual a: " + (num1%num2));
        System.out.println("Y tienes " + euros + "euros.");
    }
}
