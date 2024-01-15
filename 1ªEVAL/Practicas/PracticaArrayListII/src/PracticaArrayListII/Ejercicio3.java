package PracticaArrayListII;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        /*3. Crea un programa en Java para gestionar una lista de nombres de asignaturas utilizando un
             ArrayList. El programa permitirá agregar nuevas asignaturas, mostrar la lista de asignaturas y
             buscar asignaturas por su nombre.*/

        //Creamos el arraylist y las variables necesarias.
        ArrayList<String> asignaturas=new ArrayList<String>();
        int opcion;
        String asignatura;
        boolean tf=false;
        Scanner datosp=new Scanner(System.in);
        do {
            System.out.println("1. Agregar asignaturas.");
            System.out.println("2. Mostrar lista de asignaturas.");
            System.out.println("3. Buscar asignatura por nombre.");
            System.out.println("4. Salir.");
            System.out.print("Elija una opción: ");
            opcion=datosp.nextInt();

            //Hacemos un switch case para cada opción
            switch (opcion){
                case 1:
                    System.out.print("Agregue el nombre de la asignatura: ");
                    asignatura=datosp.next();
                    asignaturas.add(asignatura);
                    break;
                case 2:
                    System.out.println("Lista de asignaturas: ");
                    for (int cont=0;cont<asignaturas.size();cont++){
                        System.out.println((cont+1)+". "+ asignaturas.get(cont));
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Dime la asignatura para comprobar si está dentro de la lista.");
                    asignatura=datosp.next();
                    if (asignaturas.contains(asignatura)){
                        System.out.println("La asignatura "+asignatura+" está en la lista.");
                    }
                    else {
                        System.out.println("La asignatura "+asignatura+" no está en la lista.");
                    }
                    System.out.println();

                    break;
                case 4:
                    System.out.println("Apagando el programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Seleccione otra opción:");
            }
        }while (opcion!=4);



    }
}
