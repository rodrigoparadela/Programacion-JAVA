package Examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        /*5. Escribe un programa en Java que utiliza tanto arrays como ArrayList para gestionar un
             inventario de productos en una tienda. Cada producto debe tener un nombre, un precio y una
             cantidad en stock. Crea los siguientes arrays:

             • Crea un array de tamaño fijo para almacenar nombres de productos.
             • Crea otro array para almacenar los precios correspondientes a los productos del
               primer array.
             • Crea un tercer array para almacenar las cantidades en stock de los productos del
               primer array.
             • Solicita al usuario ingresar información para al menos tres productos (nombre, precio y
               cantidad en stock).
             • Llena los arrays correspondientes con la información ingresada

             Operaciones Básicas:
             • Muestra en la consola la lista de productos con su precio y cantidad en stock.
             • Calcula y muestra el valor total del inventario (suma del precio multiplicado por la
               cantidad en stock para cada producto).
             • Muestra en la consola la lista de productos con su precio y cantidad en stock utilizando
               el ArrayList.
             • Realiza una búsqueda en el ArrayList para encontrar un producto específico ingresado
               por el usuario y muestra su información.
             • Permite al usuario actualizar la cantidad en stock de ese producto.*/

        //Creamos los arrays pedidos
        String nombres[]=new String[3];
        int precio[]=new int[3];
        int stock[]=new int[3];
        Scanner datosp=new Scanner(System.in);

        //Llenamos los arrays.
        for (int cont=0; cont<3;cont++){
            System.out.print("Dime el nombre del producto "+(cont+1)+": " );
            nombres[cont]=datosp.next();
            System.out.print("Dime el precio del producto "+(cont+1)+": ");
            precio[cont]=datosp.nextInt();
            System.out.print("Dime la cantidad en stock del producto "+(cont+1)+": ");
            stock[cont]=datosp.nextInt();
        }

        //Imprimimos los productos
        for (int cont=0;cont<3;cont++){
            System.out.println("Nombre: "+nombres[cont]);
            System.out.println(" -Precio: "+precio[cont]);
            System.out.println((" -Stock: "+stock[cont]));
        }

        //Calculamos el valor total de cada producto
        int valor1=0,valor2=0,valor3=0;
        valor1 = precio[0]*stock[0];
        valor2 = precio[1]*stock[1];
        valor3 = precio[2]*stock[2];
        System.out.println("El valor total del producto 1 es: " +valor1+" €");
        System.out.println("El valor total del producto 2 es: " +valor2+" €");
        System.out.println("El valor total del producto 3 es: " +valor3+" €");


        //Llenamos todos los valores en un arraylist
        ArrayList<String> productos = new ArrayList<String>();
        for (int cont=0;cont<3;cont++){
            productos.add(nombres[cont]);
            productos.add(String.valueOf(precio[cont]));
            productos.add(String.valueOf(stock[cont]));
        }
        //Mostramos el arraylist
        System.out.println("Producto 1: "+productos.get(0)+"\n -Precio: "+productos.get(1)+"\n -Stock: "+productos.get(2));
        System.out.println("Producto 2: "+productos.get(3)+"\n -Precio: "+productos.get(4)+"\n -Stock: "+productos.get(5));
        System.out.println("Producto 3: "+productos.get(6)+"\n -Precio: "+productos.get(7)+"\n -Stock: "+productos.get(8));

        //Buscamos un producto por nombre
        String producto,producto2;
        System.out.print("Dime un producto especifico: ");
        producto=datosp.next();
        for (int cont = 0;cont<4;cont++){
            if (cont==0){
                producto2=productos.get(0);
                if (producto==producto2){
                    System.out.println("El producto es: ");
                    System.out.println("Producto 1: " + productos.get(0) + "\n -Precio: " + productos.get(1) + "\n -Stock: " + productos.get(2));
                    break;
                }
            } else if (cont ==1) {
                producto2=productos.get(3);
                if (producto==producto2) {
                    System.out.println("El producto es: ");
                    System.out.println("Producto 2: " + productos.get(3) + "\n -Precio: " + productos.get(4) + "\n -Stock: " + productos.get(5));
                    break;
                }
            } else if (cont==3) {
                producto2=productos.get(6);
                if (producto==producto2){
                    System.out.println("El producto es: ");
                    System.out.println("Producto 3: " + productos.get(6) + "\n -Precio: " + productos.get(7) + "\n -Stock: " + productos.get(8));
                    break;
                }
            } else{
                System.out.println("El producto que has añadido no existe");
            }
        }




    }
}
