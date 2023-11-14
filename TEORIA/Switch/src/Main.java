import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Pedir un número del 1 al 10, siendo el 10 el número correcto.

        int numero;

        Scanner datosp=new Scanner(System.in);
        System.out.println("Introduce un número del 1-10");
        numero=datosp.nextInt();

        switch (numero)
        {
            case 1:
                System.out.println("El 1 no es el número correcto");
                break;

            case 2:
                System.out.println("El 2 no es el número correcto");
                break;

            case 3:
                System.out.println("El 3 no es el número correcto");
                break;

            case 4:
                System.out.println("El 4 no es el número correcto");
                break;

            case 5:
                System.out.println("El 5 no es el número correcto");
                break;

            case 6:
                System.out.println("El 6 no es el número correcto");
                break;

            case 7:
                System.out.println("El 7 no es el número correcto");
                break;

            case 8:
                System.out.println("El 8 no es el número correcto");
                break;

            case 9:
                System.out.println("El 9 no es el número correcto");
                break;

            case 10:
                System.out.println("El 10 es el número correcto");
                break;

            default:
                System.out.println("El dato tecleado no es válido");


        }


    }

}