package Examen;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*1.Escribe un programa en Java que solicite al usuario ingresar el importe total de una compra.
            El programa debe determinar automáticamente el descuento aplicable según las siguientes
            reglas:

            • Si el importe de la compra es menor o igual a 100 Euros, no hay descuento.
            • Si el importe de la compra está entre 101 Euros y 500 Euros (inclusive), se aplica un
              descuento del 5%.
            • Si el importe de la compra está entre 501 Euros y 1000 Euros (inclusive), se aplica un
              descuento del 10%.
            • Si el importe de la compra es mayor a 1000 Euros, se aplica un descuento del 15%.
            • El programa debe mostrar el monto original de la compra, el porcentaje de descuento
              aplicado y el monto final después de aplicar el descuento.*/

        //Preguntamos al usuario el importe total de la compra
        int compra;
        Scanner datosp=new Scanner(System.in);
        System.out.print("Dime el importe total de la compra: ");
        compra=datosp.nextInt();

        //con unos if anidados creamos una variable que más tarde usaremos para el switch
        int opcion;
        if (compra<101){
            opcion=1;
        } else if (compra<501) {
            opcion=2;
        } else if (compra<1001) {
            opcion=3;
        }
        else{
            opcion=4;
        }

        //Realizamos un switch para cada opción
        switch (opcion){
            case 1:
                System.out.println("El importe total de la compra es: "+compra +" €");
                System.out.println("No hay descuento.");
                break;
            case 2:
                System.out.println("El importe total de la compra es: "+compra +" €");
                System.out.println("El descuento es del 5%");
                System.out.println("El importe final con el descuento es: "+(compra*0.95)+" €");
                break;
            case 3:
                System.out.println("El importe total de la compra es: "+compra +" €");
                System.out.println("El descuento es del 10%");
                System.out.println("El importe final con el descuento es: "+(compra*0.90)+" €");
                break;
            case 4:
                System.out.println("El importe total de la compra es: "+compra +" €");
                System.out.println("El descuento es del 15%");
                System.out.println("El importe final con el descuento es: "+(compra*0.85)+" €");
                break;
            default:
                System.out.println("Importe erróneo");
                break;
        }





    }
}