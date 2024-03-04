import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datosp = new Scanner(System.in);


        System.out.print("Dime el primer número (debe ser mayor que 100): ");
        double num1 = datosp.nextDouble();
        if (num1 <= 100) {
            System.out.println("El primer número debe ser mayor que 100. Programa finalizado.");
            System.exit(0);
        }

        System.out.print("Introduce el segundo número (no puede ser cero): ");
        double num2 = datosp.nextDouble();
        if (num2 == 0) {
            System.out.println("El segundo número no puede ser cero. Programa finalizado.");
            System.exit(0);
        }

        if (num1 <= 0) {
            System.out.println("El primer número debe ser mayor que cero. Programa finalizado.");
            System.exit(0);
        }

       double resultado = num1 / num2;
        System.out.println("El resultado de la división es: " + resultado);

        datosp.close();

    }
}