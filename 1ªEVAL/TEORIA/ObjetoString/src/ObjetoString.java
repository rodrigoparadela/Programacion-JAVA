import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class ObjetoString {
    public static void main(String[] args) {

        //creamos dos objetos de tipo string

        String nombre;
        Scanner datosp = new Scanner(System.in);

        //pedir por pantalla el nombre

        System.out.println("Introduce tu nombre ");
        nombre=datosp.nextLine();

        //pedir por pantalla los apellidos

        System.out.println("Introduce los apellidos");
        String apellidos=new String(datosp.nextLine());

        //para acceder a las propiedades

        System.out.println(nombre + " " + apellidos);


        //Este método nos permite comparar objeros de tipo cadena
        //apellidos.equals(nombre)

        //comprobar que el nombre es diferente de Luis

        if (nombre.equals("Luis")) {
            System.out.println("El nombre es Luis.");
        }
        else{
            System.out.println("El nombre es distinto de Luis");
        }

        //Y los apellidos son diferentes de esteban baeta

        if (apellidos.equals("Esteban Baeta")){
            System.out.println("Los apellidos son iguales.");
        }
        else{
            System.out.println("Los apellidos son distintos");
        }


        //con .length medimos la longitud de caracteres dentro de la variable

        System.out.println(nombre.length());
        System.out.println(apellidos.length());

        //con .touppercase y .tolowercase ponemos todos los caracteres de la variable en mayusulas o minusculas respectivamente

        System.out.print("El nombre en mayúsculas es: "+nombre.toUpperCase()+ "\n");
        System.out.println("El nombre en minusculas es: " + nombre.toLowerCase());


        String misupercadena= new String("Buenas tardes");

        int longitud = misupercadena.length();

        System.out.println("La cadena es: " + misupercadena);
        System.out.println("La longitud es: " + longitud);

        //substring(posi) Selecciona la cadena a partir de la posición dada
        System.out.println(misupercadena.substring(1));


        //substring(posi, posf) Selecciona el texto comprendido entre las dos posiciones
        System.out.println(misupercadena.substring(0,7));


        //El método indexOF(), nos informa sobre la posición de un carácter y nos devuelve -1 si el carácter no lo contiene la cadena

        System.out.println("El carácter de la B está en la posición: " + misupercadena.indexOf("B"));

        //charAt(), decuelce la posición de un caracter
        System.out.println("El carácter de la posición 12 es: "+misupercadena.charAt(12));


    }
}