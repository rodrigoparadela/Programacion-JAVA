package Examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        /*4. Escribe un programa en Java que utilice la clase ArrayList para gestionar un registro de
             estudiantes. Cada estudiante debe tener un nombre, un número de estudiante y un promedio.
             Crea un ArrayList para almacenar objetos de tipo estudiante. Solicita al usuario ingresar la
             información de al menos tres estudiantes (nombre, número de estudiante y promedio) y
             agrega cada estudiante al ArrayList.

             Operaciones Básicas:
             • Operaciones con el Registro:
             • Muestra en la consola la lista de estudiantes con su información completa.
             • Calcula y muestra el promedio de todos los estudiantes.
             • Búsqueda y Modificación:
             • Solicita al usuario ingresar el número de estudiante de un estudiante específico.
             • Busca en el ArrayList el estudiante. */

        //Creamos el Arraylist y le pedimos al usuario la información de 3 estudiantes
        ArrayList<String> estudiantes=new ArrayList<String>();
        Scanner datosp=new Scanner(System.in);
        for (int cont=0;cont<3;cont++){
            System.out.print("Dime el nombre del estudante "+(cont+1)+": ");
            estudiantes.add(datosp.next());
            System.out.print("Dime el número del estudiante "+(cont+1)+": ");
            estudiantes.add(datosp.next());
            System.out.print("Dime el promedio del estudiante "+(cont+1)+": ");
            estudiantes.add(datosp.next());
        }

        //Imprimimos el array
        System.out.println("Estudiante 1: "+estudiantes.get(0)+"\n -Nº: "+estudiantes.get(1)+"\n -Promedio: "+estudiantes.get(2));
        System.out.println("Estudiante 2: "+estudiantes.get(3)+"\n -Nº: "+estudiantes.get(4)+"\n -Promedio: "+estudiantes.get(5));
        System.out.println("Estudiante 3: "+estudiantes.get(6)+"\n -Nº: "+estudiantes.get(7)+"\n -Promedio: "+estudiantes.get(8));

        //Calculamos el promedio total y lo mostramos
        double promedio = Double.parseDouble(estudiantes.get(2))+Double.parseDouble(estudiantes.get(5))+Double.parseDouble(estudiantes.get(8));
        promedio=promedio/3;
        System.out.println("El promedio total es: "+promedio);

        //Buscamos a un estudiante por su número de estudiante
        int num, num2, kk=0;
        System.out.print("Dime un número de estudiante: ");
        num = datosp.nextInt();

        for (int cont=0; cont<4;cont++){
            if (cont==0) {
                num2 = Integer.parseInt(estudiantes.get(1));
                if (num==num2){
                    kk=1;
                    break;
                }
            } else if (cont==1) {
                num2 = Integer.parseInt(estudiantes.get(4));
                if (num == num2) {
                    kk=2;
                    break;
                }
            }else if (cont==2){
                num2 = Integer.parseInt(estudiantes.get(7));
                if (num==num2){
                    kk=3;
                    break;
                }
            }else{
                kk=0;
            }
        }


        if (kk==1){
            System.out.println("El estudiante es: "+estudiantes.get(0));
        } else if (kk==2) {
            System.out.println("El estudiante es: "+estudiantes.get(3));
        } else if (kk==3) {
            System.out.println("El estudiante es: "+estudiantes.get(6));
        }
        else{
            System.out.println("No existe el estudiante");
        }


    }
}
