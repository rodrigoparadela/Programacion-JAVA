import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //pedimos por pantalla dos valores
        int num1, num2;

        Scanner datosp = new Scanner(System.in);

        //Pedimos el primer valor
        System.out.println("Introduce el primer valor: ");
        num1 = datosp.nextInt();

        //Pedimos el segundo valor
        System.out.println("Introduce el segundo valor: ");
        num2 = datosp.nextInt();

        //aplicamos el método para calcular la raiz cuadrada.
        Math.sqrt(num1);
        Math.sqrt(num2);

        //Mostramos el resultado por pantalla
        System.out.println("La raíz cuadrada es: "+Math.sqrt(num1));
        System.out.println("La raíz cuadrada es: "+Math.sqrt(num2));

        //valores máximos y mínimos
        int resultado = Math.max(num1,num2);
        System.out.println("El valor máximo es: "+resultado);
        resultado = Math.min(num1,num2);
        System.out.println("El valor mínimo es: "+resultado);

        double num3;
         System.out.println("Introduce número con 4 posiciones decimales");
         num3 = datosp.nextDouble();

        //método ceil para redondear, redondea con todos los decimales
         System.out.println("Aplicamos función para redondear: "+Math.ceil(num3));

        //método round para redondear, redondea con el siguiente decimal
        System.out.println("Aplicamos función para redondear: " + Math.round(num3));

        //Método floor, redondea a la baja
        System.out.println("Aplicamos el método floor: "+ Math.floor(num3));

        //sacamos el número pi
        System.out.println("El valor del número PI es: "+ Math.PI);


        System.out.println("Probamos a crear números aleatorios "+ Math.random());




    }
}