package PracticaString;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       /*  1.Desarrollar un programa que solicita la contraseña o password. Se debe comprobar:
             Que la longitud de la cadena no es superior a 25 caracteres.
             No debe contener caracteres especiales:@,.,$,#,&,/
             Se debe almacenar la primera letra y la última en mayúsculas*/

        //Creamos las variables contra y la pedimos por pantalla
        char letra1, letra2;
        String contra= new String();
        Scanner datosp = new Scanner(System.in);
        System.out.println("Escribe la contraseña que quieras agregar.");
        contra = datosp.nextLine();

        //comprobamos que la longitud no sea superior a 25 caracteres.

        int long_contra = contra.length();

        if (long_contra<26){

            //Si es menor o igual de 25 caracteres se continua con la comprobación de la contraseña
            //Se comprueba mediante un bucle y una condición si algún carácter de la cadena es un carácter especial

            for (int cont=0; cont< long_contra; cont++){
                if (contra.charAt(cont)=='@' || contra.charAt(cont)=='.' || contra.charAt(cont)=='$' || contra.charAt(cont) == '#' || contra.charAt(cont)=='&' || contra.charAt(cont) == '/') {
                    System.out.println("ERROR \n No puede tener caracteres especiales");
                    break;
                }
                else{

                    //Se almacena el primer y ultimo caracter en mayusculas

                    letra1 = contra.charAt(0);
                    letra2 = contra.charAt(contra.length()-1);

                    System.out.println("La primera letra en mayúsculas es: " + Character.toUpperCase(letra1));
                    System.out.println("La última letra en mayúsculas es: " + Character.toUpperCase(letra2));
                    break;
                }
            }
        }
        else {

            //Si es mayor de 25 caracteres se muestra error

            System.out.println(" ERROR \n La longitud no puede ser mayor de 25 caracteres.");
        }
















    }
}