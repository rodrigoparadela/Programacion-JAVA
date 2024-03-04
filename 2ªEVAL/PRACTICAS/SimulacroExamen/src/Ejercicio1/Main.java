package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Pedimos los valores por pantalla
        Scanner datosp=new Scanner(System.in);
        String ID,nombre,proveedor,descripcion;
        double precio;
        Producto producto1=new Producto();
        System.out.print("Dime el ID del producto: ");
        ID=datosp.next();
        producto1.setID(ID);
        System.out.print("Dime el nombre del producto: ");
        nombre=datosp.next();
        producto1.setNombre(nombre);
        System.out.print("Dime el precio del procucto: ");
        precio=datosp.nextDouble();
        producto1.setPrecio(precio);
        System.out.print("Dime el proveedor del producto: ");
        proveedor=datosp.next();
        producto1.setProveedor(proveedor);
        System.out.println("Dime una pequeña descripción del producto: ");
        datosp.nextLine();
        descripcion=datosp.nextLine();
        producto1.setDescripcion(descripcion);

        //Imprimimos los datos por pantalla
        System.out.println("ID: "+producto1.getID());
        System.out.println("Nombre: "+producto1.getNombre());
        System.out.println("Precio: "+producto1.getPrecio());
        System.out.println("Proveedor: "+producto1.getProveedor());
        System.out.println("Descripción: "+producto1.getDescripcion());

    }
}