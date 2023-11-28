package Simulacro;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        /*3. Crea una Matriz para almacenar cada estudiante, y las siguientes propiedades:
              nombre, apellidos,nota1,nota2,nota3.

             Operaciones
                 Solicita al usuario ingresar información para al menos tres estudiantes.
                 Para cada estudiante, pide su nombre y las notas obtenidas en diferentes asignaturas.
                 Muestra en la consola la lista de estudiantes con sus respectivas notas.
                 Calcula y muestra el promedio de notas de cada estudiante.
                 Calcula y muestra el promedio de notas de todas las asignaturas.
                 Identifica y muestra en la consola el estudiante con el promedio de notas más alto.
                 Identifica y muestra en la consola el estudiante con el promedio de notas más bajo.*/

        //Creamos la matriz y la rellenamos con datos pedidos por pantalla
        String [][] estudiantes= new String[3][6];
        double promedio;
        Scanner datosp=new Scanner(System.in);

        for (int cont = 0;cont<3;cont++){
            System.out.println("Estudiante " + (cont+1)+":");
            System.out.print("Nombre: ");
            estudiantes[cont][0]=datosp.next();

            System.out.print("Apellido 1: ");
            estudiantes[cont][1]=datosp.next();

            System.out.print("Apellido 2: ");
            estudiantes[cont][2]=datosp.next();

            System.out.print("Nota 1: ");
            estudiantes[cont][3]=datosp.next();

            System.out.print("Nota 2: ");
            estudiantes[cont][4]=datosp.next();

            System.out.print("Nota 3: ");
            estudiantes[cont][5]=datosp.next();
        }

        //Imprimimos la matriz con los estudiantes y sus datos
        for (int cont = 0;cont<3;cont++){
            System.out.println("Estudiante "+ (cont+1)+": "+estudiantes[cont][0]+" "+estudiantes[cont][1]+" "+estudiantes[cont][2]);
            System.out.println("Notas: " +estudiantes[cont][3]+", "+estudiantes[cont][4]+", "+estudiantes[cont][5]);
            promedio= Double.parseDouble(estudiantes[cont][3])+Double.parseDouble(estudiantes[cont][4])+Double.parseDouble(estudiantes[cont][5]);
            promedio=promedio/3;
            System.out.println("Promedio: "+promedio);

        }
        



    }
}
