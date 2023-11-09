package PracticaString;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        /*3. Diseña un programa que pide un texto por pantalla y se muestra de la siguiente manera:
        Por ejemplo se teclea: Buenas tardes Lola
        Debe aparecer:
            Buenas
            Tardes
            Lola*/

        //Pedimos el texto por pantalla
        Scanner datosp=new Scanner(System.in);
        String texto = new String();
        System.out.println("Dime el texto que quieras añadir ");
        texto = datosp.nextLine();

        //Para separar palabra a palabra usamos un bucle con una condición que siempre que detecte un espacio haga un salto de linea.
        //Después dentro de la condición usamos un .substring() para ir imprimiendo palabra por palabra
        //con la variable kk hacemos que vaya guardando el valor del último espacio para que solo imprima la siguiente palabra.
        //Para terminar tenemos que imprimir la última palabra fuera del bucle ya que no termina en un espacio y tenemos que imprimirla por separado.
        int kk =0;
        for(int cont=0; cont<texto.length();cont++){
            if (texto.charAt(cont)==' '){
                System.out.println(texto.substring(kk,cont));
                kk=cont+1;
            }

        }
        System.out.println(texto.substring(kk,texto.length()));


    }

}
