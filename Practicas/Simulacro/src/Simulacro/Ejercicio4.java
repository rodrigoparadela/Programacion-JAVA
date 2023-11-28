package Simulacro;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        /*4. Crea un menú que permita al usuario seleccionar la operación que desea realizar. Solicita al
             usuario ingresar los números necesarios para realizar las operaciones según el menú.

             Suma de dos números.
             Resta de dos números.
             Multiplicación de dos números.
             División de dos números.
             Operaciones Avanzadas:
             Cálculo del seno de un ángulo.
             Cálculo del coseno de un ángulo.
             Redondeo de un número decimal al entero más cercano.
             Potencia de un número elevado a otro.

            Operaciones
                 Mostrar el valor de la constante pi (Math.PI).
                 Mostrar el valor de la constante de Euler (Math.E).
                 Calcular y mostrar el logaritmo natural de un número.*/

        //Realizamos un menu para preguntar al usuario que opción quiere hacer.
        int operacion, num1, num2;
        double resultado, decimal;
        Scanner datosp=new Scanner(System.in);
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma de dos números");
        System.out.println("2. Resta de dos números");
        System.out.println("3. Multiplicación de dos números");
        System.out.println("4. División de dos números");
        System.out.println("Operaciones Avanzadas: ");
        System.out.println("5. Seno de un ágnulo");
        System.out.println("6. Coseno de un ángulo");
        System.out.println("7. Redondeo de número decimal");
        System.out.println("8. Potencia de un número elevado a otro");
        System.out.println("9. Valor de PI");
        System.out.println("10. Valor de la constante de Euler");
        System.out.println("11. Logaritmo de un número");
        operacion = datosp.nextInt();

        //Realizamos un switch-case
        switch (operacion){
            case 1:
                System.out.println("Dime el valor del primer número");
                num1=datosp.nextInt();
                System.out.println("Dime el valor del segundo número");
                num2=datosp.nextInt();
                resultado=num1+num2;
                System.out.println("El resultado de la suma es: " + Math.round(resultado));
                break;
            case 2:
                System.out.println("Dime el valor del primer número");
                num1=datosp.nextInt();
                System.out.println("Dime el valor del segundo número");
                num2=datosp.nextInt();
                resultado=num1-num2;
                System.out.println("El resultado de la resta es: " + Math.round(resultado));
                break;
            case 3:
                System.out.println("Dime el valor del primer número");
                num1=datosp.nextInt();
                System.out.println("Dime el valor del segundo número");
                num2=datosp.nextInt();
                resultado=num1*num2;
                System.out.println("El resultado de la multiplicación es: " + Math.round(resultado));
                break;
            case 4:
                System.out.println("Dime el valor del primer número");
                num1=datosp.nextInt();
                System.out.println("Dime el valor del segundo número");
                num2=datosp.nextInt();
                if (num2==0){
                    System.out.println("No se puede dividir por 0");
                }
                else{
                    resultado=num1/num2;
                    System.out.println("El resultado de la división es: " + Math.round(resultado));
                }
                break;
            case 5:
                System.out.println("Dime un ángulo para calcular el seno");
                num1=datosp.nextInt();
                resultado=Math.sin(Math.toRadians(num1));
                System.out.println("El seno del ángulo dado es: " + resultado);
                break;
            case 6:
                System.out.println("Dime un ángulo para calcular el coseno");
                num1 = datosp.nextInt();
                resultado=Math.cos(Math.toRadians(num1));
                System.out.println("El coseno del ángulo dado es: " + resultado);
                break;
            case 7:
                System.out.println("Dime un número decimal para redondearlo");
                decimal=datosp.nextDouble();
                System.out.println("El número redondeado es: " + Math.round(decimal));
                break;
            case 8:
                System.out.println("Dime el primer número");
                num1=datosp.nextInt();
                System.out.println("Dime el segundo número");
                num2=datosp.nextInt();
                resultado=Math.pow(num1,num2);
                System.out.println("El resultado de la potencia es: "+ Math.round(resultado));
                break;
            case 9:
                System.out.println("El valor de PI es: "+Math.PI);
                break;
            case 10:
                System.out.println("El valor de la constante de Euler es: "+ Math.E);
                break;
            case 11:
                System.out.println("Dime un número");
                num1=datosp.nextInt();
                resultado=Math.log(num1);
                System.out.println("El resultado del logaritmo es: "+resultado);
                break;
            default:
                System.out.println("Error, opción no válida.");
        }

    }
}
