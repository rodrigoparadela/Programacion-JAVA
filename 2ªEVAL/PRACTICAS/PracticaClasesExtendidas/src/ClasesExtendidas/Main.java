package ClasesExtendidas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datosp=new Scanner(System.in);
        //Creamos los dos objetos de la clase estudiante
        Estudiante estudiante1= new Estudiante();
        Estudiante estudiante2= new Estudiante();
        System.out.print("Dime el nombre del Estudiante 1: ");
        estudiante1.setNombre(datosp.next());
        System.out.print("Dime la edad del Estudiante 1: ");
        estudiante1.setEdad(datosp.nextInt());
        System.out.print("Dime la carrera que estudia: ");
        estudiante1.setCarrera(datosp.next());
        System.out.print("Dime su legajo: ");
        estudiante1.setLegajo(datosp.nextInt());

        System.out.print("Dime el nombre del Estudiante 2: ");
        estudiante2.setNombre(datosp.next());
        System.out.print("Dime la edad del Estudiante 2: ");
        estudiante2.setEdad(datosp.nextInt());
        System.out.print("Dime la carrera que estudia: ");
        estudiante2.setCarrera(datosp.next());
        System.out.print("Dime su legajo: ");
        estudiante2.setLegajo(datosp.nextInt());

        //Creamos los dos objetos de la clase Profesor
        Profesor profesor1=new Profesor();
        Profesor profesor2=new Profesor();
        System.out.print("Dime el nombre del Profesor 1: ");
        profesor1.setNombre(datosp.next());
        System.out.print("Dime la edad del Profesor 1: ");
        profesor1.setEdad(datosp.nextInt());
        System.out.print("Dime la materia que imparte: ");
        profesor1.setMateria(datosp.next());
        System.out.print("Dime su cargo: ");
        profesor1.setCargo(datosp.next());

        System.out.print("Dime el nombre del Profesor 2: ");
        profesor2.setNombre(datosp.next());
        System.out.print("Dime la edad del Profesor 2: ");
        profesor2.setEdad(datosp.nextInt());
        System.out.print("Dime la materia que imparte: ");
        profesor2.setMateria(datosp.next());
        System.out.print("Dime su cargo: ");
        profesor2.setCargo(datosp.next());

        //Mostramos los 4 objetos
        System.out.println("Nombre Estudiante 1: "+estudiante1.getNombre());
        System.out.println("Edad Estudiante 1: "+estudiante1.getEdad());
        System.out.println("Carrera Estudiante 1: "+estudiante1.getCarrera());
        System.out.println("Legajo Estudiante 1: "+estudiante1.getLegajo());

        System.out.println("Nombre Estudiante 2: "+estudiante2.getNombre());
        System.out.println("Edad Estudiante 2: "+estudiante2.getEdad());
        System.out.println("Carrera Estudiante 2: "+estudiante2.getCarrera());
        System.out.println("Legajo Estudiante 2: "+estudiante2.getLegajo());

        System.out.println("Nombre Profesor 1: "+profesor1.getNombre());
        System.out.println("Edad Profesor 1: "+profesor1.getEdad());
        System.out.println("Materia Profesor 1: "+profesor1.getMateria());
        System.out.println("Cargo Profesor 1: "+profesor1.getCargo());

        System.out.println("Nombre Profesor 2: "+profesor2.getNombre());
        System.out.println("Edad Profesor 2: "+profesor2.getEdad());
        System.out.println("Materia Profesor 2: "+profesor2.getMateria());
        System.out.println("Cargo Profesor 2: "+profesor2.getCargo());
    }
}