package PracticaString;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){

       /* 2.Diseña un objeto de tipo String que pide por teclado un grupo de dos-tres palabras.
          Implementar los siguientes métodos:
                 Imprimir la primera mitad de los caracteres de la cadena
                 Imprimir el último carácter
                 Imprimir la cadena de forma inversa
                 Imprimir cada carácter del String separado por un guión
                 Imprimir la cantidad de vocales almacenadas*/


        //Definimos el String necesario y pedimos por pantalla el grupo de dos o tres palabras
        String palabras = new String();
        System.out.println("Dime un grupo de dos o tres palabras");
        Scanner datosp = new Scanner(System.in);
        palabras = datosp.nextLine();

        //Imprimimos la primera mitad de los caracteres mediante .lenght() y .substring()
        int long_cadena = palabras.length();
        long_cadena = long_cadena/2;
        System.out.println("La primera mitad de la cadena es : " + palabras.substring(0,long_cadena));

        //Imprimimos el último carácter mediante .lenght()
        System.out.println("El último carácter de la cadena es: "+palabras.charAt(palabras.length()-1));

        //Imprimimos la cadena de forma inversa mediante un bucle for y la función .charAt() guardandolo en un nuevo string, para luego imprimirla por pantalla
        System.out.println("La cadena de forma inversa es: ");
        String inversa = new String();
        for(int cont = palabras.length()-1; cont>=0; cont--) {
            inversa += palabras.charAt(cont);

        }
        System.out.println(inversa);


        //Imprimimos los caracteres de la cadena separados por guiones mediante otro bucle for y las funciones .lenght() y .charAt()
        //Para que no aparezca un guión después del último carácter, este se saca fuera del bucle y hacemos que el bucle termine en el penúltimo carácter
        System.out.println("La cadena separada por guiones es: ");
        for(int cont = 0; cont<palabras.length()-1; cont++){
            System.out.print(palabras.charAt(cont)+"-");
        }
        System.out.print(palabras.charAt(palabras.length()-1));

        //Imprimimos la cantidad de vocales almacenadas mediante un bucle con una condición además de la función .charAt()
        int vocales = 0;
        for(int cont=0; cont<palabras.length(); cont++){
            if (palabras.charAt(cont)=='a'||palabras.charAt(cont)=='e'||palabras.charAt(cont)=='i'||palabras.charAt(cont)=='o'||palabras.charAt(cont)=='u'||palabras.charAt(cont)=='A'||palabras.charAt(cont)=='E'||palabras.charAt(cont)=='I'||palabras.charAt(cont)=='O'||palabras.charAt(cont)=='U'){
                vocales++;
            }

        }
        System.out.println("\nEl número de vocales que hay en la contraseña es: "+ vocales);

        //Para verificar si se lee igual de derecha a izquierda que de izquierda a derecha, usamos la variable inversa guardada antes y mediante una condición
        //y la función .equals las comparamos.
        if (inversa.equals(palabras)){
            System.out.println("Se lee igual de derecha a izquierda que de izquierda a derecha.");
        }
        else {
            System.out.println("No se lee igual de derecha a izquierda de de izquierda a derecha.");
        }


    }
}
