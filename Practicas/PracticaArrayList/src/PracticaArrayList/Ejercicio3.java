package PracticaArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
      /*3. Realizar un programa para gestionar la lista de Empleados, en que tendremos el
        siguiente menú:
        1. Agregar Nombres.
        2. Modificar nombre
        3. Borrar Nombres.
        4. Visualizar un Nombre
        5. Visualizar todos Nombres.
        6. Salir.

        -Si se selecciona 1, nos pedirá cuantos nombres queremos introducir en el arraylist.
        -La opción 2 modificará los datos de un empleado.
        -La opción 3, nos dirá como queremos borrar, nos tiene que dar opción a borrar por
        posición o por nombre
        -La opción 4 muestra un nombre, según la posición que queremos, hay que comprobar
        si la posición es correcta.
        -La opción 5 muestra por pantalla un listado de todos los empleados
        -Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se
        seleccione la opción 6, que terminará el programa.*/

        //Creamos un bucle para que se vaya mostrando el menu principal hasta que se añada salir
        //Creamos el array de nombres, una variable nombre, y una variable int para moverse por el menu
        Scanner datosp=new Scanner(System.in);
        int num =0;
        String nombre;
        ArrayList<String> nombres= new ArrayList<String>();

        while (num!=6){
            //Mostramos el menu por pantalla
            System.out.println("1. Agregar nombres");
            System.out.println("2. Modificar nombre");
            System.out.println("3. Borrar nombres");
            System.out.println("4. Visualizar un nombre");
            System.out.println("5. Visualizar todos los nombres");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            num = datosp.nextInt();

            //Hacemos un Switch Case con cada opción.
            switch (num){
                case 1:
                    //Agregamos los nombres al arraylist hasta que el usuario marque atras.
                    //Lo hacemos mediante un while, y siempre que no sea igual a atras añada el nombre.
                    System.out.print("Añada nombre o atras: ");
                    nombre = datosp.next().toLowerCase();
                    while(!nombre.equals("atras")){
                        if (!nombre.equals("atras")){
                            nombres.add(nombre);
                        }
                        System.out.print("Añada nombre o atras: ");
                        nombre = datosp.next().toLowerCase();
                    }
                    break;
                case 2:
                    //mostramos el arraylist para que luego se sepa facilmente la posicion. Lo modificamos con una variable temporal temp.
                    int temp;
                    System.out.println(nombres);
                    System.out.print("Dime la posición del nombre que quieras modificar: ");
                    temp =datosp.nextInt();
                    System.out.print("Dime el nombre modificado: ");
                    nombre=datosp.next();
                    nombres.set(temp-1,nombre);
                    break;
                case 3:
                    //con una variable temporal hacemos una condición para distinguir entre borrar por posición y borrar por nombre.
                    String temp1;
                    int posicion;
                    System.out.println("Como quieres borrar, por posición o por nombre (posicion/nombre)");
                    temp1 = datosp.next();
                    if (temp1.equals("posicion")){
                        System.out.println(nombres);
                        System.out.print("Dime la posicion del nombre que quieras borrar: ");
                        posicion = datosp.nextInt();
                        nombres.remove(posicion-1);
                    }
                    else {
                        System.out.println(nombres);
                        System.out.print("Dime el nombre que quieras borrar: ");
                        nombre = datosp.next();
                        nombres.remove(nombre);
                    }
                    break;
                case 4:
                    //Con una variable temporal temp2, pedimos el nombre que se quiera mostrar
                    int temp2;
                    System.out.print("Dime la posición del nombre que quieras mostrar: ");
                    temp2=datosp.nextInt();
                    nombre = nombres.get(temp2-1);
                    System.out.println(nombre);
                    break;
                case 5:
                    //con un bucle vamos mostrando nombre por nombre dentro del arraylist
                    System.out.println("Lista de empleados: ");
                    for (int cont=0;cont<nombres.size();cont++){
                        System.out.println(cont+1+". "+nombres.get(cont));
                    }
                    System.out.println(" ");

                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }










        }


    }
}
