package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaramos variables
        String titulo, autor;
        int nejemplares, nejeplaresP;
        Scanner datosp = new Scanner(System.in);

        //Creamos los dos primeros objetos pidiendo por teclado los datos y utilizando setters
        Biblioteca libro1 = new Biblioteca();
        System.out.print("Dime el título del primer libro: ");
        titulo=datosp.next();
        libro1.setTitulo(titulo);
        System.out.print("Dime el autor del primer libro: ");
        autor=datosp.next();
        libro1.setAutor(autor);
        System.out.print("Dime el número de ejemplares que hay: ");
        nejemplares=datosp.nextInt();
        libro1.setNejemplares(nejemplares);
        System.out.print("Dime el número de ejemplares prestados que hay: ");
        nejeplaresP=datosp.nextInt();
        libro1.setNejemplaresP(nejeplaresP);

    }
}