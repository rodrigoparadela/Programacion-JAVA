package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        int num1,num2;
        Scanner datosp=new Scanner(System.in);
        do {
            System.out.print("Dime el primer número para realizar una operación: ");
            num1=datosp.nextInt();
            System.out.print("Dime el segundo número: ");
            num2=datosp.nextInt();
            System.out.println("Escoge una opción:");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            opcion=datosp.nextInt();
            Calculadora operacion = new Calculadora(num1,num2);
            switch (opcion){
                case 1:
                    System.out.println("La suma es: "+operacion.sumar());
                    break;
                case 2:
                    System.out.println("La resta es: "+operacion.restar());
                    break;
                case 3:
                    System.out.println("La multiplicación es: "+operacion.multiplicar());
                    break;
                case 4:
                    operacion.dividir();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error. Dame otra opcion.");
            }
        }while (opcion!=5);

    }
}