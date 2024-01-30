package Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Actores {
    ArrayList<String> actores = new ArrayList<>();


    public void menu(){
        int opcion;
        Scanner datosp = new Scanner(System.in);
        do {
            System.out.println("Menu: ");
            System.out.println("1. Agregar nombres");
            System.out.println("2. Modificar nombres");
            System.out.println("3. Borrar nombres");
            System.out.println("4. Buscar posición nombre");
            System.out.println("5. Visualizar nombres");
            System.out.println("6. Cantidad de nombres");
            System.out.println("7. Salir");
            opcion=datosp.nextInt();
            comenzar(opcion);
        }while (opcion!=7);
    }
    public void comenzar(int opcion){
        Scanner datosp=new Scanner(System.in);
        int opcion1,contador=0;
        String nombre,nombre2;
        boolean estaoNo=false;
        switch (opcion){
            case 1:
                System.out.print("Dime el nombre del actor que quieres añadir: ");
                actores.add(datosp.next());
                break;
            case 2:
                System.out.print("Dime la posicion del actor que quieres modificar: ");
                opcion1=datosp.nextInt();
                System.out.print("Dime el nombre modificado: ");
                actores.set(opcion1-1,datosp.next());
                break;
            case 3:
                System.out.print("Dime la posición del nombre que quieras borrar: ");
                actores.remove(datosp.nextInt()-1);
                break;
            case 4:
                System.out.print("Dime el nombre que quieras buscar: ");
                nombre=datosp.next();
                if (actores.contains(nombre)){
                    System.out.println("El nombre "+nombre+", si está en el arraylist");
                    System.out.println("Está en la posición: "+(actores.indexOf(nombre)+1));
                    estaoNo=true;
                }
                if (estaoNo==false){
                    System.out.println("El nombre "+nombre+", no está en el arraylist");
                }
                break;
            case 5:
                System.out.println("Los nombres que están dentro del arraylist son: ");
                for (int cont=0;cont<actores.size()-1;cont++){
                    System.out.print(actores.get(cont)+" - ");
                }
                System.out.println(actores.get(actores.size()-1));
                break;
            case 6:
                System.out.print("La cantidad de cantantes que hay dentro del arraylist es: ");
                for (int cont=0;cont<actores.size();cont++){
                    contador=contador+1;
                }
                System.out.println(contador);

                break;
            case 7:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

    }
    //main
    public void main(){
        Actores actores=new Actores();
        actores.menu();
    }


}
