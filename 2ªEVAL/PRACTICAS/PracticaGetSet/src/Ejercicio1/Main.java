package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaramos variables y creamos el scanner
        Scanner datosp=new Scanner(System.in);
        ArrayList<String> perecederos = new ArrayList<String>();
        ArrayList<String> noPerecederos = new ArrayList<String>();
        int numproductos, diasACaducar;
        double precio,aux;
        String tipo;
        double preciototal=0;




        //Hacemos dos bucles uno para perecederos y otro para no perecederos y guardar en estos los nombres de los productos
        //perecederos
        System.out.print("Cuantos productos perecederos quieres añadir: ");
        numproductos=datosp.nextInt();
        for (int cont =0; cont<numproductos;cont++){
            System.out.print("Dime el nombre del producto "+(cont+1)+": ");
            perecederos.add(datosp.next());
        }
        //No perecederos
        System.out.print("Cuantos productos no perecederos quieres añadir: ");
        numproductos=datosp.nextInt();
        for (int cont =0; cont<numproductos;cont++){
            System.out.print("Dime el nombre del producto "+(cont+1)+": ");
            noPerecederos.add(datosp.next());
        }

        //Mediante dos bucles y las funciones constructoras guardamos los objetos en sus respectivas clases y con sus atributos
        //perecederos
        Perecederos[] productosPer = new Perecederos[perecederos.size()];
        for (int cont=0;cont<perecederos.size();cont++){
            System.out.print("Dime el precio del producto "+perecederos.get(cont)+": ");
            precio = datosp.nextDouble();
            System.out.print("Dime los días a caducar del producto "+perecederos.get(cont)+": ");
            diasACaducar = datosp.nextInt();
            productosPer[cont] = new Perecederos(perecederos.get(cont),precio,diasACaducar);
        }
        //no perecederos
        NoPerecederos[] productosNop = new NoPerecederos[noPerecederos.size()];
        for (int cont=0;cont<noPerecederos.size();cont++){
            System.out.print("Dime el precio del producto "+noPerecederos.get(cont)+": ");
            precio = datosp.nextDouble();
            System.out.print("Dime el tipo del producto "+noPerecederos.get(cont)+": ");
            tipo = datosp.next();
            productosNop[cont] = new NoPerecederos(noPerecederos.get(cont), precio, tipo );
        }

        //Mostramos cuanto sería el precio total de vender 5 productos de cada tipo.
        //perecederos
        for (int cont=0;cont<productosPer.length;cont++){
            preciototal+=productosPer[0].Calcular(5);
        }
        System.out.println("El precio total de los productos perecederos es: " +preciototal);
        preciototal=0;
        //no perecederos
        for (int cont=0;cont<productosNop.length+1;cont++){
            preciototal+=productosNop[0].Calcular(5);
        }
        System.out.println("El precio total de los productos no perecederos es: " +preciototal);
    }
}