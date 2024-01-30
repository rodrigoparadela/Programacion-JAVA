package Ejercicio4;

import java.util.Scanner;

public class Procesos {
    String nombre;
    String apellidos;
    String calle;
    int telefono;
    String[] aficiones;


    Scanner datosp=new Scanner(System.in);
    public void cargarDatos(){
        aficiones=new String[3];
        System.out.print("Dime tu nombre: ");
        nombre=datosp.nextLine();
        System.out.print("Dime tus apellidos: ");
        apellidos=datosp.nextLine();
        System.out.print("Dime tu dirección: ");
        calle=datosp.nextLine();
        System.out.print("Dime tu teléfono: ");
        telefono=datosp.nextInt();
        for (int cont=0;cont<3;cont++) {
            System.out.print("Dime afición número " + (cont + 1) + " (Responder con una palabra): ");
            aficiones[cont] = datosp.next();
        }
        datosp.nextLine();
        Persona usuario=new Persona(nombre,apellidos,calle,telefono,aficiones);
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Dirección: "+calle);
        System.out.println("Número de teléfono: "+telefono);
        System.out.println("Aficiones: ");
        for (int cont=0;cont<3;cont++){
            System.out.println("Afición "+(cont+1)+": "+aficiones[cont]);
        }
    }
    public void cambiarDatos(){
        int opcion;
        int opcion2;
        boolean salida=false;
        do {
            System.out.println("Quieres cambiar alguna opción (1.s/2.n): ");
            opcion=datosp.nextInt();
            if (opcion==1){
                System.out.println("¿Que Quieres cambiar?");
                System.out.println("1.Nombre");
                System.out.println("2.Apellidos");
                System.out.println("3.Dirección");
                System.out.println("4.Telefóno");
                System.out.println("5.Aficiones");
                opcion2 = datosp.nextInt();
                datosp.nextLine();
                switch (opcion2){
                    case 1:
                        System.out.print("Dime el nuevo nombre: ");
                        nombre=datosp.nextLine();
                        break;
                    case 2:
                        System.out.print("Dime los nuevos apellidos: ");
                        apellidos=datosp.nextLine();
                        break;
                    case 3:
                        System.out.print("Dime la nueva dirección: ");
                        calle=datosp.nextLine();
                        break;
                    case 4:
                        System.out.print("Dime el nuevo número de teléfono: ");
                        telefono=datosp.nextInt();
                        break;
                    case 5:
                        System.out.println("¿Que afición quieres cambiar?");
                        System.out.println("1. "+aficiones[0]);
                        System.out.println("2. "+aficiones[1]);
                        System.out.println("3. "+aficiones[2]);
                        opcion2=datosp.nextInt();
                        datosp.nextLine();
                        if (opcion2==1){
                            System.out.print("Dime la nueva afición: ");
                            aficiones[0]=datosp.nextLine();
                        } else if (opcion2==2) {
                            System.out.print("Dime la nueva afición: ");
                            aficiones[1]=datosp.nextLine();
                        } else if (opcion2==3){
                            System.out.print("Dime la nueva afición: ");
                            aficiones[2]=datosp.nextLine();
                        } else {
                            System.out.println("Error. Opción no válida.");
                        }
                        break;
                    default:
                        System.out.println("Error. Opción no válida.");
                }
                Persona usuario = new Persona(nombre,apellidos,calle,telefono,aficiones);
            }
            System.out.println("¿Quieres volver a mostrar los datos?(1.s/2.n)");
            opcion=datosp.nextInt();
            if (opcion==1){
                mostrarDatos();
                System.out.println("¿Todo listo?(1.s/2.n)");
                opcion=datosp.nextInt();
                if (opcion==1){
                    System.out.println("Saliendo...");
                    salida=true;
                }
            }
            else{
                System.out.println("¿Todo listo?(1.s/2.n)");
                opcion=datosp.nextInt();
                if (opcion==1){
                    System.out.println("Saliendo...");
                    salida=true;
                }
            }

        }while (salida==false);
    }
}
