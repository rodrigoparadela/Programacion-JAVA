package PracticaBucles;
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        /*Se pide por pantalla, un número, para comprobar si es primo. Si se introduce el número cero
          termina el juego.*/

        int numero;
        int primo = 0;
        Scanner datosp = new Scanner(System.in);

        System.out.println("Introduce un número");
        numero = datosp.nextInt();

        if (numero > 0) {
            for (int contador = 1; contador <= numero; contador++) {
                if (numero % contador == 0) {
                    primo = primo + 1;
                }
            }

            if (primo == 2) {
                System.out.println("Tu número es primo");
            } else {
                System.out.println("Tu número no es primo");
            }
        } else {
            System.out.println("El número debe ser mayor que 0.");
        }





    }
}