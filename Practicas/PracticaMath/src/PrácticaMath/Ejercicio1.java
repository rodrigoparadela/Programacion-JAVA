package PrácticaMath;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        //1. Se pide por pantalla el radio de un circulo, se calcula su área. Mostrar el resultado aplicando una función
        //para redondear el valor.

        //Definimos las variables, y pedimos por pantalla el radio
        int radio;
        float resultado= 0;
        Scanner datosp=new Scanner(System.in);
        System.out.println("Dime el radio de un círculo.");
        radio = datosp.nextInt();

        //Calculamos el resultado

        resultado = radio * radio;
        resultado*=Math.PI;

        //Mostramos el resultado por pantalla redondeando el valor con la función round.
        System.out.println("El área del cículo es: "+Math.round(resultado));


    }
}