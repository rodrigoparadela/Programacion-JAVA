import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Práctica Euroconversor
        //Nos basamos en la estructura usada en Pseint para realizar el código
        //Declaramos las variables necesarias y pedimos el importe en euros con scanner

        double euro, libra;
        Scanner datosp= new Scanner(System.in);
        System.out.println("Dime el importe en euros");
        euro = datosp.nextDouble();

        //Hacemos el cambio a libras y lo mostramos por pantalla
        libra = euro*0.86270;
        System.out.println("El importe en libras es: " + libra);






    }
}