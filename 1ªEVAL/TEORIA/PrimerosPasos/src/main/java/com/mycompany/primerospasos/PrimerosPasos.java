
package com.mycompany.primerospasos;

import java.util.Scanner;


public class PrimerosPasos {

    public static void main(String[] args) {
        //saludo hola mundo
        System.out.println("Hola mundo");
        
        
        //creamos variables   
        String nombre;
        int num2;
        boolean contento;
        double num1;
        
        //les asignamos valor
        num1=24.5;
        num2=89;
        contento=true;
        nombre="Rodrigo";
        
        //Mostramos por pantalla las variables 
        System.out.println("La variable num1 tiene el valor: " + num1);
        System.out.println("La variable num2, tiene el valor: " + num2);
        System.out.println("La variable contento contiene: " + contento);
        System.out.println("La variable nombre contiene: " + nombre);
        
        //Constantes
        final double valorPI = 3.14159;
        System.out.println("La constante PI tiene el valor: " + valorPI);
        
        //creamos la instancia de Scanner para pedir valores
        Scanner datosp = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre");
        String respuesta = datosp.next();
        System.out.println("El dato que se ha tecleado es: " + respuesta);
        
        
        
        
        
        
        
    }
}
