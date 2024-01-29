package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opcion, longitud;
        Scanner datosp=new Scanner(System.in);

        do {
            System.out.print("Dime la longitud del vector: ");
            longitud=datosp.nextInt();
            int[] vector= new int[longitud];
            for (int cont=0;cont<vector.length;cont++){
                vector[cont]= (int) (Math.random()*10) +1;
            }
            System.out.println("Creando el vector...");
            System.out.println("Como lo quieres mostrar:");
            System.out.println("1. Del derecho");
            System.out.println("2. Del revés");
            System.out.println("3. Salir");
            opcion=datosp.nextInt();
            Vector vector1=new Vector();
            switch (opcion){
                case 1:
                    vector1.mostrarDerecho(vector);
                    break;
                case 2:
                    vector1.mostrarReves(vector);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error. Seleccione otra opción");
            }



        }while  (opcion!=3);
    }
}
