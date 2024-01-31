package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaramos variables
        String titulo, autor;
        int nejemplares, nejeplaresP,opcion,opcion2;
        Scanner datosp = new Scanner(System.in);

        //Creamos los dos primeros objetos pidiendo por teclado los datos y utilizando setters
        //libro1
        Biblioteca libro1 = new Biblioteca();
        System.out.print("Dime el título del primer libro: ");
        titulo=datosp.nextLine();
        libro1.setTitulo(titulo);
        System.out.print("Dime el autor del primer libro: ");
        autor=datosp.nextLine();
        libro1.setAutor(autor);
        System.out.print("Dime el número de ejemplares que hay: ");
        nejemplares=datosp.nextInt();
        libro1.setNejemplares(nejemplares);
        System.out.print("Dime el número de ejemplares prestados que hay: ");
        nejeplaresP=datosp.nextInt();
        libro1.setNejemplaresP(nejeplaresP);
        //libro2
        datosp.nextLine();
        Biblioteca libro2 = new Biblioteca();
        System.out.print("Dime el título del segundo libro: ");
        titulo=datosp.nextLine();
        libro2.setTitulo(titulo);
        System.out.print("Dime el autor del segundo libro: ");
        autor=datosp.nextLine();
        libro2.setAutor(autor);
        System.out.print("Dime el número de ejemplares que hay: ");
        nejemplares=datosp.nextInt();
        libro2.setNejemplares(nejemplares);
        System.out.print("Dime el número de ejemplares prestados que hay: ");
        nejeplaresP=datosp.nextInt();
        libro2.setNejemplaresP(nejeplaresP);

        //Creamos los dos últimos libros con constructores.
        //libro3
        datosp.nextLine();
        System.out.print("Dime el título del tercer libro: ");
        titulo=datosp.nextLine();
        System.out.print("Dime el autor del tercer libro: ");
        autor=datosp.nextLine();
        System.out.print("Dime el número de elemplares que hay: ");
        nejemplares=datosp.nextInt();
        System.out.print("Dime el número de ejemplares prestados que hay: ");
        nejeplaresP=datosp.nextInt();
        Biblioteca libro3 = new Biblioteca(titulo,autor,nejemplares,nejeplaresP);
        //libro4
        datosp.nextLine();
        System.out.print("Dime el título del cuarto libro: ");
        titulo=datosp.nextLine();
        System.out.print("Dime el autor del cuarto libro: ");
        autor=datosp.nextLine();
        System.out.print("Dime el número de elemplares que hay: ");
        nejemplares=datosp.nextInt();
        System.out.print("Dime el número de ejemplares prestados que hay: ");
        nejeplaresP=datosp.nextInt();
        Biblioteca libro4 = new Biblioteca(titulo,autor,nejemplares,nejeplaresP);

        //Mostramos los cuatro libros por pantalla.
        System.out.println("Libro 1: ");
        libro1.mostrar();
        System.out.println("Libro 2: ");
        libro2.mostrar();
        System.out.println("Libro 3: ");
        libro3.mostrar();
        System.out.println("Libro 4: ");
        libro4.mostrar();

        do {
            System.out.println("Menú: ");
            System.out.println("1. Devolución");
            System.out.println("2. Préstamo");
            System.out.println("3. Continuar sin ningún cambio");
            opcion=datosp.nextInt();
            if (opcion==1){
                //devolución
                System.out.println("¿Qué libro quieres devolver? ");
                System.out.println("1. "+libro1.getTitulo());
                System.out.println("2. "+libro2.getTitulo());
                System.out.println("3. "+libro3.getTitulo());
                System.out.println("4. "+libro4.getTitulo());
                opcion2=datosp.nextInt();
                switch (opcion2){
                    case 1:
                        libro1.devolucion();
                        break;
                    case 2:
                        libro2.devolucion();
                        break;
                    case 3:
                        libro3.devolucion();
                        break;
                    case 4:
                        libro4.devolucion();
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } else if (opcion==2) {
                //Préstamos
                System.out.println("¿Qué libro quieres llevarte prestado? ");
                System.out.println("1. "+libro1.getTitulo());
                System.out.println("2. "+libro2.getTitulo());
                System.out.println("3. "+libro3.getTitulo());
                System.out.println("4. "+libro4.getTitulo());
                opcion2=datosp.nextInt();
                switch (opcion2){
                    case 1:
                        libro1.prestamo();
                        break;
                    case 2:
                        libro2.prestamo();
                        break;
                    case 3:
                        libro3.prestamo();
                        break;
                    case 4:
                        libro4.prestamo();
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } else if (opcion==3) {
            } else {
                System.out.println("Opción no válida.");
            }
            System.out.println("Menú: ");
            System.out.println("1. Mostrar Libros y realizar otra operación");
            System.out.println("2. Salir del programa");
            opcion=datosp.nextInt();
            if (opcion==1){
                System.out.println("Libro 1: ");
                libro1.mostrar();
                System.out.println("Libro 2: ");
                libro2.mostrar();
                System.out.println("Libro 3: ");
                libro3.mostrar();
                System.out.println("Libro 4: ");
                libro4.mostrar();
            } else if (opcion==2) {
                System.out.println("Saliendo...");
            }else {
                System.out.println("Opción no Válida. Volviendo al menú principal.");
            }

        }while (opcion!=2);

    }
}