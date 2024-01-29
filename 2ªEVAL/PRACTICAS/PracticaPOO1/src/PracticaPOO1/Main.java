package PracticaPOO1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion, opcionCuenta,ISBN,numPaginas,a,b,c;
        double cantidadCuenta;
        String titular,titulo,autor;
        Scanner datosp=new Scanner(System.in);
        do {
            System.out.println("A donde quieres entrar:  (Señale la opción 1,2 o 3)");
            System.out.println("1. Cuenta de banco");
            System.out.println("2. Libreria");
            System.out.println("3. Calculadora de raices");
            System.out.println("4. Salir");
            opcion=datosp.nextInt();
            switch (opcion){
                case 1:
                    //CUENTA DE BANCO
                   System.out.print("Usuario: ");
                   titular=datosp.next();
                   System.out.print("Cantidad en la cuenta: ");
                   cantidadCuenta=datosp.nextDouble();
                   Cuenta usuario=new Cuenta(titular,cantidadCuenta);
                   System.out.println("Que quieres hacer: ");
                   System.out.println("1. Ingresar.");
                   System.out.println("2. Retirar.");
                   opcionCuenta=datosp.nextInt();
                   if (opcionCuenta==1){
                       usuario.ingresar(cantidadCuenta);
                   } else if (opcionCuenta==2) {
                       usuario.retirar(cantidadCuenta);
                   }
                   else {
                       System.out.println("Opción incorrecta.");
                       System.out.println("Saliendo...");
                   }
                   break;
                case 2:
                    //LIBRERIA
                    System.out.print("Dime el título del primer libro: ");
                    datosp.nextLine();
                    titulo=datosp.nextLine();
                    System.out.print("Dime su autor: ");
                    autor=datosp.nextLine();
                    System.out.print("Dime su ISBN: ");
                    ISBN=datosp.nextInt();
                    System.out.print("Dime el número de páginas que tiene: ");
                    numPaginas=datosp.nextInt();
                    Libreria usuario1=new Libreria(ISBN,titulo,autor,numPaginas);
                    System.out.print("Dime el título del segundo libro: ");
                    datosp.nextLine();
                    titulo=datosp.nextLine();
                    System.out.print("Dime su autor: ");
                    autor=datosp.nextLine();
                    System.out.print("Dime su ISBN: ");
                    ISBN=datosp.nextInt();
                    System.out.print("Dime el número de páginas que tiene: ");
                    numPaginas=datosp.nextInt();
                    Libreria usuario2=new Libreria(ISBN,titulo,autor,numPaginas);
                    System.out.println("Los libros son: ");
                    System.out.println(usuario1.toString());
                    System.out.println(usuario2.toString());
                    if (usuario1.numPaginas>usuario2.numPaginas){
                        System.out.println("El libro: "+usuario1.titulo+". Tiene más páginas.");
                    }
                    else{
                        System.out.println("El libro: "+usuario2.titulo+". Tiene más páginas.");
                    }
                    break;
                case 3:
                    //CALCULADORA DE RAICES
                    System.out.print("Dime el primer número de la ecuación: ");
                    a=datosp.nextInt();
                    System.out.print("Dime el segundo número de la ecuación: ");
                    b=datosp.nextInt();
                    System.out.print("Dime el tercer número de la ecuación: ");
                    c=datosp.nextInt();
                    Raices ecuacion1=new Raices(a,b,c);
                    ecuacion1.calcular();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("ERROR! Escoge otra opción.");
            }
        } while(opcion!=4);
    }
}