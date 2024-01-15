package Examen;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        /*3. Escribe un programa en Java que realice las siguientes operaciones con objetos String,
             solicita al usuario ingresar una palabra o frase.

             Operaciones Básicas:
             • Muestra en la consola la longitud de la palabra o frase ingresada.
             • Convierte todos los caracteres a mayúsculas y muestra el resultado.
             • Convierte todos los caracteres a minúsculas y muestra el resultado.
             • Encuentra y muestra la primera letra de la palabra o frase.
             • Encuentra y muestra la última letra de la palabra o frase.
             • Extrae y muestra una subcadena de la palabra o frase (por ejemplo, los primeros tres
               caracteres).
             • Búsqueda de Caracteres, Solicita al usuario ingresar un carácter.
             • Verifica si el carácter ingresado está presente en la palabra o frase e informa al usuario
               sobre su presencia o ausencia.*/

        //Creamos el String y le preguntamos al usuario
        String palabra=new String();
        Scanner datosp= new Scanner(System.in);
        System.out.print("Dime una palabra o frase: ");
        palabra=datosp.nextLine();

        //Mostramos la longitud del String
        System.out.println("La longitud del String es: "+palabra.length());

        //Imprimimos el String tanto en mayúsculas como en minúsculas
        System.out.println("El String en mayúsculas es: "+ palabra.toUpperCase());
        System.out.println("El String en minúsculas es: "+ palabra.toLowerCase());

        //Imprimimos el primer y último elemento del String
        System.out.println("El primer elemento es: "+palabra.charAt(0));
        System.out.println("El último elemento es: "+palabra.charAt(palabra.length()-1));

        //Mostramos una subcadena de los 3 primeros elementos del String
        System.out.println("Los 3 primeros elementos del String son: " + palabra.substring(0,3));

        //Comprobamos si un caracter preguntado al usuario existe en el String
        System.out.print("Dime un caracter para ver si existe en el String: ");
        char caracter = datosp.next().toLowerCase().charAt(0);
        if (palabra.indexOf(caracter) != -1){
            System.out.println("El carácter está en el String");
        }
        else{
            System.out.println("El carácter no está en el String");
        }


    }
}
